package com.seoul.his.log.base.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.base.to.OutLogCdBean;
import com.seoul.his.log.base.to.WhBean;

public interface WhDAO {

    List<OutLogCdBean> selectBindWhCdList(Map<String, String> argsMap);

    List<WhBean> selectWhList(Map<String, String> argsMap);

    void updateWh(WhBean whBean);
}
