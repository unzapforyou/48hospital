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
import com.seoul.his.acc.elementary.to.AssiSubBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class AssiSubController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    private AccElementaryServiceFacade accElementaryServiceFacade;
    
    @RequestMapping("acc/elementary/findAssiSubList.do")
    public void findAssiSubList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<AssiSubBean> assiSubList = accElementaryServiceFacade.findAssiSubList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, assiSubList, AssiSubBean.class);
    }
}
