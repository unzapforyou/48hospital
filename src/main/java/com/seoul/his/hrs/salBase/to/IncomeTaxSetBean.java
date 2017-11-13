package com.seoul.his.hrs.salBase.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salBase.to
 * @Class    IncomeTaxSetBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsTaxChart")
public class IncomeTaxSetBean extends BaseBean{
    private String taxRangeFrom,    // 과세표준시작
	               taxRate,         // 세율
	               acmltDdt,        // 누진공액
	               limitAmt,        // 한도액
	               artcCd,          // 항목코드
	               taxRangeTo,      // 과세표준종료
	               belongYear,      // 귀속연도
	               seq;             // 일련번호
}
