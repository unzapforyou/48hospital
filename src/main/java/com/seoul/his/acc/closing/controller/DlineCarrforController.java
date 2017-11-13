package com.seoul.his.acc.closing.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.closing.service.ClosingServiceFacade;
import com.seoul.his.acc.elementary.to.AccPridBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class DlineCarrforController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    ClosingServiceFacade closingServiceFacade;
    
    @RequestMapping("acc/closing/modifyDlineYn.do")
    public void modifyDlineYn(HttpServletRequest request,HttpServletResponse response) 
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        AccPridBean accPrid = dataSetBeanMapper.datasetToBean(inData, AccPridBean.class);
        closingServiceFacade.modifyDlineYn(accPrid);
    }

    @RequestMapping("acc/closing/executeCarrfor.do")
    public void executeCarrfor(HttpServletRequest request,HttpServletResponse response) 
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        AccPridBean accPrid = dataSetBeanMapper.datasetToBean(inData, AccPridBean.class);
        closingServiceFacade.executeCarrfor(accPrid);
    }
}
