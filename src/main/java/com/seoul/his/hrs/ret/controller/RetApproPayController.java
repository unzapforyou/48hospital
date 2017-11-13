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
import com.seoul.his.hrs.ret.to.RetApproPayBean;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.controller
 * @Class    RetApproPayController.java
 * @Create   2016. 6. 5.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */
@Controller
public class RetApproPayController {
	@Autowired
	private RetServiceFacade retServiceFacade;
	@Autowired
	private DataSetBeanMapper datasetBeanMapper;

	@RequestMapping("hrs/ret/findRetApproPayList.do")
	public void findRetApproPayList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap;
		argsMap = datasetBeanMapper.variablesToMap(inData);
		List<RetApproPayBean> retApproPayList;

		retApproPayList = retServiceFacade.findRetApproPayList(argsMap);
		datasetBeanMapper.beansToDataset(outData, retApproPayList,
				RetApproPayBean.class);
	}

	@RequestMapping("hrs/ret/batchRetApproPayProcess.do")
	public void batchRetApproPayProcess(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<RetApproPayBean> retApproPayList = datasetBeanMapper.datasetToBeans(inData,
				RetApproPayBean.class);
		retServiceFacade.batchRetApproPayProcess(retApproPayList);
	}


}
