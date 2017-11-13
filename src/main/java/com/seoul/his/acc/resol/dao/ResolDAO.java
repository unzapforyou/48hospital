package com.seoul.his.acc.resol.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.ResolLetBean;

/**
 * <pre>
 * com.seoul.his.acc.resol.dao.sqlMap
 *    |_ ResolDAO.java
 *
 * </pre>
 * @date : 2016. 12. 14. 오후 5:16:32
 * @version :
 * @author : 응디꿍디
 */

public interface ResolDAO {

	List<ResolLetBean> selectResolLetList(Map<String,String>argsMap);

	ResolLetBean selectResolLetDetail(Map<String, String> argsMap);

}





