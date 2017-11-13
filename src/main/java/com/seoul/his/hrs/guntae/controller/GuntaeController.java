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
import com.seoul.his.common.util.NexacroLogger;
import com.seoul.his.hrs.guntae.service.GuntaeServiceFacade;
import com.seoul.his.hrs.guntae.to.DayGuntaeBean;
import com.seoul.his.hrs.guntae.to.MonGuntaeBean;
import com.seoul.his.hrs.guntae.to.MonGuntaeCloseBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.controller
 *    |_ GuntaeController.java
 *
 * </pre>
 * @date : 2016. 12. 22. 오후 7:47:07
 * @version :
 * @author : User
 */
@RequestMapping("hrs/guntae")
@Controller
public class GuntaeController {

	 @Autowired
	    GuntaeServiceFacade guntaeServiceFacade;
	    @Autowired
	    DataSetBeanMapper dataSetBeanMapper;

	  //일근태 생성
	    @RequestMapping("/callDayGuntae.do")
	    public void createDayGuntae(HttpServletRequest request,
	            HttpServletResponse response) throws Exception{
	        PlatformData outData = (PlatformData)request.getAttribute("outData");
	        PlatformData inData = (PlatformData)request.getAttribute("inData");
	        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

	        List<DayGuntaeBean> list = guntaeServiceFacade.createDayGuntae(argsMap);

	        dataSetBeanMapper.beansToDataset(outData, list, DayGuntaeBean.class);

	    }

	    //일근태 조회
	    @RequestMapping("/findDayGuntaeList.do")
	    public void findDayGuntaeList(HttpServletRequest request,
	            HttpServletResponse response) throws Exception{
	        PlatformData outData = (PlatformData)request.getAttribute("outData");
	        PlatformData inData = (PlatformData)request.getAttribute("inData");
	        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

	        List<DayGuntaeBean> list = guntaeServiceFacade.findDayGuntaeList(argsMap);
	        dataSetBeanMapper.beansToDataset(outData, list, DayGuntaeBean.class);

	    }

	    //월근태 조회
	    @RequestMapping("/findMonGuntaeList.do")
	    public void findMonGuntaeList(HttpServletRequest request,
	            HttpServletResponse response) throws Exception{
	        PlatformData outData = (PlatformData)request.getAttribute("outData");
	        PlatformData inData = (PlatformData)request.getAttribute("inData");
	        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

	        List<MonGuntaeBean> list = guntaeServiceFacade.findMonGuntaeList(argsMap);
	        dataSetBeanMapper.beansToDataset(outData, list, MonGuntaeBean.class);

	    }

	  //월근태 생성
	    @RequestMapping("/callMonGuntae.do")
	    public void createMonGuntae(HttpServletRequest request,
	            HttpServletResponse response) throws Exception{
	        PlatformData outData = (PlatformData)request.getAttribute("outData");
	        PlatformData inData = (PlatformData)request.getAttribute("inData");
	        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

	        List<MonGuntaeBean> list = guntaeServiceFacade.createMonGuntae(argsMap);
	        NexacroLogger.debug(inData);
	        dataSetBeanMapper.beansToDataset(outData, list, MonGuntaeBean.class);
	    }

	    //월근태 마감
	    @RequestMapping("/callCloseMonGuntae.do")
	    public void closeMonGuntae(HttpServletRequest request,
	            HttpServletResponse response) throws Exception{
	        PlatformData outData = (PlatformData)request.getAttribute("outData");
	        PlatformData inData = (PlatformData)request.getAttribute("inData");
	        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

	        List<MonGuntaeCloseBean> list = guntaeServiceFacade.closeMonGuntae(argsMap);

	        dataSetBeanMapper.beansToDataset(outData, list, MonGuntaeCloseBean.class);

	    }



}





