package com.seoul.his.acc.closing.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.closing.to.FinanStatsBean;



public interface FinanStatsDAO {

    List<FinanStatsBean> selectFinanPosiList(Map<String, Object> argsMap);

    List<FinanStatsBean> selectIncomStatList(Map<String, Object> argsMap);


}
