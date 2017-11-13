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
import com.seoul.his.hrs.yeta.to.HmEmpBean;

@Controller
public class HmEmpController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper datasetBeanMapper;
    private PlatformData outData;
    private PlatformData inData;
    
    @RequestMapping("hrs/yeta/findHmEmpList.do")
    public void findHmEmpList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        List<HmEmpBean> hmEmpBeanList = yetaServiceFacade.findHmEmpList();
        datasetBeanMapper.beansToDataset(outData, hmEmpBeanList, HmEmpBean.class);
    }

    @RequestMapping("hrs/yeta/batchHmEmpProcess.do")
    public void batchHmEmpProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");

        List<HmEmpBean> HmEmpBeanList = datasetBeanMapper.datasetToBeans(inData, HmEmpBean.class);
        yetaServiceFacade.batchHmEmpProcess(HmEmpBeanList);

    }
}
