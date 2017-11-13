package com.seoul.his.hdm.admission.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.admission.to.HospitalizationInfoBean;

public interface HospitalizationInfoDAO {

	List<HospitalizationInfoBean> selectHospitalizationInfo(Map<String, String> argsMap);
	void insertHospitalizationInfo(HospitalizationInfoBean hospitalizationInfoBean);
	void updateHospitalizationInfo(HospitalizationInfoBean hospitalizationInfoBean);
	void deleteHospitalizationInfo(HospitalizationInfoBean hospitalizationInfoBean);
	String selectHospitalizationSeq();

}
