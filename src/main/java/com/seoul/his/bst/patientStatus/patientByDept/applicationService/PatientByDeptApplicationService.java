package com.seoul.his.bst.patientStatus.patientByDept.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.patientByDept.exception.PatientByDeptException;
import com.seoul.his.bst.patientStatus.patientByDept.to.PatientByDeptBean;


public interface PatientByDeptApplicationService {

	List<PatientByDeptBean> findPatientByDeptList(Map<String, String> argsMap);

	void batchPatientByDeptProcess(List<PatientByDeptBean> patientByDeptBeanList);




}
