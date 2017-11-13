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
import com.seoul.his.acc.fixedasset.to.FixedAssetLgGrpCdBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetMidGrpCdBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetSmGrpCdBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class FixedAssetGrpCdController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    FixedAssetServiceFacade fixedAssetServiceFacade;
    
    @SuppressWarnings("unchecked")
    @RequestMapping("acc/fixedasset/findFixedAssetGrpCdList.do")
    public void findFixedAssetGrpCdList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        HashMap<String, Object> fixedAssetGrpCdMap = fixedAssetServiceFacade.findFixedAssetGrpCdList();
        List<FixedAssetLgGrpCdBean> fixedAssetLgGrpCdBeanList = (List<FixedAssetLgGrpCdBean>) fixedAssetGrpCdMap.get("fixedAssetLgGrpCdList");
        List<FixedAssetMidGrpCdBean> fixedAssetMidGrpCdBeanList = (List<FixedAssetMidGrpCdBean>) fixedAssetGrpCdMap.get("fixedAssetMidGrpCdList");
        List<FixedAssetSmGrpCdBean> fixedAssetSmGrpCdBeanList = (List<FixedAssetSmGrpCdBean>) fixedAssetGrpCdMap.get("fixedAssetSmGrpCdList");
        dataSetBeanMapper.beansToDataset(outData, fixedAssetLgGrpCdBeanList, FixedAssetLgGrpCdBean.class);
        dataSetBeanMapper.beansToDataset(outData, fixedAssetMidGrpCdBeanList, FixedAssetMidGrpCdBean.class);
        dataSetBeanMapper.beansToDataset(outData, fixedAssetSmGrpCdBeanList, FixedAssetSmGrpCdBean.class);
    }
    
    @RequestMapping("acc/fixedasset/batchFixedAssetGrpCdProcess.do")
    public void batchFixedAssetGrpCdProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        HashMap<String, Object> fixedAssetGrpCdMap = new HashMap<String, Object>();
        List<FixedAssetLgGrpCdBean> fixedAssetLgGrpCdBeanList = dataSetBeanMapper.datasetToBeans(inData, FixedAssetLgGrpCdBean.class);
        List<FixedAssetMidGrpCdBean> fixedAssetMidGrpCdBeanList = dataSetBeanMapper.datasetToBeans(inData, FixedAssetMidGrpCdBean.class);
        List<FixedAssetSmGrpCdBean> fixedAssetSmGrpCdBeanList = dataSetBeanMapper.datasetToBeans(inData, FixedAssetSmGrpCdBean.class);
        fixedAssetGrpCdMap.put("fixedListLgGrpCdList", fixedAssetLgGrpCdBeanList );
        fixedAssetGrpCdMap.put("fixedListMidGrpCdList", fixedAssetMidGrpCdBeanList );
        fixedAssetGrpCdMap.put("fixedListSmGrpCdList", fixedAssetSmGrpCdBeanList );
        fixedAssetServiceFacade.batchFixedAssetGrpCdProcess(fixedAssetGrpCdMap);
        dataSetBeanMapper.beanToDataset(outData, new FixedAssetLgGrpCdBean(), FixedAssetLgGrpCdBean.class);
    }
}
