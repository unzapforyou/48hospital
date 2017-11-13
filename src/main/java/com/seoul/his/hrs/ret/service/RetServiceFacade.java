package com.seoul.his.hrs.ret.service;

import java.util.Map;
import java.util.List;

import com.seoul.his.hrs.ret.exception.RetPayTreatedException;
import com.seoul.his.hrs.ret.to.RetApproPayBean;
import com.seoul.his.hrs.ret.to.RetEmpBean;
import com.seoul.his.hrs.ret.to.RetPayBean;
import com.seoul.his.hrs.ret.to.RetPlanEmpBean;
import com.seoul.his.hrs.ret.to.ReturnItemBean;


/**
 * 
 * @Package  com.seoul.his.hrs.ret.service
 * @Class    RetServiceFacade.java
 * @Create   2016. 6. 5.
 * @Author   Ckeun
 * @Description
 *			퇴직 sf
 * @LastUpdated
 * 			2016. 6. 5.
 */

public interface RetServiceFacade {

	List<RetApproPayBean> findRetApproPayList(Map<String, String> argsMap);

	List<ReturnItemBean> findReturnItemList(
			Map<String, String> returnItemSeachMap);

	void batchRetApproPayProcess(List<RetApproPayBean> retApproPayList);

	void batchReturnItemProcess(List<ReturnItemBean> returnItemList);

	void calcRetPayProcess(Map<String, String> argsMap) throws RetPayTreatedException;

	void batchRetPayProcess(List<RetPayBean> retPayList);

	List<RetPayBean> findRetPayList(Map<String, String> argsMap);
	
	List<RetPlanEmpBean> findRetPlanEmpList(Map<String, String> argsMap);

	List<RetEmpBean> findRetEmpList(Map<String, String> argsMap);
}
