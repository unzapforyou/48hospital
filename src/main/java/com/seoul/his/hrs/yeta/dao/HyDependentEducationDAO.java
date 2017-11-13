package com.seoul.his.hrs.yeta.dao;

import java.util.List;

import com.seoul.his.hrs.yeta.to.HyDependentEducationBean;

public interface HyDependentEducationDAO {
	List<HyDependentEducationBean> selectHyDependentEducationList();

	void insertHyDependentEducation(HyDependentEducationBean hyDependentEducationBean);

	void updateHyDependentEducation(HyDependentEducationBean hyDependentEducationBean);

	void deleteHyDependentEducation(HyDependentEducationBean hyDependentEducationBean);

}
