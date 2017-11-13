package com.seoul.his.log.store.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsPrcsWhs")
public class PrcsWhsBean extends BaseBean {
    String buyWhsNo,       //구매입고번호
    buyWhsDate,            //구매입고일자
    monthDlineYb,          //월마감여부
    cust,                //거래처코드
    ctrtCon,               //계약내용
    fmNm,                  //품명
    signStat,              //결재상태
    ctrtNo,                //계약번호
    gdsCd;                 //물품코드
}
