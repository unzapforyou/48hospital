
package com.seoul.his.msv.pre.prescriptionmanagement.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.pre.prescriptionmanagement.to.FeeBean;


/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.dao
 *    |_ FeeDAO.java
 *
 * </pre>
 * @date : 2016. 12. 6. 오후 4:48:59
 * @version :
 * @author : User
 */


public interface FeeDAO {
	public List<FeeBean> selectFeeListEMR(Map<String, String> argsMap);
}





