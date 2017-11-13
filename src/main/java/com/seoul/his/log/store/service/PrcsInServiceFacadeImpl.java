package com.seoul.his.log.store.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.store.applicationService.PrcsInApplicationService;
import com.seoul.his.log.store.to.PrcsWhsBean;
import com.seoul.his.log.store.to.PrcsWhsHistBean;

@Service
public class PrcsInServiceFacadeImpl implements PrcsInServiceFacade {
    
    @Autowired
    PrcsInApplicationService prcsInApplicationService;
    
    @Override
    public List<PrcsWhsBean> findPrcsWhsList(Map<String, String> argsMap){
        return prcsInApplicationService.findPrcsWhsList(argsMap);
    }
    @Override
    public void batchPrcsWhsProcess(List<PrcsWhsBean> prcsWhsBeanList){
        prcsInApplicationService.batchPrcsWhsProcess(prcsWhsBeanList);
    }
    @Override
    public List<PrcsWhsHistBean> findPrcsWhsHistList(Map<String, String> argsMap){
        return prcsInApplicationService.findPrcsWhsHistList(argsMap);
    }
    @Override
    public void batchPrcsWhsHistProcess(List<PrcsWhsHistBean> prcsWhsHistBeanList){
        prcsInApplicationService.batchPrcsWhsHistProcess(prcsWhsHistBeanList);
    }
    @Override
    public void callPcWhsPstInvenReflect(Map<String, String> argsMap){
        prcsInApplicationService.callPcWhsPstInvenReflect(argsMap);
    }
}
