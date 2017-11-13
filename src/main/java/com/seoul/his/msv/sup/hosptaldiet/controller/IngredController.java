package com.seoul.his.msv.sup.hosptaldiet.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.msv.sup.hosptaldiet.service.HosptalDietServiceFacade;
import com.seoul.his.msv.sup.hosptaldiet.to.HosptalDietCodeBean;
import com.seoul.his.msv.sup.hosptaldiet.to.IngredBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * <pre>
 * com.seoul.his.msv.sup.hosptaldiet.controller
 *    |_ HosptalDietController.java
 * </pre>
 *
 * @date : 2016. 12. 1. 오후 2:35:00
 * @version :
 * @author : 응디꿍디
 */

@Controller
public class IngredController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	HosptalDietServiceFacade hosptaldietServiceFacade;

	@RequestMapping("msv/sup/hosptaldiet/findCodeList.do")
	public void findCodeList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<HosptalDietCodeBean> ingredCodeList = hosptaldietServiceFacade.findCodeList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, ingredCodeList, HosptalDietCodeBean.class);
	}


	@RequestMapping("msv/sup/hosptaldiet/findIngredList.do")
	public void findIngredList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    System.out.println("controller도착");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<IngredBean> ingredCodeList = hosptaldietServiceFacade.findIngredList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, ingredCodeList, IngredBean.class);
	}
	@RequestMapping("msv/sup/hosptaldiet/batchIngredProcess.do")
	public void batchIngredProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<IngredBean> ingredList = dataSetBeanMapper.datasetToBeans(inData, IngredBean.class);
		hosptaldietServiceFacade.batchIngredProcess(ingredList);

	}


}
