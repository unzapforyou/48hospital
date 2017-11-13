package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.seoul.his.acc.resol.dao.AccountDAO;
import com.seoul.his.acc.resol.dao.ResolDAO;
import com.seoul.his.acc.resol.to.AccountBean;
import com.seoul.his.acc.resol.to.ResolLetBean;

/**
 * <pre>
 * com.seoul.his.acc.resol.applicationService
 *    |_ ResolApplicationServiceImpl.java
 *
 * </pre>
 *
 * @date : 2016. 12. 14. 오후 5:13:49
 * @version :
 * @author : 응디꿍디
 */
@Component
public class ResolApplicationServiceImpl implements ResolApplicationService {
	@Autowired
	ResolDAO resolDAO;
	@Autowired
	AccountDAO accountDAO;

	@Override
	public List<ResolLetBean> findResolLetList(Map<String, String> argsMap) {
		List<ResolLetBean> resolLetBeanList = resolDAO.selectResolLetList(argsMap);
		return resolLetBeanList;
	}

	@Override
	public List<AccountBean> findAccount(Map<String, String> argsMap) {
		List<AccountBean> accountBeanList = accountDAO.selectAccount(argsMap);
		return accountBeanList;
	}

	@Override
	public ResolLetBean findResolLetDetail(Map<String, String> argsMap) {
		ResolLetBean resolLetDetail = resolDAO.selectResolLetDetail(argsMap);
		return resolLetDetail;
	}

}
