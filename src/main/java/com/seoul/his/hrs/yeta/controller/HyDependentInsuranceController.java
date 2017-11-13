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
import com.seoul.his.hrs.yeta.to.HyDependentInsuranceBean;

@Controller
public class HyDependentInsuranceController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHyDependentInsuranceList.do")
    public void findHyDependentInsuranceList(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HyDependentInsuranceBean> hyDependentInsuranceBeanList = yetaServiceFacade
                .findHyDependentInsuranceList();
        datasetBeanMapper.beansToDataset(outData, hyDependentInsuranceBeanList,
                HyDependentInsuranceBean.class);
    }

    @RequestMapping("hrs/yeta/batchHyDependentInsuranceProcess.do")
    public void batchHyDependentInsuranceProcess(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HyDependentInsuranceBean> HyDependentInsuranceBeanList = datasetBeanMapper
                .datasetToBeans(inData, HyDependentInsuranceBean.class);
        yetaServiceFacade.batchHyDependentInsuranceProcess(HyDependentInsuranceBeanList);

    }
}
