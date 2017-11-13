package com.seoul.his.log.inpt.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.inpt.to.BuyDemdBean;
import com.seoul.his.log.inpt.to.CtrtInfoBean;
import com.seoul.his.log.inpt.to.CtrtInfoDetailBean;
import com.seoul.his.log.inpt.to.GdsInptBean;
import com.seoul.his.log.inpt.to.SkillExmntHistBean;

public interface InptServiceFacade {

	// 물품검수 조회
	public List<CtrtInfoBean> findCtrtList();

	// 물품조회 (계약번호에 해당하는 계약상세정보 조회)
	public List<CtrtInfoDetailBean> findCtrtInfoDetailList(Map<String, String> queryMap);

	// 물품검수조회 (계약번호에 해당하는 검수내역 조회)
	public List<GdsInptBean> findGdsInptList(Map<String, String> queryMap);

	// 납품일조회 (계약번호에 해당하는 남품일 조회)
	public List<BuyDemdBean> findDelivDay(Map<String, String> queryMap);

	// 검수확인등록
	public void registerGdsInpt(List<GdsInptBean> gdsInptList, List<CtrtInfoBean> ctrtInfo);

	// 검수확인취소
	public void cancelGdsInpt(List<GdsInptBean> gdsInptList, List<CtrtInfoBean> ctrtInfo);

    // 기술검사조회
	public List<SkillExmntHistBean> findSkillExmntHistList(Map<String, String> queryMap);

    // 기술검사 일괄처리
	public void batchProcessSkillExmntHist(List<SkillExmntHistBean> skillExmntHisList, CtrtInfoBean ctrtInfoBean);
}
