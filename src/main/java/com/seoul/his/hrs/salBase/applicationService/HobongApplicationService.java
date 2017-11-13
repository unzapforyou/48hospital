package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salBase.to.HobongBean;
import com.seoul.his.hrs.salBase.to.HobongHistoryBean;
import com.seoul.his.hrs.salBase.to.JobBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    HobongApplicationService.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

public interface HobongApplicationService {
    /* 호봉 */
    public List<JobBean> findJobList();
    public List<HobongBean> findHobongList(Map<String, String> argsMap);
    public List<HobongHistoryBean> findHobongHistoryList(Map<String, String> argsMap);
    public void batchHobongProcess(List<HobongBean> hobongList);
    public void batchHobongHisProcess(List<HobongHistoryBean> hobongHisList);
}
