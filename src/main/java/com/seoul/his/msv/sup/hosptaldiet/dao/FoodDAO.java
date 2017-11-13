package com.seoul.his.msv.sup.hosptaldiet.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.hosptaldiet.to.FoodBean;
import com.seoul.his.msv.sup.hosptaldiet.to.FoodDtlBean;
import com.seoul.his.msv.sup.hosptaldiet.to.HosptalDietCodeBean;

/**
 * <pre>
 * com.seoul.his.msv.sup.hosptaldiet.dao
 *    |_ FoodDAO.java
 *
 * </pre>
 * @date : 2016. 12. 6. 오후 2:29:37
 * @version :
 * @author : 응디꿍디
 */

public interface FoodDAO {

	List<HosptalDietCodeBean> selectFoodCodeList(Map<String, String> argsMap);

	List<FoodBean> selectFoodList(Map<String, String> argsMap);

	List<FoodDtlBean> selectFoodDtlList(Map<String, String> argsMap);

	void deleteFoodList(FoodBean foodBean);

	void updateFoodList(FoodBean foodBean);

	void insertFoodList(FoodBean foodBean);

	void deleteFoodDtlList(FoodDtlBean foodDtlBean);

	void insertFoodDtlList(FoodDtlBean foodDtlBean);

	void updateFoodDtlList(FoodDtlBean foodDtlBean);

}





