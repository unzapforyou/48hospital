package com.seoul.his.hrs.ret.dao;

import java.util.Map;
import java.util.List;

import com.seoul.his.hrs.ret.to.RetPlanEmpBean;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.dao
 * @Class    RetPlanEmpDAO.java
 * @Create   2016. 6. 5.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */

public interface RetPlanEmpDAO {

	List<RetPlanEmpBean> selectRetPlanEmpList(Map<String, String> argsMap);
}
