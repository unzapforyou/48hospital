package com.seoul.his.com.system.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.com.system.dao.SystemDAO;
import com.seoul.his.com.system.exception.SystemException;
import com.seoul.his.com.system.to.SystemBean;

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
public class SystemApplicationServiceImpl implements SystemApplicationService{
	@Autowired
	SystemDAO systemDAO;

	@Override
	public List<SystemBean> findSystemList(Map<String, String> argsMap) {
		List<SystemBean> systemList = systemDAO.selectSystemList(argsMap);
		return systemList;		
	}
	
	@Override
    public String findDate(Map<String, String> argsMap) {
        return systemDAO.selectDate(argsMap);
    }

}
