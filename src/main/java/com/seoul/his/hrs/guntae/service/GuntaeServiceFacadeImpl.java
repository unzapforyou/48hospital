package com.seoul.his.hrs.guntae.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.hrs.guntae.applicationService.GuntaeApplicationService;
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
 * com.seoul.his.hrs.guntae.service
 *    |_ GuntaeServiceFacadeImpl.java
 *
 * </pre>
 * @date : 2016. 12. 22. 오후 7:45:38
 * @version :
 * @author : User
 */

@Service
public class GuntaeServiceFacadeImpl implements GuntaeServiceFacade{

	@Autowired
    GuntaeApplicationService guntaeApplicationService;

	 //출퇴근시간 조회
    @Override
    public List<InoutWorkTimeBean> findInoutWorkTimeList(Map<String, String> argsMap) {
        return guntaeApplicationService.findInoutWorkTimeList(argsMap);
    }

    //출퇴근시간 일괄처리
    @Override
    public void batchInoutWorkTimeProcess(List<InoutWorkTimeBean> list) {
    	guntaeApplicationService.batchInoutWorkTimeProcess(list);

    }

    //개인 시간외근무 조회
    @Override
    public List<OverTimeWorkBean> findOverTimeWorkList(Map<String, String> argsMap) {
        return guntaeApplicationService.findOverTimeWorkList(argsMap);
    }

    //관리자 시간외근무 조회
    @Override
    public List<OverTimeWorkBean> findApproverOverTimeWorkList() {
        return guntaeApplicationService.findApproverOverTimeWorkList();
    }

    //시간외근무 일괄처리
    @Override
    public void batchOverTimeWorkProcess(List<OverTimeWorkBean> list) {
    	guntaeApplicationService.batchOverTimeWorkProcess(list);
    }

    //개인휴가 조회
    @Override
    public List<HolidayBean> findHolidayList(Map<String, String> argsMap) {
        return guntaeApplicationService.findHolidayList(argsMap);
    }

    //관리자 휴가신청 조회
    @Override
    public List<HolidayBean> findAdminHolidayList(Map<String, String> argsMap) {
        return guntaeApplicationService.findAdminHolidayList(argsMap);
    }

    //휴가신청 일괄처리
    @Override
    public void batchHolidayProcess(List<HolidayBean> list) {
        System.out.println("일괄처리 서비스퍼사드 타나??");
        guntaeApplicationService.batchHolidayProcess(list);
    }

    //연차 조회
    @Override
    public List<YeonchaBean> findYeonchaList(Map<String, String> argsMap) {
        return guntaeApplicationService.findYeonchaList(argsMap);
    }

    //연차발생
    @Override
    public List<YeonchaBean> callYeoncha(Map<String, String> argsMap) {
        System.out.println("연차발생 serviceFacadeImpl");
        return guntaeApplicationService.callYeoncha(argsMap);
    }

  //휴일 조회
    @Override
    public List<HdayBean> findHdayList(Map<String, String> argsMap) {
        return guntaeApplicationService.findHdayList(argsMap);
    }

    //휴일 일괄처리
    @Override
    public void batchHdayProcess(List<HdayBean> list) {
    	guntaeApplicationService.batchHdayProcess(list);

    }

    //일근태 생성
    @Override
    public List<DayGuntaeBean> createDayGuntae(Map<String, String> argsMap) {
        return guntaeApplicationService.createDayGuntae(argsMap);
    }

    //일근태 조회
    @Override
    public List<DayGuntaeBean> findDayGuntaeList(Map<String, String> argsMap) {
        return guntaeApplicationService.findDayGuntaeList(argsMap);
    }


    //월근태 조회
    @Override
    public List<MonGuntaeBean> findMonGuntaeList(Map<String, String> argsMap) {
        return guntaeApplicationService.findMonGuntaeList(argsMap);
    }

    //월근태 생성
    @Override
    public List<MonGuntaeBean> createMonGuntae(Map<String, String> argsMap) {
        return guntaeApplicationService.createMonGuntae(argsMap);
    }

  //월근태 마감
    @Override
    public List<MonGuntaeCloseBean> closeMonGuntae(Map<String, String> argsMap) {
        return guntaeApplicationService.closeMonGuntae(argsMap);
    }

}





