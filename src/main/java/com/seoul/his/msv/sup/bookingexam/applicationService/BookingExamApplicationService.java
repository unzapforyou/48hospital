package com.seoul.his.msv.sup.bookingexam.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.bookingexam.to.BookingExamBean;

public interface BookingExamApplicationService {

	// 검사예약조회
	public List<BookingExamBean> findBookingExamList(Map<String, String> argsMap);
	// 검사예약 일괄처리
	public void batchBookingExamProcess(BookingExamBean bookingExamBean);

}
