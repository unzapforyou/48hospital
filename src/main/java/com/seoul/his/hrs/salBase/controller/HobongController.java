package com.seoul.his.hrs.salBase.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.salBase.service.SalBaseServiceFacade;
import com.seoul.his.hrs.salBase.to.HobongBean;
import com.seoul.his.hrs.salBase.to.HobongHistoryBean;
import com.seoul.his.hrs.salBase.to.JobBean;

/**
 * @Package  com.seoul.his.hrs.salBase.controller
 * @Class    HobongController.java
 * @Create   2016. 5. 25.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class HobongController {

	@Autowired
	public SalBaseServiceFacade salBaseServiceFacade;

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;

	//대상직급
	@RequestMapping("hrs/salBase/findJobList.do")
	public void findJabList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<JobBean> jobList = salBaseServiceFacade.findJobList();
		dataSetBeanMapper.beansToDataset(outData, jobList, JobBean.class);
	}

	//호봉리스트
	@RequestMapping("hrs/salBase/findHobongList.do")
	public void findHobongList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<HobongBean> hobongList = salBaseServiceFacade.findHobongList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, hobongList, HobongBean.class);
	}
	
	//호봉이력
	@RequestMapping("hrs/salBase/findHobongHistoryList.do")
	public void findHobongHistoryList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<HobongHistoryBean> hobongHisListt = salBaseServiceFacade.findHobongHistoryList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, hobongHisListt, HobongHistoryBean.class);
	}
	
	//일괄처리
	@RequestMapping("hrs/salBase/batchHobongProcess.do")
	public void processHobongBatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		String detailCode = argsMap.get("detailCode");
		List<HobongBean> hobongList=dataSetBeanMapper.datasetToBeans(inData, HobongBean.class);
		List<HobongHistoryBean> hobongHisList=dataSetBeanMapper.datasetToBeans(inData, HobongHistoryBean.class);

		for(int i=0;i<hobongHisList.size(); i++){
			hobongHisList.get(i).setDetailCode(detailCode);
		}
		
		salBaseServiceFacade.batchHobongProcess(hobongList);
		salBaseServiceFacade.batchHobongHisProcess(hobongHisList);
	}
}
