package com.seoul.his.bst.mis.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.mis.exception.MisException;
import com.seoul.his.bst.mis.to.MisBean;
import com.seoul.his.hdm.patient.to.PatientBean;


public interface MisApplicationService {

	List<PatientBean> findPatientList();




}
