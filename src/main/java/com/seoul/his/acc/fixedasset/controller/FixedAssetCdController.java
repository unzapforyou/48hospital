package com.seoul.his.acc.fixedasset.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.fixedasset.service.FixedAssetServiceFacade;
import com.seoul.his.acc.fixedasset.to.FixedAssetCdBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetCdDtlBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * @Package  com.seoul.his.acc.fixedasset.controller
 * @Class    FixedAssetCdController.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class FixedAssetCdController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    FixedAssetServiceFacade fixedAssetServiceFacade;
    
    @SuppressWarnings("unchecked")
    @RequestMapping("acc/fixedasset/findFixedAssetCdList.do")
    public void findFixedAssetCdList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        HashMap<String, Object> fixedAssetCdMap = fixedAssetServiceFacade.findFixedAssetCdList();
        List<FixedAssetCdBean> fixedAssetCdBeanList = (List<FixedAssetCdBean>) fixedAssetCdMap.get("fixedAssetCdList");
        List<FixedAssetCdDtlBean> fixedAssetCdDtlBeanList = (List<FixedAssetCdDtlBean>) fixedAssetCdMap.get("fixedAssetCdDtlList");
        dataSetBeanMapper.beansToDataset(outData, fixedAssetCdBeanList, FixedAssetCdBean.class);
        dataSetBeanMapper.beansToDataset(outData, fixedAssetCdDtlBeanList, FixedAssetCdDtlBean.class);
    }
    
    @RequestMapping("acc/fixedasset/findUsingFixedAssetCdDtlList.do")
    public void findUsingFixedAssetCdDtlList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        List<FixedAssetCdDtlBean> fixedAssetCdDtlBeanList = fixedAssetServiceFacade.findUsingFixedAssetCdDtlList();
        dataSetBeanMapper.beansToDataset(outData, fixedAssetCdDtlBeanList, FixedAssetCdDtlBean.class);
    }

    @RequestMapping("acc/fixedasset/batchFixedAssetCdProcess.do")
    public void batchFixedAssetCdProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        HashMap<String, Object> fixedAssetCdMap = new HashMap<String, Object>();
        List<FixedAssetCdBean> fixedAssetCdBeanList = dataSetBeanMapper.datasetToBeans(inData, FixedAssetCdBean.class);
        List<FixedAssetCdDtlBean> fixedAssetCdDtlBeanList = dataSetBeanMapper.datasetToBeans(inData, FixedAssetCdDtlBean.class);
        fixedAssetCdMap.put("fixedAssetCdList", fixedAssetCdBeanList );
        fixedAssetCdMap.put("fixedAssetCdDtlList", fixedAssetCdDtlBeanList );
        fixedAssetServiceFacade.batchFixedAssetCdProcess(fixedAssetCdMap);
        dataSetBeanMapper.beanToDataset(outData, new FixedAssetCdBean(), FixedAssetCdBean.class);
    }
}
