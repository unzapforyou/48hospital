package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salBase.to.DeduChartBean;
import com.seoul.his.hrs.salBase.to.IncomeTaxSetBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    IncomeTaxSetApplicationService.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

public interface IncomeTaxSetApplicationService {   
    /*소득세액공제설정*/
    public List<IncomeTaxSetBean> findTaxChartList(Map<String, String> argsMap);
    public List<DeduChartBean> findDeduChartList(Map<String, String> argsMap);
    public void setTaxDeduCopy(int year);
    public void batchTaxChartProcess(List<IncomeTaxSetBean> taxList);
    public void batchDeductionChartProcess(List<DeduChartBean> deduChartList);
}
