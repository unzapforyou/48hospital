package com.seoul.his.hrs.ret.dao;

import java.util.Map;
import java.util.List;

import com.seoul.his.hrs.ret.to.RetEmpBean;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.dao
 * @Class    RetEmpDAO.java
 * @Create   2016. 6. 5.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */

public interface RetEmpDAO {

	List<RetEmpBean> selectRetEmpList(Map<String, String> argsMap);
}
