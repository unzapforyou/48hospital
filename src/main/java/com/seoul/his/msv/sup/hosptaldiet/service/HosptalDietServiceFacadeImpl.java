package com.seoul.his.msv.sup.hosptaldiet.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.sup.hosptaldiet.applicationService.HosptalDietApplicationService;
import com.seoul.his.msv.sup.hosptaldiet.to.BreakfastBean;
import com.seoul.his.msv.sup.hosptaldiet.to.CarteBean;
import com.seoul.his.msv.sup.hosptaldiet.to.DCarteBean;
import com.seoul.his.msv.sup.hosptaldiet.to.DinnerBean;
import com.seoul.his.msv.sup.hosptaldiet.to.FoodBean;
import com.seoul.his.msv.sup.hosptaldiet.to.FoodDtlBean;
import com.seoul.his.msv.sup.hosptaldiet.to.HosptalDietCodeBean;
import com.seoul.his.msv.sup.hosptaldiet.to.IngredBean;
import com.seoul.his.msv.sup.hosptaldiet.to.LunchBean;


/**
 * @Package  com.seoul.his.msv.sup.hosptaldiet.service
 * @Class    HosptalDietServiceFacadeImpl.java
 * @Create   2016. 12. 06.
 * @Author   응디꿍디
 * @Description
 *
 * @LastUpdated
 */

@Service
public class HosptalDietServiceFacadeImpl implements HosptalDietServiceFacade{
	@Autowired
	HosptalDietApplicationService hosptaldietApplicationService;



     //화면로드 시 식재료 코드
	@Override
	public List<HosptalDietCodeBean> findCodeList(Map<String, String> argsMap) {
		List<HosptalDietCodeBean> ingredCodeList = hosptaldietApplicationService.findCodeList(argsMap);
		return ingredCodeList;
	}

	//조회에 따른 식재료 리스트
	@Override
	public List<IngredBean> findIngredList(Map<String, String> argsMap) {
		System.out.println("서비스포사드");
		List<IngredBean> ingredBeanList = hosptaldietApplicationService.findIngredList(argsMap);
		return ingredBeanList;
	}
	// 식재료배치
	@Override
	public void batchIngredProcess(List<IngredBean> ingredList){
		hosptaldietApplicationService.batchIngredProcess(ingredList);
	}
	//음식코드리스트가져오기
	@Override
	public List<HosptalDietCodeBean> findFoodCodeList(Map<String, String> argsMap) {
		List<HosptalDietCodeBean> foodCodeList = hosptaldietApplicationService.findFoodCodeList(argsMap);
		return foodCodeList;
	}
	//검색조건으로 음식리스트가져오기
	@Override
	public List<FoodBean> findFoodList(Map<String, String> argsMap) {
		List<FoodBean> foodBeanList = hosptaldietApplicationService.findFoodList(argsMap);
		return foodBeanList;
	}

	@Override
	public List<FoodDtlBean> findFoodDtlList(Map<String, String> argsMap) {
		List<FoodDtlBean> findFoodDtlList = hosptaldietApplicationService.findFoodDtlList(argsMap);
		return findFoodDtlList;
	}

	@Override
	public void batchFoodProcess(List<FoodBean> foodList) {
		hosptaldietApplicationService.batchFoodProcess(foodList);
	}

	@Override
	public void batchFoodDtlProcess(List<FoodDtlBean> foodDtlList) {
		hosptaldietApplicationService.batchFoodDtlProcess(foodDtlList);
	}

	@Override
	public List<HosptalDietCodeBean> findDietSeparateCodeList(Map<String, String> argsMap) {
		List<HosptalDietCodeBean> hosptalCodeList = hosptaldietApplicationService.findDietSeparateCodeList(argsMap);
		return hosptalCodeList;
	}

	@Override
	public List<CarteBean> findCarteList(Map<String, String> argsMap) {

		List<CarteBean>carteList = hosptaldietApplicationService.findCarteList(argsMap);
		return carteList;
	}

	@Override
	public List<DCarteBean> findDCarteList(Map<String, String> argsMap) {
		List<DCarteBean>dCarteList = hosptaldietApplicationService.findDCarteList(argsMap);
		return dCarteList;
	}

	@Override
	public void batchCarteProcess(Map<String, Object> map) {
		System.out.println("퍼사드");
		hosptaldietApplicationService.batchCarteProcess(map);
	}



}
