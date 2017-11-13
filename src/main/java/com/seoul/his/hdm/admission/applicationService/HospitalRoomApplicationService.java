package com.seoul.his.hdm.admission.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.admission.to.HospitalRoomBean;

public interface HospitalRoomApplicationService {

	List<HospitalRoomBean> findHospitalRoomList(Map<String, String> argsMap);
	void batchHospitalRoomProcess(List<HospitalRoomBean> hospitalRoomBeanList);
	String getHospitalRoomSeq();
}
