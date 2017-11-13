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
import com.seoul.his.hrs.guntae.to.InoutWorkTimeBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.controller
 *    |_ InoutWorkTimeController.java
 *
 * </pre>
 * @date : 2016. 12. 22. 오후 7:58:27
 * @version :
 * @author : User
 */
@Controller
public class InoutWorkTimeController {

	@Autowired
	GuntaeServiceFacade guntaeServiceFacade;
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;

	  //출퇴근시간 조회
		@RequestMapping("hrs/inoutTime/findInoutTimeList.do")
		public void findInoutWorkTimeList(HttpServletRequest request,
				HttpServletResponse response) throws Exception{

			PlatformData inData = (PlatformData)request.getAttribute("inData");
			PlatformData outData = (PlatformData)request.getAttribute("outData");

			 Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

			List<InoutWorkTimeBean> list = guntaeServiceFacade.findInoutWorkTimeList(argsMap);

			dataSetBeanMapper.beansToDataset(outData, list, InoutWorkTimeBean.class);

		}

		 //출퇴근시간 일괄처리
		@RequestMapping("hrs/inoutTime/batchInoutWorkTimeProcess.do")
		public void batchInoutWorkTimeProcess(HttpServletRequest request,
				HttpServletResponse response) throws Exception{

			PlatformData inData = (PlatformData)request.getAttribute("inData");
			PlatformData outData = (PlatformData)request.getAttribute("outData");
			NexacroLogger.debug(inData);

			System.out.println("getDataSetList:");
			NexacroLogger.debug(inData.getDataSetList());
			List<InoutWorkTimeBean> list;

			list = dataSetBeanMapper.datasetToBeans(inData, InoutWorkTimeBean.class);

			guntaeServiceFacade.batchInoutWorkTimeProcess(list);

		}
}





