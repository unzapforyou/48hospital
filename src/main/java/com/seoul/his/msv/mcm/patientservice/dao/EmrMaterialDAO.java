package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.EmrMaterialBean;

public interface EmrMaterialDAO {
	List<EmrMaterialBean> selectEmrMaterialList(Map<String, String> argsMap);
}
