package com.seoul.his.msv.mcm.doctorschedule.controller;

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
import com.seoul.his.msv.mcm.doctorschedule.to.LastDateBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleRegisterInfoBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleTypeBean;


/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.controller
 *    |_ DoctorScheduleController.java
 * </pre>
 *
 * @date : 2016. 12. 21. 오후 8:11:24
 * @version :
 * @author : 이정미
 */




@Controller
public class DoctorScheduleController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	DoctorScheduleServiceFacade doctorScheduleServiceFacade;

	@RequestMapping("msv/mcm/doctorschedule/registerDoctorSchedule.do")
	public void registerDoctorSchedule(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		ScheduleRegisterInfoBean scheduleRegisterInfo = dataSetBeanMapper.datasetToBean(inData, ScheduleRegisterInfoBean.class);
		System.out.println(scheduleRegisterInfo);
		doctorScheduleServiceFacade.registerDoctorSchedule(scheduleRegisterInfo);
	}
	@RequestMapping("msv/mcm/doctorschedule/removeDoctorSchedule.do")
	public void removeDoctorSchedule(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		doctorScheduleServiceFacade.removeDoctorSchedule(argsMap);
	}
	@RequestMapping("msv/mcm/doctorschedule/findLastDateList.do")
	public void findLastDateList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<LastDateBean> lastDateList=doctorScheduleServiceFacade.findLastDateList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, lastDateList, LastDateBean.class);
	}




}