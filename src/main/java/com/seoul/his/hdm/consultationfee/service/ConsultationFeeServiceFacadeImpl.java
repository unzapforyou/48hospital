package com.seoul.his.hdm.consultationfee.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.hdm.consultationfee.applicationService.ConsultationFeeApplicationService;
import com.seoul.his.hdm.consultationfee.to.HosptlzPatBean;
import com.seoul.his.hdm.consultationfee.to.HosptlzPatReceBean;

@Service
public class ConsultationFeeServiceFacadeImpl implements ConsultationFeeServiceFacade {
	@Autowired
	ConsultationFeeApplicationService consultationfeeApplicationService;

	@Override
	public void calcuInpatientPayment(Map<String, String> argsMap) {
		consultationfeeApplicationService.calcuInpatientPayment(argsMap);
	}

	@Override
	public List<HosptlzPatBean> findInpatientPayment(Map<String, String> argsMap) throws Exception {
		List<HosptlzPatBean> hosptlzPatList;
		hosptlzPatList = consultationfeeApplicationService.findInpatientPayment(argsMap);
		return hosptlzPatList;
	}

	@Override
	public HosptlzPatReceBean findHosptlzPatRece(Map<String, String> argsMap) {
		HosptlzPatReceBean hosptlzPatReceBean;
		hosptlzPatReceBean = consultationfeeApplicationService.findHosptlzPatRece(argsMap);
		return hosptlzPatReceBean;
	}

	@Override
	public void callHosptlzPatRece(HosptlzPatReceBean hosptlzPatReceBean) {
		consultationfeeApplicationService.callHosptlzPatRece(hosptlzPatReceBean);
	}

}
