package com.seoul.his.msv.sup.hosptaldiet.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.hosptaldiet.to.BreakfastBean;
import com.seoul.his.msv.sup.hosptaldiet.to.CarteBean;
import com.seoul.his.msv.sup.hosptaldiet.to.DCarteBean;
import com.seoul.his.msv.sup.hosptaldiet.to.DinnerBean;
import com.seoul.his.msv.sup.hosptaldiet.to.FoodBean;
import com.seoul.his.msv.sup.hosptaldiet.to.FoodDtlBean;
import com.seoul.his.msv.sup.hosptaldiet.to.HosptalDietCodeBean;
import com.seoul.his.msv.sup.hosptaldiet.to.IngredBean;
import com.seoul.his.msv.sup.hosptaldiet.to.LunchBean;


public interface HosptalDietApplicationService {

	List<HosptalDietCodeBean> findCodeList(Map<String, String> argsMap);

	List<IngredBean> findIngredList(Map<String, String> argsMap);

	void batchIngredProcess(List<IngredBean> ingredList);

	List<HosptalDietCodeBean> findFoodCodeList(Map<String, String> argsMap);

	List<FoodBean> findFoodList(Map<String, String> argsMap);

	List<FoodDtlBean> findFoodDtlList(Map<String, String> argsMap);

	void batchFoodProcess(List<FoodBean> foodList);

	void batchFoodDtlProcess(List<FoodDtlBean> foodDtlList);

	List<HosptalDietCodeBean> findDietSeparateCodeList(Map<String, String> argsMap);

	List<CarteBean> findCarteList(Map<String, String> argsMap);

	List<DCarteBean> findDCarteList(Map<String, String> argsMap);

	void batchCarteProcess(Map<String, Object> map);


}
