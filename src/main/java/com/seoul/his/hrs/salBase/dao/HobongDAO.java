package com.seoul.his.hrs.salBase.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.seoul.his.hrs.salBase.to.HobongHistoryBean;
import com.seoul.his.hrs.salBase.to.HobongBean;
import com.seoul.his.hrs.salBase.to.JobBean;

/**
 * @Package  com.seoul.his.hrs.salBase.dao
 * @Class    HobongDAO.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

public interface HobongDAO {

    public List<JobBean> findJobList() throws DataAccessException;
    public List<HobongBean> findHobongList(Map<String, String> argsMap) throws DataAccessException;
    public List<HobongHistoryBean> findHobongHistoryList(
            Map<String, String> argsMap) throws DataAccessException;
    
    public void insertHobong(HobongBean hobongBean) throws DataAccessException;
    public void updateHobong(HobongBean hobongBean) throws DataAccessException;
    public void deleteHobong(HobongBean hobongBean) throws DataAccessException;

    public void insertHobongHis(HobongHistoryBean hobongHisBean) throws DataAccessException;
    public void updateHobongHis(HobongHistoryBean hobongHisBean) throws DataAccessException;
    public void deleteHobongHis(HobongHistoryBean hobongHisBean) throws DataAccessException;

}
