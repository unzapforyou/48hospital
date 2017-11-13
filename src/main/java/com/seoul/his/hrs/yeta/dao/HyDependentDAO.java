package com.seoul.his.hrs.yeta.dao;

import java.util.List;

import com.seoul.his.hrs.yeta.to.HyDependentBean;

public interface HyDependentDAO {
	List<HyDependentBean> selectHyDependentList();

	void insertHyDependent(HyDependentBean hyDependentBean);

	void updateHyDependent(HyDependentBean hyDependentBean);

	void deleteHyDependent(HyDependentBean hyDependentBean);

}
