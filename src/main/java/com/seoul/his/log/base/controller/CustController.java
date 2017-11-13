package com.seoul.his.log.base.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.log.base.service.LogBaseServiceFacade;
import com.seoul.his.log.base.to.CustBean;

/**
 * @Package  com.seoul.his.log.base.controller
 * @Class    CustController.java
 * @Create   2016. 5. 24.
 * @Author   godseop
 * @Description 거래처관리 컨트롤러
 *
 * @LastUpdated 
 */
@Controller
public class CustController {

    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    private LogBaseServiceFacade logBaseServiceFacade;

    // 거래처목록 조회
    @RequestMapping("log/base/findCustList.do")
    public void findCustList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<CustBean> custList = logBaseServiceFacade.findCustList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, custList, CustBean.class);
    }

    // 거래처 CRUD
    @RequestMapping("log/base/batchCustProcess.do")
    public void modifyWh(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<CustBean> custList = dataSetBeanMapper.datasetToBeans(inData, CustBean.class);
        logBaseServiceFacade.batchCustProcess(custList);
    }
}