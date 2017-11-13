package com.seoul.his.com.system.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.com.system.service.ComBaseServiceFacade;
import com.seoul.his.com.system.to.BindCodeBean;
import com.seoul.his.com.system.to.OutCodeBean;
import com.seoul.his.common.util.DataSetBeanMapper;


@Controller
public class CodeUtilController {

	@Autowired
    private ComBaseServiceFacade comBaseServiceFacade;
    @Autowired
    private DataSetBeanMapper dataSetBeanMapper;

    @SuppressWarnings("deprecation")
    @RequestMapping("com/bindCode.do")
    public void bindCode(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<BindCodeBean> bindCodeList = dataSetBeanMapper.datasetToBeans(inData,
                BindCodeBean.class);
        Map<String, List<OutCodeBean>> bindCodeMap = comBaseServiceFacade.bindCode(bindCodeList);
        dataSetBeanMapper.bindCode(outData, bindCodeMap, bindCodeList, OutCodeBean.class);
    }    
}