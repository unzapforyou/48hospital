package com.seoul.his.bst.patientStatus.selectDailyPatient.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.selectDailyPatient.exception.SelectDailyPatientException;
import com.seoul.his.bst.patientStatus.selectDailyPatient.to.SelectDailyPatientBean;


public interface SelectDailyPatientApplicationService {

	List<SelectDailyPatientBean> findSelectDailyPatientList(Map<String, String> argsMap);

	void batchSelectDailyPatientProcess(List<SelectDailyPatientBean> selectDailyPatientBeanList);




}
