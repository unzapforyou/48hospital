package com.seoul.his.hdm.foreign.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.foreign.to.PatInfoBean;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;
import com.seoul.his.msv.mcm.patientservice.to.TransferPatientInfoBean;


public interface ForeignApplicationService {

	List<ReceiptInfoBean> findDiagnosisReceiptList(Map<String, String> argsMap);

	void registerDiagnosisReceipt(ReceiptInfoBean receiptInfoBean);

	void removeDiagnosisReceipt(ReceiptInfoBean receiptInfoBean);

	public List<PatInfoBean> findPatList(Map<String, String> argsMap);

	public PatInfoBean findPat(Map<String, String> argsMap);

	 //전원환자
	 List<TransferPatientInfoBean> findTransferPatientInfoList(Map<String, String> argsMap);

}
