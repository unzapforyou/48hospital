package com.seoul.his.hdm.foreign.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hdm.foreign.dao.ForeignDAO;
import com.seoul.his.hdm.foreign.dao.ReceiptInfoDAO;
import com.seoul.his.hdm.foreign.to.PatInfoBean;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;
import com.seoul.his.msv.mcm.patientservice.dao.TransferPatientInfoDAO;
import com.seoul.his.msv.mcm.patientservice.to.TransferPatientInfoBean;


@Component
public class ForeignApplicationServiceImpl implements ForeignApplicationService {

	@Autowired
	ForeignDAO foreignDAO;
	@Autowired
	ReceiptInfoDAO receiptInfoDAO;
	@Autowired
	TransferPatientInfoDAO transferPatientInfoDAO;

	@Override
	public List<ReceiptInfoBean> findDiagnosisReceiptList(Map<String, String> argsMap) {
		return receiptInfoDAO.selectReceiptList(argsMap);
	}

	@Override
	public void registerDiagnosisReceipt(ReceiptInfoBean receiptInfoBean) {
		receiptInfoDAO.insertReceipt(receiptInfoBean);

	}

	@Override
	public void removeDiagnosisReceipt(ReceiptInfoBean receiptInfoBean) {
		receiptInfoDAO.deleteReceipt(receiptInfoBean);
	}

	@Override
	public List<PatInfoBean> findPatList(Map<String, String> argsMap) {
		return foreignDAO.selectPatList(argsMap);
	}

	@Override
	public PatInfoBean findPat(Map<String, String> argsMap) {
		return foreignDAO.selectPat(argsMap);
	}

		//전원환자
	@Override
	public List<TransferPatientInfoBean> findTransferPatientInfoList(Map<String, String> argsMap) {
		return transferPatientInfoDAO.selectTransferPatInfoList(argsMap);
	}


}
