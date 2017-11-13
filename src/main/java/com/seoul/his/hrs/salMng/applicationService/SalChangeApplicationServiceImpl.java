package com.seoul.his.hrs.salMng.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.salMng.dao.SalChangeDAO;
import com.seoul.his.hrs.salMng.to.SalChangeBean;
import com.seoul.his.hrs.salMng.to.SalChangeEmpBean;
import com.seoul.his.hrs.salMng.to.SalChangePayDeduBean;

/**
 * @Package  com.seoul.his.hrs.salMng.applicationService
 * @Class    SalChangeApplicationServiceImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

@Component
public class SalChangeApplicationServiceImpl implements SalChangeApplicationService{

	@Autowired
	public SalChangeDAO salChangeDAO;
	
	/* 급/상여변동현황 */
	@Override
	public List<SalChangeBean> findSalChangeList(Map<String, String> argsMap) {
		return salChangeDAO.findSalChangeList(argsMap);
	}

	@Override
	public List<SalChangeEmpBean> findSalEmpList(Map<String, String> argsMap) {
		return salChangeDAO.findSalEmpList(argsMap);
	}

	@Override
	public List<SalChangePayDeduBean> findPayDeduList(Map<String, String> argsMap) {
		return salChangeDAO.findPayDeduList(argsMap);
	}	
}
