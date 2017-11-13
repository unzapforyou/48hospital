package com.seoul.his.hrs.salBase.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salBase.to.DeduChartBean;
import com.seoul.his.hrs.salBase.to.HobongBean;
import com.seoul.his.hrs.salBase.to.HobongHistoryBean;
import com.seoul.his.hrs.salBase.to.IncomeTaxSetBean;
import com.seoul.his.hrs.salBase.to.JobBean;
import com.seoul.his.hrs.salBase.to.PayDeduBean;
import com.seoul.his.hrs.salBase.to.PayDeduSectBean;
import com.seoul.his.hrs.salBase.to.PaydayBean;
import com.seoul.his.hrs.salBase.to.SalStandardSetBean;
import com.seoul.his.hrs.salBase.to.SocialInsureBean;

/**
 * @Package  com.seoul.his.hrs.salBase.service
 * @Class    SalBaseServiceFacade.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

public interface SalBaseServiceFacade {
    /* 호봉 */
    public List<JobBean> findJobList();
    public List<HobongBean> findHobongList(Map<String, String> argsMap);
    public List<HobongHistoryBean> findHobongHistoryList(Map<String, String> argsMap);
    public void batchHobongProcess(List<HobongBean> hobongList);
    public void batchHobongHisProcess(List<HobongHistoryBean> hobongHisList);

    /* 소득.세액환경설정 */
    public List<IncomeTaxSetBean> findTaxChartList(Map<String, String> argsMap);
    public List<DeduChartBean> findDeduChartList(Map<String, String> argsMap);
    public void setTaxDeduCopy(int year);
    public void batchTaxChartProcess(List<IncomeTaxSetBean> taxList);
    public void batchDeductionChartProcess(List<DeduChartBean> deduChartList);
    
    /* 급상여지급일자관리 */
    public List<PaydayBean> findPaydayList(Map<String, String> argsMap);
    public List<PaydayBean> findPaydaySubList(Map<String, String> argsMap);
    public void batchPaydayProcess(List<PaydayBean> paydayList);
    
    /*지급공제항목설정*/
    public List<PayDeduBean> findPayDeduList(Map<String, String> argsMap);
    public void magamCancel(List<PayDeduBean> payDeduList);
    public void magam(List<PayDeduBean> payDeduList);
    public void batchPayDeduProcess(List<PayDeduBean> payDeduList);
    public void batchPayDeduSectProcess(List<PayDeduSectBean> payDeduSectList);
    
    /*사회보험설정*/
    public List<SocialInsureBean> findsocialInsureList(Map<String, String> argsMap);
    public void batchSocialInsureProcess(Map<String, String> argsMap);
    
    /*급여근태기준일설정*/
    List<SalStandardSetBean> findSalStandardList();
    void batchSalStanSetProcess(List<SalStandardSetBean> salStanList);

}
