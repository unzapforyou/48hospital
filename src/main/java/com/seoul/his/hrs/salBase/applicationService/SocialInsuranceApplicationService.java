package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salBase.to.SocialInsureBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    SocialInsuranceApplicationService.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

public interface SocialInsuranceApplicationService {
    /*사회보험설정*/
    public List<SocialInsureBean> findsocialInsureList(Map<String, String> argsMap);
    public void batchSocialInsureProcess(Map<String, String> argsMap);
}
