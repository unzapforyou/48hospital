package com.seoul.his.hdm.admission.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.admission.to.HospitalizationInfoBean;

public interface HospitalizationInfoApplicationService {

	List<HospitalizationInfoBean> findHospitalizationInfo(Map<String, String> argsMap);
	void batchHospitalizationProcess(List<HospitalizationInfoBean> hospitalizationInfoList);
	String callHospitalizationSeq();

}
