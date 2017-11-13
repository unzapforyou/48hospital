package com.seoul.his.bst.mis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.seoul.his.bst.mis.service.MisServiceFacade;
import com.seoul.his.com.sockjs.ws.EchoHandler;
import com.seoul.his.hdm.patient.service.PatientServiceFacade;
import com.seoul.his.hdm.patient.to.PatientBean;

/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    RestPatientController.java
 * @Create   2016. 12. 26.
 * @Author   berics
 * @Description Restful 을 이용하여 환자 Bean을  List 에 담아 Bean List 를 외부로 Json 형태로 리턴해주는 컨트롤러입니다.
 * 
 * @LastUpdated 
 */


@RestController
public class MisController {
	

	@Autowired
	MisServiceFacade misServiceFacade;
	
	@Autowired
	EchoHandler echoHandler;
	
	@Autowired
	Gson gson;
	
    @RequestMapping(value = "/findPatientList", method=RequestMethod.GET , produces="application/json; charset=UTF-8")
    public String  findPatientList(){
	List<PatientBean> list = misServiceFacade.findPatientList();
	String json = gson.toJson(list);
	try {
		echoHandler.sendMessage(json);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return json;
	}

}
