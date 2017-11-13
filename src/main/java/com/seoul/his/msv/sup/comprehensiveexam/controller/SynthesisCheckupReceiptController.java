package com.seoul.his.msv.sup.comprehensiveexam.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.msv.sup.comprehensiveexam.service.ComprehensiveExamServiceFacade;
import com.seoul.his.msv.sup.comprehensiveexam.to.ChoiceCheckBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupCheckTypeBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupReceiptBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupReservationBean;


/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.controller
 * @Class    SynthesisCheckupReceiptController.java
 * @Create   2016. 12. 11.
 * @Author   박상우
 * @Description   종합검진 접수관리 컨트롤러
 *
 * @LastUpdated   2016. 12. 11. 
 */

@Controller
public class SynthesisCheckupReceiptController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    
    @Autowired
    ComprehensiveExamServiceFacade comprehensiveExamServiceFacade;
    
    /* 종합검진 접수 - 접수, 예약조회 */
    @SuppressWarnings("unchecked")
    @RequestMapping("sup/comprehensiveexam/findRsvtReceiptList.do")
    public void findRsvtReceiptList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        System.out.println("con");
        Map<String, Object> map = comprehensiveExamServiceFacade.findRsvtReceiptList(argsMap);
        
        List<SynthesisCheckupReservationBean> rsvtList = (List<SynthesisCheckupReservationBean>) map.get("rsvtList");
        List<SynthesisCheckupReceiptBean> receiptList = (List<SynthesisCheckupReceiptBean>) map.get("receiptList");

        dataSetBeanMapper.beansToDataset(outData, receiptList, SynthesisCheckupReceiptBean.class);
        dataSetBeanMapper.beansToDataset(outData, rsvtList, SynthesisCheckupReservationBean.class);
    }
     
   
    
    /* 종합검진 접수 - 예약검사 조회 */
    @RequestMapping("sup/comprehensiveexam/findRsvtInspList.do")
    public void findRsvtInspList(HttpServletRequest request, HttpServletResponse response)throws Exception {
        
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        
        List<SynthesisCheckupCheckTypeBean> pckInspList = new ArrayList<SynthesisCheckupCheckTypeBean>();
        List<ChoiceCheckBean> choInspList = new ArrayList<ChoiceCheckBean>();

        SynthesisCheckupReservationBean rsvtBean = comprehensiveExamServiceFacade.findRsvtInspList(argsMap);
        
        if (rsvtBean == null) {
            rsvtBean = new SynthesisCheckupReservationBean();
        } else {
            pckInspList = rsvtBean.getPckInspList();
            choInspList = rsvtBean.getChoInspList();
        }
        
        dataSetBeanMapper.beansToDataset(outData, pckInspList, SynthesisCheckupCheckTypeBean.class);
        dataSetBeanMapper.beansToDataset(outData, choInspList, ChoiceCheckBean.class);
    }
    
    /* 종합검진 접수 - 접수 등록 */
    @RequestMapping("sup/comprehensiveexam/registerReceipt.do")
    public void registerReceipt(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	PlatformData inData = (PlatformData) request.getAttribute("inData");
        
        SynthesisCheckupReceiptBean receiptBean= dataSetBeanMapper.datasetToBean(inData, SynthesisCheckupReceiptBean.class);
        comprehensiveExamServiceFacade.registerReceipt(receiptBean);
    }
    
    /* 종합검진 접수 - 접수 취소 */
    @RequestMapping("sup/comprehensiveexam/cancelReceipt.do")
    public void cancelReceipt(HttpServletRequest request, HttpServletResponse response) throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        SynthesisCheckupReceiptBean receiptBean = dataSetBeanMapper.datasetToBean(inData, SynthesisCheckupReceiptBean.class);

        comprehensiveExamServiceFacade.cancelReceipt(receiptBean);
    }
    
    /* 종합검진 접수 - 접수 저장 */
    @RequestMapping("sup/comprehensiveexam/batchReceiptProcess.do")
    public void batchReceiptProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        SynthesisCheckupReservationBean rsvtBean = dataSetBeanMapper.datasetToBean(inData, SynthesisCheckupReservationBean.class);
        
        List<ChoiceCheckBean> choInspList= dataSetBeanMapper.datasetToBeans(inData, ChoiceCheckBean.class);

        Map<String, Object> map = new HashMap<>();

        if(rsvtBean!=null){
            map.put("rsvtBean", rsvtBean);
        }
        
        if(choInspList.size() > 0){
            map.put("choInspList", choInspList);
        }
        
        comprehensiveExamServiceFacade.batchReceiptProcess(map);
    }
    
    /* 종합검진 접수 - 선택한 검사 일괄처리 */
    @RequestMapping("sup/comprehensiveexam/batchPckInspProcess.do")
    public void batchPckInspProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<SynthesisCheckupCheckTypeBean> pckInspList = dataSetBeanMapper.datasetToBeans(inData, SynthesisCheckupCheckTypeBean.class);
        comprehensiveExamServiceFacade.batchPckInspProcess(pckInspList);
    }
}

