package com.seoul.his.log.csr.controller;

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
import com.seoul.his.common.util.NexacroLogger;
import com.seoul.his.log.csr.service.SplyLndryRmServiceFacade;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;
import  com.seoul.his.msv.mcm.patientservice.to.TrmtSchdTypeDetailBean;


/**
 * @Package  com.seoul.his.log.midSplyRm.controller
 * @Class    GdsAnspController.java
 * @Create   2016. 5. 25.
 * @Author   Chun
 * @Description 공급실, 세탁실  물품청구 관리 컨트롤러
 *
 * @LastUpdated
 */

@Controller
public class CsrGdsAnspController {
	@Autowired
	private SplyLndryRmServiceFacade splyLndryRmServiceFacade;
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;

	//물품청구조회
	@RequestMapping("log/csr/findCsrGdsAnspList.do")
    @SuppressWarnings("unchecked")
	public void findCsrGdsAnspList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<GdsAnspBean> gdsAnspList = splyLndryRmServiceFacade.findCsrGdsAnspList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, gdsAnspList, GdsAnspBean.class);
		List<GdsAnspHistBean> gdsAnspHistList = new ArrayList<>();
		for(GdsAnspBean gsAnspBean : gdsAnspList){
			List<GdsAnspHistBean> gdsAnspHist = gsAnspBean.getGdsAnspHistList();
			gdsAnspHistList.addAll(gdsAnspHist);
		}
		dataSetBeanMapper.beansToDataset(outData, gdsAnspHistList, GdsAnspHistBean.class);
	}

	@RequestMapping("log/csr/updatePstRlsList.do")
	public void updatePstRlsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<GdsAnspHistBean> gdsAnspHistList;
        gdsAnspHistList = dataSetBeanMapper.datasetToBeans(inData, GdsAnspHistBean.class);
        splyLndryRmServiceFacade.updatePstRlsList(gdsAnspHistList);

	}

	//물품출고
	@RequestMapping("log/csr/batchRlsGdsAnspList.do")
	public void batchRlsGdsAnspList(HttpServletRequest request, HttpServletResponse response) throws Exception {

    PlatformData inData = (PlatformData) request.getAttribute("inData");

    List<GdsAnspBean> gdsAnspList;
    gdsAnspList = dataSetBeanMapper.datasetToBeans(inData,GdsAnspBean.class);
    List<GdsAnspHistBean> gdsAnspHistList;
    gdsAnspHistList = dataSetBeanMapper.datasetToBeans(inData,GdsAnspHistBean.class);
    NexacroLogger.debug(inData.getDataSetList());
    if(gdsAnspList.size() != 0){                             //부모데이터 확인
        for(GdsAnspBean lwgdsAnspBean : gdsAnspList){
            List<GdsAnspHistBean> tempGdsAnspHistList=new ArrayList<GdsAnspHistBean>();
            if(gdsAnspHistList.size() != 0){              //자식데이터 확인
                for(int i=0; i<gdsAnspHistList.size(); i++){
                    if(lwgdsAnspBean.getGdsAnspNo().equals(gdsAnspHistList.get(i).getGdsAnspNo())){
                        tempGdsAnspHistList.add(gdsAnspHistList.get(i)); //헤딩 자식들을 temp에 넣어놓고
                        gdsAnspHistList.remove(gdsAnspHistList.get(i)); //원본자식을 List에서 삭제한다
                    }
                }
            }
            lwgdsAnspBean.setGdsAnspHistList(gdsAnspHistList);
        }
    }
    splyLndryRmServiceFacade.batchRlsGdsAnspList(gdsAnspList,gdsAnspHistList);


	}

}


