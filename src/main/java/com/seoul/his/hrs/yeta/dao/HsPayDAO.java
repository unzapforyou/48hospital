package com.seoul.his.hrs.yeta.dao;

import java.util.List;

import com.seoul.his.hrs.yeta.to.HsPayBean;

public interface HsPayDAO {
	List<HsPayBean> selectHsPayList();

	void insertHsPay(HsPayBean hsPayBean);

	void updateHsPay(HsPayBean hsPayBean);

	void deleteHsPay(HsPayBean hsPayBean);

}
