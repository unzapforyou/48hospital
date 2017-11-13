package com.seoul.his.hrs.ret.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.to
 * @Class    RetPayBean.java
 * @Create   2016. 6. 26.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsRetPay")
public class RetPayBean extends BaseBean {

	String retIncomeAmt         //퇴직소득금액
    ,  retIncomeDeduction       //퇴직소득공제
    ,  retIncomeAsseStandard    //퇴직소득과세표준
    ,  retIncomeCalcTaxAmt      //퇴직소득산출세액
    ,  retIncomeDecidedTaxAmt   //퇴직소득결정세액
    ,  residenceTax             //주민세
    ,  actualRetPay             //실지급퇴직금
    ,  retIncomeAppropriation   //퇴직충당금
    ,  salAmount                //급여 금액
    ,  workingdays              //근속일수
    ,  salDays                  //월급지급일
    ,  recentWorkingdays        //최근근무일자
    ,  recentSalAmount          //최근월급금액
    ,  workPeriod               //근속기간
    ,  taxRate                  //세율
    ,  progressiveTaxDeduction  //누진세율공제
    ,  singleRateDeduction      //단일 세율 공제
    ,  empNo                    //사원번호
	,  empNm;                   //사원명

}