package com.seoul.his.acc.resol.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.resol.service.ResolServiceFacade;
import com.seoul.his.acc.resol.to.AutoJourRuleBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class AutoJourRuleController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    ResolServiceFacade resolServiceFacade;


    @RequestMapping("acc/resol/findAutoJourRuleList.do")
    public void findAutoJourRuleList(HttpServletRequest request,HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<AutoJourRuleBean> autoJourRuleList = resolServiceFacade.findAutoJourRuleList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, autoJourRuleList,AutoJourRuleBean.class);
    }


        @RequestMapping("acc/resol/registerAutoJourRule.do")
        public void registerAutoJourRule(HttpServletRequest request,HttpServletResponse response)
                throws Exception {
            PlatformData inData = (PlatformData) request.getAttribute("inData");
            String parentDiv = inData.getVariable("parentDiv").getString();
            List<AutoJourRuleBean> autoJourRuleBeanList = dataSetBeanMapper.datasetToBeans(inData, AutoJourRuleBean.class);
            //resolServiceFacade.registerAutoJourRule(parentDiv,autoJourRuleBeanList);
        }
}
