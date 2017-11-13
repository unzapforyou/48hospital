package com.seoul.his.hrs.salMng.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salMng.to
 * @Class    SalCalculSumBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsSalCalculSum")
public class SalCalculSumBean {
	private String taxationTaxSum,   // 과세총액
				   freeTaxAmt,       // 비과세총액
				   compShare,        // 회사총부담금
				   gookmin,          // 국민
				   goyoung,          // 고용
				   gungang,          // 건강
				   nongteuk,         // 농특
				   sodeuk,           // 소득
				   jibang;           // 지방
}
