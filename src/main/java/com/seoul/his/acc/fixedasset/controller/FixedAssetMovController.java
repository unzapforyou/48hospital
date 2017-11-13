package com.seoul.his.acc.fixedasset.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.fixedasset.service.FixedAssetServiceFacade;
import com.seoul.his.acc.fixedasset.to.FixedAssetMovBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class FixedAssetMovController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    FixedAssetServiceFacade fixedAssetServiceFacade;
    
    @RequestMapping("acc/fixedasset/findFixedAssetMovList.do")
    public void findFixedAssetMovList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        List<FixedAssetMovBean> fixedAssetMovBeanList = fixedAssetServiceFacade.findFixedAssetMovList();
        dataSetBeanMapper.beansToDataset(outData, fixedAssetMovBeanList, FixedAssetMovBean.class);
    }
    
    @RequestMapping("acc/fixedasset/batchFixedAssetMovProcess.do")
    public void batchFixedAssetMovProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        List<FixedAssetMovBean> fixedAssetMovBeanList = dataSetBeanMapper.datasetToBeans(inData, FixedAssetMovBean.class);
        fixedAssetServiceFacade.batchFixedAssetMovProcess(fixedAssetMovBeanList);
        dataSetBeanMapper.beanToDataset(outData, new FixedAssetMovBean(), FixedAssetMovBean.class);
    }
}
