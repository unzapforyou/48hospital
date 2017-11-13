package com.seoul.his.log.demd.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.log.demd.to
 * @Class    GdsReturnBean.java
 * @Create   2016. 5. 25.
 * @Author   Bohyun
 * @Description 물품반품 빈
 *
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsGdsReturn")
public class GdsReturnBean extends BaseBean{
    
    String returnDate;     //반품일
    String returnSeq;      //반품순번
    String returnDeptCd;   //반품부서코드
    String returnWhCd;     //반품창고코드
    String returnStatCd;   //반품상태코드
    String returnCau;      //반품사유
    String whsDate;        //입고일
    String whsSeq;         //입고순번
    String regdsDept;      //반품부서
    String regdsAnspName;  //반품물품명
    String vaildPrid;      //유효기간
    String regdsUnit;      //반품단위
    String regdsQnt;       //반품수량
    String regdsPrice;     //반품단가
    String regdsCau;       //반품내용
    String aprvYn;         //승인처리
    String aprvWorker;     //승인자
    
}
