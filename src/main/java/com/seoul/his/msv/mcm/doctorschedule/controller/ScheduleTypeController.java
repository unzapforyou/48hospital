package com.seoul.his.msv.mcm.doctorschedule.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.msv.mcm.doctorschedule.service.DoctorScheduleServiceFacade;
import com.seoul.his.msv.mcm.doctorschedule.to.DetailDowBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleDetailBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleTypeBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.controller
 *    |_ ScheduleTypeController.java
 * </pre>
 *
 * @date : 2016. 12. 19. 오후 2:20:04
 * @version :
 * @author : 이정미
 */

@Controller
public class ScheduleTypeController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	DoctorScheduleServiceFacade doctorScheduleServiceFacade;

	@RequestMapping("msv/mcm/doctorschedule/findScheduleTypeList.do")
	public void findScheduleTypeList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<ScheduleTypeBean> scheduleTypeList = doctorScheduleServiceFacade.findScheduleTypeList(argsMap);
		List<DetailDowBean> detailDowList = new ArrayList<DetailDowBean>();
		for (ScheduleTypeBean scheduleType : scheduleTypeList) {
			detailDowList.addAll(scheduleType.getDetailDowList());
		}
		dataSetBeanMapper.beansToDataset(outData, scheduleTypeList, ScheduleTypeBean.class);
		dataSetBeanMapper.beansToDataset(outData, detailDowList, DetailDowBean.class);
	}

	@RequestMapping("msv/mcm/doctorschedule/registerScheduleType.do")
	public void registerScheduleType(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		ScheduleTypeBean scheduleType = dataSetBeanMapper.datasetToBean(inData, ScheduleTypeBean.class);
		List<ScheduleDetailBean> scheduleDetailList = dataSetBeanMapper.datasetToBeans(inData,
				ScheduleDetailBean.class);
		scheduleType.setScheduleDetailList(scheduleDetailList);
		doctorScheduleServiceFacade.registerScheduleType(scheduleType);
	}

	@RequestMapping("msv/mcm/doctorschedule/modifyScheduleType.do")
	public void modifyScheduleType(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		ScheduleTypeBean scheduleType = dataSetBeanMapper.datasetToBean(inData, ScheduleTypeBean.class);
		System.out.println(scheduleType);
		List<ScheduleDetailBean> scheduleDetailList = dataSetBeanMapper.datasetToBeans(inData,
				ScheduleDetailBean.class);
		for (ScheduleDetailBean sheduleDetail : scheduleDetailList) {
			System.out.println(sheduleDetail);
		}
		scheduleType.setScheduleDetailList(scheduleDetailList);
		doctorScheduleServiceFacade.modifyScheduleType(scheduleType);
	}

	@RequestMapping("msv/mcm/doctorschedule/removeScheduleType.do")
	public void removeScheduleType(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("removeController");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		ScheduleTypeBean scheduleType = dataSetBeanMapper.datasetToBean(inData, ScheduleTypeBean.class);
		System.out.println(scheduleType);
		doctorScheduleServiceFacade.removeScheduleType(scheduleType);
	}

	@RequestMapping("msv/mcm/doctorschedule/findScheduleDetailList.do")
	public void findScheduleDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("findScheduleDetailListt시작");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<ScheduleDetailBean> scheduleDetailList = doctorScheduleServiceFacade.findScheduleDetailList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, scheduleDetailList, ScheduleDetailBean.class);
	}
}