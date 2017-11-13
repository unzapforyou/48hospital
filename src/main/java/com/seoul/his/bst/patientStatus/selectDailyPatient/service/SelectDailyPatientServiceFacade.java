package com.seoul.his.bst.patientStatus.selectDailyPatient.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.selectDailyPatient.to.SelectDailyPatientBean;


public interface SelectDailyPatientServiceFacade {

	List<SelectDailyPatientBean> findSelectDailyPatientList(Map<String, String> argsMap);

	void batchSelectDailyPatientProcess(List<SelectDailyPatientBean> selectDailyPatientBeanList);

}
