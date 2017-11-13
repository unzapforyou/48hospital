package com.seoul.his.bst.patientStatus.selectDailyPatient.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.selectDailyPatient.to.SelectDailyPatientBean;

public interface SelectDailyPatientDAO {

	List<SelectDailyPatientBean> selectSelectDailyPatientList(Map<String, String> argsMap);

	void insertSelectDailyPatient(SelectDailyPatientBean selectDailyPatientBean);

	void updateSelectDailyPatient(SelectDailyPatientBean selectDailyPatientBean);

	void deleteEmp(SelectDailyPatientBean selectDailyPatientBean);


}
