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
import com.seoul.his.acc.elementary.to.AccntNoBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class AccntNoController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    private AccElementaryServiceFacade accElementaryServiceFacade;
    
    @RequestMapping("acc/elementary/findAccntNoList.do")
    public void findAccntNoList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<AccntNoBean> accntNoList = accElementaryServiceFacade.findAccntNoList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, accntNoList, AccntNoBean.class);
    }
    
    @RequestMapping("acc/elementary/batchAccntNoListProcess.do")
    public void batchAccntNoListProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        List<AccntNoBean> AccntNoList = dataSetBeanMapper.datasetToBeans(inData, AccntNoBean.class);
        accElementaryServiceFacade.batchAccntNoListProcess(AccntNoList);
    }
    
    @RequestMapping("acc/elementary/lastYearAccntNoCopy.do")
    public void lastYearAccntNoCopy(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<AccntNoBean> accntNoList = accElementaryServiceFacade.lastYearAccntNoCopy(argsMap);
        dataSetBeanMapper.beansToDataset(outData, accntNoList, AccntNoBean.class);
    }
}
