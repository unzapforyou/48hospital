package com.seoul.his.msv.sup.hosptaldiet.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.hosptaldiet.to.BreakfastBean;
import com.seoul.his.msv.sup.hosptaldiet.to.CarteBean;
import com.seoul.his.msv.sup.hosptaldiet.to.DCarteBean;
import com.seoul.his.msv.sup.hosptaldiet.to.DinnerBean;
import com.seoul.his.msv.sup.hosptaldiet.to.HosptalDietCodeBean;
import com.seoul.his.msv.sup.hosptaldiet.to.LunchBean;

/**
 * <pre>
 * com.seoul.his.msv.sup.hosptaldiet.dao
 *    |_ CrateDAO.java
 *
 * </pre>
 * @date : 2016. 12. 11. 오후 2:51:04
 * @version :
 * @author : 응디꿍디
 */

public interface CarteDAO {

	List<HosptalDietCodeBean> selectDietSeparateCodeList(Map<String, String> argsMap);

	List<CarteBean> selectCarteList(Map<String, String> argsMap);

	List<DCarteBean> selectDCarteList(Map<String, String> argsMap);

	void insertCarte(BreakfastBean breakfastBean);

	void deleteCarte(BreakfastBean breakfastBean);

	void insertCarte(LunchBean lunchBean);

	void deleteCarte(LunchBean lunchBean);

	void insertCarte(DinnerBean dinnerBean);

	void deleteCarte(DinnerBean dinnerBean);


}





