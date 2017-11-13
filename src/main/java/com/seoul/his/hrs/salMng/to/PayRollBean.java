package com.seoul.his.hrs.salMng.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salMng.to
 * @Class    PayRollBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsPayRoll")
public class PayRollBean {
	private String title1,             // 사원코드
				   title2,             // 사원명
				   title3,             // 부서
				   paymAmt,            // 지급항목금액
				   deducAmt,           // 공제항목금액
				   select="0";         // checkbox 미선택

}
