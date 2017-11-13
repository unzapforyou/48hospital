package com.seoul.his.hrs.salBase.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salBase.to
 * @Class    SalStandardSetBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsSalStandard")
public class SalStandardSetBean extends BaseBean{
	private String jobfm,                 // 직종
	               belongMonthSect,       // 귀속월구분
	               startDate,             // 시작일
	               ibsajaSalStanDay,      // 입사자급여계산
	               pepr,                  // 수습직지급기간
	               pesc,                  // 수습직급여계산
	               pepRate,               // 수습직지급율
	               reEmpSalCal,           // 퇴사자급여계산
	               bonusTaxCalStan,       // 상여세액계산기
	               frnTaxFreeRate,        // 외국인비과세율
	               pcscs,                 // 근속기간계산기
	               stanDay,               // 한달정상일
	               stanHour,              // 한달정상시간
	               hourOfOneDay,          // 하루시간
	               countDayOfMonth,       // 월일수산정
	               jobfmCd;               // 직종코드
}














