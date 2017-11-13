package com.seoul.his.hrs.yeta.dao;

import java.util.List;

import com.seoul.his.hrs.yeta.to.HmDeptBean;

public interface HmDeptDAO {
	List<HmDeptBean> selectHmDeptList();

	void insertHmDept(HmDeptBean hmDeptBean);

	void updateHmDept(HmDeptBean hmDeptBean);

	void deleteHmDept(HmDeptBean hmDeptBean);

}
