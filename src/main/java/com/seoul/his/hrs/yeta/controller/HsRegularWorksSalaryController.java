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
import com.seoul.his.hrs.yeta.to.HsRegularWorksSalaryBean;

@Controller
public class HsRegularWorksSalaryController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHsRegularWorksSalaryList.do")
    public void findHsRegularWorksSalaryList(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HsRegularWorksSalaryBean> hsRegularWorksSalaryBeanList = yetaServiceFacade
                .findHsRegularWorksSalaryList();
        datasetBeanMapper.beansToDataset(outData, hsRegularWorksSalaryBeanList,
                HsRegularWorksSalaryBean.class);
    }

    @RequestMapping("hrs/yeta/batchHsRegularWorksSalaryProcess.do")
    public void batchHsRegularWorksSalaryProcess(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HsRegularWorksSalaryBean> HsRegularWorksSalaryBeanList = datasetBeanMapper
                .datasetToBeans(inData, HsRegularWorksSalaryBean.class);
        yetaServiceFacade.batchHsRegularWorksSalaryProcess(HsRegularWorksSalaryBeanList);

    }
}
