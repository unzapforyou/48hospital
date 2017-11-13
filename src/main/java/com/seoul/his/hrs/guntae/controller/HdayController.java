package com.seoul.his.hrs.guntae.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.guntae.service.GuntaeServiceFacade;
import com.seoul.his.hrs.guntae.to.HdayBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.controller
 *    |_ HdayController.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 7:51:49
 * @version :
 * @author : User
 */
@Controller
@RequestMapping("hrs/hday")
public class HdayController {

	 @Autowired
	    GuntaeServiceFacade guntaeServiceFacade;
	    @Autowired
	    DataSetBeanMapper dataSetBeanMapper;


	    //휴일 조회
	    @RequestMapping("/findHday.do")
	    public void findHday(HttpServletRequest request,
	            HttpServletResponse response) throws Exception{

	        PlatformData inData = (PlatformData)request.getAttribute("inData");
	        PlatformData outData = (PlatformData)request.getAttribute("outData");

	        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

	        List<HdayBean> list = guntaeServiceFacade.findHdayList(argsMap);

	        dataSetBeanMapper.beansToDataset(outData, list, HdayBean.class);


	    }

	  //휴일 일괄처리
	    @RequestMapping("/batchHdayProcess.do")
	    public void batchHdayProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{

	        PlatformData inData = (PlatformData)request.getAttribute("inData");
	        PlatformData outData = (PlatformData)request.getAttribute("outData");
	        List<HdayBean> list;
	        list = dataSetBeanMapper.datasetToBeans(inData, HdayBean.class);
	        guntaeServiceFacade.batchHdayProcess(list);
	    }
}