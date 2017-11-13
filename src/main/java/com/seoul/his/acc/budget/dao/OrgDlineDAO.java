package com.seoul.his.acc.budget.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.budget.to.OrgDlineBean;

public interface OrgDlineDAO {

	List<OrgDlineBean> selectOrgDlineList(Map<String, String> argsMap);

	void callOrgDlineReg(OrgDlineBean orgDlineBean);

	OrgDlineBean selectOrgDline(Map<String, String> argsOsMap);

}
