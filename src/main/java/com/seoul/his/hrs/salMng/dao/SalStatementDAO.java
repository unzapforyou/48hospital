package com.seoul.his.hrs.salMng.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.seoul.his.hrs.salMng.to.SalCalEmpBean;
import com.seoul.his.hrs.salMng.to.SalStatmPDFBean;

public interface SalStatementDAO {
    
    /*급여명세*/
    List<SalCalEmpBean> findSalCalEmpList(Map<String, String> argsMap) throws DataAccessException;
    List<SalStatmPDFBean> findSalStatmEmp(Map<String, String> argsMap) throws DataAccessException;

}
