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
import com.seoul.his.msv.sup.comprehensiveexam.to.PackgeBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupCheckTypeBean;


/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.controller
 * @Class    PackgeController.java
 * @Create   2016. 12. 01.
 * @Author   박상우
 * @Description   종합검진 패키지관리 컨트롤러
 *
 * @LastUpdated   2016. 12. 01. 
 */

@Controller
public class PackgeController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    
    @Autowired
    ComprehensiveExamServiceFacade comprehensiveExamServiceFacade;
    
    /* 종합검진 접수, 패키지관리 - 패키지 조회 */
    @RequestMapping("sup/comprehensiveexam/findPckList.do")
    public void findPckList(HttpServletRequest request, HttpServletResponse response) 
            throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<PackgeBean> pckList = comprehensiveExamServiceFacade.findPckList(argsMap);

        dataSetBeanMapper.beansToDataset(outData, pckList, PackgeBean.class);
    }
    
    /* 종합검진 패키지관리 - EX 패키지 조회 */
    @RequestMapping("sup/comprehensiveexam/findExPckInspList.do")
    public void findExPckInspList(HttpServletRequest request, HttpServletResponse response) 
            throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<SynthesisCheckupCheckTypeBean> pckInspList = comprehensiveExamServiceFacade.findExPckInspList(argsMap);
        
        dataSetBeanMapper.beansToDataset(outData, pckInspList, SynthesisCheckupCheckTypeBean.class);
    }
    
    /* 종합검진 패키지관리 - 패키지 검사 조회 */
    @RequestMapping("sup/comprehensiveexam/findPckInspList.do")
    public void findPckInspList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        
        List<SynthesisCheckupCheckTypeBean> pckInspList = comprehensiveExamServiceFacade.findPckInspList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, pckInspList, SynthesisCheckupCheckTypeBean.class);
    }
    
    /* 종합검진 패키지관리 - 저장 */
    @RequestMapping("sup/comprehensiveexam/batchPckProcess.do")
    public void batchPckProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        
        List<PackgeBean> pckList = dataSetBeanMapper.datasetToBeans(inData, PackgeBean.class);
        List<SynthesisCheckupCheckTypeBean> pckInspList = dataSetBeanMapper.datasetToBeans(inData, SynthesisCheckupCheckTypeBean.class);
        
        Map<String, Object> map = new HashMap<>();

        if(pckList!=null){
            map.put("pckList", pckList);
        }
        
        if(pckInspList !=null){
            map.put("pckInspList", pckInspList);
        }
        
        comprehensiveExamServiceFacade.batchPckProcess(map);

    }    
    
    @RequestMapping("sup/comprehensiveexam/batchPckProcess2.do")
    public void batchPckProcess2(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");

        PackgeBean pckBean = dataSetBeanMapper.datasetToBean(inData, PackgeBean.class);
        
        comprehensiveExamServiceFacade.batchPckProcess2(pckBean);

    }    
}