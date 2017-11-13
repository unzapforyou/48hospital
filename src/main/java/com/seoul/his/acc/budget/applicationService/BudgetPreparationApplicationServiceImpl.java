package com.seoul.his.acc.budget.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.acc.budget.dao.BudgRegDAO;
import com.seoul.his.acc.budget.dao.RunBudgDAO;
import com.seoul.his.acc.budget.to.BudgRegBean;
import com.seoul.his.acc.budget.to.RunBudgBean;

/**
 * @Package  com.seoul.his.acc.budget.applicationService
 * @Class    BudgetPreparationApplicationServiceImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Component
public class BudgetPreparationApplicationServiceImpl implements BudgetPreparationApplicationService{
	
	@Autowired
	BudgRegDAO budgRegDAO;
	@Autowired
	RunBudgDAO runBudgDAO;

    // 예산조회
	@Override
	public List<BudgRegBean> findBudg(Map<String, String> argsMap) {
		return budgRegDAO.selectBudg(argsMap);
	}
	
    // 비목코드 조회
	@Override
	public List<RunBudgBean> findRunBudgList(Map<String, String> argsMap) {
		List<RunBudgBean> runBudgList = runBudgDAO.selectRunBudgList(argsMap);
		return runBudgList;
	}

	// 예산등록
	@Override
	public void registerBudg(List<BudgRegBean> budgRegList) {
		for(BudgRegBean budgRegBean:budgRegList){
			budgRegDAO.mergeIntoBudg(budgRegBean);
		}
	}
	
	@Override
    public RunBudgBean findRunBimok(Map<String, String> argsMap) {
        System.out.println("findRunBimok" + "=========== AS");
        return runBudgDAO.selectRunBimok(argsMap);
    }
}
