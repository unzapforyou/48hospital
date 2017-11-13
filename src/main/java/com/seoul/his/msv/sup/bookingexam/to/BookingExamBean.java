package com.seoul.his.msv.sup.bookingexam.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  	com.seoul.his.msv.sup.bookingexam.to
 * @Class    	BookingExamBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsBookingExam")
public class BookingExamBean extends BaseBean{

	private	String 	patNo,
					patNm,
					newonGubun,
					examType,
					reservationDate,
					reservationTime,
					memo;

}
