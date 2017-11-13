package com.seoul.his.hrs.salMng.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salMng.to.PayRollBean;

public interface PayRollApplicationService {    
    
    /* 급여대장 */
    List<PayRollBean> findPayrollList(Map<String, String> argsMap);
    
}
