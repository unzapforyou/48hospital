package com.seoul.his.log.inpt.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  	com.seoul.his.log.inpt.to
 * @Class    	CtrtInfoDetailBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description 계약상세 빈
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsCtrtInfoDetail")
public class CtrtInfoDetailBean extends BaseBean{
    private String
    accYear         //회계년도
    ,acntSeq        //계정순번
    ,asstSubCd      //계정과목코드
    ,cngQnt         //환산수량
    ,ctrtAmt        //계약금액
    ,ctrtDate       //계약일자
    ,ctrtNo         //계약번호
    ,ctrtPrice      //계약단가
    ,ctrtQnt        //계약수량
    ,ctrtSeq        //요구순번
    ,demdDate       //요구일자
    ,demdSeq        //요구순번
    ,deptCd         //요구부서코드
    ,gdsCd          //물품코드
    ,gdsNm          //물품명
    ,gdsStand       //물품규격
    ,mngntAtcCode   //관리항목코드
    ,nsNo           //내선번호
    ,ordUnit        //발주단위
    ,receiptNo      //접수번호
    ,respoWorker    //요구담당자
    ,subul;         //수불


}
