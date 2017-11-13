package com.seoul.his.hrs.yeta.dao;

import java.util.List;

import com.seoul.his.hrs.yeta.to.HsRegularWorksSalaryBean;

public interface HsRegularWorksSalaryDAO {
	List<HsRegularWorksSalaryBean> selectHsRegularWorksSalaryList();

	void insertHsRegularWorksSalary(HsRegularWorksSalaryBean hsRegularWorksSalaryBean);

	void updateHsRegularWorksSalary(HsRegularWorksSalaryBean hsRegularWorksSalaryBean);

	void deleteHsRegularWorksSalary(HsRegularWorksSalaryBean hsRegularWorksSalaryBean);

}
