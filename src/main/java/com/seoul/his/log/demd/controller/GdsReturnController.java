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
import com.seoul.his.log.demd.to.GdsReturnBean;

/**
 * @Package  com.seoul.his.log.demd.controller
 * @Class    GdsReturnController.java
 * @Create   2016. 5. 25.
 * @Author   Bohyun
 * @Description 물품반납컨트롤러
 *
 * @LastUpdated 
 */
@Controller
public class GdsReturnController {
    
    @Autowired
    DemdServiceFacade demdServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    
    //반품조회
    @RequestMapping("log/demd/findGdsReturnList.do")
    public void findGdsReturnList(HttpServletRequest request,HttpServletResponse response) throws Exception{
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        List<GdsReturnBean> GdsReturnBeanList = demdServiceFacade.findGdsReturnList();
        datasetBeanMapper.beansToDataset(outData, GdsReturnBeanList, GdsReturnBean.class);
    }
    
    //반품 일괄처리
    @RequestMapping("log/demd/batchGdsReturnProcess.do")
    public void batchGdsReturnProcess(HttpServletRequest request,HttpServletResponse response) throws Exception {
        
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        List<GdsReturnBean> GdsReturnBeanList = datasetBeanMapper
                .datasetToBeans(inData, GdsReturnBean.class);
        demdServiceFacade.batchGdsReturnProcess(GdsReturnBeanList);

    }
    

}
