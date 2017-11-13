package com.seoul.his.hdm.foreign.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.foreign.to.PatInfoBean;

public interface ForeignDAO {

	public List<PatInfoBean> selectPatList(Map<String, String> argsMap);
	public PatInfoBean selectPat(Map<String, String> argsMap);

}
