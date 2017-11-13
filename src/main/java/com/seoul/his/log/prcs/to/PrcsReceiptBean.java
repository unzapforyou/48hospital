package com.seoul.his.log.prcs.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsPrcsReceipt")
public class PrcsReceiptBean extends BaseBean {
    private String gdsAnspNo,               //물품청구번호
                   anspHistNo,              //청구상세번호
                   buyReceiptNo,            //구매접수번호
                   buyReceiptDate,          //구매접수일
                   buyReceiptRespoWorker,   //구매접수담당자
                   cust,                    //거래처
                   custCd,                  //거래처코드
                   buyKind,                 //구매종류
                   inptYn,                  //검수여부
                   prcsQnt,                 //구매수량
                   buyReceiptYb,            //
                   buyDemdDeptCd,           //
                   acntCd,                  //
                   danDiv,                  //
                   receiptDiv,              //
                   skillExamTargetYb,       //
                   skillExamDate,           //
                   ctrtKind,                //
                   signStat,                //
                   buyDemdNo,               //
                   buyDemdDate,             //
                   ctrtYb,                  //
                   ctrtDiv,                 //
                   aprvYn,                  //
                   aprvWorker,              //
                   gdsCd,                   //물품코드
                   gdsNm;                   //물품명
}
