package com.seoul.his.hrs.salMng.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.seoul.his.hrs.salMng.to.PayRollBean;

public interface PayRollDAO {

    /*집계별 급여대장.*/
    List<PayRollBean> findEmpPayRollList(Map<String, String> argsMap) throws DataAccessException;
    List<PayRollBean> findDeptPayRollList(Map<String, String> argsMap) throws DataAccessException;
    List<PayRollBean> findJobPayRollList(Map<String, String> argsMap) throws DataAccessException;
    List<PayRollBean> findCompPayRollList(Map<String, String> argsMap) throws DataAccessException;

}
