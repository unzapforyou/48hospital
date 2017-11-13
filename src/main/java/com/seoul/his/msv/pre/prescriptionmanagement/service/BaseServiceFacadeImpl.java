
package com.seoul.his.msv.pre.prescriptionmanagement.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.pre.prescriptionmanagement.applicationService.FeeApplicationService;
import com.seoul.his.msv.pre.prescriptionmanagement.to.FeeBean;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.service
 *    |_ BaseServiceFacadeImpl.java
 *
 * </pre>
 * @date : 2016. 12. 6. 오후 4:55:19
 * @version :
 * @author : 백송은
 */


@Service
public class BaseServiceFacadeImpl implements BaseServiceFacade{
	@Autowired
    private FeeApplicationService feeApplicationService;

	 @Override
	    public List<FeeBean> findFeeListEMR(Map<String, String> argsMap) {
	        return feeApplicationService.findFeeListEMR(argsMap);
	    }
}





