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
import com.seoul.his.acc.closing.to.FinanStatsBean;
import com.seoul.his.acc.closing.to.TotalBalBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class FinanStatsController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    ClosingServiceFacade closingServiceFacade;

    @RequestMapping("acc/closing/findFinanStats.do")
    public void findFinanStats(HttpServletRequest request,HttpServletResponse response) 
            throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, Object> argsMap = dataSetBeanMapper.procedureVariablesToMap(inData);
        List<FinanStatsBean> finanStatList = closingServiceFacade.findFinanStats(argsMap);
        dataSetBeanMapper.beansToDataset(outData, finanStatList, FinanStatsBean.class);
    }
    
    @RequestMapping("acc/closing/findTotalBalStat.do")
    public void findTotalBalStat(HttpServletRequest request,HttpServletResponse response) 
            throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, Object> argsMap = dataSetBeanMapper.procedureVariablesToMap(inData);
        List<TotalBalBean> totalBalList = closingServiceFacade.findTotalBalList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, totalBalList, TotalBalBean.class);

    }
}
