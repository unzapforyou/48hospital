package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.salBase.dao.SocialInsureDAO;
import com.seoul.his.hrs.salBase.to.SocialInsureBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    SalBaseApplicationServiceImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

@Component
public class SocialInsuranceApplicationServiceImpl implements SocialInsuranceApplicationService{

	@Autowired
	public SocialInsureDAO socialInsureDAO;

	/* 사회보험설정 */
	@Override
	public List<SocialInsureBean> findsocialInsureList(Map<String, String> argsMap) {
		return socialInsureDAO.findsocialInsureList(argsMap);
	}

	@Override
	public void batchSocialInsureProcess(Map<String, String> argsMap) {
		socialInsureDAO.insertSocialInsure(argsMap);
	}

}
