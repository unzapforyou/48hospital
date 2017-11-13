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
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupReceiptBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupResultBean;


/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.controller
 * @Class    SynthesisCheckupResultController.java
 * @Create   2016. 12. 11.
 * @Author   박상우
 * @Description  종합검진 결과관리 컨트롤러
 *
 * @LastUpdated   2016. 12. 11. 
 */

@Controller
public class SynthesisCheckupResultController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    
    @Autowired
    ComprehensiveExamServiceFacade comprehensiveExamServiceFacade;
    
    /* 종합검진 결과관리 - 검진자조회 */
    @RequestMapping("sup/comprehensiveexam/findReceiptList.do")
    public void findReceiptList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        
        List<SynthesisCheckupReceiptBean> receiptList = comprehensiveExamServiceFacade.findReceiptList(argsMap);

        dataSetBeanMapper.beansToDataset(outData, receiptList, SynthesisCheckupReceiptBean.class);
    }
    
    /* 종합검진 결과관리 - 결과조회 */
    @RequestMapping("sup/comprehensiveexam/findRsltList.do")
    public void findRsltList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        List<SynthesisCheckupResultBean> rsltList = comprehensiveExamServiceFacade.findRsltList(argsMap);

        dataSetBeanMapper.beansToDataset(outData, rsltList, SynthesisCheckupResultBean.class);

    }
    
    /* 종합검진 결과관리 - 저장 */
    @RequestMapping("sup/comprehensiveexam/registerRslt.do")
    public void registerReceipt(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<SynthesisCheckupResultBean> rsltList= dataSetBeanMapper.datasetToBeans(inData, SynthesisCheckupResultBean.class);

        comprehensiveExamServiceFacade.registerRslt(rsltList);
    }
}