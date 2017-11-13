package com.seoul.his.log.prcs.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.prcs.to.PrcsReceiptBean;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;

public interface PrcsReceiptDAO {
    List<GdsAnspBean> selectAnspList(Map<String, String> argsMap);
    List<PrcsReceiptBean> selectPrcsReceiptList(Map<String, String> argsMap);
    void insertPrcsReceipt(PrcsReceiptBean prcsReceiptBean);
    void updatePrcsReceipt(PrcsReceiptBean prcsReceiptBean);
    void deletePrcsReceipt(PrcsReceiptBean prcsReceiptBean);
    List<GdsAnspHistBean> selectAnspHistList(GdsAnspHistBean anspHistBean);
}
