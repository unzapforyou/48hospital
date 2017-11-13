package com.seoul.his.log.store.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.store.to.PrcsWhsBean;
import com.seoul.his.log.store.to.PrcsWhsHistBean;

public interface PrcsInServiceFacade {
    List<PrcsWhsBean> findPrcsWhsList(Map<String, String> argsMap);
    void batchPrcsWhsProcess(List<PrcsWhsBean> prcsWhsBeanList);
    List<PrcsWhsHistBean> findPrcsWhsHistList(Map<String, String> argsMap);
    void batchPrcsWhsHistProcess(List<PrcsWhsHistBean> prcsWhsHistBeanList);
    void callPcWhsPstInvenReflect(Map<String, String> argsMap);
}
