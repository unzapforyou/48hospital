package com.seoul.his.hrs.guntae.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.guntae.to.YeonchaBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.dao
 *    |_ YeonchaDAO.java
 *
 * </pre>
 * @date : 2016. 12. 26. 오후 5:10:45
 * @version :
 * @author : User
 */

public interface YeonchaDAO {

	  	//각 사원 연차 조회
		List<YeonchaBean> selectYeonchaList(Map<String, String> argsMap);
		//연차발생
		List<YeonchaBean> callYeoncha(Map<String, String> argsMap);
}





