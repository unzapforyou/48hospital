package com.seoul.his.hrs.yeta.dao;

import java.util.List;

import com.seoul.his.hrs.yeta.to.HyDependentMedicalBean;

public interface HyDependentMedicalDAO {
	List<HyDependentMedicalBean> selectHyDependentMedicalList();

	void insertHyDependentMedical(HyDependentMedicalBean hyDependentMedicalBean);

	void updateHyDependentMedical(HyDependentMedicalBean hyDependentMedicalBean);

	void deleteHyDependentMedical(HyDependentMedicalBean hyDependentMedicalBean);

}
