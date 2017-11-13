package com.seoul.his.log.prcs.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.prcs.dao.PrcsReceiptDAO;
import com.seoul.his.log.prcs.to.PrcsReceiptBean;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;

@Service
public class PrcsApplicationServiceImpl implements PrcsApplicationService {
    @Autowired
    PrcsReceiptDAO prcsReceiptDAO;

    @Override
    public List<PrcsReceiptBean> findPrcsReceiptList(Map<String, String> argsMap) {
        return prcsReceiptDAO.selectPrcsReceiptList(argsMap);
    }

    @Override
    public void batchPrcsReceiptProcess(List<PrcsReceiptBean> prcsReceiptList) {
        for(PrcsReceiptBean prcsReceiptBean : prcsReceiptList) {
            switch(prcsReceiptBean.getStatus()){
            case "inserted" :prcsReceiptDAO.insertPrcsReceipt(prcsReceiptBean); break;
            case "updated" :prcsReceiptDAO.updatePrcsReceipt(prcsReceiptBean); break;
            case "deleted" :prcsReceiptDAO.deletePrcsReceipt(prcsReceiptBean); break;
            }
        }
    }

    @Override
    public List<GdsAnspBean> findAnspList(Map<String, String> argsMap) {
        // TODO Auto-generated method stub
        return prcsReceiptDAO.selectAnspList(argsMap);
    }

    @Override
    public List<GdsAnspHistBean> findAnspHistList(GdsAnspHistBean anspHistBean) {
        // TODO Auto-generated method stub
        return prcsReceiptDAO.selectAnspHistList(anspHistBean);
    }
}
