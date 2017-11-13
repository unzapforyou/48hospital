package com.seoul.his.hdm.foreign.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.foreign.exception.ForeignException;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;
import com.seoul.his.hdm.foreign.to.PatInfoBean;


public interface ForeignApplicationService {

	List<ReceiptInfoBean> findDiagnosisReceiptList(Map<String, String> argsMap);
	
	void registerDiagnosisReceipt(ReceiptInfoBean receiptInfoBean);

	void removeDiagnosisReceipt(ReceiptInfoBean receiptInfoBean);
	
	public List<PatInfoBean> findPatList(Map<String, String> argsMap);

	public PatInfoBean findPat(Map<String, String> argsMap);
	
}
