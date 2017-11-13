package com.seoul.his.bst.patientStatus.monthlyPatient.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.monthlyPatient.to.MonthlyPatientBean;

public interface MonthlyPatientDAO {

	List<MonthlyPatientBean> selectMonthlyPatientList(Map<String, String> argsMap);

	void insertMonthlyPatient(MonthlyPatientBean monthlyPatientBean);

	void updateMonthlyPatient(MonthlyPatientBean monthlyPatientBean);

	void deleteEmp(MonthlyPatientBean monthlyPatientBean);


}
