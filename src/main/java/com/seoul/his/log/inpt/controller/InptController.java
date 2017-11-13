package com.seoul.his.log.inpt.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.log.inpt.service.InptServiceFacade;
import com.seoul.his.log.inpt.to.BuyDemdBean;
import com.seoul.his.log.inpt.to.CtrtInfoBean;
import com.seoul.his.log.inpt.to.CtrtInfoDetailBean;
import com.seoul.his.log.inpt.to.GdsInptBean;
import com.seoul.his.log.inpt.to.SkillExmntHistBean;

@Controller
public class InptController {

	@Autowired
    private InptServiceFacade inptServiceFacade;
    @Autowired
    private DataSetBeanMapper dataSetBeanMapper;

    // 물품검수 조회
    @RequestMapping("log/inpt/findCtrtList.do")
    public void findCtrtList(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	PlatformData outData = (PlatformData) request.getAttribute("outData");
    	List<CtrtInfoBean> list = inptServiceFacade.findCtrtList();
        dataSetBeanMapper.beansToDataset(outData, list, CtrtInfoBean.class);
    }

    // 물품조회 (계약번호에 해당하는 계약상세정보 조회)
    @RequestMapping("log/inpt/findCtrtHistList.do")
    public void findCtrtHistList(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> queryMap = (Map<String, String>) request.getAttribute("queryMap");
        List<CtrtInfoDetailBean> list = inptServiceFacade.findCtrtInfoDetailList(queryMap);
        dataSetBeanMapper.beansToDataset(outData, list, CtrtInfoDetailBean.class);
    }

    // 물품검수조회 (계약번호에 해당하는 검수내역 조회)
    @RequestMapping("log/inpt/findGdsInptList.do")
    public void findGdsInptList(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> queryMap = (Map<String, String>) request.getAttribute("queryMap");
        List<GdsInptBean> list = inptServiceFacade.findGdsInptList(queryMap);
        dataSetBeanMapper.beansToDataset(outData, list, GdsInptBean.class);
    }

    // 납품일조회 (계약번호에 해당하는 남품일 조회)
    @RequestMapping("log/inpt/findDelivDay.do")
    public void findDelivDay(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> queryMap = (Map<String, String>) request.getAttribute("queryMap");
        List<BuyDemdBean> list = inptServiceFacade.findDelivDay(queryMap);
        dataSetBeanMapper.beansToDataset(outData, list, BuyDemdBean.class);
    }

    // 검수확인등록, 검수여부변경
    @RequestMapping("log/inpt/registerGdsInpt.do")
    public void registerGdsInpt(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<GdsInptBean> gdsInptList = dataSetBeanMapper.datasetToBeans(inData, GdsInptBean.class);
        List<CtrtInfoBean> ctrtInfo = dataSetBeanMapper.datasetToBeans(inData, CtrtInfoBean.class);
        inptServiceFacade.registerGdsInpt(gdsInptList, ctrtInfo);
    }

    // 검수확인취소
    @RequestMapping("log/inpt/cancelGdsInpt.do")
    public void cancelGdsInpt(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<GdsInptBean> gdsInptList = dataSetBeanMapper.datasetToBeans(inData, GdsInptBean.class);
        List<CtrtInfoBean> ctrtInfo = dataSetBeanMapper.datasetToBeans(inData, CtrtInfoBean.class);
        inptServiceFacade.cancelGdsInpt(gdsInptList, ctrtInfo);
    }

    // 기술검사조회
    @RequestMapping("log/inpt/findSkillExmntHistList.do")
    public void findSkillExmntHistList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> queryMap = (Map<String, String>) request.getAttribute("queryMap");
        List<SkillExmntHistBean> SkillExmntHistlist = inptServiceFacade.findSkillExmntHistList(queryMap);
        dataSetBeanMapper.beansToDataset(outData, SkillExmntHistlist, SkillExmntHistBean.class);
    }

    // 기술검사 일괄처리
    @RequestMapping("log/inpt/batchProcessSkillExmntHist.do")
    public void batchProcessSkillExmntHist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> queryMap = (Map<String, String>) request.getAttribute("queryMap");
        List<SkillExmntHistBean> skillExmntHisList = dataSetBeanMapper.datasetToBeans(inData, SkillExmntHistBean.class);
        String ctrtNo = skillExmntHisList.get(0).getCtrtNo();
        CtrtInfoBean ctrtInfoBean = new CtrtInfoBean();
        ctrtInfoBean.setCtrtNo(ctrtNo);
        inptServiceFacade.batchProcessSkillExmntHist(skillExmntHisList, ctrtInfoBean);
    }

}
