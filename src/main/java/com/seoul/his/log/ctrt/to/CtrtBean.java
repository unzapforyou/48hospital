package com.seoul.his.log.ctrt.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsCtrt")
public class CtrtBean extends BaseBean {
    private String ctrtNo,             //계약번호
                   buyReceiptNo,       //구매접수번호
                   ctrtDiv,            //계약구분
                   inptYb,             //검수여부
                   cust,               //거래처
                   ctrtDate,           //계약일자
                   ctrtTel,            //거래처연락처
                   ctrtAddr,           //거래처주소
                   ctrtRespoWorker,    //계약담당자
                   ctrtGds,            //계약물품
                   gdsCd,              //물품코드
                   ctrtPrid,           //계약기간
                   ctrtQnt,            //계약수량
                   ctrtPrice,          //계약단가
                   ctrtAmt,            //계약금액
                   ctrtCon,            //계약내용
                   ctrtStart,          //계약시작일
                   ctrtEnd,            //계약종료일
                   ctrtSeq,            //계약순번
                   ctrtStat,           //계약상태
                   buyAprvYb,          //구매승인여부
                   signSsYb,           //결재상신여부
                   ctrtStand,          //계약규격
                   fm,                 //품목 24 이하 데이터칼럼에 없음
                   
                   custCd,             //거래처코드                   
                   bussNo,             //                   
                   busCtgNm,           //
                   prsdntNm,           //
                   
                   
                   
                   
                   
                   buyKnd,             //
                   ctrtMthd,           //
                   pps,                //
                   inptDate,           //
                   ctrtGrp,            //
                   resolNo,            //
                   resolStat,          //
                   ecoItem,            //
                   disper,             //
                   socCpn,             //
                   sm,                 //
                   ctrtCancelYb,       //
                   aprvYn,             //
                   aprvWorker;         //
                   
                   // cussCd 거래처코드, bussNo 사업자등록번호, busCtgNm 업종명, prsdntNm 대표자명
}
