package com.seoul.his.hrs.guntae.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.guntae.to.DayGuntaeBean;
import com.seoul.his.hrs.guntae.to.MonGuntaeBean;
import com.seoul.his.hrs.guntae.to.MonGuntaeCloseBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.dao
 *    |_ GuntaeDAO.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 9:02:43
 * @version :
 * @author : User
 */

public interface GuntaeDAO {
	//일근태생성
	List<DayGuntaeBean> callDayGuntae(Map<String, String> argsMap);

	//일근태조회
	List<DayGuntaeBean> selectDayGuntaeList(Map<String, String> argsMap);

	//월근태조회
	List<MonGuntaeBean> selectMonGuntaeList(Map<String, String> argsMap);

	//월근태생성
	List<MonGuntaeBean> callMonGuntae(Map<String, String> argsMap);

	//월근태마감
	List<MonGuntaeBean> callCloseMonGuntae(Map<String, String> argsMap);

	//월근태마감조회
	List<MonGuntaeCloseBean> selectMonGuntaeCloseList(Map<String, String> argsMap);
}





