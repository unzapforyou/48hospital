package com.seoul.his.bst.patientStatus.dailyPatient.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.dailyPatient.exception.DailyPatientException;
import com.seoul.his.bst.patientStatus.dailyPatient.to.DailyPatientBean;


public interface DailyPatientApplicationService {

	List<DailyPatientBean> findDailyPatientList(Map<String, String> argsMap);

	void batchDailyPatientProcess(List<DailyPatientBean> dailyPatientBeanList);




}
