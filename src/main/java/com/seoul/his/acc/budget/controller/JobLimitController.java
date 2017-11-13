package com.seoul.his.acc.budget.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.budget.service.BudgetServiceFacade;
import com.seoul.his.acc.budget.to.JobLimitBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    JobLimitController.java
 * @Create   2016. 6. 17.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class JobLimitController {
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	BudgetServiceFacade budgServiceFacade;
	
	// 부서별 적정인원 조회
	@RequestMapping("acc/budget/findJobLimitList.do")
	public void findJobLimit(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData)request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<JobLimitBean> jobLimitList = budgServiceFacade.findJobLimit(argsMap);
		
		dataSetBeanMapper.beansToDataset(outData, jobLimitList, JobLimitBean.class);
	}
	
	// 부서별 적정인원 저장
	@RequestMapping("acc/budget/modifyJobLimit.do")
	public void modifyJobLimit(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<JobLimitBean> jobLimitList = dataSetBeanMapper.datasetToBeans(inData, JobLimitBean.class);
		budgServiceFacade.modifyJobLimit(jobLimitList);
	}
}
