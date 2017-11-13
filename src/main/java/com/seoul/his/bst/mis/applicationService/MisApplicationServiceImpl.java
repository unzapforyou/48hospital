package com.seoul.his.bst.mis.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.bst.mis.dao.MisDAO;
import com.seoul.his.bst.mis.exception.MisException;
import com.seoul.his.bst.mis.to.MisBean;
import com.seoul.his.hdm.patient.dao.PatientDAO;
import com.seoul.his.hdm.patient.to.PatientBean;

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
public class MisApplicationServiceImpl implements MisApplicationService{
	@Autowired
	MisDAO misDAO;
	@Autowired
	PatientDAO patientDAO;







	@Override
	public List<PatientBean> findPatientList() {
		List<PatientBean> patientList = patientDAO.selectRestPatientList();
		return patientList;		
	}
}
