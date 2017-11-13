package com.seoul.his.msv.sup.comprehensiveexam.applicationService;

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







public interface ComprehensiveExamApplicationService {
    /* 종합검진 검사종류관리 - 조회 */
    public List<SynthesisCheckupCheckTypeBean> findSynthesisCheckupCheckTypeList(Map<String, String> argsMap);

    /* 종합검진 검사종류관리 - 수정, 추가 */
    public void batchSynthesisCheckupCheckType(List<SynthesisCheckupCheckTypeBean> SynthesisCheckupCheckTypeList);

    /* 종합검진 검사종류관리 - 처방코드 조회 */
    public List<CodePopupBean> findOcsCodeList(Map<String, String> argsMap);
    
    /* 종합검진 검사종류관리 - 선택 검사목록 조회*/
    public List<ChoiceCheckBean> findChoInspList(Map<String, String> argsMap);
    
    /* 종합검진 검사관리 - 선택 검사목록외 조회*/
    public List<SynthesisCheckupCheckTypeBean> findExChoInspList(Map<String, String> argsMap);

    /*종합검진 세부검사관리 - 검사 조회*/
    public List<SynthesisCheckupCheckTypeBean> findSimpleCheckupList(Map<String, String> argsMap);

     /*종합검진 세부검사관리 - 세부검사 조회*/
    public List<DetailsCheckupBean> findDetailsCheckupList(Map<String, String> argsMap);

     /*종합검진 세부검사관리 - 수정, 추가*/
    public void batchDetailsCheckup(List<DetailsCheckupBean> detailsCheckupList);
    
    /*종합검진 예약관리 - 예약 조회*/
    public List<SynthesisCheckupReservationBean> findSynthesisCheckupReservationList(Map<String, String> argsMap);

     /*종합검진 예약관리 - 새예약*/
    public String findNewCheckupReservation();

    /* 종합검진 예약관리 - 저장*/
    public void batchSynthesisCheckupReservation(Map<String, Object> map);

     /*종합검진 예약관리 - 예약취소*/
    public void cancelCheckupReservation(Map<String, String> argsMap);
    
    /* 종합검진 예약관리 - 감면조회 */
    public List<ReducBean> findReducList(Map<String, String> argsMap);
    
    /*종합검진 접수,패키지관리 - 패키지 조회*/
    public List<PackgeBean> findPckList(Map<String, String> argsMap);
    
    /*종합검진 패키지관리 - 패키지 검사 조회*/
    public List<SynthesisCheckupCheckTypeBean> findPckInspList(Map<String, String> argsMap);

     /*종합검진 패키지관리 - 저장*/
    public void batchPckProcess(Map<String, Object> map);
    public void batchPckProcess2(PackgeBean packgeBean);

     /*종합검진 패키지관리 - EX 패키지 조회*/
    public List<SynthesisCheckupCheckTypeBean> findExPckInspList(Map<String, String> argsMap);
    
    /* 종합검진 접수 - 접수, 예약조회 */
    public Map<String, Object> findRsvtReceiptList(Map<String, String> argsMap);
    
    /* 종합검진 접수 - 예약검사 조회 */
    public SynthesisCheckupReservationBean findRsvtInspList(Map<String, String> argsMap);
    
    /* 종합검진 접수 - 접수 등록 */
    public void registerReceipt(SynthesisCheckupReceiptBean synthesisCheckupReceiptBean);
    
    /* 종합검진 접수 - 접수 취소 */
    public void cancelReceipt(SynthesisCheckupReceiptBean synthesisCheckupReceiptBean);
    
    /* 종합검진 접수 - 접수 저장 */
    public void batchReceiptProcess(Map<String, Object> map);
    
    /* 종합검진 접수 - 선택검사 일괄처리 */
    public void batchPckInspProcess(List<SynthesisCheckupCheckTypeBean> pckInspList);

    /* 종합검진 결과관리 - 검진자조회*/
    public List<SynthesisCheckupReceiptBean> findReceiptList(Map<String, String> argsMap);

     /*종합검진 결과관리 - 결과조회*/
    public List<SynthesisCheckupResultBean> findRsltList(Map<String, String> argsMap);

     /*종합검진 결과관리 - 저장*/
    public void registerRslt(List<SynthesisCheckupResultBean> rsltList);

}
