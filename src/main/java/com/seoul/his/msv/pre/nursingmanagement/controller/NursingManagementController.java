package com.seoul.his.msv.pre.nursingmanagement.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.msv.pre.nursingmanagement.service.NursingManagementServiceFacade;
import com.seoul.his.msv.pre.nursingmanagement.to.NursingManagementBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    BudgBimokController.java
 * @Create   2016. 6. 10.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class NursingManagementController {
	
	@Autowired
	DataSetBeanMapper dataSetBeanMapper; 
	@Autowired
	NursingManagementServiceFacade nursingmanagementServiceFacade;
	
	@RequestMapping("msv/pre/nursingmanagement/findNursingManagementList.do")
	public void findNursingManagementList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData); 
		List<NursingManagementBean> nursingmanagementList = nursingmanagementServiceFacade.findNursingManagementList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, nursingmanagementList, NursingManagementBean.class);
	}
}
