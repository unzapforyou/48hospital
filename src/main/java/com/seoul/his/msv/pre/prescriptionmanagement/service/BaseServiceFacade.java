
package com.seoul.his.msv.pre.prescriptionmanagement.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.pre.prescriptionmanagement.to.FeeBean;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.service
 *    |_ BaseServiceFacade.java
 *
 * </pre>
 * @date : 2016. 12. 6. 오후 4:53:45
 * @version :
 * @author : 백송은
 */



public interface BaseServiceFacade {
	List<FeeBean> findFeeListEMR(Map<String, String> argsMap);
}





