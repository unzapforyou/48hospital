package com.seoul.his.bst.patientStatus.patientByDept.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.patientByDept.to.PatientByDeptBean;


public interface PatientByDeptServiceFacade {

	List<PatientByDeptBean> findPatientByDeptList(Map<String, String> argsMap);

	void batchPatientByDeptProcess(List<PatientByDeptBean> patientByDeptBeanList);

}
