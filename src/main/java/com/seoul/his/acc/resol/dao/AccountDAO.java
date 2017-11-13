package com.seoul.his.acc.resol.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.AccountBean;
import com.seoul.his.acc.resol.to.ResolLetBean;

/**
 * <pre>
 * com.seoul.his.acc.resol.dao
 *    |_ AccountDAO.java
 *
 * </pre>
 * @date : 2016. 12. 15. 오후 7:08:28
 * @version :
 * @author : 응디꿍디
 */

public interface AccountDAO {
	List<AccountBean> selectAccount(Map<String,String>argsMap);
}





