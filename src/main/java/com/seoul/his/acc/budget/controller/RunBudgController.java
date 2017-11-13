
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
import com.seoul.his.acc.budget.to.RunBudgBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * <pre>
 * com.seoul.his.acc.budget.controller
 *    |_ RunBudgController.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 3:20:56
 * @version :
 * @author : 응디꿍디
 */

@Controller
public class RunBudgController {
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	BudgetServiceFacade budgetServiceFacade;
	
	// 예산현황 조회
		@RequestMapping("acc/budget/findRunBudg.do")
		public void findRunBudg(HttpServletRequest request, HttpServletResponse response) throws Exception{
		    PlatformData inData = (PlatformData)request.getAttribute("inData");
			PlatformData outData = (PlatformData) request.getAttribute("outData");
			Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
			List<RunBudgBean> runBudgList = budgetServiceFacade.findRunBudg(argsMap);
			System.out.println("예산돌아간댜");
			System.out.println(runBudgList.get(0));
			dataSetBeanMapper.beansToDataset(outData, runBudgList, RunBudgBean.class);
		}
	
	// 비목코드조회
	@RequestMapping("acc/budget/findRunBudgList.do")
	public void findRunBudgList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData)request.getAttribute("inData");
	    PlatformData outData = (PlatformData) request.getAttribute("outData");
	    Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);   
		List<RunBudgBean> runBudgList = budgetServiceFacade.findRunBudgList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, runBudgList, RunBudgBean.class);
	}
}

