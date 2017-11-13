package com.seoul.his.log.prcs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seoul.his.log.prcs.service.PrcsServiceFacade;
import com.seoul.his.log.prcs.to.PrcsReceiptBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;
import com.seoul.his.log.demd.to.GdsAnspBean;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package com.seoul.his.log.prcs.controller
 * @Class LP_PrcsReceiptController.java
 * @Create 2016. 5. 25.
 * @Author kooko
 * @Description 구매접수관리 컨트롤러
 *
 * @LastUpdated
 */

@Controller
public class PrcsReceiptController {

    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    PrcsServiceFacade prcsServiceFacade;

    @RequestMapping("log/prcs/findAnspList.do")
    public void findGdsAnspList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<GdsAnspBean> anspBeanList = prcsServiceFacade.findAnspList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, anspBeanList, GdsAnspBean.class);
    }

    @RequestMapping("log/prcs/findAnspHistList.do")
    public void findGdsAnspHistList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        String gdsAnspNo = inData.getVariable("GDS_ANSP_NO").getString();
        GdsAnspHistBean anspHistBean = new GdsAnspHistBean();
        anspHistBean.setGdsAnspNo(gdsAnspNo);
        List<GdsAnspHistBean> anspHistBeanList = prcsServiceFacade.findAnspHistList(anspHistBean);
        dataSetBeanMapper.beansToDataset(outData, anspHistBeanList, GdsAnspHistBean.class);
    }

    //수정중
    @RequestMapping("log/prcs/findPrcsReceiptList.do")
    public void findPrcsReceiptList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<PrcsReceiptBean> prcsReceiptBeanList = prcsServiceFacade.findPrcsReceiptList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, prcsReceiptBeanList, PrcsReceiptBean.class);
    }

    @RequestMapping("log/prcs/batchPrcsReceiptProcess.do")
    public void batchPrcsReceiptProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        List<PrcsReceiptBean> prcsReceiptBeanList = dataSetBeanMapper.datasetToBeans(inData, PrcsReceiptBean.class);
        prcsServiceFacade.batchPrcsReceiptProcess(prcsReceiptBeanList);
    }

}
