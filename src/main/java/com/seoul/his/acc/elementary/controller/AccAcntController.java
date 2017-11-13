package com.seoul.his.acc.elementary.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.elementary.service.AccElementaryServiceFacade;
import com.seoul.his.acc.elementary.to.AccAcntBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class AccAcntController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    private AccElementaryServiceFacade accElementaryServiceFacade;

    // 회계 계정과목 조회
    @RequestMapping("acc/elementary/findAccAcntList.do")
    public void findAccAcntList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<AccAcntBean> accAcntList = accElementaryServiceFacade.findAccAcntList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, accAcntList, AccAcntBean.class);
    }
    
    @RequestMapping("acc/elementary/lastYearAcntCopy.do")
    public void lastYearAcntCopy(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<AccAcntBean> accAcntList = accElementaryServiceFacade.lastYearAcntCopy(argsMap);
        dataSetBeanMapper.beansToDataset(outData, accAcntList, AccAcntBean.class);
    }
    
    @RequestMapping("acc/elementary/batchAccAcntProcess.do")
    public void batchAccAcntProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        List<AccAcntBean> accAcntList = dataSetBeanMapper.datasetToBeans(inData, AccAcntBean.class);
        accElementaryServiceFacade.batchAccAcntProcess(accAcntList);
    }
}