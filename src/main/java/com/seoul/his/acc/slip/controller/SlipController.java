package com.seoul.his.acc.slip.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.slip.service.SlipServiceFacade;
import com.seoul.his.acc.slip.to.SlipBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class SlipController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    SlipServiceFacade slipServiceFacade;

    @RequestMapping("acc/slip/registerSlipList.do")
    public void registerSlipList(HttpServletRequest request,HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        System.out.println(inData.saveXml());
        List<SlipBean> slipBeanList = dataSetBeanMapper.datasetToBeans(inData,SlipBean.class);
        slipServiceFacade.registerSlipList(slipBeanList);

    }

    @RequestMapping("acc/slip/findSlipList.do")
    public void findSlipList(HttpServletRequest request,HttpServletResponse response) throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<SlipBean> slipList = slipServiceFacade.findSlipList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, slipList, SlipBean.class);

    }
}
