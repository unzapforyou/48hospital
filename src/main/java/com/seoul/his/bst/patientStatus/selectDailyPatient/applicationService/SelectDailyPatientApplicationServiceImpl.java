package com.seoul.his.bst.patientStatus.selectDailyPatient.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.bst.patientStatus.selectDailyPatient.dao.SelectDailyPatientDAO;
import com.seoul.his.bst.patientStatus.selectDailyPatient.exception.SelectDailyPatientException;
import com.seoul.his.bst.patientStatus.selectDailyPatient.to.SelectDailyPatientBean;

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
public class SelectDailyPatientApplicationServiceImpl implements SelectDailyPatientApplicationService{
	@Autowired
	SelectDailyPatientDAO selectDailyPatientDAO;
	



	@Override
	public List<SelectDailyPatientBean> findSelectDailyPatientList(Map<String, String> argsMap) {
		List<SelectDailyPatientBean> selectDailyPatientList = selectDailyPatientDAO.selectSelectDailyPatientList(argsMap);
		return selectDailyPatientList;		
	}




	@Override
	public void batchSelectDailyPatientProcess(List<SelectDailyPatientBean> selectDailyPatientBeanList) {
	        for (SelectDailyPatientBean selectDailyPatientBean : selectDailyPatientBeanList) {
	            if (selectDailyPatientBean.getStatus().equals("inserted")) {
	            	selectDailyPatientDAO.insertSelectDailyPatient(selectDailyPatientBean);
	            } else if (selectDailyPatientBean.getStatus().equals("updated")) {
	            	System.out.println("11111여기까지");
	            	selectDailyPatientDAO.updateSelectDailyPatient(selectDailyPatientBean);
	            } else if (selectDailyPatientBean.getStatus().equals("deleted")) {
	            	selectDailyPatientDAO.deleteEmp(selectDailyPatientBean);
	            }
	        }
	    
	}

	
	

}
