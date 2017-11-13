package com.seoul.his.hdm.foreign.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name="dsTrmtSchd")
public class TrmtSchdBean extends BaseBean{
	private String meddate ;    //진료일자
	private String empNo; 		//진료의
	private String rsvcnt; 		//예약인원현황
	private String examtm; 		//예약시간
	private String ampmflag;	//오전오후구분
	private String rsvposcnt; 	//잔여예약인원
	private String totcnt;		//총원
	private String comments; 	//설명



}
