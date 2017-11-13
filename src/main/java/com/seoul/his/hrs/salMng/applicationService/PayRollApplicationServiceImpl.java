package com.seoul.his.hrs.salMng.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.salMng.dao.PayRollDAO;
import com.seoul.his.hrs.salMng.to.PayRollBean;

/**
 * @Package  com.seoul.his.hrs.salMng.applicationService
 * @Class    PayRollApplicationServiceImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

@Component
public class PayRollApplicationServiceImpl implements PayRollApplicationService{

	@Autowired
	public PayRollDAO payRollDAO;

	/* 급여대장 */
	@Override
	public List<PayRollBean> findPayrollList(Map<String, String> argsMap) {
		String jibGeType = argsMap.get("jibGeType");
		List<PayRollBean> payRollBean = null;
		switch(jibGeType){
			case "개인별" : payRollBean = payRollDAO.findEmpPayRollList(argsMap);
				break;
			case "부서별" : payRollBean = payRollDAO.findDeptPayRollList(argsMap);
				break;
			case "직종별" : payRollBean = payRollDAO.findJobPayRollList(argsMap);
				break;
			case "사업장별" : payRollBean = payRollDAO.findCompPayRollList(argsMap);
				break;
			}
		return payRollBean;
	}	
}
