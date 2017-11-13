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
import com.seoul.his.hrs.guntae.service.GuntaeServiceFacade;
import com.seoul.his.hrs.guntae.to.OverTimeWorkBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.controller
 *    |_ OverTimeWorkController.java
 *
 * </pre>
 * @date : 2016. 12. 23. 오후 5:39:45
 * @version :
 * @author : User
 */
@Controller
@RequestMapping("hrs/overtime")
public class OverTimeWorkController {

	@Autowired
	GuntaeServiceFacade guntaeServiceFacade;
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;

	//개인 시간외근무 조회
		@RequestMapping("/findOverTimeWorkList.do")
		public void findOverTimeWorkList(HttpServletRequest request,
				HttpServletResponse response) throws Exception{

			PlatformData inData = (PlatformData)request.getAttribute("inData");
			PlatformData outData = (PlatformData)request.getAttribute("outData");

			 Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

			List<OverTimeWorkBean> list;

			list = guntaeServiceFacade.findOverTimeWorkList(argsMap);

			dataSetBeanMapper.beansToDataset(outData, list, OverTimeWorkBean.class);


		}

		//관리자 시간외근무 조회
		@RequestMapping("/findApproverOverTimeWorkList.do")
		public void findApproverOverTimeWorkList(HttpServletRequest request,
				HttpServletResponse response) throws Exception{

			PlatformData inData = (PlatformData)request.getAttribute("inData");
			PlatformData outData = (PlatformData)request.getAttribute("outData");

			List<OverTimeWorkBean> list;

			list = guntaeServiceFacade.findApproverOverTimeWorkList();

			dataSetBeanMapper.beansToDataset(outData, list, OverTimeWorkBean.class);


		}

		 //시간외근무 일괄처리
		@RequestMapping("/batchOverTimeWorkProcess.do")
		public void batchOverTimeWorkProcess(HttpServletRequest request,
				HttpServletResponse response) throws Exception{
		    System.out.println("시간외 근무 일괄처리 controller");
			PlatformData inData = (PlatformData)request.getAttribute("inData");
			PlatformData outData = (PlatformData)request.getAttribute("outData");

			List<OverTimeWorkBean> list;

			list = dataSetBeanMapper.datasetToBeans(inData, OverTimeWorkBean.class);

			guntaeServiceFacade.batchOverTimeWorkProcess(list);


		}




}





