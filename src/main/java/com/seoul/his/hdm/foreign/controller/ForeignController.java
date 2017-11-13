package com.seoul.his.hdm.foreign.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.hdm.foreign.service.ForeignServiceFacade;
import com.seoul.his.hdm.foreign.to.PatInfoBean;
import com.seoul.his.common.util.DataSetBeanMapper;


@Controller
public class ForeignController {
	
	@Autowired
	DataSetBeanMapper dataSetBeanMapper; 
	@Autowired
	ForeignServiceFacade foreignServiceFacade;

	private PlatformData outData;
	private PlatformData inData;
	private Map<String, String> argsMap;	
	
	@RequestMapping("hdm/foreign/findPatList.do")
	public void findPatList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    inData = (PlatformData) request.getAttribute("inData");
		outData = (PlatformData) request.getAttribute("outData");
		argsMap = dataSetBeanMapper.variablesToMap(inData);

		List<PatInfoBean> list
		= foreignServiceFacade.findPatList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, list, PatInfoBean.class);
	}

	
    @RequestMapping("hdm/foreign/findPat.do")
    public void findPat(HttpServletRequest request
                            , HttpServletResponse response) throws Exception {
        outData = (PlatformData) request.getAttribute("outData");
        inData = (PlatformData) request.getAttribute("inData");
        argsMap = dataSetBeanMapper.variablesToMap(inData);
         System.out.println("PatController - 환자한명조회");
        PatInfoBean patInfoBean = foreignServiceFacade.findPat(argsMap);
        System.out.println(patInfoBean);
        dataSetBeanMapper.beanToDataset(outData, patInfoBean, PatInfoBean.class);
    }   
    
}
