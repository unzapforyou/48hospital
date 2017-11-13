package com.seoul.his.hrs.yeta.dao;

import java.util.List;

import com.seoul.his.hrs.yeta.to.HyDependentInsuranceBean;

public interface HyDependentInsuranceDAO {
	List<HyDependentInsuranceBean> selectHyDependentInsuranceList();

	void insertHyDependentInsurance(HyDependentInsuranceBean hyDependentInsuranceBean);

	void updateHyDependentInsurance(HyDependentInsuranceBean hyDependentInsuranceBean);

	void deleteHyDependentInsurance(HyDependentInsuranceBean hyDependentInsuranceBean);

}
