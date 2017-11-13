package com.seoul.his.hrs.salMng.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salMng.to.SalCalEmpBean;
import com.seoul.his.hrs.salMng.to.SalStatmPDFBean;
import com.seoul.his.hrs.salMng.to.SalTransfBean;

public interface SalTransferApplicationService {    
    
    /* 급여명세 */
    List<SalCalEmpBean> findSalCalEmpList(Map<String, String> argsMap);
    List<SalStatmPDFBean> findSalStatmEmp(Map<String, String> argsMap);
    
    /* 급상여이체현황 */
    List<SalTransfBean> findSalTransfList(Map<String, String> argsMap);    
    
}
