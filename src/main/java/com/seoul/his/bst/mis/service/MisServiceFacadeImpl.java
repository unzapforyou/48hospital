package com.seoul.his.bst.mis.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.seoul.his.bst.mis.applicationService.MisApplicationService;
import com.seoul.his.bst.mis.to.MisBean;
import com.seoul.his.hdm.patient.to.PatientBean;


/**
 * @Package  com.seoul.his.acc.budget.service
 * @Class    BudgetServiceFacadeImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Service
public class MisServiceFacadeImpl implements MisServiceFacade{

	@Autowired
	MisApplicationService misApplicationService;



	@Override
	public List<PatientBean> findPatientList() {
		List<PatientBean> patientList = misApplicationService.findPatientList();
		return patientList;
	}
	
}
