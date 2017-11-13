package com.seoul.his.bst.patientStatus.patientByDept.controller;

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
import com.seoul.his.bst.patientStatus.patientByDept.service.PatientByDeptServiceFacade;
import com.seoul.his.bst.patientStatus.patientByDept.to.PatientByDeptBean;
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
public class PatientByDeptController {
	
	@Autowired
	DataSetBeanMapper dataSetBeanMapper; 
	@Autowired
	PatientByDeptServiceFacade patientByDeptServiceFacade;
	
	@RequestMapping("bst/patientByDept/findPatientByDeptList.do")
	public void findPatientByDeptList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		Map<String,String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<PatientByDeptBean> list = patientByDeptServiceFacade.findPatientByDeptList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, list, PatientByDeptBean.class);
	}
	
	
	
	@RequestMapping("bst/patientByDept/batchPatientByDeptProcess.do") //xxx.do로 넥사크로에서 요청하는 패키지구조와 xxx.do를 기입
	public void batchPatientByDeptProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
	PlatformData inData = (PlatformData) request.getAttribute("inData");
	List<PatientByDeptBean> patientByDeptBeanList = dataSetBeanMapper.datasetToBeans(inData, PatientByDeptBean.class);
	patientByDeptServiceFacade.batchPatientByDeptProcess(patientByDeptBeanList);
	}

}
