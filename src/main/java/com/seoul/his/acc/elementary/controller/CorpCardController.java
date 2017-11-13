package com.seoul.his.acc.elementary.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.elementary.service.AccElementaryServiceFacade;
import com.seoul.his.acc.elementary.to.CorpCardBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class CorpCardController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    private AccElementaryServiceFacade accElementaryServiceFacade;
    
    @RequestMapping("acc/elementary/findCorpCardList.do")
    public void findCorpCardList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<CorpCardBean> corpCardList = accElementaryServiceFacade.findCorpCardList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, corpCardList, CorpCardBean.class);
    }
    
    @RequestMapping("acc/elementary/batchCorpCardListProcess.do")
    public void batchCorpCardListProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        List<CorpCardBean> corpCardList = dataSetBeanMapper.datasetToBeans(inData, CorpCardBean.class);
        accElementaryServiceFacade.batchCorpCardListProcess(corpCardList);
    }
}
