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
import com.seoul.his.acc.budget.to.BudgBimokBean;
import com.seoul.his.acc.budget.to.BudgUseDeptBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    BudgUseDeptController.java
 * @Create   2016. 6. 14.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class BudgUseDeptController {
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	BudgetServiceFacade budgetServiceFacade;
	
	// 예산사용부서 조회
	@RequestMapping("acc/budget/findBudgUseDeptList.do")
	public void findBudgUseDeptList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
	    PlatformData outData = (PlatformData) request.getAttribute("outData");
	    Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData); 
		List<BudgBimokBean> bimokList = budgetServiceFacade.findBimokList(argsMap);
		List<BudgUseDeptBean> budgUseDeptBeanList = budgetServiceFacade.findBudgUseDept(argsMap);
		
//		for(BudgBimokBean budgBimokBean : bimokList){
//			List<BudgUseDeptBean> budgUseDeptBeans = budgBimokBean.getBudgUseDeptBeanList();
//			for(BudgUseDeptBean budgUseDeptBean : budgUseDeptBeans){
//				budgUseDeptBeanList.add(budgUseDeptBean);
//			}
//		}
		
		dataSetBeanMapper.beansToDataset(outData, bimokList, BudgBimokBean.class);
		dataSetBeanMapper.beansToDataset(outData, budgUseDeptBeanList, BudgUseDeptBean.class);
	}
	
	// 예산사용부서 저장
	@RequestMapping("acc/budget/batchBudgUseDeptProcess.do")
	public void batchBudgUseDeptProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<BudgUseDeptBean> budgUseDeptBeanList = dataSetBeanMapper.datasetToBeans(inData, BudgUseDeptBean.class);
		budgetServiceFacade.batchBudgUseDeptProcess(budgUseDeptBeanList);
	}
	
}
