package com.seoul.his.msv.mcm.patientservice.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




/**
 * @Package  com.seoul.his.med.base.to
 * @Class    TrmtSchdTypeDetailBean.java
 * @Create   2016. 6. 15.
 * @Author   Chun
 * @Description 의사일정상세빈
 *
 * @LastUpdated
 */
@Dataset(name="dsTrmtSchdTypeDetail")
@Getter
@Setter
@ToString

public class TrmtSchdTypeDetailBean extends BaseBean{

	private String amFmDiv      ;  //오전오후구분
	private String time         ;  //시간
	private String handle       ;  //총원
	private String diffDeptReser;  //타과예약
	private String empNo        ;  //사원번호
	private String trmtTypeNo   ;  //진료타입번호
	private String dayOfWeek    ;  //요일



}
