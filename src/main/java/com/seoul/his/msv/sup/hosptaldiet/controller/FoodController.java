package com.seoul.his.msv.sup.hosptaldiet.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.msv.sup.hosptaldiet.service.HosptalDietServiceFacade;
import com.seoul.his.msv.sup.hosptaldiet.to.FoodBean;
import com.seoul.his.msv.sup.hosptaldiet.to.FoodDtlBean;
import com.seoul.his.msv.sup.hosptaldiet.to.HosptalDietCodeBean;
import com.seoul.his.msv.sup.hosptaldiet.to.IngredBean;

/**
 * <pre>
 * com.seoul.his.msv.sup.hosptaldiet.controller
 *    |_ FoodController.java
 *
 * </pre>
 * @date : 2016. 12. 6. 오후 2:20:52
 * @version :
 * @author : 응디꿍디
 */
@Controller
public class FoodController {
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	HosptalDietServiceFacade hosptaldietServiceFacade;

	@RequestMapping("msv/sup/hosptaldiet/findFoodCodeList.do")
	public void findFoodCodeList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<HosptalDietCodeBean> foodCodeList = hosptaldietServiceFacade.findFoodCodeList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, foodCodeList, HosptalDietCodeBean.class);
	}

	@RequestMapping("msv/sup/hosptaldiet/findFoodList.do")
	public void findFoodList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<FoodBean> foodList = hosptaldietServiceFacade.findFoodList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, foodList, FoodBean.class);
	}
	@RequestMapping("msv/sup/hosptaldiet/findFoodDtlList.do")
	public void findFoodDtlList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<FoodDtlBean> foodDtlList = hosptaldietServiceFacade.findFoodDtlList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, foodDtlList, FoodDtlBean.class);
	}

	@RequestMapping("msv/sup/hosptaldiet/batchFoodListProcess.do")
	public void batchFoodListProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<FoodBean> foodList = dataSetBeanMapper.datasetToBeans(inData, FoodBean.class);
		List<FoodDtlBean> foodDtlList = dataSetBeanMapper.datasetToBeans(inData, FoodDtlBean.class);
		hosptaldietServiceFacade.batchFoodProcess(foodList);
		hosptaldietServiceFacade.batchFoodDtlProcess(foodDtlList);

	}
}




