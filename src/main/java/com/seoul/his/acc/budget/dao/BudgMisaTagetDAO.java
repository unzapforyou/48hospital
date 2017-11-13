package com.seoul.his.acc.budget.dao;

import com.seoul.his.acc.budget.to.BudgMisaBean;
import com.seoul.his.acc.budget.to.BudgMisaTagetBean;

public interface BudgMisaTagetDAO {

	void insertBudgMisaTaget(BudgMisaTagetBean budgMisaTagetBean);

	void updateBudgMisaTaget(BudgMisaTagetBean budgMisaTagetBean);

	void deleteBudgMisaTaget(BudgMisaTagetBean budgMisaTagetBean);

	void deleteBudgMisaTagetCascade(BudgMisaBean budgMisaBean);

}
