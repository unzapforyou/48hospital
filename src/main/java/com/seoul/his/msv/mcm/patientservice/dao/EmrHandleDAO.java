package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.EmrHandleBean;

public interface EmrHandleDAO {
	List<EmrHandleBean> selectEmrHandleList(Map<String, String> argsMap);
}
