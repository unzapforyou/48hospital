
package com.seoul.his.acc.budget.service;

import java.util.List;
import java.util.Map;

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
 *    |_ BudgetServiceFacade.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 3:23:15
 * @version :
 * @author : 응디꿍디
 */

public interface BudgetServiceFacade {

	List<BudgBimokBean> findBimokList(Map<String, String> argsMap);

    void batchBimokProcess(List<BudgBimokBean> bimokList);

	List<BudgBimokBean> copyBimok(String year) throws BimokCopyException;

	void batchBudgUseDeptProcess(List<BudgUseDeptBean> UseDeptBeanList);

	List<RunBudgBean> findRunBudg(Map<String, String> argsMap);

	List<JobLimitBean> findJobLimit(Map<String, String> argsMap);
	
	void modifyJobLimit(List<JobLimitBean> jobLimitList);
	
	List<OrgDlineBean> findOrgDlineList(Map<String, String> argsMap);

	List<OrgDlineBean> registerOrgDline(OrgDlineBean orgDlineBean) throws BudgOrgDlineException;

	List<BudgRegBean> findBudg(Map<String, String> argsMap);

	OrgDlineBean findOrgDline(Map<String, String> argsMap);
	
	List<BudgMisaBean> findBudgMisaList(Map<String, String> argsMap);

	String getMisaNo();

	void deciBudgMisa(Map<String, String> argsMap);

	void appBudgMisa(List<BudgMisaBean> budgMisaList, List<BudgMisaTagetBean> budgMisaTagetList);
    /*
	List<CauseActBean> findCauseAct(HashMap<String, String> queryMap);

	void batchCauseAct(CauseActBean causeActBean) throws CauseActException;

	String getCauseNo();*/

	List<BudgUseDeptBean> findBudgUseDept(Map<String, String> argsMap);

	List<RunBudgBean> findRunBudgList(Map<String, String> argsMap);

	void registerBudg(List<BudgRegBean> budgRegList);

	RunBudgBean findRunBimok(Map<String, String> argsMap);

}
