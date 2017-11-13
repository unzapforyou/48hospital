package com.seoul.his.hrs.salBase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.salBase.service.SalBaseServiceFacade;
import com.seoul.his.hrs.salBase.to.SalStandardSetBean;

/**
 * @Package  com.seoul.his.hrs.salBase.controller
 * @Class    SalStandardSetController.java
 * @Create   2016. 5. 25.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class SalStandardSetController {

	@Autowired
	public SalBaseServiceFacade salBaseServiceFacade;

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;

	@RequestMapping("hrs/salBase/findSalStandardList.do")
	public void findSalStandardList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<SalStandardSetBean> salStandardList = salBaseServiceFacade.findSalStandardList();
		dataSetBeanMapper.beansToDataset(outData, salStandardList, SalStandardSetBean.class);
	}

	@RequestMapping("hrs/salBase/batchSalStanSetProcess.do")
	public void batchSalStanSetProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<SalStandardSetBean> salStanList
								= dataSetBeanMapper.datasetToBeans(inData, SalStandardSetBean.class);
		salBaseServiceFacade.batchSalStanSetProcess(salStanList);
	}
}








