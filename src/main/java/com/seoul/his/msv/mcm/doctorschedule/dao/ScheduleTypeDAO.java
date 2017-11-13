package com.seoul.his.msv.mcm.doctorschedule.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleTypeBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.dao
 *    |_ SchduleTypeDAO.java
 *
 * </pre>
 * @date : 2016. 12. 19. 오후 2:35:36
 * @version :
 * @author : 이정미
 */

public interface ScheduleTypeDAO {

	List<ScheduleTypeBean> selectScheduleTypeList(Map<String, String> argsMap);

	void insertScheduleType(ScheduleTypeBean scheduleType);

	void updateScheduleType(ScheduleTypeBean scheduleType);

	void deleteScheduleType(ScheduleTypeBean scheduleType);

}





