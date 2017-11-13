package com.seoul.his.msv.sup.comprehensiveexam.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.comprehensiveexam.to.ChoiceCheckBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.CodePopupBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.DetailsCheckupBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.PackgeBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.ReducBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupCheckTypeBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupReceiptBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupReservationBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupResultBean;







public interface ComprehensiveExamServiceFacade {

    /* 종합검진 검사종류관리 - 조회 */
    List<SynthesisCheckupCheckTypeBean> findSynthesisCheckupCheckTypeList(Map<String, String> argsMap);

    /* 종합검진 검사종류관리 - 수정, 추가 */
    void batchSynthesisCheckupCheckType(List<SynthesisCheckupCheckTypeBean> SynthesisCheckupCheckTypeList);

    /* 종합검진 검사종류관리 - 처방코드 조회 */
    List<CodePopupBean> findOcsCodeList(Map<String, String> argsMap);
    
    /* 종합검진 검사관리 - 선택 검사목록 조회*/
    List<ChoiceCheckBean> findChoInspList(Map<String, String> argsMap);
    
    /* 종합검진 검사관리 - 선택 검사목록외 조회*/
    List<SynthesisCheckupCheckTypeBean> findExChoInspList(Map<String, String> argsMap);


    /* 종합검진 세부검사관리 - 검사 조회 */
    List<SynthesisCheckupCheckTypeBean> findSimpleCheckupList(Map<String, String> argsMap);

    /* 종합검진 세부검사관리 - 세부검사 조회 */
    List<DetailsCheckupBean> findDetailsCheckupList(Map<String, String> argsMap);

    /* 종합검진 세부검사관리 - 수정, 추가 */
     void batchDetailsCheckup(List<DetailsCheckupBean> detailsCheckupList);
     
     /* 종합검진 예약관리 - 예약조회 */
     List<SynthesisCheckupReservationBean> findSynthesisCheckupReservationList(Map<String, String> argsMap);

     /* 종합검진 예약관리 - 새예약 */
     String findNewCheckupReservation();

     /* 종합검진 예약관리 - 저장 */
     void batchSynthesisCheckupReservation(Map<String, Object> map);

     /* 종합검진 예약관리 - 예약취소 */
     void cancelCheckupReservation(Map<String, String> argsMap);
     
     /* 종합검진 예약관리 - 감면조회 */
     List<ReducBean> findReducList(Map<String, String> argsMap);
     
     /* 종합검진 접수 - 패키지 조회 */
      List<PackgeBean> findPckList(Map<String, String> argsMap);
     
     /* 종합검진 패키지관리 - 패키지 검사 조회 */
      List<SynthesisCheckupCheckTypeBean> findPckInspList(Map<String, String> argsMap);

      /* 종합검진 패키지관리 - 저장 */
     void batchPckProcess(Map<String, Object> map);
     void batchPckProcess2(PackgeBean packgeBean);

      /* 종합검진 패키지관리 - EX 패키지 조회 */
     List<SynthesisCheckupCheckTypeBean> findExPckInspList(Map<String, String> argsMap);

     /* 종합검진 접수 - 접수, 예약조회 */
     Map<String, Object> findRsvtReceiptList(Map<String, String> argsMap);
     
     /* 종합검진 접수 - 예약검사 조회 */
     SynthesisCheckupReservationBean findRsvtInspList(Map<String, String> argsMap);
     
     /* 종합검진 접수 - 접수 등록 */
    void registerReceipt(SynthesisCheckupReceiptBean synthesisCheckupReceiptBean);
     
     /* 종합검진 접수 - 접수 취소 */
    void cancelReceipt(SynthesisCheckupReceiptBean synthesisCheckupReceiptBean);
     
     /* 종합검진 접수 - 접수 저장 */
   void batchReceiptProcess(Map<String, Object> map);
     
     /* 종합검진 접수 - 선택검사 일괄처리 */
    void batchPckInspProcess(List<SynthesisCheckupCheckTypeBean> pckInspList);

    /* 종합검진 결과관리 - 검진자조회 */
   List<SynthesisCheckupReceiptBean> findReceiptList(Map<String, String> argsMap);

    /* 종합검진 결과관리 - 결과조회 */
   List<SynthesisCheckupResultBean> findRsltList(Map<String, String> argsMap);

    /* 종합검진 결과관리 - 저장 */
   void registerRslt(List<SynthesisCheckupResultBean> rsltList);

}
