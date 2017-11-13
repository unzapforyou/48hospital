package com.seoul.his.log.store.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.store.to.PrcsWhsHistBean;

public interface PrcsWhsHistDAO {
    List<PrcsWhsHistBean> selectPrcsWhsHistList(Map<String, String> argsMap);
    void insertPrcsWhsHist(PrcsWhsHistBean prcsWhsHistBean);
    void updatePrcsWhsHist(PrcsWhsHistBean prcsWhsHistBean);
    void deletePrcsWhsHist(PrcsWhsHistBean prcsWhsHistBean);
}
