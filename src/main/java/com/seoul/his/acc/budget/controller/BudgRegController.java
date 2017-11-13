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
import com.seoul.his.acc.budget.to.BudgRegBean;
import com.seoul.his.acc.budget.to.OrgDlineBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    BudgRegController.java
 * @Create   2016. 6. 13.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class BudgRegController {
	
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	BudgetServiceFacade budgetServiceFacade;
	
	// 예산조회
	@RequestMapping("acc/budget/findBudg.do")
	public void findBudg(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData)request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
    	List<BudgRegBean> BudgRegList = budgetServiceFacade.findBudg(argsMap);
    	OrgDlineBean orgDlineBean = budgetServiceFacade.findOrgDline(argsMap);
    	dataSetBeanMapper.beansToDataset(outData, BudgRegList, BudgRegBean.class);
    	dataSetBeanMapper.beanToDataset(outData, orgDlineBean, OrgDlineBean.class);
	}
	
	// 예산등록
	@RequestMapping("acc/budget/registerBudg.do")
	public void registerBudg(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<BudgRegBean> budgRegList = dataSetBeanMapper.datasetToBeans(inData, BudgRegBean.class);
		
		budgetServiceFacade.registerBudg(budgRegList);
	}
}
