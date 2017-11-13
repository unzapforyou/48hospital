package com.seoul.his.hdm.consultationfee.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.consultationfee.exception.ConsultationFeeException;
import com.seoul.his.hdm.consultationfee.to.HosptlzPatBean;
import com.seoul.his.hdm.consultationfee.to.HosptlzPatReceBean;
import com.seoul.his.hdm.consultationfee.to.HosptlzTrmtCostReceReceiptBean;


public interface ConsultationFeeApplicationService {

	void calcuInpatientPayment(Map<String, String> argsMap);

	List<HosptlzPatBean> findInpatientPayment(Map<String, String> argsMap) throws ConsultationFeeException;

	HosptlzPatReceBean findHosptlzPatRece(Map<String, String> argsMap);

	void callHosptlzPatRece(HosptlzPatReceBean hosptlzPatReceBean);

	
	/*List<HosptlzTrmtCostReceReceiptBean> callHosptlzCostReceReceipt(
			String outpaReceiptNo);*/


}
