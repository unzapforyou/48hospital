package com.seoul.his.log.store.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.log.store.service.PrcsInServiceFacade;
import com.seoul.his.log.store.to.PrcsWhsBean;
import com.seoul.his.log.store.to.PrcsWhsHistBean;

/**
 * @Package  com.seoul.his.log.store.controller
 * @Class    prcsInController.java
 * @Create   2016. 6. 3.
 * @Author   kooko
 * @Description 입고관리 컨트롤러======
 *
 * @LastUpdated 
 */

@Controller
public class PrcsInController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    PrcsInServiceFacade prcsInServiceFacade;

    @RequestMapping("log/store/findPrcsWhsList.do")
    public void findPrcsWhsList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<PrcsWhsBean> prcsWhsBeanList = prcsInServiceFacade.findPrcsWhsList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, prcsWhsBeanList, PrcsWhsBean.class);
    }
    @RequestMapping("log/store/batchPrcsWhsProcess.do")
    public void batchPrcsWhsProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<PrcsWhsBean> prcsWhsBeanList = dataSetBeanMapper.datasetToBeans(inData, PrcsWhsBean.class);
        prcsInServiceFacade.batchPrcsWhsProcess(prcsWhsBeanList);
    }
    @RequestMapping("log/store/findPrcsWhsHistList.do")
    public void findPrcsWhsHistList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<PrcsWhsHistBean> PrcsWhsHistBeanList = prcsInServiceFacade.findPrcsWhsHistList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, PrcsWhsHistBeanList, PrcsWhsHistBean.class);
    }
    @RequestMapping("log/store/batchPrcsWhsHistProcess.do")
    public void batchPrcsWhsHistProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");

        List<PrcsWhsHistBean> prcsWhsHistBeanList = dataSetBeanMapper.datasetToBeans(inData, PrcsWhsHistBean.class);
        prcsInServiceFacade.batchPrcsWhsHistProcess(prcsWhsHistBeanList);
    }
    @RequestMapping("log/store/callPcWhsPstInvenReflect.do")
    public void callPcWhsPstInvenReflect(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        prcsInServiceFacade.callPcWhsPstInvenReflect(argsMap);
        System.out.println(argsMap.get("errorMsg"));
        
    }
}
