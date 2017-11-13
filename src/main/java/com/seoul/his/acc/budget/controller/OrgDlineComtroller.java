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
import com.seoul.his.acc.budget.to.OrgDlineBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    OrgDlineComtroller.java
 * @Create   2016. 6. 17.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class OrgDlineComtroller {
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	BudgetServiceFacade budgetServiceFacade;
	
	// 예산편성 마감 조회
	@RequestMapping("acc/budget/findOrgDlineList.do")
	public void findOrgDlineList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData)request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<OrgDlineBean> orgDlineList = budgetServiceFacade.findOrgDlineList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, orgDlineList, OrgDlineBean.class);
	}
	
	// 예산편성 마감 저장
	@RequestMapping("acc/budget/registerOrgDline.do")
	public void registerOrgDline(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		OrgDlineBean orgDlineBean = dataSetBeanMapper.datasetToBean(inData, OrgDlineBean.class);
		List<OrgDlineBean> orgDlineList = budgetServiceFacade.registerOrgDline(orgDlineBean);
    	dataSetBeanMapper.beansToDataset(outData, orgDlineList, OrgDlineBean.class);
    }
}
