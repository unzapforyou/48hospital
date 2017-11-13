package com.seoul.his.msv.sup.bookingexam.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.bookingexam.to.BookingExamBean;

public interface BookingExamDAO {

	// 검사예약조회
	List<BookingExamBean> selectBookingExamList(Map<String, String> argsMap);
	// 검사예약 일괄처리
	public void insertBookingExam(BookingExamBean bookingExamBean);
	public void updateBookingExam(BookingExamBean bookingExamBean);

}
