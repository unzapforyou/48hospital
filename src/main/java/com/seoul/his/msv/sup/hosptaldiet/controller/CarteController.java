package com.seoul.his.msv.sup.hosptaldiet.controller;

import java.util.HashMap;
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
import com.seoul.his.msv.sup.hosptaldiet.to.BreakfastBean;
import com.seoul.his.msv.sup.hosptaldiet.to.CarteBean;
import com.seoul.his.msv.sup.hosptaldiet.to.DCarteBean;
import com.seoul.his.msv.sup.hosptaldiet.to.DinnerBean;
import com.seoul.his.msv.sup.hosptaldiet.to.HosptalDietCodeBean;
import com.seoul.his.msv.sup.hosptaldiet.to.LunchBean;

/**
 * <pre>
 * com.seoul.his.msv.sup.hosptaldiet.controller
 *    |_ CarteController.java
 *
 * </pre>
 * @date : 2016. 12. 11. 오후 2:42:45
 * @version :
 * @author : 응디꿍디
 */
@Controller
public class CarteController {
		@Autowired
		DataSetBeanMapper dataSetBeanMapper;
		@Autowired
		HosptalDietServiceFacade hosptaldietServiceFacade;

	@RequestMapping("msv/sup/hosptalDiet/findDietSeparateCodeList.do")
	public void findDietSeparateCodeList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<HosptalDietCodeBean> foodList = hosptaldietServiceFacade.findDietSeparateCodeList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, foodList, HosptalDietCodeBean.class);
	}

	@RequestMapping("msv/sup/hosptalDiet/findCarteList.do")
	public void findCarteList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<CarteBean> carteList = hosptaldietServiceFacade.findCarteList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, carteList, CarteBean.class);
	}

	@RequestMapping("msv/sup/hosptalDiet/findDCarteList.do")
	public void findDCarteList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<DCarteBean> dCarteList = hosptaldietServiceFacade.findDCarteList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, dCarteList, DCarteBean.class);
	}

	@RequestMapping("msv/sup/hosptalDiet/batchCarteProcess.do")
	public void batchCarteProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("컨트롤러");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<BreakfastBean> breakfastList = dataSetBeanMapper.datasetToBeans(inData, BreakfastBean.class);
		List<LunchBean> lunchList = dataSetBeanMapper.datasetToBeans(inData, LunchBean.class);
		List<DinnerBean> dinnerList = dataSetBeanMapper.datasetToBeans(inData, DinnerBean.class);
		Map<String, Object> map = new HashMap<String,Object>();
		  if(breakfastList.size() > 0){
	            map.put("breakfast", breakfastList);
	        }

	        if(lunchList.size() > 0){
	            map.put("lunch", lunchList);
	        }

	        if(dinnerList.size() > 0){
	            map.put("dinner", dinnerList);
	        }
		hosptaldietServiceFacade.batchCarteProcess(map);

	}

}




