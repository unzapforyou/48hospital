package com.seoul.his.hdm.consultationfee.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.consultationfee.to.HosptlzPatBean;
import com.seoul.his.hdm.consultationfee.to.HosptlzTrmtCostReceReceiptBean;

public interface InpatientPaymentDAO {

	void calcuInpatientPayment(Map<String, String> argsMap);

	List<HosptlzPatBean> selectInpatientPayment(Map<String, String> argsMap);

	//List<HosptlzTrmtCostReceReceiptBean> callHosptlzCostReceReceipt(String outpaReceiptNo);
}
