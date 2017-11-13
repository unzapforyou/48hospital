package com.seoul.his.bst.patientStatus.monthlyPatient.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.monthlyPatient.to.MonthlyPatientBean;


public interface MonthlyPatientServiceFacade {

	List<MonthlyPatientBean> findMonthlyPatientList(Map<String, String> argsMap);

	void batchMonthlyPatientProcess(List<MonthlyPatientBean> monthlyPatientBeanList);

}
