package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.EmrTransfusionBean;

public interface EmrTransfusionDAO {
	List<EmrTransfusionBean> selectEmrTransfusionList(Map<String, String> argsMap);
}
