
package com.seoul.his.acc.budget.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.budget.applicationService.AccBudgetApplicationService;
import com.seoul.his.acc.budget.applicationService.BudgetExecutionApplicationService;
import com.seoul.his.acc.budget.applicationService.BudgetPreparationApplicationService;
import com.seoul.his.acc.budget.exception.BimokCopyException;
import com.seoul.his.acc.budget.exception.BudgOrgDlineException;
import com.seoul.his.acc.budget.to.BudgBimokBean;
import com.seoul.his.acc.budget.to.BudgMisaBean;
import com.seoul.his.acc.budget.to.BudgMisaTagetBean;
import com.seoul.his.acc.budget.to.BudgRegBean;
import com.seoul.his.acc.budget.to.BudgUseDeptBean;
import com.seoul.his.acc.budget.to.JobLimitBean;
import com.seoul.his.acc.budget.to.OrgDlineBean;
import com.seoul.his.acc.budget.to.RunBudgBean;

/**
 * <pre>
 * com.seoul.his.acc.budget.service
 *    |_ BudgetServiceFacadeImpl.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 3:23:37
 * @version :
 * @author : 응디꿍디
 */

@Service
public class BudgetServiceFacadeImpl implements BudgetServiceFacade{
	@Autowired
	AccBudgetApplicationService accBudgetApplicationService;
	@Autowired
	BudgetExecutionApplicationService budgetExecutionApplicationService;
	@Autowired
	BudgetPreparationApplicationService budgetPreparationApplicationService;

	//예산비목 조회
	@Override
	public List<BudgBimokBean> findBimokList(Map<String, String> argsMap) {
		List<BudgBimokBean> bimokList = accBudgetApplicationService.findBimokList(argsMap);
		return bimokList;
	}

	// 예산비목 일괄처리 
	@Override
	public void batchBimokProcess(List<BudgBimokBean> bimokList) {
	    accBudgetApplicationService.batchBimokProcess(bimokList);
	}

    // 예산비목 전년도복사 
	@Override
	public List<BudgBimokBean> copyBimok(String year) throws BimokCopyException {
		List<BudgBimokBean> budgBimokList = accBudgetApplicationService.copyBimok(year);
		return budgBimokList;
	}

    // 예산사용부서 저장	
	@Override
	public void batchBudgUseDeptProcess(List<BudgUseDeptBean> UseDeptBeanList) {
	    accBudgetApplicationService.batchBudgUseDeptProcess(UseDeptBeanList);
	}
	
	// 예산집행현황 조회
	@Override
	public List<RunBudgBean> findRunBudg(Map<String, String> argsMap) {
		List<RunBudgBean> runBudgList = accBudgetApplicationService.findRunBudg(argsMap);
		return runBudgList;
	}
 

    // 부서별 적정인원 조회	
	@Override
	public List<JobLimitBean> findJobLimit(Map<String, String> argsMap) {
		List<JobLimitBean> jobLimitList = accBudgetApplicationService.findJobLimit(argsMap);
		return jobLimitList;
	}

    // 부서별 적정인원 저장	
	@Override
	public void modifyJobLimit(List<JobLimitBean> jobLimitList) {
	    accBudgetApplicationService.modifyJobLimit(jobLimitList);
	}

    // 예산편성 마감 조회	
	@Override
	public List<OrgDlineBean> findOrgDlineList(Map<String, String> argsMap) {
		List<OrgDlineBean> orgDlineList = budgetExecutionApplicationService.findOrgDlineList(argsMap);
		return orgDlineList;
	}

    // 예산편성 마감 저장	
	@Override
	public List<OrgDlineBean> registerOrgDline(OrgDlineBean orgDlineBean) throws BudgOrgDlineException {
		List<OrgDlineBean> orgDlineList = budgetExecutionApplicationService.registerOrgDline(orgDlineBean);
		return orgDlineList;
	}

    // 예산조회	
	@Override
	public List<BudgRegBean> findBudg(Map<String, String> argsMap) {
		List<BudgRegBean> budgRegList;
		budgRegList = budgetPreparationApplicationService.findBudg(argsMap);
		return budgRegList;
	}

	@Override
	public OrgDlineBean findOrgDline(Map<String, String> argsMap) {
		OrgDlineBean orgDlineBean = budgetExecutionApplicationService.findOrgDline(argsMap);
		return orgDlineBean;
	}

    // 예산목간전용 조회	
	@Override
	public List<BudgMisaBean> findBudgMisaList(Map<String, String> argsMap) {
		List<BudgMisaBean> budgMisaBean = budgetExecutionApplicationService.gindbudgMisaList(argsMap);
		return budgMisaBean;
	}

	@Override
	public String getMisaNo() {
		String misaNo = budgetExecutionApplicationService.getMisaNo();
		return misaNo;
	}

    // 전용확정	
	@Override
	public void deciBudgMisa(Map<String, String> argsMap) {
	    budgetExecutionApplicationService.deciBudgMisa(argsMap);
	}
	
    // 예상목간전용 저장	
	@Override
	public void appBudgMisa(List<BudgMisaBean> budgMisaList, List<BudgMisaTagetBean> budgMisaTagetList) {
	    budgetExecutionApplicationService.appBudgMisa(budgMisaList, budgMisaTagetList);
	}
/*
	@Override
	public List<CauseActBean> findCauseAct(HashMap<String, String> queryMap) {
		// TODO Auto-generated method stub
		List<CauseActBean> causeActList = budgetExecutionAS.findCauseAct(queryMap);
		return causeActList;
	}

	@Override
	public void batchCauseAct(CauseActBean causeActBean) throws CauseActException {
		// TODO Auto-generated method stub
		budgetExecutionAS.batchCauseAct(causeActBean);
	}

	@Override
	public String getCauseNo() {
		// TODO Auto-generated method stub
		String causeNo = budgetExecutionAS.getCauseNo();
		return causeNo;
	}*/

    // 예산사용부서 조회
	@Override
	public List<BudgUseDeptBean> findBudgUseDept(Map<String, String> argsMap) {
		List<BudgUseDeptBean> findBudgUseDept = accBudgetApplicationService.findBudgUseDept(argsMap);
		return findBudgUseDept;
	}

    // 비목코드 조회	
	@Override
	public List<RunBudgBean> findRunBudgList(Map<String, String> argsMap) {
		List<RunBudgBean> runBudgList = budgetPreparationApplicationService.findRunBudgList(argsMap);
		return runBudgList;
	}

	// 예산등록
	@Override
	public void registerBudg(List<BudgRegBean> budgRegList) {
	    budgetPreparationApplicationService.registerBudg(budgRegList);
	}

	@Override
    public RunBudgBean findRunBimok(Map<String, String> argsMap) {
        return budgetPreparationApplicationService.findRunBimok(argsMap);
    }
}

