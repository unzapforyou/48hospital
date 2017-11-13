package com.seoul.his.msv.mcm.doctorschedule.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.doctorschedule.to.LastDateBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleRegisterInfoBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.dao
 *    |_ DoctorScheduleDAO.java
 * </pre>
 *
 * @date : 2016. 12. 21. 오후 8:25:56
 * @version :
 * @author : 이정미
 */

public interface DoctorScheduleDAO {

	void insertDoctorSchedule(ScheduleRegisterInfoBean scheduleRegisterInfo);

	List<LastDateBean> selectLastDateList(Map<String, String> argsMap);

	void deleteDoctorSchedule(Map<String, Object> paramMap);

}
