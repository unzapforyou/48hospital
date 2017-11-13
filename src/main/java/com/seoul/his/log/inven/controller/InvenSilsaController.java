package com.seoul.his.log.inven.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.log.inven.service.InvenServiceFacade;
import com.seoul.his.log.inven.to.InvenSilsaBean;
import com.seoul.his.log.inven.to.InvenSilsaDtlInfoBean;

@Controller
public class InvenSilsaController {

	@Autowired
	InvenServiceFacade invenServiceFacade;
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;

	// 재고실사조회
	@RequestMapping("log/inven/findInvenSilsaList.do")
	public void findInvenSilsaList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<InvenSilsaBean> invenSilsaList = invenServiceFacade.findInvenSilsaList(argsMap);

		dataSetBeanMapper.beansToDataset(outData, invenSilsaList, InvenSilsaBean.class);

		List<InvenSilsaDtlInfoBean> invenSilsaDetailList = new ArrayList<InvenSilsaDtlInfoBean>();
		for (InvenSilsaBean invenSilsaBean : invenSilsaList) {
			List<InvenSilsaDtlInfoBean> invenSilsaDtlInfoList;
			invenSilsaDtlInfoList = invenSilsaBean.getInvenSilsaDtlInfoList();
			invenSilsaDetailList.addAll(invenSilsaDtlInfoList);
		}
		dataSetBeanMapper.beansToDataset(outData, invenSilsaDetailList,InvenSilsaDtlInfoBean.class);
	}

	// 재고실사 일괄처리
	@RequestMapping("log/inven/batchInvenSilsaListProcess.do")
	public void batchInvenSilsaListProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<InvenSilsaBean> invenSilsaList;
		invenSilsaList = dataSetBeanMapper.datasetToBeans(inData,InvenSilsaBean.class);
		List<InvenSilsaDtlInfoBean> invenSilsaDtlInfoList;
		invenSilsaDtlInfoList = dataSetBeanMapper.datasetToBeans(inData,InvenSilsaDtlInfoBean.class);

		if(invenSilsaList.size() != 0){				   				//부모데이터 확인
			for(InvenSilsaBean invenSilsaBean : invenSilsaList){
				List<InvenSilsaDtlInfoBean> tempInvenSilsaDtlInfoList=new ArrayList<InvenSilsaDtlInfoBean>();
				if(invenSilsaDtlInfoList.size() != 0){ 				//자식데이터 확인
					for(int i=0; i<invenSilsaDtlInfoList.size(); i++){
						if(invenSilsaBean.getWhCd().equals(invenSilsaDtlInfoList.get(i).getWhCd())){
							tempInvenSilsaDtlInfoList.add(invenSilsaDtlInfoList.get(i)); //헤딩 자식들을 temp에 넣어놓고
							invenSilsaDtlInfoList.remove(invenSilsaDtlInfoList.get(i));	//원본자식을 List에서 삭제한다
						}
					}
				}
				invenSilsaBean.setInvenSilsaDtlInfoList(tempInvenSilsaDtlInfoList); 	//싹 집어넣기
			}
		}
		invenServiceFacade.batchInvenSilsaListProcess(invenSilsaList,invenSilsaDtlInfoList);
	}

}
