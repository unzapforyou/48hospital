package com.seoul.his.bst.patientStatus.dailyPatient.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.patientStatus.dailyPatient.to.DailyPatientBean;

public interface DailyPatientDAO {

	List<DailyPatientBean> selectDailyPatientList(Map<String, String> argsMap);

	void insertDailyPatient(DailyPatientBean dailyPatientBean);

	void updateDailyPatient(DailyPatientBean dailyPatientBean);

	void deleteEmp(DailyPatientBean dailyPatientBean);


}
