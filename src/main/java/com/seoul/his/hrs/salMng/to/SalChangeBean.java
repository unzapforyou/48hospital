package com.seoul.his.hrs.salMng.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salMng.to
 * @Class    SalChangeBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description 
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsSalChange")
public class SalChangeBean {
	private String basicSal,     // 기본급
				   taxSum,       // 과세총액
				   freeTaxSum,   // 비과세총액
				   bonus,        // 상여
				   compShare,    // 사업자부담금
				   gookmin,      // 국민연금
				   gungang,      // 건강보험
				   goyong,       // 고용보험
				   janggi,       // 장기요양보험
				   sodeuk,       // 소득세
				   jumin,        // 주민세
				   chainSum,     // 지급합계
				   cnt;          // 인원수
}
