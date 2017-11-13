package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.EmrCheckupBean;

public interface EmrCheckupDAO {
	List<EmrCheckupBean> selectCheckupList(Map<String, String> argsMap);
}
