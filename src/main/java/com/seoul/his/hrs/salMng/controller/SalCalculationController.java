package com.seoul.his.hrs.salMng.controller;

import java.util.ArrayList;
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
import com.seoul.his.hrs.salMng.to.SalCalculDetailBean;
import com.seoul.his.hrs.salMng.to.SalCalculSumBean;
import com.seoul.his.hrs.salMng.to.SalCalculationBean;

/**
 * @Package  com.seoul.his.hrs.salMng.controller
 * @Class    SalCalculationController.java
 * @Create   2016. 5. 27.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 7. 05.
 */

@Controller
public class SalCalculationController {

	@Autowired
	public SalMngServiceFacade salMngServiceFacade;

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;
	
	@RequestMapping("hrs/salMng/findSalCalList.do")
	public void findSalCalList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SalCalculationBean> salCalculList = salMngServiceFacade.findSalCalList(argsMap);
		List<SalCalculDetailBean> salCalculDetailList = new ArrayList<>();
                          
		for(SalCalculationBean salCalculationBean: salCalculList){
			salCalculDetailList.addAll(salCalculationBean.getSalCalculDetailList());
		}
		
		dataSetBeanMapper.beansToDataset(outData, salCalculList, SalCalculationBean.class);
		dataSetBeanMapper.beansToDataset(outData, salCalculDetailList, SalCalculDetailBean.class);
	}
	
	//급여총액
	@RequestMapping("hrs/salMng/findSalCalSumList.do")
	public void findSalCalSumList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SalCalculSumBean> salCalculSumList = salMngServiceFacade.findSalCalSumList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, salCalculSumList, SalCalculSumBean.class);
	}
	
	//급여계산
	@RequestMapping("hrs/salMng/salCalculationList.do")
	public void salCalculationList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        salMngServiceFacade.salCalculation(argsMap);  
	}
    
    //마감취소
    @RequestMapping("hrs/salMng/magamCancelSalCalList.do")
    public void magamCancelSalCalList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        salMngServiceFacade.magamCancelSalCalList(argsMap);
    }
    
    //마감
    @RequestMapping("hrs/salMng/magamSalCalList.do")
    public void magamSalCalList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("magamSalCalList con");
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        salMngServiceFacade.magamSalCalList(argsMap);       
    }
    
    @RequestMapping("hrs/salMng/callUpdateSal.do")
    public void callUpdateSal (HttpServletRequest request, HttpServletResponse response) throws Exception{
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        SalCalculDetailBean salCalculDetailBean = dataSetBeanMapper.datasetToBean(inData, SalCalculDetailBean.class);
        salMngServiceFacade.callUpdateSal(salCalculDetailBean);
    }
}
