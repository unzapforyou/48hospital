package com.seoul.his.acc.fixedasset.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.fixedasset.service.FixedAssetServiceFacade;
import com.seoul.his.acc.fixedasset.to.DepreRateBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetDepreYmBean;
import com.seoul.his.acc.fixedasset.to.MonthDepreBean;
import com.seoul.his.acc.fixedasset.to.YearDepreBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package  com.seoul.his.acc.fixedasset.controller
 * @Class    FixedAssetDepreController.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class FixedAssetDepreController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    FixedAssetServiceFacade fixedAssetServiceFacade;
    
    @RequestMapping("acc/fixedasset/findDepreRateList.do")
    public void findDepreRateList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        List<DepreRateBean> depreRateBeanList = fixedAssetServiceFacade.findDepreRateList();
        dataSetBeanMapper.beansToDataset(outData, depreRateBeanList, DepreRateBean.class);
    }
    
    @RequestMapping("acc/fixedasset/findFixedAssetYearDepreList.do")
    public void findFixedAssetYearDepreList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<YearDepreBean> yearDepreBeanList = fixedAssetServiceFacade.findFixedAssetYearDepreList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, yearDepreBeanList, YearDepreBean.class);
    }
    
    @SuppressWarnings("unchecked")
    @RequestMapping("acc/fixedasset/findFixedAssetMonthDepreList.do")
    public void findFixedAssetMonthDepreList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        HashMap<String, Object> argsMap = new HashMap<String, Object>();
        argsMap.put("startDate", inData.getVariable("startDate").getString());
        argsMap.put("endDate", inData.getVariable("endDate").getString());
        HashMap<String, Object> fixedAssetMonthDepreMap = fixedAssetServiceFacade.findFixedAssetMonthDepreList(argsMap);
        List<MonthDepreBean> monthDepreBeanList = (List<MonthDepreBean>)fixedAssetMonthDepreMap.get("fixedAssetMonthDepreList");
        List<FixedAssetDepreYmBean> monthDepreYmBeanList = (List<FixedAssetDepreYmBean>)fixedAssetMonthDepreMap.get("fixedAssetMonthDepreYmList");
        dataSetBeanMapper.beansToDataset(outData, monthDepreBeanList, MonthDepreBean.class);
        dataSetBeanMapper.beansToDataset(outData, monthDepreYmBeanList, FixedAssetDepreYmBean.class);
    }
    
    @RequestMapping("acc/fixedasset/modifyFixedAssetMonthDepre.do")
    public void modifyFixedAssetMonthDepre(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        List<MonthDepreBean> monthDepreBeanList = dataSetBeanMapper.datasetToBeans(inData, MonthDepreBean.class);
        fixedAssetServiceFacade.modifyFixedAssetMonthDepre(monthDepreBeanList);
        dataSetBeanMapper.beanToDataset(outData, new MonthDepreBean(), MonthDepreBean.class);
    }
    
    @SuppressWarnings("unchecked")
    @RequestMapping("acc/fixedasset/findFixedAssetYearDepreDtlList.do")
    public void findFixedAssetYearDepreDtlList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        HashMap<String, Object> argsMap = new HashMap<String, Object>();
        argsMap.put("startDate", inData.getVariable("startDate").getString());
        argsMap.put("endDate", inData.getVariable("endDate").getString());
        HashMap<String, Object> fixedAssetYearDepreMap = fixedAssetServiceFacade.findFixedAssetYearDepreDtlList(argsMap);
        List<YearDepreBean> yearDepreBeanList = (List<YearDepreBean>)fixedAssetYearDepreMap.get("fixedAssetYearDepreList");
        List<FixedAssetDepreYmBean> yearDepreYearBeanList = (List<FixedAssetDepreYmBean>)fixedAssetYearDepreMap.get("fixedAssetYearDepreYearList");
        dataSetBeanMapper.beansToDataset(outData, yearDepreBeanList, YearDepreBean.class);
        dataSetBeanMapper.beansToDataset(outData, yearDepreYearBeanList, FixedAssetDepreYmBean.class);
    }
    
    @RequestMapping("acc/fixedasset/modifyFixedAssetYearDepre.do")
    public void modifyFixedAssetYearDepre(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        List<YearDepreBean> yearDepreBeanList = dataSetBeanMapper.datasetToBeans(inData, YearDepreBean.class);
        fixedAssetServiceFacade.modifyFixedAssetYearDepre(yearDepreBeanList);
        dataSetBeanMapper.beanToDataset(outData, new YearDepreBean(), YearDepreBean.class);
    }
}
