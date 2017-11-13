package com.seoul.his.hdm.consultationfee.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import com.seoul.his.hdm.consultationfee.dao.InpatientPaymentDAO;
import com.seoul.his.hdm.consultationfee.dao.InpatientReceDAO;
import com.seoul.his.hdm.consultationfee.exception.ConsultationFeeException;
import com.seoul.his.hdm.consultationfee.to.HosptlzPatBean;
import com.seoul.his.hdm.consultationfee.to.HosptlzPatReceBean;
import com.seoul.his.hdm.consultationfee.to.HosptlzTrmtCostReceReceiptBean;

@Component
public class ConsultationFeeApplicationServiceImpl implements ConsultationFeeApplicationService {
	@Autowired
	InpatientPaymentDAO inpatientPaymentDAO;

	@Autowired
	InpatientReceDAO inpatientReceDAO;

	@Autowired
	ResourceBundleMessageSource msg;

	@Override
	public void calcuInpatientPayment(Map<String, String> argsMap) {
		inpatientPaymentDAO.calcuInpatientPayment(argsMap);
	}

	@Override
	public List<HosptlzPatBean> findInpatientPayment(Map<String, String> argsMap) throws ConsultationFeeException {
		List<HosptlzPatBean> hosptlzPatList;
		hosptlzPatList = inpatientPaymentDAO.selectInpatientPayment(argsMap);
		for (HosptlzPatBean hosptlzPatBean : hosptlzPatList) {
			if (hosptlzPatBean.getHosptlzYb().equals("N")) {
				throw new ConsultationFeeException(
						msg.getMessage("WON001", new Object[] { hosptlzPatBean.getPatNm() }, null));
			}
		}
		return hosptlzPatList;
	}

	@Override
	public HosptlzPatReceBean findHosptlzPatRece(Map<String, String> argsMap) {
		HosptlzPatReceBean hosptlzPatReceBean;
		hosptlzPatReceBean = inpatientReceDAO.selectHosptlzPatRece(argsMap);
		return hosptlzPatReceBean;
	}

	@Override
	public void callHosptlzPatRece(HosptlzPatReceBean hosptlzPatReceBean) {
		inpatientReceDAO.callHosptlzPatRece(hosptlzPatReceBean);
	}

	/*
	 * @Override public List<HosptlzTrmtCostReceReceiptBean>
	 * callHosptlzCostReceReceipt( String outpaReceiptNo) {
	 * List<HosptlzTrmtCostReceReceiptBean> hosptlzTrmtCostReceReceipt;
	 * hosptlzTrmtCostReceReceipt =
	 * inpatientPaymentDAO.callHosptlzCostReceReceipt(outpaReceiptNo); return
	 * hosptlzTrmtCostReceReceipt; }
	 */

}
