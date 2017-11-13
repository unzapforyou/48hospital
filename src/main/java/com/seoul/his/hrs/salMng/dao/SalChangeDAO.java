package com.seoul.his.hrs.salMng.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salMng.to.SalChangeBean;
import com.seoul.his.hrs.salMng.to.SalChangeEmpBean;
import com.seoul.his.hrs.salMng.to.SalChangePayDeduBean;

public interface SalChangeDAO {
    
    List<SalChangeBean> findSalChangeList(Map<String, String> argsMap);
    List<SalChangeEmpBean> findSalEmpList(Map<String, String> argsMap);
    List<SalChangePayDeduBean> findPayDeduList(Map<String, String> argsMap);
    
}
