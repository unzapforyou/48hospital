package com.seoul.his.hrs.guntae.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.hrs.guntae.dao.GuntaeDAO;
import com.seoul.his.hrs.guntae.dao.HdayDAO;
import com.seoul.his.hrs.guntae.dao.HolidayDAO;
import com.seoul.his.hrs.guntae.dao.InoutWorkTimeDAO;
import com.seoul.his.hrs.guntae.dao.OverTimeWorkDAO;
import com.seoul.his.hrs.guntae.dao.YeonchaDAO;
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
 *    |_ GuntaeApplicationServiceImpl.java
 *
 * </pre>
 * @date : 2016. 12. 22. 오후 7:42:24
 * @version :
 * @author : User
 */
@Service
public class GuntaeApplicationServiceImpl implements GuntaeApplicationService{

	@Autowired
    InoutWorkTimeDAO inoutWorkTimeDAO;
	@Autowired
	OverTimeWorkDAO overTimeWorkDAO;
	@Autowired
	HolidayDAO holidayDAO;
	@Autowired
	YeonchaDAO yeonchaDAO;
	@Autowired
	HdayDAO hdayDAO;
	@Autowired
	GuntaeDAO guntaeDAO;

	 //출퇴근시간 조회
    @Override
    public List<InoutWorkTimeBean> findInoutWorkTimeList(Map<String, String> argsMap) {
        return inoutWorkTimeDAO.selectInoutWorkTimeList(argsMap);
    }

    //출퇴근시간 일괄처리
    @Override
    public void batchInoutWorkTimeProcess(List<InoutWorkTimeBean> list) {

        for(InoutWorkTimeBean inoutWorkTimeBean : list){

            switch(inoutWorkTimeBean.getStatus()){

            case "inserted" : inoutWorkTimeDAO.insertInoutWorkTime(inoutWorkTimeBean);break;
            case "updated" : inoutWorkTimeDAO.updateInoutWorkTime(inoutWorkTimeBean);break;

            }

        }
    }

    //개인 시간외근무 조회
    @Override
    public List<OverTimeWorkBean> findOverTimeWorkList(Map<String, String> argsMap) {
        return overTimeWorkDAO.selectOverTimeWorkList(argsMap);
    }

    //관리자 시간외근무 조회
    @Override
    public List<OverTimeWorkBean> findApproverOverTimeWorkList() {
        return overTimeWorkDAO.selectApproverOverTimeWorkList();
    }

    //시간외근무 일괄처리
    @Override
    public void batchOverTimeWorkProcess(List<OverTimeWorkBean> list) {
        for(OverTimeWorkBean overTimeWorkbean : list){

            switch(overTimeWorkbean.getStatus()){

            case "inserted" : overTimeWorkDAO.insertOverTimeWork(overTimeWorkbean);break;
            case "updated" : overTimeWorkDAO.updateOverTimeWork(overTimeWorkbean);
                            if(overTimeWorkbean.getBeforeOvertimeNo() != null || overTimeWorkbean.getBeforeOvertimeNo() != ""){
                                overTimeWorkDAO.deleteBeforeOverTimeWork(overTimeWorkbean);
                            }break;
            case "deleted" : overTimeWorkDAO.deleteOverTimeWork(overTimeWorkbean);break;

            }

        }

    }

    //개인휴가 조회
    @Override
    public List<HolidayBean> findHolidayList(Map<String, String> argsMap) {
        return holidayDAO.selectHolidayList(argsMap);
    }

    //관리자 휴가신청 조회
    @Override
    public List<HolidayBean> findAdminHolidayList(Map<String, String> argsMap) {
        return holidayDAO.selectAdminHolidayList(argsMap);
    }

  //휴가신청 일괄처리
    @Override
    public void batchHolidayProcess(List<HolidayBean> list) {
        System.out.println("일괄처리 AS타나?");
        for(HolidayBean holidayBean : list){

            String appType = holidayBean.getAppType();
            String holidayStatus = holidayBean.getHolidayStatus();

            switch(holidayBean.getStatus()){

            case "inserted" : holidayDAO.callHoliday(holidayBean);break;
            case "updated" : holidayDAO.updateHoliday(holidayBean);break;

            }

        }

    }

  //연차 조회
    @Override
    public List<YeonchaBean> findYeonchaList(Map<String, String> argsMap) {
        return yeonchaDAO.selectYeonchaList(argsMap);
    }

    //연차발생
    @Override
    public List<YeonchaBean> callYeoncha(Map<String, String> argsMap) {
        System.out.println("연차발생 applicationService");
        argsMap.put("errorCode", "");
        argsMap.put("errorMsg", "");
        List<YeonchaBean> callYeon = yeonchaDAO.callYeoncha(argsMap);
        if(argsMap.get("errorCode").equals("-1")){
            new RuntimeException(argsMap.get("errorMsg"));
        }
        return callYeon;
    }

    //휴일 조회
    @Override
    public List<HdayBean> findHdayList(Map<String, String> argsMap) {
        return hdayDAO.selectHdayList(argsMap);
    }

    //휴일 일괄처리
    @Override
    public void batchHdayProcess(List<HdayBean> list) {

        for(HdayBean hdayBean : list){

            switch (hdayBean.getStatus()) {
            case "inserted" : hdayDAO.callHday(hdayBean); break;
            case "updated" : hdayDAO.callHday(hdayBean); break;
            case "deleted" : hdayDAO.deleteHday(hdayBean); break;

            }

        }

    }

  //일근태 생성
    @Override
    public List<DayGuntaeBean> createDayGuntae(Map<String, String> argsMap) {
        argsMap.put("errorCode", "");
        argsMap.put("errorMsg", "");
        List<DayGuntaeBean> callDayGuntae = guntaeDAO.callDayGuntae(argsMap);
        if(argsMap.get("errorCode").equals("-1")){
            new RuntimeException(argsMap.get("errorMsg"));
        }
        if(argsMap.get("errorCode").equals("1")){
            System.out.println(argsMap.get("errorMsg"));
        }
        return callDayGuntae;
    }

    //일근태 조회
    @Override
    public List<DayGuntaeBean> findDayGuntaeList(Map<String, String> argsMap) {
        return guntaeDAO.selectDayGuntaeList(argsMap);
    }


    //월근태 조회
    @Override
    public List<MonGuntaeBean> findMonGuntaeList(Map<String, String> argsMap) {
        return guntaeDAO.selectMonGuntaeList(argsMap);
    }

    //월근태 생성
    @Override
    public List<MonGuntaeBean> createMonGuntae(Map<String, String> argsMap) {

        argsMap.put("errorCode", "");
        argsMap.put("errorMsg", "");
        List<MonGuntaeBean> callMonGuntae = guntaeDAO.callMonGuntae(argsMap);
        if(argsMap.get("errorCode").equals("-1")){
            new RuntimeException(argsMap.get("errorMsg"));
        }if(argsMap.get("errorCode").equals("1")){
            System.out.println(argsMap.get("errorMsg"));
        }
        return callMonGuntae;
    }

    //월근태 마감
    @Override
    public List<MonGuntaeCloseBean> closeMonGuntae(Map<String, String> argsMap) {

        argsMap.put("errorCode", "");
        argsMap.put("errorMsg", "");
        List<MonGuntaeBean> callCloseMonGuntae = guntaeDAO.callCloseMonGuntae(argsMap);
        if(argsMap.get("errorCode").equals("-1")){
            new RuntimeException(argsMap.get("errorMsg"));
        }if(argsMap.get("errorCode").equals("1")){
            System.out.println(argsMap.get("errorMsg"));
        }

        List<MonGuntaeCloseBean> monGuntaeCloseList = guntaeDAO.selectMonGuntaeCloseList(argsMap);

        return monGuntaeCloseList;
    }

}





