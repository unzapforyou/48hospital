package com.seoul.his.log.inpt.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  	com.seoul.his.log.inpt.to
 * @Class    	CtrtInfoBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description 계약관리 빈
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsCtrtInfo")
public class CtrtInfoBean extends BaseBean{
    private String
    ctrtNo              //계약번호
    ,ctrtDate           //계약일자
    ,ctrtDiv            //계약구분
    ,ctrtStart          //계약시작
    ,ctrtEnd            //계약종료
    ,ctrtSeq            //계약순번
    ,ctrtRespoWorker    //계약담당자
    ,cust               //거래처
    ,ctrtStat           //계약상태
    ,buyAprvYb          //구매승인여부
    ,signSsYb           //결제상신여부
    ,ctrtCon            //계약내용
    ,ctrtStand          //계약규격
    ,ctrtQnt            //계약수량
    ,ctrtPrice          //계약단가
    ,ctrtAmt            //계약금액
    ,buyReceiptNo       //구매접수번호
    ,inptYb             //검수여부
    ,fm                 //품목
    ,ctrtGds            //계약물품
    ,gdsCd;             //물품코드



}
