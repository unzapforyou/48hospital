package com.seoul.his.msv.sup.bookingexam.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.sup.bookingexam.applicationService.BookingExamApplicationService;
import com.seoul.his.msv.sup.bookingexam.to.BookingExamBean;


/**
 * @Package  com.seoul.his.msv.sup.bookingexam.service
 * @Class    BookingExamServiceFacadeImpl.java
 * @Create   2016. 12. 16.
 * @Author   oss
 * @Description
 *
 * @LastUpdated
 */

@Service
public class BookingExamServiceFacadeImpl implements BookingExamServiceFacade{

	@Autowired
	BookingExamApplicationService bookingexamApplicationService;

	// 검사예약조회
	@Override
	public List<BookingExamBean> findBookingExamList(Map<String, String> argsMap) {
		List<BookingExamBean> bookingExamList = bookingexamApplicationService.findBookingExamList(argsMap);
		return bookingExamList;
	}

	// 검사예약 일괄처리
	@Override
	public void batchBookingExamProcess(BookingExamBean bookingExamBean) {
		bookingexamApplicationService.batchBookingExamProcess(bookingExamBean);
	}

}
