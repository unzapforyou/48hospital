package com.seoul.his.hrs.guntae.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.to
 *    |_ HdayBean.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 7:43:43
 * @version :
 * @author : User
 */
@Dataset(name="dsHday")
@Getter
@Setter
@ToString
public class HdayBean extends BaseBean{

	private String
	hdayDate  //휴일날짜
  , hdayNm   //휴일명
  , hdayNm2  //공휴일명
  , sDate    //검색 시작 날짜
  , eDate;   //검색 종료 날짜
}





