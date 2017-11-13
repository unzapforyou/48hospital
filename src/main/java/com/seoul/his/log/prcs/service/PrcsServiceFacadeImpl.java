package com.seoul.his.log.prcs.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.prcs.applicationService.PrcsApplicationService;
import com.seoul.his.log.prcs.to.PrcsReceiptBean;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;

@Service
public class PrcsServiceFacadeImpl implements PrcsServiceFacade {
    @Autowired
    PrcsApplicationService prcsApplicationService;

    @Override
    public List<PrcsReceiptBean> findPrcsReceiptList(Map<String, String> argsMap) {
        return prcsApplicationService.findPrcsReceiptList(argsMap);
    }

    @Override
    public void batchPrcsReceiptProcess(List<PrcsReceiptBean> prcsReceiptList) {
        prcsApplicationService.batchPrcsReceiptProcess(prcsReceiptList);
    }

    @Override
    public List<GdsAnspBean> findAnspList(Map<String, String> argsMap) {
        // TODO Auto-generated method stub
        return  prcsApplicationService.findAnspList(argsMap);
    }

    @Override
    public List<GdsAnspHistBean> findAnspHistList(GdsAnspHistBean anspHistBean) {
        // TODO Auto-generated method stub
        return prcsApplicationService.findAnspHistList(anspHistBean);
    }
}
