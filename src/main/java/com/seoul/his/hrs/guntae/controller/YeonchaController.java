package com.seoul.his.hrs.guntae.controller;

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
import com.seoul.his.hrs.guntae.service.GuntaeServiceFacade;
import com.seoul.his.hrs.guntae.to.YeonchaBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.controller
 *    |_ YeonchaController.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 5:16:20
 * @version :
 * @author : User
 */
@RequestMapping("hrs/guntae")
@Controller
public class YeonchaController {
	@Autowired
	GuntaeServiceFacade guntaeServiceFacade;
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;

	 // 각 사원 연차조회
		@RequestMapping("/findYeonchaList.do")

		public void findYeonchaList(HttpServletRequest request,
				HttpServletResponse response) throws Exception{
		    PlatformData inData = (PlatformData)request.getAttribute("inData");
			PlatformData outData = (PlatformData)request.getAttribute("outData");
			NexacroLogger.debug(inData);
			Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
			List<YeonchaBean> list = guntaeServiceFacade.findYeonchaList(argsMap);

			dataSetBeanMapper.beansToDataset(outData, list, YeonchaBean.class);
		}

	    //연차발생
		@RequestMapping("/createYeoncha.do")

		public void insertYeoncha(HttpServletRequest request,
				HttpServletResponse response) throws Exception{
		    System.out.println("연차발생 controller");
			PlatformData outData = (PlatformData)request.getAttribute("outData");
			PlatformData inData = (PlatformData)request.getAttribute("inData");
			NexacroLogger.debug(inData);
			Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

			List<YeonchaBean> list = guntaeServiceFacade.callYeoncha(argsMap);

			dataSetBeanMapper.beansToDataset(outData, list, YeonchaBean.class);
		}
}





