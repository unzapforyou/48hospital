package com.seoul.his.msv.sup.comprehensiveexam.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.sup.comprehensiveexam.applicationService.ComprehensiveExamApplicationService;
import com.seoul.his.msv.sup.comprehensiveexam.to.ChoiceCheckBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.CodePopupBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.DetailsCheckupBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.PackgeBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.ReducBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupCheckTypeBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupReceiptBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupReservationBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupResultBean;






/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.service
 * @Class    ComprehensiveExamServiceFacadeImpl.java
 * @Create   2016. 12. 01.
 * @Author   박상우
 * @Description   종합검진 서비스 퍼사드
 *
 * @LastUpdated   2016. 12. 01.
 */

@Service
public class ComprehensiveExamServiceFacadeImpl implements ComprehensiveExamServiceFacade {

    @Autowired
    private ComprehensiveExamApplicationService comprehensiveExamApplicationService;

    @Override                 /* 종합검진 검사종류관리 - 조회 */
    public List<SynthesisCheckupCheckTypeBean> findSynthesisCheckupCheckTypeList(Map<String, String> argsMap) {
        List<SynthesisCheckupCheckTypeBean> SynthesisCheckupCheckTypeList = comprehensiveExamApplicationService.findSynthesisCheckupCheckTypeList(argsMap);
        return SynthesisCheckupCheckTypeList;
    }

    @Override                 /* 종합검진 검사종류관리 - 수정, 추가 */
    public void batchSynthesisCheckupCheckType(List<SynthesisCheckupCheckTypeBean> SynthesisCheckupCheckTypeList) {
    	comprehensiveExamApplicationService.batchSynthesisCheckupCheckType(SynthesisCheckupCheckTypeList);
    }

    @Override                 /* 종합검진 검사종류관리 - 처방코드 조회 */
    public List<CodePopupBean> findOcsCodeList(Map<String, String> argsMap) {
        List<CodePopupBean> ocsCodeList = comprehensiveExamApplicationService.findOcsCodeList(argsMap);
        return ocsCodeList;
    }
    
    /*종합검진 검사종류관리 - 선택 검사목록 조회*/
   	@Override
   	public List<ChoiceCheckBean> findChoInspList(Map<String, String> argsMap) {
   		List<ChoiceCheckBean> choInspList = comprehensiveExamApplicationService.findChoInspList(argsMap);
   		return choInspList;
   	}
   	
   	/* 종합검진 검사관리 - 선택 검사목록외 조회*/
	@Override
	public List<SynthesisCheckupCheckTypeBean> findExChoInspList(Map<String, String> argsMap) {
		List<SynthesisCheckupCheckTypeBean> exChoInspList = comprehensiveExamApplicationService.findExChoInspList(argsMap);
		return exChoInspList;
	}


    @Override                  /*종합검진 세부검사관리 - 검사 조회*/
    public List<SynthesisCheckupCheckTypeBean> findSimpleCheckupList(Map<String, String> argsMap) {
        List<SynthesisCheckupCheckTypeBean> simpleCheckupList = comprehensiveExamApplicationService.findSimpleCheckupList(argsMap);
        return simpleCheckupList;
    }

    @Override                  /*종합검진 세부검사관리 - 세부검사 조회*/
    public List<DetailsCheckupBean> findDetailsCheckupList(Map<String, String> argsMap) {
        List<DetailsCheckupBean> detailsCheckupList = comprehensiveExamApplicationService.findDetailsCheckupList(argsMap);
        return detailsCheckupList;
    }

    @Override                  /*종합검진 세부검사관리 - 수정, 추가*/
    public void batchDetailsCheckup(List<DetailsCheckupBean> detailsCheckupList) {
    	comprehensiveExamApplicationService.batchDetailsCheckup(detailsCheckupList);
    }
    
    @Override                 /*종합검진 예약관리 - 예약 조회*/
    public List<SynthesisCheckupReservationBean> findSynthesisCheckupReservationList(Map<String, String> argsMap) {
        List<SynthesisCheckupReservationBean> synthesisCheckupReservationList = comprehensiveExamApplicationService.findSynthesisCheckupReservationList(argsMap);
        return synthesisCheckupReservationList;
    }

    @Override                 /*종합검진 예약관리 - 새예약*/
    public String findNewCheckupReservation() {
        String scrvNo = comprehensiveExamApplicationService.findNewCheckupReservation();
        return scrvNo;
    }

    @Override                 /*종합검진 예약관리 - 저장*/
    public void batchSynthesisCheckupReservation(Map<String, Object> map) {
    	comprehensiveExamApplicationService.batchSynthesisCheckupReservation(map);
    }

    @Override                /* 종합검진 예약관리 - 예약취소*/
    public void cancelCheckupReservation(Map<String, String> argsMap) {
    	comprehensiveExamApplicationService.cancelCheckupReservation(argsMap);
    }
    
    /* 종합검진 예약관리 - 감면조회  */
	@Override                
    public List<ReducBean> findReducList(Map<String, String> argsMap) {
        List<ReducBean> reducList = comprehensiveExamApplicationService.findReducList(argsMap);
        return reducList;
    }
    
    
    @Override                 /*종합검진 접수,패키지관리 - 패키지 조회*/
    public List<PackgeBean> findPckList(Map<String, String> argsMap) {
        List<PackgeBean> pckList = comprehensiveExamApplicationService.findPckList(argsMap);
        return pckList;
    }
    
    @Override                /* 종합검진 패키지관리 - 패키지 검사 조회*/
    public List<SynthesisCheckupCheckTypeBean> findPckInspList(Map<String, String> argsMap) {
        List<SynthesisCheckupCheckTypeBean> inspList = comprehensiveExamApplicationService.findPckInspList(argsMap);
        return inspList;
    }

    @Override                 /*종합검진 패키지관리 - 저장*/
    public void batchPckProcess(Map<String, Object> map) {
    	comprehensiveExamApplicationService.batchPckProcess(map);
    }

    @Override
    public void batchPckProcess2(PackgeBean packgeBean) {
    	comprehensiveExamApplicationService.batchPckProcess2(packgeBean);
    }

    @Override                 /*종합검진 패키지관리 - EX 패키지 조회*/
    public List<SynthesisCheckupCheckTypeBean> findExPckInspList(Map<String, String> argsMap) {
        List<SynthesisCheckupCheckTypeBean> pckInspList = comprehensiveExamApplicationService.findExPckInspList(argsMap);
        return pckInspList;
    }
    
    /*종합검진 접수 - 접수, 예약조회 */
    @Override               
    public Map<String, Object> findRsvtReceiptList(Map<String, String> argsMap) {
    	System.out.println("service");
        Map<String, Object> map = comprehensiveExamApplicationService.findRsvtReceiptList(argsMap);
        return map;
    }
    
     /*종합검진 접수 - 예약검사 조회 */
    @Override               
    public SynthesisCheckupReservationBean findRsvtInspList(Map<String, String> argsMap) {
    	SynthesisCheckupReservationBean rsvtBean = comprehensiveExamApplicationService.findRsvtInspList(argsMap);
        return rsvtBean;
    }
    
     /*종합검진 접수 - 접수 등록 */
    @Override                
    public void registerReceipt(SynthesisCheckupReceiptBean receiptBean) {
    	comprehensiveExamApplicationService.registerReceipt(receiptBean);
    }
    
     /*종합검진 접수 - 접수 취소 */
    @Override                
    public void cancelReceipt(SynthesisCheckupReceiptBean receiptBean) {
    	comprehensiveExamApplicationService.cancelReceipt(receiptBean);
    }
    
     /*종합검진 접수 - 접수 저장 */
    @Override               
    public void batchReceiptProcess(Map<String, Object> map) {
    	comprehensiveExamApplicationService.batchReceiptProcess(map);
    }
    
     /*종합검진 접수 - 선택검사 일괄처리 */
    @Override                
    public void batchPckInspProcess(List<SynthesisCheckupCheckTypeBean> pckInspList) {
    	comprehensiveExamApplicationService.batchPckInspProcess(pckInspList);
    }
    
    @Override                 /*종합검진 결과관리 - 검진자조회*/
    public List<SynthesisCheckupReceiptBean> findReceiptList(Map<String, String> argsMap) {
        List<SynthesisCheckupReceiptBean> receiptList = comprehensiveExamApplicationService.findReceiptList(argsMap);
        return receiptList;
    }

    @Override                 /*종합검진 결과관리 - 결과조회*/
    public List<SynthesisCheckupResultBean> findRsltList(Map<String, String> argsMap) {
        List<SynthesisCheckupResultBean> rsltList = comprehensiveExamApplicationService.findRsltList(argsMap);
        return rsltList;
    }

    @Override                 /*종합검진 결과관리 - 저장*/
    public void registerRslt(List<SynthesisCheckupResultBean> rsltList) {
    	comprehensiveExamApplicationService.registerRslt(rsltList);
    }

}
