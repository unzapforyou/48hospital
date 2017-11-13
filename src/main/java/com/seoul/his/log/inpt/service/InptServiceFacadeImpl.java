package com.seoul.his.log.inpt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.inpt.applicationService.InptApplicationService;
import com.seoul.his.log.inpt.applicationService.SkillExApplicationService;
import com.seoul.his.log.inpt.to.BuyDemdBean;
import com.seoul.his.log.inpt.to.CtrtInfoBean;
import com.seoul.his.log.inpt.to.CtrtInfoDetailBean;
import com.seoul.his.log.inpt.to.GdsInptBean;
import com.seoul.his.log.inpt.to.SkillExmntHistBean;

@Service
public class InptServiceFacadeImpl implements InptServiceFacade{

	@Autowired
    private InptApplicationService inptAppleicationservice;
	@Autowired
    private SkillExApplicationService skillExApplicationservice;

	// 물품검수 조회
	@Override
	public List<CtrtInfoBean> findCtrtList() {
		return inptAppleicationservice.findCtrtList();
	}

	// 물품조회 (계약번호에 해당하는 계약상세정보 조회)
	@Override
	public List<CtrtInfoDetailBean> findCtrtInfoDetailList(Map<String, String> queryMap) {
		return inptAppleicationservice.findCtrtInfoDetailList(queryMap);
	}

	// 물품검수조회 (계약번호에 해당하는 검수내역 조회)
	@Override
	public List<GdsInptBean> findGdsInptList(Map<String, String> queryMap) {
		return inptAppleicationservice.findGdsInptList(queryMap);
	}

	// 납품일조회 (계약번호에 해당하는 남품일 조회)
	@Override
	public List<BuyDemdBean> findDelivDay(Map<String, String> queryMap) {
		return inptAppleicationservice.findDelivDay(queryMap);
	}

	// 검수확인등록
	@Override
	public void registerGdsInpt(List<GdsInptBean> gdsInptList, List<CtrtInfoBean> ctrtInfo) {
		inptAppleicationservice.registerGdsInpt(gdsInptList, ctrtInfo);
	}

	// 검수확인취소
	@Override
	public void cancelGdsInpt(List<GdsInptBean> gdsInptList, List<CtrtInfoBean> ctrtInfo) {
		inptAppleicationservice.cancelGdsInpt(gdsInptList, ctrtInfo);
	}

	// 기술검사조회
	@Override
	public List<SkillExmntHistBean> findSkillExmntHistList(Map<String, String> queryMap) {
		return skillExApplicationservice.findSkillExmntHistList(queryMap);
	}

	// 기술검사 일괄처리
	@Override
	public void batchProcessSkillExmntHist(List<SkillExmntHistBean> skillExmntHisList, CtrtInfoBean ctrtInfoBean) {
		skillExApplicationservice.batchProcessSkillExmntHist(skillExmntHisList, ctrtInfoBean);
	}


}
