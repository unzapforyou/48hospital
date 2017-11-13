package com.seoul.his.acc.budget.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.budget.to.BudgMisaBean;

public interface BudgMisaDAO {

	List<BudgMisaBean> selectBudgMisaList(Map<String, String> argsMap);

	String getMisaNo();

	void callDeciBudgMisa(Map<String, String> argsMap);

	void insertBudgMisa(BudgMisaBean budgMisaBean);

	void updateBudgMisa(BudgMisaBean budgMisaBean);

	void deleteBudgMisa(BudgMisaBean budgMisaBean);

}
