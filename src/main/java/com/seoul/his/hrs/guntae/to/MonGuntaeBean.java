package com.seoul.his.hrs.guntae.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.to
 *    |_ MonGuntaeBean.java
 *
 * </pre>
 * @date : 2016. 12. 27. 오후 8:34:49
 * @version :
 * @author : User
 */
@Dataset(name="dsMonGuntae")
@Getter
@Setter
@ToString
public class MonGuntaeBean extends BaseBean{
	private String
	 belongYearMon        //  기준년도월
	,empNo                //  사원코드
	,basicTime            //  기본시간
	,overTime             //  연장시간
	,basicDay             //  기본일수
	,absenteeismDay       //  결근일수
	,paidDay              //  유급일수
	,absenceDay           //  휴직일수
	,yeonchaDay           //  연차일수
	,aleryDay             //  조퇴일수
	,latelessDay          //  지각일수
	,goOutDay             //  외출일수
	,closeYn              //  마감여부
	,startDate            // 시작일(조건검색으로 인해 세팅)
	,endDate;             // 마감일(조건검색으로 인해 세팅)
}





