package com.seoul.his.msv.sup.comprehensiveexam.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.comprehensiveexam.to.ReducBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupReservationBean;



public interface SynthesisCheckupReservationDAO {

    /* 종합검진 예약관리 - 예약조회 */
    List<SynthesisCheckupReservationBean> selectSynthesisCheckupReservationList(Map<String, String> argsMap);
    
    /* 종합검진 예약관리 - 새예약 */
    String selectNewScrvNo();
    
    /* 종합검진 예약관리 - 저장 */
    void insertSynthesisCheckupReservation(SynthesisCheckupReservationBean scrv);
    void updateSynthesisCheckupReservation(SynthesisCheckupReservationBean scrv);
    
    /* 종합검진 예약관리 - 예약취소 */
    void updateCheckupReservationYN(Map<String, String> argsMap);
    
    /* 종합검진 예약관리 - 감면조회 */
    List<ReducBean> selectReducList(Map<String, String> argsMap);

}
