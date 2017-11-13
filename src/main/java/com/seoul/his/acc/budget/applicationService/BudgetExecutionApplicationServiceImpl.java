package com.seoul.his.acc.budget.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.acc.budget.dao.BudgMisaDAO;
import com.seoul.his.acc.budget.dao.BudgMisaTagetDAO;
import com.seoul.his.acc.budget.dao.OrgDlineDAO;
import com.seoul.his.acc.budget.exception.BudgOrgDlineException;
import com.seoul.his.acc.budget.to.BudgMisaBean;
import com.seoul.his.acc.budget.to.BudgMisaTagetBean;
import com.seoul.his.acc.budget.to.OrgDlineBean;

/**
 * @Package  com.seoul.his.acc.budget.applicationService
 * @Class    BudgetExecutionApplicationServiceImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Component
public class BudgetExecutionApplicationServiceImpl implements BudgetExecutionApplicationService{
	
	@Autowired
	OrgDlineDAO orgDlineDAO;
	@Autowired
	BudgMisaDAO budgMisaDAO;
	@Autowired
	BudgMisaTagetDAO budgMisaTagetDAO;
	//@Autowired
	//CauseActDAO causeActDAO;

    // 예산편성 마감 조회
	@Override
	public List<OrgDlineBean> findOrgDlineList(Map<String, String> argsMap) {
		List<OrgDlineBean> orgDlineList = orgDlineDAO.selectOrgDlineList(argsMap);
		return orgDlineList;
	}

    // 예산편성 마감 저장  
	@Override
	public List<OrgDlineBean> registerOrgDline(OrgDlineBean orgDlineBean) throws BudgOrgDlineException {
		orgDlineDAO.callOrgDlineReg(orgDlineBean);
		String errorMsg = orgDlineBean.getErrorMsg();
		String errorCode = orgDlineBean.getErrorCode();
		if(errorCode.equals("-1")){
			throw new BudgOrgDlineException(errorMsg);
		}
		
		HashMap<String, String> queryMap = new HashMap<String, String>();
		queryMap.put("accYear", orgDlineBean.getAccYear());
		
		List<OrgDlineBean> orgDlineList = orgDlineDAO.selectOrgDlineList(queryMap);
		
		return orgDlineList;
	}

	@Override
	public OrgDlineBean findOrgDline(Map<String, String> argsMap) {
		OrgDlineBean orgDlineBean = orgDlineDAO.selectOrgDline(argsMap);
		return orgDlineBean;
	}

    // 예산목간전용 조회   
	@Override
	public List<BudgMisaBean> gindbudgMisaList(Map<String, String> argsMap) {
		List<BudgMisaBean> budgMisaList = budgMisaDAO.selectBudgMisaList(argsMap);
		return budgMisaList;
	}

	@Override
	public String getMisaNo() {
		String misaNo = budgMisaDAO.getMisaNo();
		return misaNo;
	}

    // 전용확정    
	@Override
	public void deciBudgMisa(Map<String, String> argsMap) {
	    argsMap.put("errorCode", "");
	    argsMap.put("errorMsg", "");
		budgMisaDAO.callDeciBudgMisa(argsMap);
	}

    // 예상목간전용 저장   
	@Override
	public void appBudgMisa(List<BudgMisaBean> budgMisaList, List<BudgMisaTagetBean> budgMisaTagetList) {
		for(BudgMisaBean budgMisaBean : budgMisaList){
			String status = budgMisaBean.getStatus();
			if(status.equals("inserted")){
				budgMisaDAO.insertBudgMisa(budgMisaBean);
			}else if(status.equals("updated")){
				budgMisaDAO.updateBudgMisa(budgMisaBean);
			}else if(status.equals("deleted")){
				budgMisaTagetDAO.deleteBudgMisaTagetCascade(budgMisaBean);
				budgMisaDAO.deleteBudgMisa(budgMisaBean);
			}
		}
		
		for(BudgMisaTagetBean budgMisaTagetBean : budgMisaTagetList){
			String status = budgMisaTagetBean.getStatus();
			
			if(status.equals("inserted")){
				budgMisaTagetDAO.insertBudgMisaTaget(budgMisaTagetBean);
			}else if(status.equals("updated")){
				budgMisaTagetDAO.updateBudgMisaTaget(budgMisaTagetBean);
			}else if(status.equals("deleted")){
				budgMisaTagetDAO.deleteBudgMisaTaget(budgMisaTagetBean);
			}
		}
	}
    /*
	@Override
	public List<CauseActBean> findCauseAct(HashMap<String, String> queryMap) {
		// TODO Auto-generated method stub
		List<CauseActBean> causeActList = causeActDAO.selectCauseAct(queryMap);
		return causeActList;
	}

	@Override
	public void batchCauseAct(CauseActBean causeActBean) throws CauseActException {
		// TODO Auto-generated method stub
		causeActDAO.callCauseActProcess(causeActBean);
		String errorCode = causeActBean.getErrorCode();
		String errorMsg = causeActBean.getErrorMsg();
		if(errorCode.equals("-1")){
			throw new CauseActException(errorMsg);
		}
	}

	@Override
	public String getCauseNo() {
		// TODO Auto-generated method stub
		String causeNo = causeActDAO.getCauseNo();
		return causeNo;
	}*/
	
}
