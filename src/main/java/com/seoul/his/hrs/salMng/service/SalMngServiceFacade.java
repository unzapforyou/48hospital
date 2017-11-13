package com.seoul.his.hrs.salMng.service;

import java.util.List;
import java.util.Map;

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
 * @Class    SalMngServiceFacade.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016.6.27
 */

public interface SalMngServiceFacade {
    
    /* 급여명세 */
    List<SalCalEmpBean> findSalCalEmpList(Map<String, String> argsMap);
    List<SalStatmPDFBean> findSalStatmEmp(Map<String, String> argsMap);
    
    /* 급여대장 */
    List<PayRollBean> findPayrollList(Map<String, String> argsMap);
    
    /* 급상여이체현황 */
    List<SalTransfBean> findSalTransfList(Map<String, String> argsMap);
    
    /* 급/상여 변동현황 */
    List<SalChangeBean> findSalChangeList(Map<String, String> argsMap);
    List<SalChangeEmpBean> findSalEmpList(Map<String, String> argsMap);
    List<SalChangePayDeduBean> findPayDeduList(Map<String, String> argsMap);
    
    /* 급여계산 */
    List<SalCalculationBean> findSalCalList(Map<String, String> argsMap);
    void magamCancelSalCalList(Map<String, String> argsMap);
    void magamSalCalList(Map<String, String> argsMap);
    List<SalCalculSumBean> findSalCalSumList(Map<String, String> argsMap);
    void salCalculation(Map<String, String> argsMap) throws AreadyMagamException;
    void callUpdateSal(SalCalculDetailBean salCalculDetailBean);

}
