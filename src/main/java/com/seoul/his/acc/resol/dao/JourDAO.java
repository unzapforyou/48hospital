package com.seoul.his.acc.resol.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.AutoJourRuleBean;
import com.seoul.his.acc.resol.to.JourBean;

public interface JourDAO {

    List<AutoJourRuleBean> selectAutoJourRuleList(Map<String, String> argsMap);

    List<JourBean> selectJourDetail(Map<String, String> argsMap);

	void insertJour(JourBean jour);



}
