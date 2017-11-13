
package com.seoul.his.msv.pre.prescriptionmanagement.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.msv.pre.prescriptionmanagement.dao.FeeDAO;
import com.seoul.his.msv.pre.prescriptionmanagement.to.FeeBean;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.applicationService
 *    |_ FeeApplicationServiceImpl.java
 *
 * </pre>
 * @date : 2016. 12. 6. 오후 4:50:59
 * @version :
 * @author : User
 */

@Component
public class FeeApplicationServiceImpl implements FeeApplicationService{
	@Autowired
	FeeDAO feeDAO;

	 @Override
	    public List<FeeBean> findFeeListEMR(Map<String, String> argsMap) {
	        return feeDAO.selectFeeListEMR(argsMap);
	    }
}





