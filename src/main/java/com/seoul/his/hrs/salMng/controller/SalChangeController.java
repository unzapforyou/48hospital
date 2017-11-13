package com.seoul.his.hrs.salMng.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.salMng.service.SalMngServiceFacade;
import com.seoul.his.hrs.salMng.to.SalChangeBean;
import com.seoul.his.hrs.salMng.to.SalChangeEmpBean;
import com.seoul.his.hrs.salMng.to.SalChangePayDeduBean;

/**
 * @Package  com.seoul.his.hrs.salMng.controller
 * @Class    SalChangeController.java
 * @Create   2016. 5. 27.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class SalChangeController {
	@Autowired
	public SalMngServiceFacade salMngServiceFacade;

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;

	@RequestMapping("hrs/salMng/findSalChangeList.do")
	public void findSalChangeList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SalChangeBean> salChangeList = salMngServiceFacade.findSalChangeList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, salChangeList, SalChangeBean.class);
	}
	
	@RequestMapping("hrs/salMng/findSalEmpList.do")
	public void findSalEmpList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SalChangeEmpBean> salChangeEmpList = salMngServiceFacade.findSalEmpList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, salChangeEmpList, SalChangeEmpBean.class);
	}
	
	@RequestMapping("hrs/salMng/findPayDeduList.do")
	public void findPayDeduList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SalChangePayDeduBean> salChangePayDeduList = salMngServiceFacade.findPayDeduList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, salChangePayDeduList, SalChangePayDeduBean.class);
	}
}
