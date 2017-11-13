package com.seoul.his.hrs.salMng.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.salMng.service.SalMngServiceFacade;
import com.seoul.his.hrs.salMng.to.SalTransfBean;

/**
 * @Package  com.seoul.his.hrs.salMng.controller
 * @Class    SalTransferController.java
 * @Create   2016. 5. 27.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class SalTransferController {
	@Autowired
	public SalMngServiceFacade salMngServiceFacade;

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;

	@RequestMapping("hrs/salMng/findSalTransfList.do")
	public void findSalTransfList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SalTransfBean> salTransfList = salMngServiceFacade.findSalTransfList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, salTransfList, SalTransfBean.class);
	}
}
