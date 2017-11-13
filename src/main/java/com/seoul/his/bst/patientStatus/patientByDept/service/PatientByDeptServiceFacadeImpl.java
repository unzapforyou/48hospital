package com.seoul.his.bst.patientStatus.patientByDept.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.seoul.his.bst.patientStatus.patientByDept.applicationService.PatientByDeptApplicationService;
import com.seoul.his.bst.patientStatus.patientByDept.to.PatientByDeptBean;


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
public class PatientByDeptServiceFacadeImpl implements PatientByDeptServiceFacade{

	@Autowired
	PatientByDeptApplicationService patientByDeptApplicationService;

	@Override
		public List<PatientByDeptBean> findPatientByDeptList(Map<String, String> argsMap) {
		List<PatientByDeptBean> patientByDeptList = patientByDeptApplicationService.findPatientByDeptList(argsMap);
		return patientByDeptList;
	}
	
	
	@Override
    public void batchPatientByDeptProcess(List<PatientByDeptBean> patientByDeptBeanList) {
		patientByDeptApplicationService.batchPatientByDeptProcess(patientByDeptBeanList);
    }
	
}
