package com.seoul.his.hrs.yeta.dao;

import java.util.Map;
import java.util.List;

import com.seoul.his.hrs.yeta.to.HyYtaResultBean;

public interface HyYtaResultDAO {
	List<HyYtaResultBean> selectHyYtaResultList(Map<String, String> argsMap);

	void insertHyYtaResult(HyYtaResultBean hyYtaResultBean);

	void updateHyYtaResult(HyYtaResultBean hyYtaResultBean);

	void deleteHyYtaResult(HyYtaResultBean hyYtaResultBean);

	void executeYta(Map<String, String> argsMap);

}
