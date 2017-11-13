package com.seoul.his.hrs.guntae.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.to
 *    |_ DayGuntaeBean.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 9:01:33
 * @version :
 * @author : User
 */
@Dataset(name = "dsDayGuntae")
@Getter
@Setter
@ToString
public class DayGuntaeBean extends BaseBean{

	private String
    belongDay          //기준일
    ,empNo             //사원번호
    ,guntaeDay         //요일
    ,inTime            //출근시간
    ,outTime           //퇴근시간
    ,basicTime         //기본시간
	,overTime          //연장시간
	,guntaeCd          //근태코드
	,guntaeOutCd       //근태외코드
	,closeYn           //마감여부
	,startDate         //시작일(조건검색으로 인해 세팅)
	,endDate           //마감일(조건검색으로 인해 세팅)
	,goOutTime          //
	,returnTime         //
	,aleryOutTime       //
	,goOutHour          //
	,latelessTime;      //
}





