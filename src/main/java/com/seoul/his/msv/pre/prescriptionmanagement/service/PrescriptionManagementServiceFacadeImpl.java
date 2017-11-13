package com.seoul.his.msv.pre.prescriptionmanagement.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.pre.prescriptionmanagement.applicationService.DiseaseApplicationService;
import com.seoul.his.msv.pre.prescriptionmanagement.to.DiseaseBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientDsBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientPrscBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescDtlBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescMediBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescValueBean;


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
public class PrescriptionManagementServiceFacadeImpl implements PrescriptionManagementServiceFacade{
	@Autowired
	DiseaseApplicationService diseaseApplicationService;




	@Override
		public List<DiseaseBean> findDiseaseList(Map<String, String> argsMap) {
		List<DiseaseBean> diseaseList = diseaseApplicationService.findDiseaseList(argsMap);
		return diseaseList;
	}

	 @Override
	    public List<PatientDsBean> findPatientDsList(Map<String, String> argsMap) {
	        return diseaseApplicationService.findPatientDsList(argsMap);
	    }


	@Override
	public List<PatientPrscBean> findPatientPrscList(Map<String, String> argsMap) {
	List<PatientPrscBean> patientPrscList = diseaseApplicationService.findPatientPrscList(argsMap);
	return patientPrscList;
}

	@Override
	public List<PrescValueBean> findPrescValueList(Map<String, String> argsMap) {
	List<PrescValueBean> prescValueList = diseaseApplicationService.findPrescValueList(argsMap);
	return prescValueList;
}

	@Override
	public List<PrescDtlBean> findPrescDtlList(Map<String, String> argsMap) {
		List<PrescDtlBean> prescDtlList = diseaseApplicationService.findPrescDtlList(argsMap);
		return prescDtlList;
	}

	@Override
		public void batchDisePrescProcess(Map<String, Object> disePrescMap){
		diseaseApplicationService.batchDisePrescProcess(disePrescMap);
	}

	@Override
	public List<PrescMediBean> findMedPrescList(Map<String, String> argsMap) {
	List<PrescMediBean> prescValueList = diseaseApplicationService.findMedPrescList(argsMap);
	return prescValueList;
}



}
