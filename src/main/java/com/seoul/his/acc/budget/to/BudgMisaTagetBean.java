package com.seoul.his.acc.budget.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Dataset(name = "dsBudgMisaTaget")
public class BudgMisaTagetBean extends BaseBean {

	private String bimokCd        		 // 비목코드
				   , variationDiv   	 // 증감구분
				   , accYear        	 // 회계년도
				   , misaNo         	 // 전용번호
				   , variationAmount     // 증감액 
				   , bimokNm             // 예산비목명칭
				   , budgAmount          // 예산금액
				   , budgBal;            // 예산잔액
}                                        
