package com.seoul.his.hrs.emp.dao;

import java.util.List;

import com.seoul.his.common.to.BaseBean;

/**
 * 
 * @Package  com.seoul.his.hrs.emp.dao
 * @Class    MilitaryDAO.java
 * @Create   2016. 6. 27.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */

public interface MilitaryDAO {
	List<BaseBean> findMilitaryList(String empNo);

	void insertMilitary(BaseBean militaryBean);

	void updateMilitary(BaseBean militaryBean);

	void deleteMilitary(BaseBean militaryBean);

	void destroyMilitary(String empNo);
}
