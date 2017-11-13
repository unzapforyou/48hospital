package com.seoul.his.hrs.yeta.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.common.util.NexacroLogger;
import com.seoul.his.hrs.yeta.service.YetaServiceFacade;
import com.seoul.his.hrs.yeta.to.HyYtaResultBean;

@Controller
public class HyYtaResultController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    
    private PlatformData outData;
    private PlatformData inData;
    Map<String, String> argsMap;
    
    
    @RequestMapping("hrs/yeta/findHyYtaResultList.do")
    public void findHyYtaResultList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        inData = (PlatformData) request.getAttribute("inData");
        argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<HyYtaResultBean> hyYtaResultBeanList = yetaServiceFacade.findHyYtaResultList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, hyYtaResultBeanList, HyYtaResultBean.class);
    }

    @RequestMapping("hrs/yeta/executeYta.do")
    public void executeYta(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        inData = (PlatformData) request.getAttribute("inData");

        System.out.println("inData 내역보기");
        NexacroLogger.debug(inData.getDataSetList());//받은데이터 내역보기
        argsMap = dataSetBeanMapper.variablesToMap(inData);

        yetaServiceFacade.executeYta(argsMap);
        String errorMessage = argsMap.get("errorMessage");
        System.out.println("9++++++++++++++++++++++" + errorMessage);
    }
}
