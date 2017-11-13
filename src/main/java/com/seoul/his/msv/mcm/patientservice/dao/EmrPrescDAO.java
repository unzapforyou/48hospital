package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.EmrPrescBean;

public interface EmrPrescDAO {
	List<EmrPrescBean> selectEmrPrescList(Map<String, String> argsMap);
}
