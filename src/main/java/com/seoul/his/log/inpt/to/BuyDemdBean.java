package com.seoul.his.log.inpt.to;

import com.seoul.his.common.to.BaseBean;

public class BuyDemdBean extends BaseBean{
    private String buyDemdDate,  //구매요구일자
    receiptNo;          //구매요구번호

    public String getBuyDemdDate() {
        return buyDemdDate;
    }

    public void setBuyDemdDate(String buyDemdDate) {
        this.buyDemdDate = buyDemdDate;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }
}
