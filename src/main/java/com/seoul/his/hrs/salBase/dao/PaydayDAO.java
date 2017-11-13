package com.seoul.his.hrs.salBase.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.seoul.his.hrs.salBase.to.PaydayBean;

public interface PaydayDAO {
    public List<PaydayBean> findPaydayList(Map<String, String> argsMap)
            throws DataAccessException;
    public void insertPayday(PaydayBean paydayBean) throws DataAccessException;
    public void updatePayday(PaydayBean paydayBean) throws DataAccessException;
    public void deletePayday(PaydayBean paydayBean) throws DataAccessException;
    public void callCreatePay(PaydayBean paydayBean) throws DataAccessException;
    public void deleteRegularWorksSal(PaydayBean paydayBean) throws DataAccessException;

    //마감여부확인
    public List<PaydayBean> findMagam(PaydayBean paydayBean) throws DataAccessException;
    public List<PaydayBean> findPaydaySubList(Map<String, String> argsMap) throws DataAccessException;
}
