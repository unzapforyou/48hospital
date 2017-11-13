package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;

import com.seoul.his.hrs.salBase.to.SalStandardSetBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    SalStandardSetApplicationService.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

public interface SalStandardSetApplicationService {
    /*급여,근태 기준일설정*/
    List<SalStandardSetBean> findSalStandardList();
    void batchSalStanSetProcess(List<SalStandardSetBean> salStanList);
}
