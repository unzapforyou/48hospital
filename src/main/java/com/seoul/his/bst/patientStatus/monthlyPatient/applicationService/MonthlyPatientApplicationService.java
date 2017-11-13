package com.seoul.his.bst.patientStatus.monthlyPatient.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.monthlyPatient.exception.MonthlyPatientException;
import com.seoul.his.bst.patientStatus.monthlyPatient.to.MonthlyPatientBean;


public interface MonthlyPatientApplicationService {

	List<MonthlyPatientBean> findMonthlyPatientList(Map<String, String> argsMap);

	void batchMonthlyPatientProcess(List<MonthlyPatientBean> monthlyPatientBeanList);




}
