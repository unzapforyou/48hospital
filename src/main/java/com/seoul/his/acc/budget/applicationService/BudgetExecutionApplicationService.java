package com.seoul.his.acc.budget.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.budget.exception.BudgOrgDlineException;
import com.seoul.his.acc.budget.to.BudgMisaBean;
import com.seoul.his.acc.budget.to.BudgMisaTagetBean;
import com.seoul.his.acc.budget.to.OrgDlineBean;

public interface BudgetExecutionApplicationService {
    
	List<OrgDlineBean> findOrgDlineList(Map<String, String> argsMap);
	
	List<OrgDlineBean> registerOrgDline(OrgDlineBean orgDlineBean) throws BudgOrgDlineException;

	OrgDlineBean findOrgDline(Map<String, String> argsMap);

	List<BudgMisaBean> gindbudgMisaList(Map<String, String> argsMap);

	String getMisaNo();
	
	void deciBudgMisa(Map<String, String> argsMap);

	void appBudgMisa(List<BudgMisaBean> budgMisaList, List<BudgMisaTagetBean> budgMisaTagetList);
    /*
	List<CauseActBean> findCauseAct(HashMap<String, String> queryMap);

	void batchCauseAct(CauseActBean causeActBean) throws CauseActException;

	String getCauseNo();*/

}
