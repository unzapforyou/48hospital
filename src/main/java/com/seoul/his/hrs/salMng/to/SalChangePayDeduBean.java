package com.seoul.his.hrs.salMng.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsPayDedu")
public class SalChangePayDeduBean {
	private String paymDeducDiv,   // 지급공제구분
				   paymDeducNm,    // 지급공제명
				   basicSal,       // 기본급
				   compSal,        // 회사부담금
				   basicAap,       // 기본급
				   compAap,        // 회사차인지급액
				   aap;            // 차인지급액
}
