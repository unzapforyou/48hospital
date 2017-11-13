package com.seoul.his.hrs.salBase.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.salBase.service.SalBaseServiceFacade;
import com.seoul.his.hrs.salBase.to.PaydayBean;

/**
 * @Package  com.erp45.hrs.salBase.controller
 * @Class    PaydayController.java
 * @Create   2016. 5. 25.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class PaydayController {
	@Autowired
	public SalBaseServiceFacade salBaseServiceFacade;

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;

	@RequestMapping("hrs/salBase/findPaydayList.do")
	public void findPaydayList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData); //yearMonth
		List<PaydayBean> findPaydayList = salBaseServiceFacade.findPaydayList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, findPaydayList, PaydayBean.class);
	}
	
	@RequestMapping("hrs/salBase/findPaydaySubList.do")
	public void findPaydaySubList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);//yearMonth
		List<PaydayBean> findPaydaySubList = salBaseServiceFacade.findPaydaySubList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, findPaydaySubList, PaydayBean.class);
	}

	//일괄처리
	@RequestMapping("hrs/salBase/batchPaydayProcess.do")
	public void batchPaydayProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<PaydayBean> paydayList= dataSetBeanMapper.datasetToBeans(inData, PaydayBean.class);
		salBaseServiceFacade.batchPaydayProcess(paydayList);
	}	

}
