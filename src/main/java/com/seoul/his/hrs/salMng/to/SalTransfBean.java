package com.seoul.his.hrs.salMng.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salMng.to
 * @Class    SalTransfBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsSalTransf")
public class SalTransfBean {
	private String bankNm,        // 은행명
	               empNo,         // 사원번호
	               empNm,         // 사원명
	               accountNm,     // 계좌명
	               aap,           // 차인지급액
	               paymentDate,   // 지급일자
	               deptNm,        // 부서명
	               select = "0";  // checkbox 미선택
}
