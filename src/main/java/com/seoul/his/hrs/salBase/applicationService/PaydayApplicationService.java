package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salBase.to.PaydayBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    PaydayApplicationService.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

public interface PaydayApplicationService {   
    /*급상여지급일자관리*/
    public List<PaydayBean> findPaydayList(Map<String, String> argsMap);
    public List<PaydayBean> findPaydaySubList(Map<String, String> argsMap);
    public void batchPaydayProcess(List<PaydayBean> paydayList);
}
