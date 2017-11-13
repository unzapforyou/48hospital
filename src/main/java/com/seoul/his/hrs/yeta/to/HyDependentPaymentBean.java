package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HyDependentPaymentBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  부양가족지출내역공제테이블빈
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsHyCreditcard")
public class HyDependentPaymentBean extends BaseBean{
	private String empNo,                               //사원번호
	               occGubun,                            //발생구분
	               regiNo,                              //주민등록번호
	               name;                                //이름
	private int    creditcardAmt,                       //신용카드사용액
                   cashReceiptAmt,                      //현금영수증사용액
                   debitcardAmt,                        //직불카드사용액
                   trdMarketAmt,                        //전통시장사용액
                   publicTransportationAmt;             //대중교통사용액
}