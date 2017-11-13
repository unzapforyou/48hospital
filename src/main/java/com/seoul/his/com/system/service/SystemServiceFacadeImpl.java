package com.seoul.his.com.system.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.com.system.applicationService.SystemApplicationService;
import com.seoul.his.com.system.to.SystemBean;


@Service
public class SystemServiceFacadeImpl implements SystemServiceFacade{
	@Autowired
	SystemApplicationService systemApplicationService;


	@Override
		public List<SystemBean> findSystemList(Map<String, String> argsMap) {
		List<SystemBean> systemList = systemApplicationService.findSystemList(argsMap);
		return systemList;
	}
	
	@Override
    public String findDate(Map<String, String> argsMap) {
        return systemApplicationService.findDate(argsMap);
    }
	
	
}
