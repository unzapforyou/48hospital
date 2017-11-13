package com.seoul.his.hrs.ret.controller;

import java.util.Map;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.ret.service.RetServiceFacade;
import com.seoul.his.hrs.ret.to.RetPlanEmpBean;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.controller
 * @Class    RetPlanEmpController.java
 * @Create   2016. 6. 27.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */

@Controller
public class RetPlanEmpController {

	@Autowired
	RetServiceFacade retServiceFacade;
	
	@Autowired
	DataSetBeanMapper datasetBeanMapper;
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("hrs/ret/findRetPlanEmpList.do")
	public void findRetPlanEmpList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		PlatformData outData = (PlatformData)request.getAttribute("outData");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		Map<String, String> argsMap;
		argsMap = datasetBeanMapper.variablesToMap(inData);
		List<RetPlanEmpBean> retPlanEmpList;
		System.out.println("사이즈"+argsMap.size());
		retPlanEmpList = retServiceFacade.findRetPlanEmpList(argsMap);
		
		datasetBeanMapper.beansToDataset(outData, retPlanEmpList, RetPlanEmpBean.class);
		
		
	}
	
	
}
