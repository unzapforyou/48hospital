package com.seoul.his.acc.budget.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.budget.to.BudgRegBean;
import com.seoul.his.acc.budget.to.RunBudgBean;

public interface BudgetPreparationApplicationService {

	List<BudgRegBean> findBudg(Map<String, String> argsMap);

	List<RunBudgBean> findRunBudgList(Map<String, String> argsMap);

	void registerBudg(List<BudgRegBean> budgRegList);

	RunBudgBean findRunBimok(Map<String, String> argsMap);

}
