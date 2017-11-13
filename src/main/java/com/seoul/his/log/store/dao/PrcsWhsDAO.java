package com.seoul.his.log.store.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.store.to.PrcsWhsBean;
import com.seoul.his.log.store.to.PrcsWhsHistBean;

public interface PrcsWhsDAO {
    List<PrcsWhsBean> selectPrcsWhsList(Map<String, String> argsMap);
    void insertPrcsWhs(PrcsWhsBean prcsWhsBean);
    void updatePrcsWhs(PrcsWhsBean prcsWhsBean);
    void deletePrcsWhs(PrcsWhsBean prcsWhsBean);
    void callPcWhsPstInvenReflect(Map<String, String> argsMap);
}
