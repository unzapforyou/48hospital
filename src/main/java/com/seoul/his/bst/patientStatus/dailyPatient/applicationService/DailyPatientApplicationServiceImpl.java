package com.seoul.his.bst.patientStatus.dailyPatient.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.bst.patientStatus.dailyPatient.dao.DailyPatientDAO;
import com.seoul.his.bst.patientStatus.dailyPatient.exception.DailyPatientException;
import com.seoul.his.bst.patientStatus.dailyPatient.to.DailyPatientBean;

/**
 * @Package  com.seoul.his.acc.budget.applicationService
 * @Class    AccBudgetApplicationServiceImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Component
public class DailyPatientApplicationServiceImpl implements DailyPatientApplicationService{
	@Autowired
	DailyPatientDAO dailyPatientDAO;
	



	@Override
	public List<DailyPatientBean> findDailyPatientList(Map<String, String> argsMap) {
		List<DailyPatientBean> dailyPatientList = dailyPatientDAO.selectDailyPatientList(argsMap);
		return dailyPatientList;		
	}




	@Override
	public void batchDailyPatientProcess(List<DailyPatientBean> dailyPatientBeanList) {
	        for (DailyPatientBean dailyPatientBean : dailyPatientBeanList) {
	            if (dailyPatientBean.getStatus().equals("inserted")) {
	            	dailyPatientDAO.insertDailyPatient(dailyPatientBean);
	            } else if (dailyPatientBean.getStatus().equals("updated")) {
	            	System.out.println("11111여기까지");
	            	dailyPatientDAO.updateDailyPatient(dailyPatientBean);
	            } else if (dailyPatientBean.getStatus().equals("deleted")) {
	            	dailyPatientDAO.deleteEmp(dailyPatientBean);
	            }
	        }
	    
	}

	
	

}
