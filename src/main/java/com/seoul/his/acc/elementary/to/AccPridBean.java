package com.seoul.his.acc.elementary.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name="dsAccPrid")
public class AccPridBean extends BaseBean{
	String accPrid;
	String startDate    ;
	String endDate      ;
	String dlineYn      ;
	String dlineDate    ;
	String dlineManCd   ;
	String carrforYn    ;
	String carrforManCd ;
	String carrforDate  ;
	String regId        ;
	String regIp        ;
	String regDate      ;
	String modId        ;
	String modIp        ;
	String modDate      ;



}
