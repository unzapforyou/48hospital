package com.seoul.his.acc.elementary.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.elementary.service.AccElementaryServiceFacade;
import com.seoul.his.acc.elementary.to.AssiSubBean;
import com.seoul.his.acc.elementary.to.AssiTypeBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class AssiTypeController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    private AccElementaryServiceFacade accElementaryServiceFacade;
    
    
    @RequestMapping("acc/elementary/findAssiTypeList.do")
    public void findAssiTypeList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<AssiTypeBean> assiTypeList = accElementaryServiceFacade.findAssiTypeList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, assiTypeList, AssiTypeBean.class);
    }
    
    @RequestMapping("acc/elementary/batchAssiTypeList.do")
    public void batchAssiCodeList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        List<AssiTypeBean> assiTypeCodeList = dataSetBeanMapper.datasetToBeans(inData, AssiTypeBean.class);
        List<AssiSubBean> assiSubCodeList = dataSetBeanMapper.datasetToBeans(inData, AssiSubBean.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("assiTypeCodeList", assiTypeCodeList);
        map.put("assiSubCodeList", assiSubCodeList);
        accElementaryServiceFacade.batchAssiCodeList(map);
    }
    
    @RequestMapping("acc/elementary/lastYearAssiCodeCopy.do")
    public void lastYearAssiCodeCopy(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<AssiTypeBean> assiCodeCopyList = accElementaryServiceFacade.lastYearAssiCodeCopy(argsMap);
        dataSetBeanMapper.beansToDataset(outData, assiCodeCopyList, AssiTypeBean.class);
    }
}
