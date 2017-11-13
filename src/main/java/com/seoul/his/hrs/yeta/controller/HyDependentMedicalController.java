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
import com.seoul.his.hrs.yeta.to.HyDependentMedicalBean;

@Controller
public class HyDependentMedicalController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHyDependentMedicalList.do")
    public void findHyDependentMedicalList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HyDependentMedicalBean> hyDependentMedicalBeanList = yetaServiceFacade
                .findHyDependentMedicalList();
        datasetBeanMapper.beansToDataset(outData, hyDependentMedicalBeanList,
                HyDependentMedicalBean.class);
    }

    @RequestMapping("hrs/yeta/batchHyDependentMedicalProcess.do")
    public void batchHyDependentMedicalProcess(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HyDependentMedicalBean> HyDependentMedicalBeanList = datasetBeanMapper
                .datasetToBeans(inData, HyDependentMedicalBean.class);
        yetaServiceFacade.batchHyDependentMedicalProcess(HyDependentMedicalBeanList);

    }
}
