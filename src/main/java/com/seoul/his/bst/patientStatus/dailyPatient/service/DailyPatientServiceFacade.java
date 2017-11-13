package com.seoul.his.bst.patientStatus.dailyPatient.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.dailyPatient.to.DailyPatientBean;


public interface DailyPatientServiceFacade {

	List<DailyPatientBean> findDailyPatientList(Map<String, String> argsMap);

	void batchDailyPatientProcess(List<DailyPatientBean> dailyPatientBeanList);

}
