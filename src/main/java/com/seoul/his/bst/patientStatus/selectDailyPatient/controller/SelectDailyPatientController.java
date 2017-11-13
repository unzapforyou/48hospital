package com.seoul.his.bst.patientStatus.selectDailyPatient.controller;

import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.bst.patientStatus.selectDailyPatient.service.SelectDailyPatientServiceFacade;
import com.seoul.his.bst.patientStatus.selectDailyPatient.to.SelectDailyPatientBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    BudgBimokController.java
 * @Create   2016. 6. 10.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class SelectDailyPatientController {
	
	@Autowired
	DataSetBeanMapper dataSetBeanMapper; 
	@Autowired
	SelectDailyPatientServiceFacade selectDailyPatientServiceFacade;
	
	@RequestMapping("bst/selectDailyPatient/findSelectDailyPatientList.do")
	public void findSelectDailyPatientList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		Map<String,String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SelectDailyPatientBean> list = selectDailyPatientServiceFacade.findSelectDailyPatientList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, list, SelectDailyPatientBean.class);
	}
	
	
	
	@RequestMapping("bst/selectDailyPatient/batchSelectDailyPatientProcess.do") //xxx.do로 넥사크로에서 요청하는 패키지구조와 xxx.do를 기입
	public void batchSelectDailyPatientProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
	PlatformData inData = (PlatformData) request.getAttribute("inData");
	List<SelectDailyPatientBean> selectDailyPatientBeanList = dataSetBeanMapper.datasetToBeans(inData, SelectDailyPatientBean.class);
	selectDailyPatientServiceFacade.batchSelectDailyPatientProcess(selectDailyPatientBeanList);
	}

}
