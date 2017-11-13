package com.seoul.his.log.ctrt.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.log.ctrt.service.CtrtServiceFacade;
import com.seoul.his.log.ctrt.to.CtrtBean;

@Controller
public class CtrtController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	CtrtServiceFacade ctrtServiceFacade;

	// 계약물품조회
	@RequestMapping("log/ctrt/findCtrtList.do")
    public void findCtrtList(HttpServletRequest request, HttpServletResponse response)throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<CtrtBean> ctrtBeanList = ctrtServiceFacade.findCtrtList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, ctrtBeanList, CtrtBean.class);
	}

	// 계약물품 일괄처리
    @RequestMapping("log/ctrt/batchCtrtProcess.do")
    public void batchCtrtProcess(HttpServletRequest request, HttpServletResponse response)throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        List<CtrtBean> ctrtBeanList = dataSetBeanMapper.datasetToBeans(inData, CtrtBean.class);
        ctrtServiceFacade.batchCtrtProcess(ctrtBeanList);
    }

}
