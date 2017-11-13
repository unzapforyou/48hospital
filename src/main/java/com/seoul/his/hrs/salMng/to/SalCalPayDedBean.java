package com.seoul.his.hrs.salMng.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salMng.to
 * @Class    SalCalPayDedBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsSalCalPayDed")
public class SalCalPayDedBean {
	private String paymDeducDiv,   // 지급공제구분
                   paymDeducNm,    // 지급공제액
                   amt,            // 금액
                   empNo;          // 사원번호
}
