package com.seoul.his.hrs.guntae.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.guntae.to.HdayBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.dao
 *    |_ HdayDAO.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 7:44:46
 * @version :
 * @author : User
 */

public interface HdayDAO {

	//휴일조회
	List<HdayBean> selectHdayList(Map<String, String> argsMap);

	//휴일생성
	void callHday(HdayBean hdayBean);

	//휴일삭제
	void deleteHday(HdayBean hdayBean);

}





