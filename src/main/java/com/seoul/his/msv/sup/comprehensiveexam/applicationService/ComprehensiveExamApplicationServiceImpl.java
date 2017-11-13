package com.seoul.his.msv.sup.comprehensiveexam.applicationService;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.sup.comprehensiveexam.dao.DetailsCheckupDAO;
import com.seoul.his.msv.sup.comprehensiveexam.dao.PackgeDAO;
import com.seoul.his.msv.sup.comprehensiveexam.dao.SynthesisCheckupCheckTypeDAO;
import com.seoul.his.msv.sup.comprehensiveexam.dao.SynthesisCheckupReceiptDAO;
import com.seoul.his.msv.sup.comprehensiveexam.dao.SynthesisCheckupReservationDAO;
import com.seoul.his.msv.sup.comprehensiveexam.dao.SynthesisCheckupResultDAO;
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
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.applicationService
 * @Class    ComprehensiveExamApplicationServiceImpl.java
 * @Create   2016. 12. 01.
 * @Author   박상우
 * @Description   종합검진 어플리케이션 서비스
 *
 * @LastUpdated   2016. 12. 01.
 */

@Service
public class ComprehensiveExamApplicationServiceImpl implements ComprehensiveExamApplicationService{
    @Autowired
    private SynthesisCheckupCheckTypeDAO synthesisCheckupCheckTypeDAO;

    @Autowired
    private DetailsCheckupDAO detailsCheckupDAO;
    
    @Autowired
    private SynthesisCheckupReservationDAO synthesisCheckupReservationDAO;
    
    @Autowired
    private PackgeDAO packgeDAO;
    
    @Autowired
   private SynthesisCheckupReceiptDAO synthesisCheckupReceiptDAO;

    @Autowired
    private SynthesisCheckupResultDAO synthesisCheckupResultDAO;

    @Override                 /* 종합검진 검사종류관리 - 조회 */
    public List<SynthesisCheckupCheckTypeBean> findSynthesisCheckupCheckTypeList(Map<String, String> argsMap) {
        List<SynthesisCheckupCheckTypeBean> SynthesisCheckupCheckTypeList = synthesisCheckupCheckTypeDAO.selectSynthesisCheckupCheckTypeList(argsMap);
        return SynthesisCheckupCheckTypeList;
    }

    @Override                 /* 종합검진 검사종류관리 - 수정, 추가 */
    public void batchSynthesisCheckupCheckType(List<SynthesisCheckupCheckTypeBean> SynthesisCheckupCheckTypeList) {
        for (SynthesisCheckupCheckTypeBean synthesisCheckupCheckTypeBean: SynthesisCheckupCheckTypeList) {

            switch (synthesisCheckupCheckTypeBean.getStatus()) {
            case "inserted":
            	synthesisCheckupCheckTypeDAO.insertSynthesisCheckupCheckType(synthesisCheckupCheckTypeBean);
                break;
            case "updated":
            	synthesisCheckupCheckTypeDAO.updateSynthesisCheckupCheckType(synthesisCheckupCheckTypeBean);
                break;
            }
        }
    }

    @Override                 /* 종합검진 검사종류관리 - 처방코드 조회 */
    public List<CodePopupBean> findOcsCodeList(Map<String, String> argsMap) {
        List<CodePopupBean> ocsCodeList = synthesisCheckupCheckTypeDAO.selectOcsCodeList(argsMap);
        return ocsCodeList;
    }
    
	/* 종합검진 검사관리 - 선택 검사목록 조회  */
	@Override
	public List<ChoiceCheckBean> findChoInspList(Map<String, String> argsMap) {
		List<ChoiceCheckBean> choInspList = synthesisCheckupCheckTypeDAO.selectChoInspList(argsMap);
		return choInspList;
	}
	
	/* 종합검진 검사관리 - 선택 검사목록외 조회  */
	@Override
	public List<SynthesisCheckupCheckTypeBean> findExChoInspList(Map<String, String> argsMap) {
		List<SynthesisCheckupCheckTypeBean> exChoInspList = synthesisCheckupCheckTypeDAO.selectExChoInspList(argsMap);
		return exChoInspList;
	}


    @Override                  /*종합검진 세부검사관리 - 검사 조회*/
    public List<SynthesisCheckupCheckTypeBean> findSimpleCheckupList(Map<String, String> argsMap) {
        List<SynthesisCheckupCheckTypeBean> simpleCheckupList = detailsCheckupDAO.selectSimpleCheckupList(argsMap);
        return simpleCheckupList;
    }

    @Override                  /*종합검진 세부검사관리 - 세부검사 조회*/
    public List<DetailsCheckupBean> findDetailsCheckupList(Map<String, String> argsMap) {
        System.out.println(argsMap.get("inspCd"));
        List<DetailsCheckupBean> detailsCheckupList = detailsCheckupDAO.selectDetailsCheckupList(argsMap);
        return detailsCheckupList;
    }

    @Override                  /*종합검진 세부검사관리 - 수정, 추가*/
    public void batchDetailsCheckup(List<DetailsCheckupBean> detailsCheckupList) {
        for (DetailsCheckupBean detailsCheckupBean: detailsCheckupList) {
            switch (detailsCheckupBean.getStatus()) {
            case "inserted":
            	detailsCheckupDAO.insertDetailsCheckup(detailsCheckupBean);
                break;
            case "updated":
            	detailsCheckupDAO.updateDetailsCheckup(detailsCheckupBean);
                break;
            }
        }
    }
    
    @Override                 /*종합검진 예약관리 - 예약 조회*/
    public List<SynthesisCheckupReservationBean> findSynthesisCheckupReservationList(Map<String, String> argsMap) {
        List<SynthesisCheckupReservationBean> synthesisCheckupReservationList = synthesisCheckupReservationDAO.selectSynthesisCheckupReservationList(argsMap);
        return synthesisCheckupReservationList;
    }

    @Override                 /*종합검진 예약관리 - 새예약*/
    public String findNewCheckupReservation() {
        String scrvNo = synthesisCheckupReservationDAO.selectNewScrvNo();
        return scrvNo;
    }


    @Override                  /*종합검진 예약관리 - 저장*/
    public void batchSynthesisCheckupReservation(Map<String, Object> map) {

        List<SynthesisCheckupReservationBean> synthesisCheckupReservationList = (List<SynthesisCheckupReservationBean>) map.get("synthesisCheckupReservationList");
        List<ChoiceCheckBean> choiceCheckList = (List<ChoiceCheckBean>) map.get("choiceCheckList");

        if(synthesisCheckupReservationList!=null){
            for(SynthesisCheckupReservationBean synthesisCheckupReservationBean: synthesisCheckupReservationList){

                System.out.println("상태 : "+synthesisCheckupReservationBean.getStatus());
                switch (synthesisCheckupReservationBean.getStatus()){
                    case "inserted" :
                    	synthesisCheckupReservationDAO.insertSynthesisCheckupReservation(synthesisCheckupReservationBean);
                        break;

                    case "updated" :
                    	synthesisCheckupReservationDAO.updateSynthesisCheckupReservation(synthesisCheckupReservationBean);
                        break;
                }
            }
        }

        if(choiceCheckList!=null){
            batchChoInspProcess(choiceCheckList);
        }
    }
    
    /* 종합검진 예약관리 - 선택검사 수정, 추가, 삭제 */
    private void batchChoInspProcess(List<ChoiceCheckBean> choInspList) {
        for(ChoiceCheckBean choInsp: choInspList){
            String status = choInsp.getStatus();
            if(status.equals("inserted")){
            	synthesisCheckupCheckTypeDAO.insertChoInsp(choInsp);
            }else if(status.equals("deleted")){
            	synthesisCheckupCheckTypeDAO.deleteChoInsp(choInsp);
            }else if(status.equals("updated")){         
            	synthesisCheckupCheckTypeDAO.updateChoInsp(choInsp);
            }
        }
    }

    @Override                  /*종합검진 예약관리 - 예약취소*/
    public void cancelCheckupReservation(Map<String, String> argsMap) {
    	synthesisCheckupReservationDAO.updateCheckupReservationYN(argsMap);
    }
    
	/* 종합검진 예약관리 - 감면조회 */
	@Override               
    public List<ReducBean> findReducList(Map<String, String> argsMap) {
        List<ReducBean> reducList = synthesisCheckupReservationDAO.selectReducList(argsMap);
        
        return reducList;
    }
    
    @Override                 /* 종합검진 접수 - 패키지 조회*/
    public List<PackgeBean> findPckList(Map<String, String> argsMap) {
        List<PackgeBean> pckList = packgeDAO.selectPckList(argsMap);
        return pckList;
    }
    
    
    @Override                  /*종합검진 패키지관리 - 패키지 검사 조회*/
    public List<SynthesisCheckupCheckTypeBean> findPckInspList(Map<String, String> argsMap) {
        List<SynthesisCheckupCheckTypeBean> inspList = packgeDAO.selectPckInspList(argsMap);

        return inspList;
    }

    @SuppressWarnings("unchecked")
	@Override                /* 종합검진 패키지관리 - 저장*/
    public void batchPckProcess(Map<String, Object> map) {
        
		List<PackgeBean> pckList = (List<PackgeBean>) map.get("pckList");
        List<SynthesisCheckupCheckTypeBean> pckInspList = (List<SynthesisCheckupCheckTypeBean>) map.get("pckInspList");

        for(PackgeBean pckBean: pckList){
            String status = pckBean.getStatus();

            if(status.equals("inserted")){
            	packgeDAO.insertPck(pckBean);

            }else if(status.equals("updated")){
            	packgeDAO.updatePck(pckBean);

            }else if(status.equals("deleted")){
            	packgeDAO.deletePckInsp(pckBean);
            	packgeDAO.deletePck(pckBean);
            }
        }

        for(SynthesisCheckupCheckTypeBean inspBean: pckInspList){
            String status = inspBean.getStatus();

            if(status.equals("inserted")){
            	packgeDAO.insertPckInsp(inspBean);

            }else if(status.equals("deleted")){
            	packgeDAO.deletePckInsp2(inspBean);
            }
        }
    }

    @Override
    public void batchPckProcess2(PackgeBean packgeBean) {
        String status = packgeBean.getStatus();

        if(status.equals("inserted")){
        	packgeDAO.insertPck(packgeBean);

        }else if(status.equals("updated")){
        	packgeDAO.updatePck(packgeBean);
        }
    }

    @Override                 /*종합검진 패키지관리 - EX 패키지 조회*/
    public List<SynthesisCheckupCheckTypeBean> findExPckInspList(Map<String, String> argsMap) {
        List<SynthesisCheckupCheckTypeBean> pckInspList = packgeDAO.selectExPckInspList(argsMap);
        return pckInspList;
    }
    
    /*종합검진 접수 - 접수, 예약조회 */
	@Override                 
	public Map<String, Object> findRsvtReceiptList(Map<String, String> argsMap) {
	    List<SynthesisCheckupReservationBean> rsvtList = synthesisCheckupReceiptDAO.selectRsvtList(argsMap);
	    List<SynthesisCheckupReceiptBean> receiptList = synthesisCheckupReceiptDAO.selectReceiptList(argsMap);
	    System.out.println("!!!!!!!!!!!!!!!!!"+argsMap);
	        
	    Map<String, Object> map = new HashMap<>();
	    System.out.println("!!!!!!!!!!!!!!!!!"+map);
	    map.put("rsvtList", rsvtList);
	    map.put("receiptList", receiptList);

	    return map;
	}

	 /*종합검진 접수 - 예약검사 조회 */
	@Override                 
	public SynthesisCheckupReservationBean findRsvtInspList(Map<String, String> argsMap) {
		SynthesisCheckupReservationBean rsvtBean = synthesisCheckupReceiptDAO.selectRsvtInspList(argsMap);
	    return rsvtBean;
	}
	
	 /*종합검진 접수 - 접수 등록 */
	@Override                 
    public void registerReceipt(SynthesisCheckupReceiptBean receiptBean) {
        if(receiptBean!=null){
            String status = receiptBean.getStatus();
            
            if(status.equals("inserted")){
                int retVal = synthesisCheckupReceiptDAO.insertReceipt(receiptBean);

                if(retVal==0){

                    receiptBean.setCancelYn("N");
                    synthesisCheckupReceiptDAO.updateCancelYN(receiptBean);
                }
            }
        }
    }
	
	 /*종합검진 접수 - 접수 취소 */
	@Override
	public void cancelReceipt(SynthesisCheckupReceiptBean receiptBean) {
		synthesisCheckupReceiptDAO.updateCancelYN(receiptBean);
	}

	 /*종합검진 접수 - 접수 저장*/ 
	@Override                 
    public void batchReceiptProcess(Map<String, Object> map) {
		SynthesisCheckupReservationBean rsvtBean = (SynthesisCheckupReservationBean) map.get("rsvtBean");
        
        List<ChoiceCheckBean> choInspList = (List<ChoiceCheckBean>) map.get("choInspList");
        
        if(rsvtBean!=null){
            String choInspAmt = rsvtBean.getChoInspAmt();
            String choInspAmt2 = choInspAmt.replaceAll(",", "");
            
            rsvtBean.setChoInspAmt(choInspAmt2);
            
            synthesisCheckupReservationDAO.updateSynthesisCheckupReservation(rsvtBean);
        }
        
        if(choInspList!=null){
            batchChoInspProcess(choInspList);
        }
    }
	
	 /*종합검진 접수 - 선택검사 일괄처리 */
	@Override                 
    public void batchPckInspProcess(List<SynthesisCheckupCheckTypeBean> pckInspList) {
        for(SynthesisCheckupCheckTypeBean inspBean: pckInspList){
            switch (inspBean.getStatus()){
            case "inserted" :
            	synthesisCheckupReceiptDAO.insertPckInsp(inspBean);
                break;
            case "deleted" :
            	synthesisCheckupReceiptDAO.deletePckInsp(inspBean);
                break;
            }
        }
    }


    
    @Override                 /* 종합검진 결과관리 - 검진자조회*/
    public List<SynthesisCheckupReceiptBean> findReceiptList(Map<String, String> argsMap) {
        List<SynthesisCheckupReceiptBean> receiptList = synthesisCheckupReceiptDAO.selectReceiptList(argsMap);
        return receiptList;
    }

    @Override                 /*종합검진 결과관리 - 결과조회*/
    public List<SynthesisCheckupResultBean> findRsltList(Map<String, String> argsMap) {
        List<SynthesisCheckupResultBean> rsltList = synthesisCheckupResultDAO.selectRsltList(argsMap);
        return rsltList;
    }

    @Override                 /*종합검진 결과관리 - 저장*/
    public void registerRslt(List<SynthesisCheckupResultBean> rsltList) {
        for(SynthesisCheckupResultBean rsltBean : rsltList){
        	synthesisCheckupResultDAO.updateRslt(rsltBean);
        }
    }



}