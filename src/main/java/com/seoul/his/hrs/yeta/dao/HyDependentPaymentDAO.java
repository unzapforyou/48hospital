package com.seoul.his.hrs.yeta.dao;

import java.util.List;

import com.seoul.his.hrs.yeta.to.HyDependentPaymentBean;

public interface HyDependentPaymentDAO {
	List<HyDependentPaymentBean> selectHyDependentPaymentList();

	void insertHyDependentPayment(HyDependentPaymentBean hyDependentPaymentBean);

	void updateHyDependentPayment(HyDependentPaymentBean hyDependentPaymentBean);

	void deleteHyDependentPayment(HyDependentPaymentBean hyDependentPaymentBean);

}
