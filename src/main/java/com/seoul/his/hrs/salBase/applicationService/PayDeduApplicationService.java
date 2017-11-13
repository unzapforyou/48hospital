package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salBase.to.PayDeduBean;
import com.seoul.his.hrs.salBase.to.PayDeduSectBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    PayDeduApplicationService.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

public interface PayDeduApplicationService {    
    /*지급공제항목설정*/
    public List<PayDeduBean> findPayDeduList(Map<String, String> argsMap);
    public void magamCancel(List<PayDeduBean> payDeduList);
    public void magam(List<PayDeduBean> payDeduList);
    public void batchPayDeduProcess(List<PayDeduBean> payDeduList);
    public void batchPayDeduSectProcess(List<PayDeduSectBean> payDeduSectList);
}
