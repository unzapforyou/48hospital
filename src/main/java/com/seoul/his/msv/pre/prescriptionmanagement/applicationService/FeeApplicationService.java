
package com.seoul.his.msv.pre.prescriptionmanagement.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.pre.prescriptionmanagement.to.FeeBean;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.applicationService
 *    |_ FeeApplicationService.java
 *
 * </pre>
 * @date : 2016. 12. 6. 오후 4:50:19
 * @version :
 * @author : 백송은
 */


public interface FeeApplicationService {
	List<FeeBean> findFeeListEMR(Map<String, String> argsMap);
}





