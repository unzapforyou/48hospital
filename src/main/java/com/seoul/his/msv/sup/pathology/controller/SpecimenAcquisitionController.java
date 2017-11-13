package com.seoul.his.msv.sup.pathology.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.msv.sup.pathology.service.PathologyServiceFacade;
import com.seoul.his.msv.sup.pathology.to.SpecimenAcquisitionBean;

/**
 * @Package  	com.seoul.his.msv.sup.pathology.controller
 * @Class    	SpecimenAcquisitionController.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Controller
public class SpecimenAcquisitionController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	PathologyServiceFacade pathologyServiceFacade;

	// 검체접수 리스트 조회 (검체인수 확인을 하기 위해 검체접수 리스트 조회)
	@RequestMapping("sup/pathology/findSpecimenAcquisitionList.do")
	public void findSpecimenAcquisitionList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SpecimenAcquisitionBean> specimenAcquisitionList = pathologyServiceFacade.findSpecimenAcquisitionList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, specimenAcquisitionList, SpecimenAcquisitionBean.class);
	}

	// 검체인수 일괄처리
	@RequestMapping("sup/pathology/batchSpecimenAcquisitionProcess.do")
	public void batchSpecimenAcquisitionProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<SpecimenAcquisitionBean> batchSpecimenAcquisitionList = dataSetBeanMapper.datasetToBeans(inData, SpecimenAcquisitionBean.class);
		System.out.println(batchSpecimenAcquisitionList.size());
		//System.out.println(batchSpecimenAcquisitionList.get(0).getAcquisitionDate());
		pathologyServiceFacade.batchSpecimenAcquisitionProcess(batchSpecimenAcquisitionList);
	}
}
