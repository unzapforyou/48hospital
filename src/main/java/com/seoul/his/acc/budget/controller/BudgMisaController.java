package com.seoul.his.acc.budget.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.nexacro.xapi.data.VariableList;
import com.seoul.his.acc.budget.service.BudgetServiceFacade;
import com.seoul.his.acc.budget.to.BudgMisaBean;
import com.seoul.his.acc.budget.to.BudgMisaTagetBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    BudgMisaController.java
 * @Create   2016. 6. 11.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class BudgMisaController {
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	BudgetServiceFacade budgetServiceFacade;
	
	// 예산목간전용 조회
	@RequestMapping("acc/budget/findBudgMisaList.do")
	public void findBudgMisaList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData); 
		List<BudgMisaBean> budgMisaList = budgetServiceFacade.findBudgMisaList(argsMap);
		List<BudgMisaTagetBean> budgMisaTagetList = new ArrayList<BudgMisaTagetBean>();
		
		for(BudgMisaBean budgMisaBean : budgMisaList){
			List<BudgMisaTagetBean> budgMisaTagetBeans = budgMisaBean.getBudgMisaTagetList();
			for(BudgMisaTagetBean budgMisaTagetBean : budgMisaTagetBeans){
				budgMisaTagetList.add(budgMisaTagetBean);
			}
		}
		
		dataSetBeanMapper.beansToDataset(outData, budgMisaList, BudgMisaBean.class);
		dataSetBeanMapper.beansToDataset(outData, budgMisaTagetList, BudgMisaTagetBean.class);
	}
	
	@RequestMapping("acc/budget/getMisaNo.do")
	public void getMisaNo(HttpServletRequest request, HttpServletResponse response){
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		String misaNo = budgetServiceFacade.getMisaNo();
		VariableList variableList = outData.getVariableList();
		variableList.add("misaNo", misaNo);
	}
	
	// 전용확정
	@RequestMapping("acc/budget/deciBudgMisa.do")
	public void deciBudgMisa(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
	    PlatformData outData = (PlatformData) request.getAttribute("outData");
	    Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		budgetServiceFacade.deciBudgMisa(argsMap);
		
		List<BudgMisaBean> budgMisaList = budgetServiceFacade.findBudgMisaList(argsMap);
		List<BudgMisaTagetBean> budgMisaTagetList = new ArrayList<BudgMisaTagetBean>();
		for(BudgMisaBean budgMisaBean : budgMisaList){
			List<BudgMisaTagetBean> budgMisaTagetBeans = budgMisaBean.getBudgMisaTagetList();
			for(BudgMisaTagetBean budgMisaTagetBean : budgMisaTagetBeans){
				budgMisaTagetList.add(budgMisaTagetBean);
			}
		}
		
		dataSetBeanMapper.beansToDataset(outData, budgMisaList, BudgMisaBean.class);
		dataSetBeanMapper.beansToDataset(outData, budgMisaTagetList, BudgMisaTagetBean.class);
	}
	
	// 예상목간전용 저장
	@RequestMapping("acc/budget/appBudgMisa.do")
	public void appBudgMisa(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<BudgMisaBean> budgMisaList = dataSetBeanMapper.datasetToBeans(inData, BudgMisaBean.class);
		List<BudgMisaTagetBean> budgMisaTagetList = dataSetBeanMapper.datasetToBeans(inData, BudgMisaTagetBean.class);
		budgetServiceFacade.appBudgMisa(budgMisaList, budgMisaTagetList);
	}
}
