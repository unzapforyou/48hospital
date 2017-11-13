package com.seoul.his.acc.resol.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.resol.applicationService.AppendFileApplicationService;
import com.seoul.his.acc.resol.applicationService.JourApplicationService;
import com.seoul.his.acc.resol.applicationService.PayRecApplicationService;
import com.seoul.his.acc.resol.applicationService.ResolApplicationService;
import com.seoul.his.acc.resol.to.AccountBean;
import com.seoul.his.acc.resol.to.AppendFileBean;
import com.seoul.his.acc.resol.to.AutoJourRuleBean;
import com.seoul.his.acc.resol.to.JourBean;
import com.seoul.his.acc.resol.to.PayRecBean;
import com.seoul.his.acc.resol.to.ResolLetBean;

/**
 * <pre>
 * com.seoul.his.acc.resol.service
 *    |_ ResolServiceFacadeImpl.java
 *
 * </pre>
 *
 * @date : 2016. 12. 14. 오후 4:35:06
 * @version :
 * @author : 응디꿍디
 */
@Service
public class ResolServiceFacadeImpl implements ResolServiceFacade {
	@Autowired
	ResolApplicationService resolApplicationService;
	@Autowired
	AppendFileApplicationService appendFileApplicationService;
	@Autowired
	JourApplicationService jourApplicationService;
	@Autowired
	PayRecApplicationService payRecApplicationService;

	@Override
	public List<ResolLetBean> findResolLetList(Map<String, String> argsMap) {
		List<ResolLetBean> resolLetBean = resolApplicationService.findResolLetList(argsMap);
		return resolLetBean;
	}

	@Override
	public List<AccountBean> findAccount(Map<String, String> argsMap) {
		List<AccountBean> accountList = resolApplicationService.findAccount(argsMap);
		return accountList;
	}

	@Override
	public ResolLetBean findResolLetDetail(Map<String, String> argsMap) {
		  ResolLetBean resolLetBean = new ResolLetBean();
	        List<JourBean> jourList = jourApplicationService.findJourRecDetail(argsMap);
	        List<PayRecBean> payRecList = payRecApplicationService.findPayRecDetail(argsMap);
	        List<AppendFileBean> appendFileList = appendFileApplicationService.findAppendFileDetail(argsMap);
	        resolLetBean.setJourList(jourList);
	        resolLetBean.setPayRecList(payRecList);
	        resolLetBean.setAppendFileList(appendFileList);
	        return resolLetBean;
	}

	@Override
	public List<AutoJourRuleBean> findAutoJourRuleList(
			Map<String, String> argsMap) {
		return null;
	}

	@Override
	public String getResolNo() {
		return null;
	}

	@Override
	public void registResolLet(HashMap<String, Object> dataSetMap) {
	}

	@Override
	public void batchResolLetProcess(HashMap<String, Object> dataSetMap) {
	}
}
