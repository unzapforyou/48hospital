package com.seoul.his.hdm.consultationfee.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.consultationfee.to.HosptlzPatBean;
import com.seoul.his.hdm.consultationfee.to.HosptlzPatReceBean;


public interface ConsultationFeeServiceFacade {

	void calcuInpatientPayment(Map<String, String> argsMap);

    List<HosptlzPatBean> findInpatientPayment(Map<String, String> argsMap) throws Exception;

    HosptlzPatReceBean findHosptlzPatRece(Map<String, String> argsMap);

    void callHosptlzPatRece(HosptlzPatReceBean hosptlzPatReceBean);




}
