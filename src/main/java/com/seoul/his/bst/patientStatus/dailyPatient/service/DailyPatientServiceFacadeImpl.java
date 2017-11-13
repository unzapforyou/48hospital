package com.seoul.his.bst.patientStatus.dailyPatient.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.seoul.his.bst.patientStatus.dailyPatient.applicationService.DailyPatientApplicationService;
import com.seoul.his.bst.patientStatus.dailyPatient.to.DailyPatientBean;


/**
 * @Package  com.seoul.his.acc.budget.service
 * @Class    BudgetServiceFacadeImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Service
public class DailyPatientServiceFacadeImpl implements DailyPatientServiceFacade{

	@Autowired
	DailyPatientApplicationService dailyPatientApplicationService;

	@Override
		public List<DailyPatientBean> findDailyPatientList(Map<String, String> argsMap) {
		List<DailyPatientBean> dailyPatientList = dailyPatientApplicationService.findDailyPatientList(argsMap);
		return dailyPatientList;
	}
	
	
	@Override
    public void batchDailyPatientProcess(List<DailyPatientBean> dailyPatientBeanList) {
		dailyPatientApplicationService.batchDailyPatientProcess(dailyPatientBeanList);
    }
	
}
