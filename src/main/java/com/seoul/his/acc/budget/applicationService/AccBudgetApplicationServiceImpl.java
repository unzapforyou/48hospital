
package com.seoul.his.acc.budget.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.acc.budget.dao.BudgBimokDAO;
import com.seoul.his.acc.budget.dao.BudgUseDeptDAO;
import com.seoul.his.acc.budget.dao.JobLimitDAO;
import com.seoul.his.acc.budget.dao.RunBudgDAO;
import com.seoul.his.acc.budget.exception.BimokCopyException;
import com.seoul.his.acc.budget.to.BudgBimokBean;
import com.seoul.his.acc.budget.to.BudgUseDeptBean;
import com.seoul.his.acc.budget.to.JobLimitBean;
import com.seoul.his.acc.budget.to.RunBudgBean;

/**
 * @Package  com.seoul.his.acc.budget.applicationService
 * @Class    AccBudgetApplicationServiceImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Component
public class AccBudgetApplicationServiceImpl implements AccBudgetApplicationService{
	@Autowired
	BudgBimokDAO budgBimokDAO;
	@Autowired
	BudgUseDeptDAO budgUseDeptDAO;
	@Autowired
	RunBudgDAO runBudgDAO;
	@Autowired
	JobLimitDAO jobLimitDAO;

    // 예산비목 조회	
	@Override
	public List<BudgBimokBean> findBimokList(Map<String, String> argsMap) {
		List<BudgBimokBean> bimokList = budgBimokDAO.selectBimokList(argsMap);
		return bimokList;
	}

    // 예산사용부서 조회
	@Override
	public List<BudgUseDeptBean> findBudgUseDept(Map<String, String> queryMap) {
		List<BudgUseDeptBean> budgUseDeptList = budgUseDeptDAO.selectBudgUseDept(queryMap);
		return budgUseDeptList;
	}

    // 예산비목 일괄처리	
	@Override
	public void batchBimokProcess(List<BudgBimokBean> bimokList) {
		for(BudgBimokBean budgBimokBean : bimokList){
			String status=budgBimokBean.getStatus();
			if(status.equals("inserted")){
				budgBimokDAO.insertBimok(budgBimokBean);
			}else if(status.equals("updated")){
				budgBimokDAO.updateBimok(budgBimokBean);
			}else if(status.equals("deleted")){
				budgBimokDAO.deleteBimok(budgBimokBean);
			}
		}
	}

    // 예산비목 전년도복사
	@Override
	public List<BudgBimokBean> copyBimok(String year) throws BimokCopyException{
		BudgBimokBean budgBimokBean = new BudgBimokBean();
		budgBimokBean.setAccYear(year);
		budgBimokDAO.callCopyBimok(budgBimokBean);
		if(budgBimokBean.getErrorCode().equals("1")){
			HashMap<String, String> queryMap=new HashMap<String, String>();
			queryMap.put("accYear", year);
			List<BudgBimokBean> budgBimokList = budgBimokDAO.selectBimokList(queryMap);
			return budgBimokList;
		}else{
			throw new BimokCopyException(budgBimokBean.getErrorMsg());
		}
	}

    // 예산사용부서 저장    
	@Override
	public void batchBudgUseDeptProcess(List<BudgUseDeptBean> useDeptBeanList) {
		for(BudgUseDeptBean budgUseDeptBean:useDeptBeanList) {
			String status = budgUseDeptBean.getStatus();

			if(status.equals("inserted")) {
				budgUseDeptDAO.insertBudgUseDept(budgUseDeptBean);
			}else if(status.equals("updated")) {
				budgUseDeptDAO.updateBudgUseDept(budgUseDeptBean);
			}else if(status.equals("deleted")) {
				budgUseDeptDAO.deleteBudgUseDept(budgUseDeptBean);
			}
		}
	}

    // 예산집행현황 조회
	@Override
	public List<RunBudgBean> findRunBudg(Map<String, String> argsMap) {
		List<RunBudgBean> runBudgList = runBudgDAO.selectRunBudg(argsMap);
		return runBudgList;
	}

    // 부서별 적정인원 조회
	@Override
	public List<JobLimitBean> findJobLimit(Map<String, String> argsMap) {
		List<JobLimitBean> jobLimitList = jobLimitDAO.selectJobLimitList(argsMap);
		return jobLimitList;
	}

    // 부서별 적정인원 저장
	@Override
	public void modifyJobLimit(List<JobLimitBean> jobLimitList) {
		for(JobLimitBean jobLimitBean : jobLimitList)
			jobLimitDAO.updateJobLimit(jobLimitBean);
	}
}




