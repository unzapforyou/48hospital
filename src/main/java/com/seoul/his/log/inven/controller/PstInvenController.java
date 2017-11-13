package com.seoul.his.log.inven.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.log.inven.service.InvenServiceFacade;
import com.seoul.his.log.inven.to.PstInvenBean;

/**
 * @Package  com.seoul.his.log.inven.controller
 * @Class    PstInvenController.java
 * @Create   2016. 5. 29.
 * @Author   Chun
 * @Description
 *
 * @LastUpdated
 */

@Controller
public class PstInvenController {
	@Autowired
	InvenServiceFacade invenServiceFacade;
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;

	//실재고 조회
	@RequestMapping("log/inven/findPstInvenList.do")
	public void findPstInvenList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<PstInvenBean> pstInvenList = invenServiceFacade.findPstInvenList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, pstInvenList, PstInvenBean.class);

		}

	//실재고 저장
	@RequestMapping("log/inven/batchPstInvenListProcess.do")
	public void batchPstInvenListProcess(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<PstInvenBean> pstInvenList;
		pstInvenList = dataSetBeanMapper.datasetToBeans(inData,PstInvenBean.class);
		invenServiceFacade.batchPstInvenListProcess(pstInvenList);

	}

	}
