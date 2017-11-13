package com.seoul.his.hrs.guntae.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.guntae.to.DayGuntaeBean;
import com.seoul.his.hrs.guntae.to.HdayBean;
import com.seoul.his.hrs.guntae.to.HolidayBean;
import com.seoul.his.hrs.guntae.to.InoutWorkTimeBean;
import com.seoul.his.hrs.guntae.to.MonGuntaeBean;
import com.seoul.his.hrs.guntae.to.MonGuntaeCloseBean;
import com.seoul.his.hrs.guntae.to.OverTimeWorkBean;
import com.seoul.his.hrs.guntae.to.YeonchaBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.applicationService
 *    |_ GuntaeApplicationService.java
 *
 * </pre>
 * @date : 2016. 12. 22. 오후 7:41:38
 * @version :
 * @author : User
 */

public interface GuntaeApplicationService {

	//출퇴근시간 조회
    List<InoutWorkTimeBean> findInoutWorkTimeList(Map<String, String> argsMap);

   //출퇴근시간 일괄처리
    void batchInoutWorkTimeProcess(List<InoutWorkTimeBean> list);

    //시간외근무 조회
    List<OverTimeWorkBean> findOverTimeWorkList(Map<String, String> argsMap);

    //관리자 시간외근무 조회
    List<OverTimeWorkBean> findApproverOverTimeWorkList();

    //시간외근무 일괄처리
    void batchOverTimeWorkProcess(List<OverTimeWorkBean> list);

    //개인휴가 조회
    List<HolidayBean> findHolidayList(Map<String, String> argsMap);

  //관리자 휴가신청 조회
    List<HolidayBean> findAdminHolidayList(Map<String, String> argsMap);

  //휴가신청 일괄처리
    void batchHolidayProcess(List<HolidayBean> list);

  //연차 조회
    List<YeonchaBean> findYeonchaList(Map<String, String> argsMap);

  //연차발생
    List<YeonchaBean> callYeoncha(Map<String, String> argsMap);

    //휴일조회
    List<HdayBean> findHdayList(Map<String, String> argsMap);

    //휴일 일괄처리
    void batchHdayProcess(List<HdayBean> list);

    //일근태생성
    List<DayGuntaeBean> createDayGuntae(Map<String, String> argsMap);

    //일근태조회
    List<DayGuntaeBean> findDayGuntaeList(Map<String, String> argsMap);

    //월근태조회
    List<MonGuntaeBean> findMonGuntaeList(Map<String, String> argsMap);

    //월근태생성
    List<MonGuntaeBean> createMonGuntae(Map<String, String> argsMap);

    //월근태마감&조회
    List<MonGuntaeCloseBean> closeMonGuntae(Map<String, String> argsMap);
}





