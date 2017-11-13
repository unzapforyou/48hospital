package com.seoul.his.hrs.salBase.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salBase.to
 * @Class    DeduChartBean.java
 * @Create   2016. 5. 25.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsDeductionChart")
public class DeduChartBean extends BaseBean{
	private String division,       // 항목
	               deductAmt,      // 공제액
	               artcCd,         // 항목코드
	               belongYear,     // 귀속년도
	               seq;            // 일련번호

}
