package com.seoul.his.log.ctrt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.ctrt.applicationService.CtrtApplicationService;
import com.seoul.his.log.ctrt.to.CtrtBean;

@Service
public class CtrtServiceFacadeImpl implements CtrtServiceFacade {

	@Autowired
    CtrtApplicationService ctrtApplicationService;

	// 계약물품조회
	@Override
	public List<CtrtBean> findCtrtList(Map<String, String> argsMap) {
		return ctrtApplicationService.findCtrtList(argsMap);
	}

	// 계약물품 일괄처리
	@Override
	public void batchCtrtProcess(List<CtrtBean> ctrtBeanList) {
		ctrtApplicationService.batchCtrtProcess(ctrtBeanList);
	}


}
