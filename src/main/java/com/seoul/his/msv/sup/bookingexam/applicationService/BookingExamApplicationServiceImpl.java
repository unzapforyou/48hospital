package com.seoul.his.msv.sup.bookingexam.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.msv.sup.bookingexam.dao.BookingExamDAO;
import com.seoul.his.msv.sup.bookingexam.to.BookingExamBean;

/**
 * @Package com.seoul.his.msv.sup.bookingexam.applicationService
 * @Class BookingExamApplicationServiceImpl.java
 * @Create 2016. 12. 16.
 * @Author oss
 * @Description
 *
 * @LastUpdated
 */

@Component
public class BookingExamApplicationServiceImpl implements BookingExamApplicationService {

	@Autowired
	BookingExamDAO bookingexamDAO;

	// 검사예약조회
	@Override
	public List<BookingExamBean> findBookingExamList(Map<String, String> argsMap) {
		List<BookingExamBean> bookingExamList = bookingexamDAO.selectBookingExamList(argsMap);
		return bookingExamList;
	}

	// 검사예약 일괄처리
	@Override
	public void batchBookingExamProcess(BookingExamBean bookingExamBean) {
		switch (bookingExamBean.getStatus()) {
		case "inserted":
			bookingexamDAO.insertBookingExam(bookingExamBean);
			break;
		case "updated":
			bookingexamDAO.updateBookingExam(bookingExamBean);
			break;
		}
	}

}
