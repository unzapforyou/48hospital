package com.seoul.his.log.store.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.store.dao.PrcsWhsDAO;
import com.seoul.his.log.store.dao.PrcsWhsHistDAO;
import com.seoul.his.log.store.to.PrcsWhsBean;
import com.seoul.his.log.store.to.PrcsWhsHistBean;

@Service
public class PrcsInApplicationServiceImpl implements PrcsInApplicationService{
    @Autowired
    PrcsWhsDAO prcsWhsDAO;
    @Autowired
    PrcsWhsHistDAO prcsWhsHistDAO;
    
    @Override
    public List<PrcsWhsBean> findPrcsWhsList(Map<String, String> argsMap){
        return prcsWhsDAO.selectPrcsWhsList(argsMap);
    }
    @Override
    public void batchPrcsWhsProcess(List<PrcsWhsBean> prcsWhsBeanList){
        for(PrcsWhsBean prcsWhsBean : prcsWhsBeanList){
            System.out.println(prcsWhsBean.getStatus());
            switch(prcsWhsBean.getStatus()){
            //case "normal" : prcsWhsBean.setStatus("inserted");
            case "inserted" : prcsWhsDAO.insertPrcsWhs(prcsWhsBean); break;
            case "updated" :prcsWhsDAO.updatePrcsWhs(prcsWhsBean); break;
            case "deleted" :prcsWhsDAO.deletePrcsWhs(prcsWhsBean); break;
            }
        }
    }
    @Override
    public List<PrcsWhsHistBean> findPrcsWhsHistList(Map<String, String> argsMap){
        return prcsWhsHistDAO.selectPrcsWhsHistList(argsMap);
    }
    @Override
    public void batchPrcsWhsHistProcess(List<PrcsWhsHistBean> prcsWhsHistBeanList){
        for(PrcsWhsHistBean prcsWhsHistBean : prcsWhsHistBeanList){
            System.out.println(prcsWhsHistBean.getStatus());
            switch(prcsWhsHistBean.getStatus()){
            //case "normal" : prcsWhsHistBean.setStatus("inserted");
            case "inserted" :prcsWhsHistDAO.insertPrcsWhsHist(prcsWhsHistBean); break;
            case "updated" :prcsWhsHistDAO.updatePrcsWhsHist(prcsWhsHistBean); break;
            case "deleted" :prcsWhsHistDAO.deletePrcsWhsHist(prcsWhsHistBean); break;
            }
        }
    }
    @Override
    public void callPcWhsPstInvenReflect(Map<String, String> argsMap){
        prcsWhsDAO.callPcWhsPstInvenReflect(argsMap);
    }
}
