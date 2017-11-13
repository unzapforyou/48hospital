package com.seoul.his.msv.sup.hosptaldiet.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.hosptaldiet.to.HosptalDietCodeBean;
import com.seoul.his.msv.sup.hosptaldiet.to.IngredBean;

/**
 * <pre>
 * com.seoul.his.msv.sup.hosptaldiet.dao
 *    |_ IngredDAO.java
 *
 * </pre>
 * @date : 2016. 12. 5. 오전 10:39:11
 * @version :
 * @author : 응디꿍디
 */

public interface IngredDAO {

	List<HosptalDietCodeBean> selectCodeList(Map<String, String> argsMap);

	List<IngredBean> selectIngredList(Map<String, String> argsMap);

	void insertIngred(IngredBean ingredList);

	void updateIngred(IngredBean ingredList);

	void deleteIngred(IngredBean ingredList);
}





