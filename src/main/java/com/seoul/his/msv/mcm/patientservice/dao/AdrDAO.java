package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.AdrBean;

public interface AdrDAO {
	List<AdrBean> selectAdrList(Map<String, String> argsMap);
	void upsertAdr(AdrBean adrBean);
	void deleteAdr(AdrBean adrBean);
}
