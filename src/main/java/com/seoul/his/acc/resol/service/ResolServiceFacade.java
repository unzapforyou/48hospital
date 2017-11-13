package com.seoul.his.acc.resol.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.resol.to.AccountBean;
import com.seoul.his.acc.resol.to.AutoJourRuleBean;
import com.seoul.his.acc.resol.to.ResolLetBean;

/**
 * <pre>
 * com.seoul.his.acc.resol.service
 *    |_ ResolServiceFacade.java
 *
 * </pre>
 * @date : 2016. 12. 14. 오후 4:34:55
 * @version :
 * @author : 응디꿍디
 */

public interface ResolServiceFacade {

	List<ResolLetBean> findResolLetList(Map<String, String> argsMap);

	List<AccountBean> findAccount(Map<String, String> argsMap);

	ResolLetBean findResolLetDetail(Map<String, String> argsMap);

	List<AutoJourRuleBean> findAutoJourRuleList(Map<String, String> argsMap);

	String getResolNo();

	void registResolLet(HashMap<String, Object> dataSetMap);

	void batchResolLetProcess(HashMap<String, Object> dataSetMap);

}





