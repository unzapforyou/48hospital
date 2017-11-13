package com.seoul.his.acc.budget.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.budget.to.BudgBimokBean;

public interface BudgBimokDAO {

	List<BudgBimokBean> selectBimokList(Map<String, String> argsMap);

	void insertBimok(BudgBimokBean budgBimokBean);

	void updateBimok(BudgBimokBean budgBimokBean);

	void deleteBimok(BudgBimokBean budgBimokBean);

	void callCopyBimok(BudgBimokBean budgBimokBean);

}
