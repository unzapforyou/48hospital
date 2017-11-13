package com.seoul.his.bst.patientStatus.patientByDept.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.bst.patientStatus.patientByDept.dao.PatientByDeptDAO;
import com.seoul.his.bst.patientStatus.patientByDept.exception.PatientByDeptException;
import com.seoul.his.bst.patientStatus.patientByDept.to.PatientByDeptBean;

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
public class PatientByDeptApplicationServiceImpl implements PatientByDeptApplicationService{
	@Autowired
	PatientByDeptDAO patientByDeptDAO;
	



	@Override
	public List<PatientByDeptBean> findPatientByDeptList(Map<String, String> argsMap) {
		List<PatientByDeptBean> patientByDeptList = patientByDeptDAO.selectPatientByDeptList(argsMap);
		return patientByDeptList;		
	}




	@Override
	public void batchPatientByDeptProcess(List<PatientByDeptBean> patientByDeptBeanList) {
	        for (PatientByDeptBean patientByDeptBean : patientByDeptBeanList) {
	            if (patientByDeptBean.getStatus().equals("inserted")) {
	            	patientByDeptDAO.insertPatientByDept(patientByDeptBean);
	            } else if (patientByDeptBean.getStatus().equals("updated")) {
	            	System.out.println("11111여기까지");
	            	patientByDeptDAO.updatePatientByDept(patientByDeptBean);
	            } else if (patientByDeptBean.getStatus().equals("deleted")) {
	            	patientByDeptDAO.deleteEmp(patientByDeptBean);
	            }
	        }
	    
	}

	
	

}
