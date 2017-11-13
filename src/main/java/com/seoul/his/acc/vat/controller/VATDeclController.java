package com.seoul.his.acc.vat.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.vat.service.VatServiceFacade;
import com.seoul.his.acc.vat.to.VATDeclBean;
import com.seoul.his.common.util.DataSetBeanMapper;


@Controller
public class VATDeclController {
    @Autowired
    VatServiceFacade vatServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    
    @RequestMapping("acc/VAT/findVATDeclList.do")
    public void findAtVatDeclList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = datasetBeanMapper.variablesToMap(inData);
        List<VATDeclBean> atVatDeclBeanList = vatServiceFacade.findVATDeclList(argsMap);
        datasetBeanMapper.beansToDataset(outData, atVatDeclBeanList, VATDeclBean.class);
    }

    @RequestMapping("acc/VAT/batchAtVatDeclProcess.do")
    public void batchAtVatDeclProcess(HttpServletRequest request,HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<VATDeclBean> AtVatDeclBeanList = datasetBeanMapper.datasetToBeans(inData, VATDeclBean.class);
        //vatServiceFacade.batchAtVatDeclProcess(AtVatDeclBeanList);

    }
}
