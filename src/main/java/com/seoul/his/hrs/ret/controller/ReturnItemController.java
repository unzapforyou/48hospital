package com.seoul.his.hrs.ret.controller;

import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.ret.service.RetServiceFacade;
import com.seoul.his.hrs.ret.to.ReturnItemBean;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.controller
 * @Class    ReturnItemController.java
 * @Create   2016. 6. 27.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */
@Controller
public class ReturnItemController {
	@Autowired
	private RetServiceFacade retServiceFacade;
	@Autowired
	private DataSetBeanMapper datasetBeanMapper;

	@SuppressWarnings("unchecked")
	@RequestMapping("hrs/ret/findReturnItemList.do")
	public void findReturnItemList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		PlatformData outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		Map<String, String> argsMap;
		argsMap = datasetBeanMapper.variablesToMap(inData);
		List<ReturnItemBean> returnItemList;

		returnItemList = retServiceFacade.findReturnItemList(argsMap);
		datasetBeanMapper.beansToDataset(outData, returnItemList,
				ReturnItemBean.class);
	}

	@RequestMapping("hrs/ret/batchReturnItemProcess.do")
	public void batchReturnItemProcess(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("배치시작");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<ReturnItemBean> returnItemList = datasetBeanMapper.datasetToBeans(inData,
				ReturnItemBean.class);
		retServiceFacade.batchReturnItemProcess(returnItemList);
	}


}
