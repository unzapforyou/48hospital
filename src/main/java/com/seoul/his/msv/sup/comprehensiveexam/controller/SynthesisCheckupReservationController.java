package com.seoul.his.msv.sup.comprehensiveexam.controller;

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
import com.seoul.his.msv.sup.comprehensiveexam.to.ReducBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupReservationBean;



/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.controller
 * @Class    SynthesisCheckupReservationController.java
 * @Create   2016. 12. 11.
 * @Author   박상우
 * @Description   예약관리 컨트롤러
 *
 * @LastUpdated   2016. 12. 11. 
 */

@Controller
public class SynthesisCheckupReservationController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    
    @Autowired
    ComprehensiveExamServiceFacade comprehensiveExamServiceFacade;
    
    // 종합검진 예약관리 - 예약 조회
    @RequestMapping("sup/comprehensiveexam/findSynthesisCheckupReservationList.do")
    public void findSynthesisCheckupReservationList(HttpServletRequest request, HttpServletResponse response) 
            throws Exception {
        
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        
        List<SynthesisCheckupReservationBean> synthesisCheckupReservationList = comprehensiveExamServiceFacade.findSynthesisCheckupReservationList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, synthesisCheckupReservationList, SynthesisCheckupReservationBean.class);
    }
    
    // 종합검진 예약관리 - 새예약
    @RequestMapping("sup/comprehensiveexam/findNewCheckupReservation.do")
    public void findNewCheckupReservation(HttpServletRequest request, HttpServletResponse response) 
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        String scrvNo = comprehensiveExamServiceFacade.findNewCheckupReservation();

        dataSetBeanMapper.addVariable(outData, "scrvNo", scrvNo);
    }
    
    // 종합검진 예약관리 - 저장
    @RequestMapping("sup/comprehensiveexam/batchSynthesisCheckupReservation.do")
    public void batchSynthesisCheckupReservation(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        
        List<SynthesisCheckupReservationBean> synthesisCheckupReservationList  = dataSetBeanMapper.datasetToBeans(inData, SynthesisCheckupReservationBean.class);
        List<ChoiceCheckBean> choiceCheckList = dataSetBeanMapper.datasetToBeans(inData, ChoiceCheckBean.class);

        Map<String, Object> map = new HashMap<>();

        if(synthesisCheckupReservationList.size() > 0){
            map.put("synthesisCheckupReservationList", synthesisCheckupReservationList);
        }
        
        if(choiceCheckList.size() > 0){
        	
            map.put("choiceCheckList", choiceCheckList);
            System.out.println(1123);
        }
        
        comprehensiveExamServiceFacade.batchSynthesisCheckupReservation(map);
    }
    
    // 종합검진 예약관리 - 예약취소
    @RequestMapping("sup/comprehensiveexam/cancelCheckupReservation.do")
    public void cancelCheckupReservation(HttpServletRequest request, HttpServletResponse response) 
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        comprehensiveExamServiceFacade.cancelCheckupReservation(argsMap);
    }
    
    //종합검진 예약관리 - 감면조회 
    @RequestMapping("sup/comprehensiveexam/findReducList.do")
    public void findReducList(HttpServletRequest request, HttpServletResponse response)throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        
        List<ReducBean> reducList = comprehensiveExamServiceFacade.findReducList(argsMap);
        
        dataSetBeanMapper.beansToDataset(outData, reducList, ReducBean.class);
    }
}        
