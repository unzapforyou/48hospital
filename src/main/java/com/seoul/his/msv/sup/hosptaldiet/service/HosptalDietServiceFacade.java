package com.seoul.his.msv.sup.hosptaldiet.service;

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


public interface HosptalDietServiceFacade {

	//화면로드 시 식재료 코드 가져오기
		List<HosptalDietCodeBean> findCodeList(Map<String, String> argsMap);

	    //조회조건에 맞는 식재료 목록 가져오기
		List<IngredBean> findIngredList(Map<String, String> argsMap);

		//식재료목록 배치
		void batchIngredProcess(List<IngredBean> ingredList);

		//화면로드 시 음식 코드 가져오기
		List<HosptalDietCodeBean> findFoodCodeList(Map<String, String> argsMap);

		//검색조건로 음식리스트가져오기
		List<FoodBean> findFoodList(Map<String, String> argsMap);

		//음식상세정보가져오기
		List<FoodDtlBean> findFoodDtlList(Map<String, String> argsMap);
        //음식 배치
		void batchFoodProcess(List<FoodBean> foodList);

		//음식상세정보 배치
		void batchFoodDtlProcess(List<FoodDtlBean> foodDtlList);

		//식단분류
		List<HosptalDietCodeBean> findDietSeparateCodeList(Map<String, String> argsMap);

		//식단조회
		List<CarteBean> findCarteList(Map<String, String> argsMap);

		//기간에 따른 식단 조회
		List<DCarteBean> findDCarteList(Map<String, String> argsMap);

		void batchCarteProcess(Map<String, Object> map);







}
