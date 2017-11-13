package com.seoul.his.com.system.dao;

/**
 * @Package  com.seoul.his.com.base.dao
 * @Class    LogDAO.java
 * @Create   2016. 12. 24.
 * @Author   최민하
 * @Description Restful방식 접속 로그 관련 Data Access Object Interface
 *
 * @LastUpdated
 */


public interface LogDAO {

	public void insertLog(String id, String time);
	
}
