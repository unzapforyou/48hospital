package com.seoul.his.bst.patientStatus.monthlyPatient.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.bst.patientStatus.monthlyPatient.dao.MonthlyPatientDAO;
import com.seoul.his.bst.patientStatus.monthlyPatient.exception.MonthlyPatientException;
import com.seoul.his.bst.patientStatus.monthlyPatient.to.MonthlyPatientBean;

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
public class MonthlyPatientApplicationServiceImpl implements MonthlyPatientApplicationService{
	@Autowired
	MonthlyPatientDAO monthlyPatientDAO;
	



	@Override
	public List<MonthlyPatientBean> findMonthlyPatientList(Map<String, String> argsMap) {
		List<MonthlyPatientBean> monthlyPatientList = monthlyPatientDAO.selectMonthlyPatientList(argsMap);
		return monthlyPatientList;		
	}




	@Override
	public void batchMonthlyPatientProcess(List<MonthlyPatientBean> monthlyPatientBeanList) {
	        for (MonthlyPatientBean monthlyPatientBean : monthlyPatientBeanList) {
	            if (monthlyPatientBean.getStatus().equals("inserted")) {
	            	monthlyPatientDAO.insertMonthlyPatient(monthlyPatientBean);
	            } else if (monthlyPatientBean.getStatus().equals("updated")) {
	            	System.out.println("11111여기까지");
	            	monthlyPatientDAO.updateMonthlyPatient(monthlyPatientBean);
	            } else if (monthlyPatientBean.getStatus().equals("deleted")) {
	            	monthlyPatientDAO.deleteEmp(monthlyPatientBean);
	            }
	        }
	    
	}

	
	

}
