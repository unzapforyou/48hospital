package com.seoul.his.bst.mis.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.mis.to.MisBean;
import com.seoul.his.hdm.patient.to.PatientBean;


public interface MisServiceFacade {


	List<PatientBean> findPatientList();

}
