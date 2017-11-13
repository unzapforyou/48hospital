package com.seoul.his.log.store.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsPrcsWhsHist")
public class PrcsWhsHistBean extends BaseBean {
    String buyWhsNo,     //구매입고번호
    buyWhsHistNo,          //구매입고내역번호
    gdsCd,               //물품코드
    subulUnit,           //수불단위
    ordUnit,             //발주단위
    cngQnt,              //환산수량
    giWhsQnt,            //기입고량
    hyunWhsQnt,          //현입고량
    price,               //단가
    amt,                 //금액
    whCd,                //창고코드
    signStat;            //결재상태
}
