package com.seoul.his.msv.sup.comprehensiveexam.controller;

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
import com.seoul.his.msv.sup.comprehensiveexam.to.CodePopupBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupCheckTypeBean;




/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.controller
 * @Class    SynthesisCheckupCheckTypeController.java
 * @Create   2016. 12. 01.
 * @Author   박상우
 * @Description   검사종류관리 컨트롤러
 *
 * @LastUpdated   2016. 12. 01.
 */

@Controller
public class SynthesisCheckupCheckTypeController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;

    @Autowired
        ComprehensiveExamServiceFacade comprehensiveExamServiceFacade;

    // 종합검진 검사관리 - 조회
    @RequestMapping("sup/comprehensiveexam/findSynthesisCheckupCheckTypeList.do")
    public void findSynthesisCheckupCheckTypeList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        /*
        for(String key : argsMap.keySet()) {
            System.out.println(key + " : " + argsMap.get(key));
        }
        */

        List<SynthesisCheckupCheckTypeBean> SynthesisCheckupCheckTypeList = comprehensiveExamServiceFacade.findSynthesisCheckupCheckTypeList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, SynthesisCheckupCheckTypeList, SynthesisCheckupCheckTypeBean.class);
    }


    // 종합검진 검사관리 - 처방코드 조회
    @RequestMapping("sup/comprehensiveexam/findOcsCodeList.do")
    public void findOcsCodeList(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        List<CodePopupBean> odsCodeList = comprehensiveExamServiceFacade.findOcsCodeList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, odsCodeList, CodePopupBean.class);
    }
    
    //종합검진 검사관리 - 선택 검사목록 조회 
    @RequestMapping("sup/comprehensiveexam/findChoInspList.do")
    public void findChoInspList(HttpServletRequest request, HttpServletResponse response)throws Exception {
        
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
       
        List<ChoiceCheckBean> choInspList = comprehensiveExamServiceFacade.findChoInspList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, choInspList, ChoiceCheckBean.class);
    }
    
    /* 종합검진 검사관리 - 선택 검사목록외 조회 */
    @RequestMapping("sup/comprehensiveexam/findExChoInspList.do")
    public void findExChoInspList(HttpServletRequest request, HttpServletResponse response)throws Exception {
    	PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        
        List<SynthesisCheckupCheckTypeBean> exChoInspList=comprehensiveExamServiceFacade.findExChoInspList(argsMap);
        System.out.println(exChoInspList);
        dataSetBeanMapper.beansToDataset(outData, exChoInspList, SynthesisCheckupCheckTypeBean.class);
    }


    // 종합검진 검사관리 - 수정, 등록, 저장
    @RequestMapping("sup/comprehensiveexam/batchSynthesisCheckupCheckType.do")
    public void batchSynthesisCheckupCheckType(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<SynthesisCheckupCheckTypeBean> SynthesisCheckupCheckTypeList = dataSetBeanMapper.datasetToBeans(inData, SynthesisCheckupCheckTypeBean.class);

        comprehensiveExamServiceFacade.batchSynthesisCheckupCheckType(SynthesisCheckupCheckTypeList);
    }
}