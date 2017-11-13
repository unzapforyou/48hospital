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
import com.seoul.his.hrs.yeta.to.HyDependentEducationBean;

@Controller
public class HyDependentEducationController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHyDependentEducationList.do")
    public void findHyDependentEducationList(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HyDependentEducationBean> hyDependentEducationBeanList = yetaServiceFacade
                .findHyDependentEducationList();
        datasetBeanMapper.beansToDataset(outData, hyDependentEducationBeanList,
                HyDependentEducationBean.class);
    }

    @RequestMapping("hrs/yeta/batchHyDependentEducationProcess.do")
    public void batchHyDependentEducationProcess(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HyDependentEducationBean> HyDependentEducationBeanList = datasetBeanMapper
                .datasetToBeans(inData, HyDependentEducationBean.class);
        yetaServiceFacade.batchHyDependentEducationProcess(HyDependentEducationBeanList);

    }
}
