package com.seoul.his.hrs.yeta.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.yeta.service.YetaServiceFacade;
import com.seoul.his.hrs.yeta.to.HsPayBean;

@Controller
public class HsPayController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHsPayList.do")
    public void findHsPayList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HsPayBean> hsPayBeanList = yetaServiceFacade.findHsPayList();
        datasetBeanMapper.beansToDataset(outData, hsPayBeanList, HsPayBean.class);
    }

    @RequestMapping("hrs/yeta/batchHsPayProcess.do")
    public void batchHsPayProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HsPayBean> HsPayBeanList = datasetBeanMapper.datasetToBeans(inData, HsPayBean.class);
        yetaServiceFacade.batchHsPayProcess(HsPayBeanList);

    }
}
