package com.seoul.his.hrs.ret.dao;

import java.util.Map;
import java.util.List;

import com.seoul.his.hrs.ret.to.RetPayBean;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.dao
 * @Class    RetPayDAO.java
 * @Create   2016. 6. 5.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */
public interface RetPayDAO {

	void calcRetPay(Map<String, String> argsMap);

	void insertRetPay(RetPayBean retPayBean);

	void updateRetPay(RetPayBean retPayBean);

	void deleteRetPay(RetPayBean retPayBean);

	List<RetPayBean> selectRetPayList(Map<String, String> argsMap);

}
