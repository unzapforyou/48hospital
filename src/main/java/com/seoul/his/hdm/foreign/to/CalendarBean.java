package com.seoul.his.hdm.foreign.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
@Dataset(name="dsCalendar")
public class CalendarBean extends BaseBean{
	private String sun   ; //일
	private String mon   ; //월
	private String thu   ; //화
	private String wed   ; //수
	private String thurs ; //목
	private String fri   ; //금
	private String sat   ; //토

}
