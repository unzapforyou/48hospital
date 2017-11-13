package com.seoul.his.log.inpt.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.log.inpt.dao.InptDAO;
import com.seoul.his.log.inpt.to.BuyDemdBean;
import com.seoul.his.log.inpt.to.CtrtInfoBean;
import com.seoul.his.log.inpt.to.CtrtInfoDetailBean;
import com.seoul.his.log.inpt.to.GdsInptBean;

@Component
public class InptApplicationServiceImpl implements InptApplicationService{

	@Autowired
	InptDAO inptDao;

	// 물품검수 조회
	@Override
	public List<CtrtInfoBean> findCtrtList() {
		return inptDao.selectCtrtList();
	}

	// 물품조회 (계약번호에 해당하는 계약상세정보 조회)
	@Override
	public List<CtrtInfoDetailBean> findCtrtInfoDetailList(Map<String, String> queryMap) {
		return inptDao.selectCtrtInfoDetailList(queryMap);
	}

	// 물품검수조회 (계약번호에 해당하는 검수내역 조회)
	@Override
	public List<GdsInptBean> findGdsInptList(Map<String, String> queryMap) {
		return inptDao.selectGdsInptList(queryMap);
	}

	// 납품일조회 (계약번호에 해당하는 남품일 조회)
	@Override
	public List<BuyDemdBean> findDelivDay(Map<String, String> queryMap) {
		return inptDao.selectDelivDay(queryMap);
	}

	// 검수확인등록, 검수여부변경
	@Override
	public void registerGdsInpt(List<GdsInptBean> gdsInptList, List<CtrtInfoBean> ctrtInfo) {
		for(GdsInptBean gdsInptBean : gdsInptList){
			switch (gdsInptBean.getStatus()) {
			case "insert" : inptDao.insertGdsInpt(gdsInptBean); break;
			}
		}
		for(CtrtInfoBean ctrtInfoBean : ctrtInfo){
			switch (ctrtInfoBean.getStatus()) {
			case "update" : inptDao.updateCtrtInfo(ctrtInfoBean); break;
			}
		}
	}

	// 검수확인취소, 검수여부변경
	@Override
	public void cancelGdsInpt(List<GdsInptBean> gdsInptList, List<CtrtInfoBean> ctrtInfo) {
		for(GdsInptBean gdsInptBean : gdsInptList){
			switch (gdsInptBean.getStatus()) {
			case "delete" : inptDao.deleteGdsInpt(gdsInptBean); break;
			}
		}
		for(CtrtInfoBean ctrtInfoBean : ctrtInfo){
			switch (ctrtInfoBean.getStatus()) {
			case "update" : inptDao.updateCtrtInfo(ctrtInfoBean); break;
			}
		}
	}

}
