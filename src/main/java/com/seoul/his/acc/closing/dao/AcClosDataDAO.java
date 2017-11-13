package com.seoul.his.acc.closing.dao;

import java.util.HashMap;
import java.util.List;

import com.seoul.his.acc.closing.to.AcClosDataBean;
import com.seoul.his.acc.elementary.to.AccPridBean;

public interface AcClosDataDAO {
	List<AcClosDataBean> selectAcClosTabArtiList(HashMap<String, Object> queryMap);

	List<AccPridBean> selectAccPridList();

}