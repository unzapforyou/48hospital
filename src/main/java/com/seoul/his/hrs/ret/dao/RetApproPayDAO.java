package com.seoul.his.hrs.ret.dao;

import java.util.Map;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.seoul.his.hrs.ret.to.RetApproPayBean;

/** 
 * 
 * @Package  com.seoul.his.hrs.ret.dao
 * @Class    RetApproPayDAO.java
 * @Create   2016. 6. 3.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */

public interface RetApproPayDAO {

	List<RetApproPayBean> selectRetApproPayList(Map<String, String> argsMap) throws DataAccessException;

	void insertRetApproPay(RetApproPayBean retApproPayBean);

	void updateRetApproPay(RetApproPayBean retApproPayBean);

	void deleteRetApproPay(RetApproPayBean retApproPayBean);

}
