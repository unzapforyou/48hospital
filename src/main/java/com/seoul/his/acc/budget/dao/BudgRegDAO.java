package com.seoul.his.acc.budget.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.budget.to.BudgRegBean;

public interface BudgRegDAO {

	List<BudgRegBean> selectBudg(Map<String, String> argsMap);

	void mergeIntoBudg(BudgRegBean budgRegBean);

}
