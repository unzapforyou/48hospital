package com.seoul.his.hdm.foreign.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;

public interface ReceiptInfoDAO {

    List<ReceiptInfoBean> selectReceiptList(Map<String, String> argsMap);

    void insertReceipt(ReceiptInfoBean receiptInfoBean);
    
    void updateReceipt(ReceiptInfoBean receiptInfoBean);

    void deleteReceipt(ReceiptInfoBean receiptInfoBean);

}
