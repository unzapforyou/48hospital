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
import com.seoul.his.hrs.yeta.to.HyFormerCompanyBean;

@Controller
public class HyFormerCompanyController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHyFormerCompanyList.do")
    public void findHyFormerCompanyList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HyFormerCompanyBean> hyFormerCompanyBeanList = yetaServiceFacade
                .findHyFormerCompanyList();
        datasetBeanMapper.beansToDataset(outData, hyFormerCompanyBeanList,
                HyFormerCompanyBean.class);
    }

    @RequestMapping("hrs/yeta/batchHyFormerCompanyProcess.do")
    public void batchHyFormerCompanyProcess(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HyFormerCompanyBean> HyFormerCompanyBeanList = datasetBeanMapper.datasetToBeans(inData,
                HyFormerCompanyBean.class);
        yetaServiceFacade.batchHyFormerCompanyProcess(HyFormerCompanyBeanList);

    }
}
