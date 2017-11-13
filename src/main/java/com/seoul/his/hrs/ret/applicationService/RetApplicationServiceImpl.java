package com.seoul.his.hrs.ret.applicationService;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.seoul.his.hrs.ret.dao.RetApproPayDAO;
import com.seoul.his.hrs.ret.dao.RetEmpDAO;
import com.seoul.his.hrs.ret.dao.RetPayDAO;
import com.seoul.his.hrs.ret.dao.RetPlanEmpDAO;
import com.seoul.his.hrs.ret.dao.ReturnItemDAO;
import com.seoul.his.hrs.ret.exception.RetPayTreatedException;
import com.seoul.his.hrs.ret.to.RetApproPayBean;
import com.seoul.his.hrs.ret.to.RetEmpBean;
import com.seoul.his.hrs.ret.to.RetPayBean;
import com.seoul.his.hrs.ret.to.RetPlanEmpBean;
import com.seoul.his.hrs.ret.to.ReturnItemBean;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.applicationService
 * @Class    RetApplicationServiceImpl.java
 * @Create   2016. 6. 3.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */
@Service
public class RetApplicationServiceImpl implements RetApplicationService{

	@Autowired
	private RetApproPayDAO retApproPayDAO;
	@Autowired
	private ReturnItemDAO returnItemDAO;
	@Autowired
	private RetPayDAO retPayDAO;
	@Autowired
	private RetPlanEmpDAO retPlanEmpDAO;
	@Autowired
	private RetEmpDAO retEmpDAO;
	
	@Override
	public List<RetApproPayBean> findRetApproPayList(Map<String, String> argsMap) {
		List<RetApproPayBean> retApproPayBeanList;

		retApproPayBeanList=retApproPayDAO.selectRetApproPayList(argsMap);

		try{
		 return retApproPayBeanList;
		}catch(DataAccessException e){
			throw e;
		}
	}

	@Override
	public void batchRetApproPayProcess(List<RetApproPayBean> retApproPayList) {
		for (RetApproPayBean retApproPayBean : retApproPayList) {
			if (retApproPayBean.getStatus().equals("inserted")) {
				retApproPayDAO.insertRetApproPay(retApproPayBean);
			} else if (retApproPayBean.getStatus().equals("updated")) {
				retApproPayDAO.updateRetApproPay(retApproPayBean);
			} else if (retApproPayBean.getStatus().equals("deleted")) {
				retApproPayDAO.deleteRetApproPay(retApproPayBean);
			}
		}
	}

	@Override
	public List<ReturnItemBean> findReturnItemList(
			Map<String, String> returnItemSeachMap) {
		List<ReturnItemBean> returnItemBeanList;

		returnItemBeanList=returnItemDAO.selectReturnItemList(returnItemSeachMap);

		try{
		 return returnItemBeanList;
		}catch(DataAccessException e){
			throw e;
		}
	}

	@Override
	public void batchReturnItemProcess(List<ReturnItemBean> returnItemList) {
		for (ReturnItemBean returnItemBean : returnItemList) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+returnItemBean.getEmpNo());
			if (returnItemBean.getStatus().equals("inserted")) {
				returnItemDAO.insertReturnItem(returnItemBean);
			} else if (returnItemBean.getStatus().equals("updated")) {
				returnItemDAO.updateReturnItem(returnItemBean);
			} else if (returnItemBean.getStatus().equals("deleted")) {
				returnItemDAO.deleteReturnItem(returnItemBean);
			}
		}
	}

	@Override
	public void calcRetPayProcess(Map<String, String> argsMap)throws RetPayTreatedException{
		retPayDAO.calcRetPay(argsMap);
		int errCd=Integer.parseInt(argsMap.get("errorCode"));
		String errMsg=argsMap.get("errorMsg");

		if(errCd<0){
			throw new RetPayTreatedException(errMsg);
		}

	}

	@Override
	public void batchRetPayProcess(List<RetPayBean> retPayList) {
		for (RetPayBean retPayBean : retPayList) {
			if (retPayBean.getStatus().equals("inserted")) {
				retPayDAO.insertRetPay(retPayBean);
			} else if (retPayBean.getStatus().equals("updated")) {
				retPayDAO.updateRetPay(retPayBean);
			} else if (retPayBean.getStatus().equals("deleted")) {
				retPayDAO.deleteRetPay(retPayBean);
			}
		}
	}

	@Override
	public List<RetPayBean> findRetPayList(Map<String, String> argsMap) {
		return retPayDAO.selectRetPayList(argsMap);
	}

	@Override
	public List<RetPlanEmpBean> findRetPlanEmpList(
			Map<String, String> argsMap) {
		return retPlanEmpDAO.selectRetPlanEmpList(argsMap);
	}

	@Override
	public List<RetEmpBean> findRetEmpList(Map<String, String> argsMap) {
		return retEmpDAO.selectRetEmpList(argsMap);
	}
}
