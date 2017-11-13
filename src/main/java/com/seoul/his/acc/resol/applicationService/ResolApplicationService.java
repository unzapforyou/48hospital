package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.AccountBean;
import com.seoul.his.acc.resol.to.ResolLetBean;

/**
 * <pre>
 * com.seoul.his.acc.resol.applicationService
 *    |_ ResolApplicationService.java
 *
 * </pre>
 * @date : 2016. 12. 14. 오후 5:13:31
 * @version :
 * @author : 응디꿍디
 */

public interface ResolApplicationService {

	List<ResolLetBean> findResolLetList(Map<String, String> argsMap);

	List<AccountBean> findAccount(Map<String, String> argsMap);

	ResolLetBean findResolLetDetail(Map<String, String> argsMap);

}





