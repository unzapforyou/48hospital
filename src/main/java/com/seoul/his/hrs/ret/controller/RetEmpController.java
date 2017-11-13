package com.seoul.his.hrs.ret.controller;

import java.util.Map;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.ret.service.RetServiceFacade;
import com.seoul.his.hrs.ret.to.RetEmpBean;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.controller
 * @Class    RetEmpController.java
 * @Create   2016. 6. 5.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */

@Controller
public class RetEmpController {

	@Autowired
	RetServiceFacade retServiceFacade;
	
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	
	@RequestMapping("hrs/ret/findRetEmpList.do")
	public void findRetEmpList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		PlatformData outData = (PlatformData)request.getAttribute("outData");
		PlatformData inData = (PlatformData)request.getAttribute("inData");
		Map<String, String> argsMap;
		argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<RetEmpBean> retEmpList;
		
		retEmpList = retServiceFacade.findRetEmpList(argsMap);
		
		dataSetBeanMapper.beansToDataset(outData, retEmpList, RetEmpBean.class);
		
	}
	
}
