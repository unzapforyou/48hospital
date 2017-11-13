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
import com.seoul.his.hrs.yeta.to.HyDependentPaymentBean;

@Controller
public class HyDependentPaymentController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHyDependentPaymentList.do")
    public void findHyDependentPaymentList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HyDependentPaymentBean> hyDependentPaymentBeanList = yetaServiceFacade
                .findHyDependentPaymentList();
        datasetBeanMapper.beansToDataset(outData, hyDependentPaymentBeanList,
                HyDependentPaymentBean.class);
    }

    @RequestMapping("hrs/yeta/batchHyDependentPaymentProcess.do")
    public void batchHyDependentPaymentProcess(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HyDependentPaymentBean> HyDependentPaymentBeanList = datasetBeanMapper
                .datasetToBeans(inData, HyDependentPaymentBean.class);
        yetaServiceFacade.batchHyDependentPaymentProcess(HyDependentPaymentBeanList);

    }
}
