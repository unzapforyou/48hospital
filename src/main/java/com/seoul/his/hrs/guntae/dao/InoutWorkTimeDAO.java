package com.seoul.his.hrs.guntae.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.guntae.to.InoutWorkTimeBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.dao
 *    |_ InoutWorkTimeDAO.java
 *
 * </pre>
 * @date : 2016. 12. 22. 오후 7:21:50
 * @version :
 * @author : User
 */

public interface InoutWorkTimeDAO {

	List<InoutWorkTimeBean> selectInoutWorkTimeList(Map<String, String> argsMap);

	void insertInoutWorkTime(InoutWorkTimeBean inoutWorkTimeBean);

	void updateInoutWorkTime(InoutWorkTimeBean inoutWorkTimeBean);
}





