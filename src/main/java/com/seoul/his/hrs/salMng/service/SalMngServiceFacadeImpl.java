package com.seoul.his.hrs.salMng.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.hrs.salMng.applicationService.PayRollApplicationService;
import com.seoul.his.hrs.salMng.applicationService.SalCalculApplicationService;
import com.seoul.his.hrs.salMng.applicationService.SalChangeApplicationService;
import com.seoul.his.hrs.salMng.applicationService.SalTransferApplicationService;
import com.seoul.his.hrs.salMng.exception.AreadyMagamException;
import com.seoul.his.hrs.salMng.to.PayRollBean;
import com.seoul.his.hrs.salMng.to.SalCalEmpBean;
import com.seoul.his.hrs.salMng.to.SalCalculDetailBean;
import com.seoul.his.hrs.salMng.to.SalCalculSumBean;
import com.seoul.his.hrs.salMng.to.SalCalculationBean;
import com.seoul.his.hrs.salMng.to.SalChangeBean;
import com.seoul.his.hrs.salMng.to.SalChangeEmpBean;
import com.seoul.his.hrs.salMng.to.SalChangePayDeduBean;
import com.seoul.his.hrs.salMng.to.SalStatmPDFBean;
import com.seoul.his.hrs.salMng.to.SalTransfBean;

/**
 * @Package  com.seoul.his.hrs.salMng.service
 * @Class    SalMngServiceFacadeImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

@Service
public class SalMngServiceFacadeImpl implements SalMngServiceFacade{
    
    @Autowired
    public PayRollApplicationService payRollApplicationService;
    
    @Autowired
    public SalCalculApplicationService salCalculApplicationService;
    
    @Autowired
    public SalChangeApplicationService salChangeApplicationService;
    
	@Autowired
	public SalTransferApplicationService salTransferApplicationService;

	/* 급여명세 */
	@Override
	public List<SalCalEmpBean> findSalCalEmpList(Map<String, String> argsMap) {
		return salTransferApplicationService.findSalCalEmpList(argsMap);
	}

	@Override
	public List<SalStatmPDFBean> findSalStatmEmp(Map<String, String> argsMap) {
		return salTransferApplicationService.findSalStatmEmp(argsMap);
	}
	
	/* 급여대장 */
	@Override
	public List<PayRollBean> findPayrollList(Map<String, String> argsMap) {
		return payRollApplicationService.findPayrollList(argsMap);
	}
	
	/* 급상여이체현황 */
	@Override
	public List<SalTransfBean> findSalTransfList(Map<String, String> argsMap) {
		return salTransferApplicationService.findSalTransfList(argsMap);
	}
	
	/* 급/상여변동현황 */
	@Override
	public List<SalChangeBean> findSalChangeList(Map<String, String> argsMap) {
		return salChangeApplicationService.findSalChangeList(argsMap);
	}

	@Override
	public List<SalChangeEmpBean> findSalEmpList(Map<String, String> argsMap) {
		return salChangeApplicationService.findSalEmpList(argsMap);
	}

	@Override
	public List<SalChangePayDeduBean> findPayDeduList(Map<String, String> argsMap) {
		return salChangeApplicationService.findPayDeduList(argsMap);
	}
	
	/* 급여계산 */
	@Override
	public List<SalCalculationBean> findSalCalList(Map<String, String> argsMap) {
		return salCalculApplicationService.findSalCalList(argsMap);
	}

    @Override
    public void magamSalCalList(Map<String, String> argsMap) {
        salCalculApplicationService.magamSalCalList(argsMap);
    }

	@Override
    public void magamCancelSalCalList(Map<String, String> argsMap) {
        salCalculApplicationService.magamCancelSalCalList(argsMap);
    }
	
	@Override
	public List<SalCalculSumBean> findSalCalSumList(Map<String, String> argsMap) {
		return salCalculApplicationService.findSalCalSumList(argsMap);
	}

    @Override
    public void salCalculation(Map<String, String> argsMap) throws AreadyMagamException {
        salCalculApplicationService.salCalculation(argsMap);
    }

    @Override
    public void callUpdateSal(SalCalculDetailBean salCalculDetailBean) {
        salCalculApplicationService.callUpdateSal(salCalculDetailBean);
    }
}
