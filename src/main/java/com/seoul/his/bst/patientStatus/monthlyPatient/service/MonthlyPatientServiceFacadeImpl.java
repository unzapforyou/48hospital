package com.seoul.his.bst.patientStatus.monthlyPatient.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.seoul.his.bst.patientStatus.monthlyPatient.applicationService.MonthlyPatientApplicationService;
import com.seoul.his.bst.patientStatus.monthlyPatient.to.MonthlyPatientBean;


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
public class MonthlyPatientServiceFacadeImpl implements MonthlyPatientServiceFacade{

	@Autowired
	MonthlyPatientApplicationService monthlyPatientApplicationService;

	@Override
		public List<MonthlyPatientBean> findMonthlyPatientList(Map<String, String> argsMap) {
		List<MonthlyPatientBean> monthlyPatientList = monthlyPatientApplicationService.findMonthlyPatientList(argsMap);
		return monthlyPatientList;
	}
	
	
	@Override
    public void batchMonthlyPatientProcess(List<MonthlyPatientBean> monthlyPatientBeanList) {
		monthlyPatientApplicationService.batchMonthlyPatientProcess(monthlyPatientBeanList);
    }
	
}
