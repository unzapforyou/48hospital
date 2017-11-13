package com.seoul.his.log.base.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.base.to.CustBean;
import com.seoul.his.log.base.to.OutLogCdBean;

public interface CustDAO {
    
    List<OutLogCdBean> selectBindCustCdList(Map<String, String> argsMap);

    List<CustBean> selectCustList(Map<String, String> argsMap);

    void insertCust(CustBean custBean);

    void updateCust(CustBean custBean);
    
    void upsertCust(CustBean custBean);
}
