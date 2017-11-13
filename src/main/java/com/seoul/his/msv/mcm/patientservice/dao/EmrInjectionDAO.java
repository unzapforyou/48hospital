package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.EmrInjectionBean;

public interface EmrInjectionDAO {
	List<EmrInjectionBean> selectEmrInjectionList(Map<String, String> argsMap);
}
