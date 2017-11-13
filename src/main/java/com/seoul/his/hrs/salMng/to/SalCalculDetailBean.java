package com.seoul.his.hrs.salMng.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salMng.to
 * @Class    SalCalculDetailBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsPayDedu")
public class SalCalculDetailBean {
	private String paymDeducDiv,   // 지급공제구분
                   paymDeducNm,    // 지급공제명
                   amt,            // 금액
                   empNo;          // 사원번호
}
