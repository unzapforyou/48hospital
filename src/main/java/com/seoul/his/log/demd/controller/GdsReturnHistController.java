package com.seoul.his.log.demd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.log.demd.service.DemdServiceFacade;
import com.seoul.his.log.demd.to.GdsReturnHistBean;

/**
 * @Package  com.seoul.his.log.demd.controller
 * @Class    GdsReturnHistController.java
 * @Create   2016. 5. 25.
 * @Author   Bohyun
 * @Description 물품반납상세 컨트롤러
 *
 * @LastUpdated 
 */
@Controller
public class GdsReturnHistController {
    
    @Autowired
    DemdServiceFacade demdServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;

    @RequestMapping("log/demd/findGdsReturnHistList.do")
    public void findGdsReturnHistList(HttpServletRequest request,HttpServletResponse response) throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        List<GdsReturnHistBean> GdsReturnHistBeanList = demdServiceFacade.findGdsReturnHistList();
        datasetBeanMapper.beansToDataset(outData, GdsReturnHistBeanList, GdsReturnHistBean.class);
    }

    @RequestMapping("log/demd/batchGdsReturnHistProcess.do")
    public void batchGdsReturnHistProcess(HttpServletRequest request,HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        List<GdsReturnHistBean> GdsReturnHistBeanList = datasetBeanMapper.datasetToBeans(inData, GdsReturnHistBean.class);
        demdServiceFacade.batchGdsReturnHistProcess(GdsReturnHistBeanList);

    }
}
