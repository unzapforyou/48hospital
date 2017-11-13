package com.seoul.his.bst.patientStatus.patientByDept.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.patientByDept.to.PatientByDeptBean;

public interface PatientByDeptDAO {

	List<PatientByDeptBean> selectPatientByDeptList(Map<String, String> argsMap);

	void insertPatientByDept(PatientByDeptBean patientByDeptBean);

	void updatePatientByDept(PatientByDeptBean patientByDeptBean);

	void deleteEmp(PatientByDeptBean patientByDeptBean);


}
