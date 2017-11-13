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
import com.seoul.his.hrs.yeta.to.HyDependentDonationBean;

@Controller
public class HyDependentDonationController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHyDependentDonationList.do")
    public void findHyDependentDonationList(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HyDependentDonationBean> hyDependentDonationBeanList = yetaServiceFacade
                .findHyDependentDonationList();
        datasetBeanMapper.beansToDataset(outData, hyDependentDonationBeanList,
                HyDependentDonationBean.class);
    }

    @RequestMapping("hrs/yeta/batchHyDependentDonationProcess.do")
    public void batchHyDependentDonationProcess(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HyDependentDonationBean> HyDependentDonationBeanList = datasetBeanMapper
                .datasetToBeans(inData, HyDependentDonationBean.class);
        yetaServiceFacade.batchHyDependentDonationProcess(HyDependentDonationBeanList);

    }
}
