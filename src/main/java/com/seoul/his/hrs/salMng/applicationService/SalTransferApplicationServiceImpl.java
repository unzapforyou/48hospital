package com.seoul.his.hrs.salMng.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.salMng.dao.SalStatementDAO;
import com.seoul.his.hrs.salMng.dao.SalTransfDAO;
import com.seoul.his.hrs.salMng.to.SalCalEmpBean;
import com.seoul.his.hrs.salMng.to.SalStatmPDFBean;
import com.seoul.his.hrs.salMng.to.SalTransfBean;

/**
 * @Package  com.seoul.his.hrs.salMng.applicationService
 * @Class    SalTransferApplicationServiceImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

@Component
public class SalTransferApplicationServiceImpl implements SalTransferApplicationService{

	@Autowired
	public SalStatementDAO salStatmDAO;

	@Autowired
	public SalTransfDAO salTransfDAO;

	/* 급여명세 */
	@Override
	public List<SalCalEmpBean> findSalCalEmpList(Map<String, String> argsMap) {
		return salStatmDAO.findSalCalEmpList(argsMap);
	}

	@Override
	public List<SalStatmPDFBean> findSalStatmEmp(Map<String, String> argsMap) {
		return salStatmDAO.findSalStatmEmp(argsMap);
	}
	
	/* 급상여이체현황 */
	@Override
	public List<SalTransfBean> findSalTransfList(Map<String, String> argsMap) {
		return salTransfDAO.findSalTransfList(argsMap);
	}
	
}
