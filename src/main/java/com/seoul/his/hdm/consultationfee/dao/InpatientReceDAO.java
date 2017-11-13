package com.seoul.his.hdm.consultationfee.dao;

import java.util.Map;

import com.seoul.his.hdm.consultationfee.to.HosptlzPatReceBean;

public interface InpatientReceDAO {

	HosptlzPatReceBean selectHosptlzPatRece(Map<String, String> argsMap);

	void callHosptlzPatRece(HosptlzPatReceBean hosptlzPatReceBean);
}
