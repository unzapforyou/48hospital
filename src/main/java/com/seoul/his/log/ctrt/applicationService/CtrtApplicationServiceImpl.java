package com.seoul.his.log.ctrt.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.log.ctrt.dao.CtrtDAO;
import com.seoul.his.log.ctrt.to.CtrtBean;

@Component
public class CtrtApplicationServiceImpl implements CtrtApplicationService {

	@Autowired
    CtrtDAO ctrtDAO;

	// 계약물품조회
	@Override
	public List<CtrtBean> findCtrtList(Map<String, String> argsMap) {
		return ctrtDAO.selectCtrtList(argsMap);
	}

	// 계약물품 일괄처리
	@Override
	public void batchCtrtProcess(List<CtrtBean> ctrtBeanList) {
		for(CtrtBean ctrtBean : ctrtBeanList){
			switch (ctrtBean.getStatus()) {
			case "insert" : ctrtDAO.insertCtrt(ctrtBean); break;
			case "update" : ctrtDAO.updateCtrt(ctrtBean); break;
			case "delete" : ctrtDAO.deleteCtrt(ctrtBean); break;
			}
		}
	}

}
