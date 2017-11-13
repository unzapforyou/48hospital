package com.seoul.his.msv.pre.prescriptionmanagement.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hdm.foreign.dao.ReceiptInfoDAO;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;
import com.seoul.his.msv.pre.prescriptionmanagement.dao.DiseaseDAO;
import com.seoul.his.msv.pre.prescriptionmanagement.dao.PatientDsDAO;
import com.seoul.his.msv.pre.prescriptionmanagement.dao.PatientPrscDAO;
import com.seoul.his.msv.pre.prescriptionmanagement.dao.PrescDtlDAO;
import com.seoul.his.msv.pre.prescriptionmanagement.dao.PrescValueDAO;
import com.seoul.his.msv.pre.prescriptionmanagement.to.DiseaseBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientDsBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientPrscBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescDtlBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescMediBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescValueBean;

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
public class DiseaseApplicationServiceImpl implements DiseaseApplicationService{
	@Autowired
	DiseaseDAO diseaseDAO;

	@Autowired
	PatientDsDAO patientDsDAO;

	@Autowired
	PatientPrscDAO patientPrscDAO;

	@Autowired
	PrescValueDAO prescValueDAO;

	@Autowired
	PrescDtlDAO prescDtlDAO;

	@Autowired
	ReceiptInfoDAO receiptInfoDAO;



	@Override
	public List<DiseaseBean> findDiseaseList(Map<String, String> argsMap) {
		List<DiseaseBean> diseaseList = diseaseDAO.selectDiseaseList(argsMap);
		return diseaseList;
	}

	 @Override
	    public List<PatientDsBean> findPatientDsList(Map<String, String> argsMap) {
	        return patientDsDAO.selectPatientDsList(argsMap);
	    }


	@Override
	public List<PatientPrscBean> findPatientPrscList(Map<String, String> argsMap){
		return patientPrscDAO.selectPatientPrscList(argsMap);
	}

	@Override
	public List<PrescValueBean> findPrescValueList(Map<String, String> argsMap){
		return prescValueDAO.selectPrescValueList(argsMap);
	}

	@Override
	public List<PrescMediBean> findMedPrescList(Map<String, String> argsMap){
		return prescValueDAO.selectMedPrescList(argsMap);
	}


	@Override
	public List<PrescDtlBean> findPrescDtlList(Map<String, String> argsMap){
		return prescDtlDAO.selectPrescDtlList(argsMap);
	}

	@SuppressWarnings("unchecked")
    @Override
    public void batchDisePrescProcess(Map<String, Object> disePrescMap){

		//환자접수정보 업데이트
		List<ReceiptInfoBean> receiptInfoList = (List<ReceiptInfoBean>) disePrescMap.get("receiptList");
		 if (receiptInfoList.size() != 0) {
	            for (ReceiptInfoBean receiptInfoBean : receiptInfoList) {
	                switch (receiptInfoBean.getStatus()) {
	                    case "updated" : receiptInfoDAO.updateReceipt(receiptInfoBean);

	                    break;      // 진료여부 수술여부 업데이트
	                }
	            }
	        }
		//환자상병내역정보
		List<PatientDsBean> patientDsList = (List<PatientDsBean>) disePrescMap.get("patientDsList");
		//환자처방정보
		List<PatientPrscBean> patientPrscList = (List<PatientPrscBean>) disePrescMap.get("patientPrscList");
		//환자처방내역정보
		List<PrescValueBean> prescValueList = (List<PrescValueBean>) disePrescMap.get("prescValueList");
		//환자처방상세내역정보
		List<PrescDtlBean> prescDtlList = (List<PrescDtlBean>) disePrescMap.get("prescDtlList");

		for(PatientDsBean patientDsBean : patientDsList){
			System.out.println(patientDsBean.getStatus());
			switch (patientDsBean.getStatus()) {

			case "inserted":
				patientDsDAO.insertPatientDs(patientDsBean);
				break;
			case "updated":
				patientDsDAO.updatePatientDs(patientDsBean);
				break;
			}

			//환자구분에 따라 입원환자, 외래환자 구분
			System.out.println("환자구분 : " + patientDsBean.getGubun());

			if("Y".equalsIgnoreCase(patientDsBean.getGubun())){
				for(PatientPrscBean patientPrscBean : patientPrscList){
					if(patientDsBean.getCode().equals(patientPrscBean.getDiseaseCd())){
						switch(patientPrscBean.getStatus()){
						case "inserted":
							patientDsDAO.insertInpatientPrsc(patientPrscBean);
							break;
						case "updated":
							patientDsDAO.updateInpatientPrsc(patientPrscBean);
							break;
						}
					}
				}

				for(PatientPrscBean patientPrscBean : patientPrscList){
					for(PrescValueBean presValueBean : prescValueList){
						if(patientPrscBean.getPatNo().equals(presValueBean.getPatNo())){
						switch(presValueBean.getStatus()){
						case "inserted":
							patientPrscDAO.insertInPrescValue(presValueBean);
							break;
						case "updated":
							patientPrscDAO.updateInPrescValue(presValueBean);
							break;
						}
					}
				}
			}

				for(PrescValueBean prescValueBean : prescValueList){
					for(PrescDtlBean prescDtlBean : prescDtlList){
						if(prescValueBean.getPrescNo().equals(prescDtlBean.getPrescNo()) &&
								prescValueBean.getCodeNo().equals(prescDtlBean.getPrescCd())){

							switch(prescDtlBean.getStatus()){
							case "inserted":
								prescValueDAO.insertPrescDtl(prescDtlBean);
								break;
							case "updated":
								prescValueDAO.updatePrescDtl(prescDtlBean);
								break;
							}
						}
					}
				}
			}else{
				for(PatientPrscBean patientPrscBean : patientPrscList){
					if(patientDsBean.getCode().equals(patientPrscBean.getDiseaseCd())){
						switch (patientPrscBean.getStatus()){
						case "inserted":
							patientDsDAO.insertOutpatientPrsc(patientPrscBean);
							break;
						case "updated":
							patientDsDAO.updateOutpatientPrsc(patientPrscBean);
							break;
						}
					}
				}
				for(PatientPrscBean patientPrscBean : patientPrscList){
					for(PrescValueBean presValueBean : prescValueList){
						if(patientPrscBean.getPatNo().equals(presValueBean.getPatNo())){
						switch(presValueBean.getStatus()){
						case "inserted":
							patientPrscDAO.insertOutPrescValue(presValueBean);
							break;
						case "updated":
							patientPrscDAO.updateOutPrescValue(presValueBean);
							break;
						}
					}
				}
			}

				for(PrescValueBean prescValueBean : prescValueList){
					for(PrescDtlBean prescDtlBean : prescDtlList){
						if(prescValueBean.getPrescNo().equals(prescDtlBean.getPrescNo()) &&
								prescValueBean.getCodeNo().equals(prescDtlBean.getPrescCd())){
							System.out.println(prescValueBean.getPrescNo()  + "     ==    " + prescDtlBean.getPrescNo());
							System.out.println(prescValueBean.getCodeNo()  + "     ==    " + prescDtlBean.getPrescCd());
							switch(prescDtlBean.getStatus()){
							case "inserted":
								prescValueDAO.insertPrescDtl(prescDtlBean);
								break;
							case "updated":
								prescValueDAO.updatePrescDtl(prescDtlBean);
								break;
							}
						}
					}
				}
			}
		}
	}



}
