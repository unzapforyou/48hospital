package com.seoul.his.log.inpt.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.inpt.to.BuyDemdBean;
import com.seoul.his.log.inpt.to.CtrtInfoBean;
import com.seoul.his.log.inpt.to.CtrtInfoDetailBean;
import com.seoul.his.log.inpt.to.GdsInptBean;

public interface InptDAO {

	// 물품검수 조회
	public List<CtrtInfoBean> selectCtrtList();

	// 물품조회 (계약번호에 해당하는 계약상세정보 조회)
	public List<CtrtInfoDetailBean> selectCtrtInfoDetailList(Map<String, String> queryMap);

	// 물품검수조회 (계약번호에 해당하는 검수내역 조회)
	public List<GdsInptBean> selectGdsInptList(Map<String, String> queryMap);

	// 납품일조회 (계약번호에 해당하는 남품일 조회)
	public List<BuyDemdBean> selectDelivDay(Map<String, String> queryMap);

	// 검수확인등록
	public void insertGdsInpt(GdsInptBean gdsInptBean);

	// 검수여부변경
	public void updateCtrtInfo(CtrtInfoBean CtrtInfobean);

	// 검수확인취소
	public void deleteGdsInpt(GdsInptBean gdsInptBean);

	// 검수여부변경
	public void updateCtrtInfoY(CtrtInfoBean ctrtInfoBean);

	// 검수여부변경
    public void updateCtrtInfoN(CtrtInfoBean ctrtInfoBean);
}
