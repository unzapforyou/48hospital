package com.seoul.his.hrs.guntae.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.guntae.to.HolidayBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.dao
 *    |_ HolidayDAO.java
 *
 * </pre>
 * @date : 2016. 12. 24. 오전 10:44:29
 * @version :
 * @author : User
 */

public interface HolidayDAO {
	List<HolidayBean> selectHolidayList(Map<String, String> argsMap);

	List<HolidayBean> selectAdminHolidayList(Map<String, String> argsMap);

	void callHoliday(HolidayBean holidayBean);

	void updateHoliday(HolidayBean holidayBean);
}





