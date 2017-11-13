package com.seoul.his.msv.mcm.doctorschedule.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleDetailBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleTypeBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.dao
 *    |_ ScheduleDetailDAO.java
 * </pre>
 *
 * @date : 2016. 12. 19. 오후 4:05:12
 * @version :
 * @author : 이정미
 */

public interface ScheduleDetailDAO {

	List<ScheduleDetailBean> selectSchduleDetailList(Map<String, String> argsMap);

	void insertScheduleDetail(ScheduleDetailBean scheduleDetail);

	void updateScheduleDetail(ScheduleDetailBean scheduleDetail);

	void deleteScheduleDetail(ScheduleDetailBean scheduleDetail);

	void deleteScheduleDetailList(ScheduleTypeBean scheduleTypeBean);

}
