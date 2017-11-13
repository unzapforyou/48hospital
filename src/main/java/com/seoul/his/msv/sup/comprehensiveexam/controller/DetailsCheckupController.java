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
import com.seoul.his.msv.sup.comprehensiveexam.to.DetailsCheckupBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupCheckTypeBean;


/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.controller
 * @Class    DetailsCheckupController.java
 * @Create   2016. 12. 01.
 * @Author   박상우
 * @Description   세부검사항목관리 컨트롤러
 *
 * @LastUpdated   2016. 12. 01.
 */

@Controller
public class DetailsCheckupController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;

    @Autowired
    ComprehensiveExamServiceFacade comprehensiveExamServiceFacade;

    // 종합검진 세부검사관리 - 검사 조회
    @RequestMapping("sup/comprehensiveexam/findSimpleCheckupList.do")
    public void findSimpleCheckupList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        List<SynthesisCheckupCheckTypeBean> SynthesisCheckupCheckTypeList = comprehensiveExamServiceFacade.findSimpleCheckupList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, SynthesisCheckupCheckTypeList, SynthesisCheckupCheckTypeBean.class);
    }


    // 종합검진 세부검사관리, 패키지관리 - 세부검사 조회
    @RequestMapping("sup/comprehensiveexam/findDetailsCheckupList.do")
    public void findDetailsCheckupList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        List<DetailsCheckupBean> detailsCheckupList = comprehensiveExamServiceFacade.findDetailsCheckupList(argsMap);

        dataSetBeanMapper.beansToDataset(outData, detailsCheckupList, DetailsCheckupBean.class);
    }


    // 종합검진 세부검사관리 - 수정, 추가
    @RequestMapping("sup/comprehensiveexam/batchDetailsCheckup.do")
    public void batchDetailsCheckup(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<DetailsCheckupBean> detailsCheckupList = dataSetBeanMapper.datasetToBeans(inData, DetailsCheckupBean.class);

        comprehensiveExamServiceFacade.batchDetailsCheckup(detailsCheckupList);
    }

}