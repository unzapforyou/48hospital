package com.seoul.his.hrs.salMng.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.salMng.service.SalMngServiceFacade;
import com.seoul.his.hrs.salMng.to.SalCalEmpBean;
import com.seoul.his.hrs.salMng.to.SalCalPayDedBean;
import com.seoul.his.hrs.salMng.to.SalStatmPDFBean;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * @Package  com.seoul.his.hrs.salMng.controller
 * @Class    SalStatementController.java
 * @Create   2016. 5. 27.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class SalStatementController {

	@Autowired
	public SalMngServiceFacade salMngServiceFacade;

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;

	@RequestMapping("hrs/salMng/findSalCalEmpList.do")
	public void findSalCalEmpList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SalCalEmpBean> SalCalEmpList = salMngServiceFacade.findSalCalEmpList(argsMap);
		List<SalCalPayDedBean> salCalPayDedList = new ArrayList<>();

		for(SalCalEmpBean salCalEmpBean: SalCalEmpList){
			salCalPayDedList.addAll(salCalEmpBean.getSalCalPayDeduList());
		}

		dataSetBeanMapper.beansToDataset(outData, SalCalEmpList, SalCalEmpBean.class);
		dataSetBeanMapper.beansToDataset(outData, salCalPayDedList, SalCalPayDedBean.class);
	}
	
	//PDF출력
	@RequestMapping("/hrs/salMng/salStatePDF.do")
	public ModelAndView salStatePDF(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    String empNo = request.getParameter("empNo");
		String[] empNoArr = empNo.split(",");
		String belongYm = request.getParameter("belongYm");
		String paymentDate = request.getParameter("paymentDate");
		
		System.out.println(empNo+" "+belongYm+" "+paymentDate);
				
		Map<String, String> queryMap = new HashMap<>();
		
		List<SalStatmPDFBean> salStatmEmpListSum = new ArrayList<>();
		List<SalStatmPDFBean> salStatmEmpList;

		for(int i =0; i<empNoArr.length; i++){
			queryMap.put("empNo", empNoArr[i]);
			queryMap.put("belongYm", belongYm);
			queryMap.put("paymentDate", paymentDate);
			salStatmEmpList = salMngServiceFacade.findSalStatmEmp(queryMap);
			salStatmEmpListSum.addAll(salStatmEmpList);
		}

		JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(salStatmEmpListSum);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("salStateReport-view");
		String format = "pdf";
		mav.addObject("format", format);
		mav.addObject("source", source);
		return mav;
	}
}
