package com.seoul.his.bst.patientStatus.selectDailyPatient.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.seoul.his.bst.patientStatus.selectDailyPatient.applicationService.SelectDailyPatientApplicationService;
import com.seoul.his.bst.patientStatus.selectDailyPatient.to.SelectDailyPatientBean;


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
public class SelectDailyPatientServiceFacadeImpl implements SelectDailyPatientServiceFacade{

	@Autowired
	SelectDailyPatientApplicationService selectDailyPatientApplicationService;

	@Override
		public List<SelectDailyPatientBean> findSelectDailyPatientList(Map<String, String> argsMap) {
		List<SelectDailyPatientBean> selectDailyPatientList = selectDailyPatientApplicationService.findSelectDailyPatientList(argsMap);
		return selectDailyPatientList;
	}
	
	
	@Override
    public void batchSelectDailyPatientProcess(List<SelectDailyPatientBean> selectDailyPatientBeanList) {
		selectDailyPatientApplicationService.batchSelectDailyPatientProcess(selectDailyPatientBeanList);
    }
	
}
