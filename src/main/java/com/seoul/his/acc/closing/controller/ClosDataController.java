package com.seoul.his.acc.closing.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.closing.service.ClosingServiceFacade;
import com.seoul.his.acc.closing.to.ClosAcntBean;
import com.seoul.his.acc.closing.to.ClosDataBean;
import com.seoul.his.acc.resol.to.JourBean;
import com.seoul.his.acc.resol.to.ResolLetBean;
import com.seoul.his.acc.slip.to.SlipBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class ClosDataController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    ClosingServiceFacade closingServiceFacade;

    @RequestMapping("acc/closing/findClosDataList.do")
    public void findClosDataList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, Object> argsMap = dataSetBeanMapper.procedureVariablesToMap(inData);
        List<ClosDataBean> totalBalList = closingServiceFacade.findClosDataList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, totalBalList, ClosDataBean.class);

    }

    @RequestMapping("acc/closing/findClosAcntList.do")
    public void findClosAcntList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<ClosAcntBean> closAcntList = closingServiceFacade.findClosAcntList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, closAcntList, ClosAcntBean.class);
    }

    @RequestMapping("acc/closing/registerClosJour.do")
    public void registerClosJour(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        List<ResolLetBean> resolLetList = dataSetBeanMapper.datasetToBeans(inData, ResolLetBean.class);
        List<SlipBean> slipList = dataSetBeanMapper.datasetToBeans(inData, SlipBean.class);
        List<JourBean> jourList = dataSetBeanMapper.datasetToBeans(inData, JourBean.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("resolLetList", resolLetList);
        map.put("slipList", slipList);
        map.put("jourList", jourList);

        closingServiceFacade.registerClosJour(map);

    }
}


