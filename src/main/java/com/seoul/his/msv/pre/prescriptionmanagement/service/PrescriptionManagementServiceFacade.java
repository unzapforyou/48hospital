package com.seoul.his.msv.pre.prescriptionmanagement.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.pre.prescriptionmanagement.to.DiseaseBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientDsBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientPrscBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescDtlBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescMediBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescValueBean;


public interface PrescriptionManagementServiceFacade {

	List<DiseaseBean> findDiseaseList(Map<String, String> argsMap);

	List<PatientDsBean> findPatientDsList(Map<String, String> argsMap);

	 List<PatientPrscBean> findPatientPrscList(Map<String, String> argsMap);

	 List<PrescValueBean> findPrescValueList(Map<String, String> argsMap);

	 List<PrescDtlBean> findPrescDtlList(Map<String, String> argsMap);

	void batchDisePrescProcess(Map<String, Object> disePrescMap);

	List<PrescMediBean> findMedPrescList(Map<String, String> argsMap);





}
