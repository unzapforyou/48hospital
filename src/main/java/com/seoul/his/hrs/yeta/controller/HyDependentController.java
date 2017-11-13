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
import com.seoul.his.hrs.yeta.to.HyDependentBean;

@Controller
public class HyDependentController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHyDependentList.do")
    public void findHyDependentList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HyDependentBean> hyDependentBeanList = yetaServiceFacade.findHyDependentList();
        datasetBeanMapper.beansToDataset(outData, hyDependentBeanList, HyDependentBean.class);
    }

    @RequestMapping("hrs/yeta/batchHyDependentProcess.do")
    public void batchHyDependentProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HyDependentBean> HyDependentBeanList = datasetBeanMapper.datasetToBeans(inData,
                HyDependentBean.class);
        yetaServiceFacade.batchHyDependentProcess(HyDependentBeanList);

    }
}
