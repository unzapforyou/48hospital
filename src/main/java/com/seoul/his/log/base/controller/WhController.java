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
import com.seoul.his.log.base.to.WhBean;


/**
 * @Package  com.seoul.his.log.base.controller
 * @Class    WhController.java
 * @Create   2016. 5. 24.
 * @Author   godseop
 * @Description 창고관리 컨트롤러
 *
 * @LastUpdated 
 */
@Controller
public class WhController {

    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    private LogBaseServiceFacade logBaseServiceFacade;

    // 창고목록 조회
    @RequestMapping("log/base/findWhList.do")
    public void findWhList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<WhBean> whList = logBaseServiceFacade.findWhList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, whList, WhBean.class);
    }

    // 창고정보 수정
    @RequestMapping("log/base/batchWhProcess.do")
    public void modifyWh(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<WhBean> whList = dataSetBeanMapper.datasetToBeans(inData, WhBean.class);
        logBaseServiceFacade.modifyWh(whList);
    }
}