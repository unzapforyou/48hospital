package com.seoul.his.acc.budget.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.budget.to.BudgUseDeptBean;

public interface BudgUseDeptDAO {

	void insertBudgUseDept(BudgUseDeptBean budgUseDeptBean);

	void updateBudgUseDept(BudgUseDeptBean budgUseDeptBean);

	void deleteBudgUseDept(BudgUseDeptBean budgUseDeptBean);

	List<BudgUseDeptBean> selectBudgUseDept(Map<String, String> argsMap);
	
}
