package com.seoul.his.msv.mcm.doctorschedule.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.mcm.doctorschedule.applicationService.DoctorScheduleApplicaionService;
import com.seoul.his.msv.mcm.doctorschedule.to.LastDateBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleDetailBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleRegisterInfoBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleTypeBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.service
 *    |_ DoctorScheduleServiceFacadeImpl.java
 *
 * </pre>
 *
 * @date : 2016. 12. 19. 오후 2:23:30
 * @version :
 * @author : 이정미
 */
@Service
public class DoctorScheduleServiceFacadeImpl implements DoctorScheduleServiceFacade {
	@Autowired
	DoctorScheduleApplicaionService doctorScheduleApplicaionService;

	@Override
	public List<ScheduleTypeBean> findScheduleTypeList(Map<String, String> argsMap) {
		return doctorScheduleApplicaionService.findScheduleTypeList(argsMap);
	}

	@Override
	public void removeScheduleType(ScheduleTypeBean scheduleType) {
		doctorScheduleApplicaionService.removeScheduleType(scheduleType);
	}

	@Override
	public void registerScheduleType(ScheduleTypeBean scheduleType) {
		doctorScheduleApplicaionService.registerScheduleType(scheduleType);
	}

	@Override
	public void modifyScheduleType(ScheduleTypeBean scheduleType) {
		doctorScheduleApplicaionService.modifyScheduleType(scheduleType);
	}

	@Override
	public List<ScheduleDetailBean> findScheduleDetailList(Map<String, String> argsMap) {
		return doctorScheduleApplicaionService.findScheduleDetailList(argsMap);
	}

	@Override
	public void registerDoctorSchedule(ScheduleRegisterInfoBean scheduleRegisterInfo) {
		doctorScheduleApplicaionService.registerDoctorSchedule(scheduleRegisterInfo);
	}

	@Override
	public List<LastDateBean> findLastDateList(Map<String, String> argsMap) {
		return doctorScheduleApplicaionService.findLastDateList(argsMap);
	}

	@Override
	public void removeDoctorSchedule(Map<String, String> argsMap) {
		doctorScheduleApplicaionService.removeDoctorSchedule(argsMap);
	}

}
