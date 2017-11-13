package com.seoul.his.log.ctrt.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.ctrt.to.CtrtBean;

public interface CtrtDAO {

	// 계약물품조회
	public List<CtrtBean> selectCtrtList(Map<String, String> argsMap);

	// 계약물품 일괄처리
	public void insertCtrt(CtrtBean ctrtBean);
	public void updateCtrt(CtrtBean ctrtBean);
	public void deleteCtrt(CtrtBean ctrtBean);

}
