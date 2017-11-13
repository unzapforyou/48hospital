package com.seoul.his.msv.mcm.doctorschedule.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.doctorschedule.to.LastDateBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleDetailBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleRegisterInfoBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleTypeBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.service
 *    |_ DoctorScheduleServiceFacade.java
 *
 * </pre>
 *
 * @date : 2016. 12. 19. 오후 2:22:28
 * @version :
 * @author : 이정미
 */

public interface DoctorScheduleServiceFacade {

	List<ScheduleTypeBean> findScheduleTypeList(Map<String, String> argsMap);

	void registerScheduleType(ScheduleTypeBean scheduleType);

	void modifyScheduleType(ScheduleTypeBean scheduleType);

	void removeScheduleType(ScheduleTypeBean scheduleType);

	List<ScheduleDetailBean> findScheduleDetailList(Map<String, String> argsMap);

	void registerDoctorSchedule(ScheduleRegisterInfoBean scheduleRegisterInfo);

	List<LastDateBean> findLastDateList(Map<String, String> argsMap);

	void removeDoctorSchedule(Map<String, String> argsMap);

}
