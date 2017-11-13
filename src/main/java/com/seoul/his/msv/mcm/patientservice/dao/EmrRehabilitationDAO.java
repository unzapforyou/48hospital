package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.EmrRehabilitationBean;

public interface EmrRehabilitationDAO {
	List<EmrRehabilitationBean> selectEmrRehabilitationList(Map<String, String> argsMap);
}
