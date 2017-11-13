package com.seoul.his.hrs.ret.service;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.hrs.ret.applicationService.RetApplicationService;
import com.seoul.his.hrs.ret.exception.RetPayTreatedException;
import com.seoul.his.hrs.ret.to.RetApproPayBean;
import com.seoul.his.hrs.ret.to.RetEmpBean;
import com.seoul.his.hrs.ret.to.RetPayBean;
import com.seoul.his.hrs.ret.to.RetPlanEmpBean;
import com.seoul.his.hrs.ret.to.ReturnItemBean;


/**
 * 
 * @Package  com.seoul.his.hrs.ret.service
 * @Class    RetServiceFacadeImpl.java
 * @Create   2016. 6. 5.
 * @Author   Ckeun
 * @Description
 *			퇴직 sf_Impl
 * @LastUpdated
 * 			2016. 6. 5.
 */

@Service
public class RetServiceFacadeImpl implements RetServiceFacade {

	@Autowired
	RetApplicationService retApplicationService;

	@Override
	public List<RetApproPayBean> findRetApproPayList(Map<String, String> argsMap) {

		return retApplicationService.findRetApproPayList(argsMap);
	}

	@Override
	public void batchRetApproPayProcess(List<RetApproPayBean> retApproPayList) {
		retApplicationService.batchRetApproPayProcess(retApproPayList);
	}

	@Override
	public List<ReturnItemBean> findReturnItemList(
			Map<String, String> returnItemSeachMap) {
		return retApplicationService.findReturnItemList(returnItemSeachMap);
	}

	@Override
	public void batchReturnItemProcess(List<ReturnItemBean> returnItemList) {
		retApplicationService.batchReturnItemProcess(returnItemList);
	}

	@Override
	public void calcRetPayProcess(Map<String, String> argsMap) throws RetPayTreatedException {
		retApplicationService.calcRetPayProcess(argsMap);
	}

	@Override
	public void batchRetPayProcess(List<RetPayBean> retPayList) {
		retApplicationService.batchRetPayProcess(retPayList);
	}

	@Override
	public List<RetPayBean> findRetPayList(Map<String, String> argsMap) {
		return retApplicationService.findRetPayList(argsMap);
	}

	//퇴직예정자 조회
	@Override
	public List<RetPlanEmpBean> findRetPlanEmpList(
			Map<String, String> argsMap) {
		return retApplicationService.findRetPlanEmpList(argsMap);
	}

	@Override
	public List<RetEmpBean> findRetEmpList(Map<String, String> argsMap) {
		return retApplicationService.findRetEmpList(argsMap);
	}

}
