package com.seoul.his.hrs.salBase.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.hrs.salBase.applicationService.HobongApplicationService;
import com.seoul.his.hrs.salBase.applicationService.IncomeTaxSetApplicationService;
import com.seoul.his.hrs.salBase.applicationService.PayDeduApplicationService;
import com.seoul.his.hrs.salBase.applicationService.PaydayApplicationService;
import com.seoul.his.hrs.salBase.applicationService.SalStandardSetApplicationService;
import com.seoul.his.hrs.salBase.applicationService.SocialInsuranceApplicationService;
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
 * @Class    SalBaseServiceFacadeImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

@Service
public class SalBaseServiceFacadeImpl implements SalBaseServiceFacade{
    @Autowired
    public  HobongApplicationService  hobongApplicationService;
    
    @Autowired
    public  IncomeTaxSetApplicationService  incomeTaxSetApplicationService;
    
    @Autowired
    public  PaydayApplicationService  paydayApplicationService;
    
    @Autowired
    public  PayDeduApplicationService  payDeduApplicationService;
    
    @Autowired
    public  SalStandardSetApplicationService  salStandardSetApplicationService;
    
    @Autowired
    public  SocialInsuranceApplicationService  socialInsuranceApplicationService;
    
    /*호봉*/
    @Override
    public List<JobBean> findJobList() {
        return hobongApplicationService.findJobList();
    }

    @Override
    public List<HobongBean> findHobongList(Map<String, String> argsMap) {
        return hobongApplicationService.findHobongList(argsMap);
    }

    @Override
    public List<HobongHistoryBean> findHobongHistoryList(Map<String, String> argsMap) {
        return hobongApplicationService.findHobongHistoryList(argsMap);
    }

    @Override
    public void batchHobongProcess(List<HobongBean> jobList) {
        hobongApplicationService.batchHobongProcess(jobList);
    }

    @Override
    public void batchHobongHisProcess(List<HobongHistoryBean> hobongHisList) {
        hobongApplicationService.batchHobongHisProcess(hobongHisList);
    }
    
    /* 소득세액공제설정 */
    @Override
    public List<IncomeTaxSetBean> findTaxChartList(Map<String, String> argsMap) {
        return incomeTaxSetApplicationService.findTaxChartList(argsMap);
    }

    @Override
    public List<DeduChartBean> findDeduChartList(Map<String, String> argsMap) {
        return incomeTaxSetApplicationService.findDeduChartList(argsMap);
    }

    @Override
    public void batchTaxChartProcess(List<IncomeTaxSetBean> taxList) {
        incomeTaxSetApplicationService.batchTaxChartProcess(taxList);
    }

    @Override
    public void batchDeductionChartProcess(List<DeduChartBean> deduChartList) {
        incomeTaxSetApplicationService.batchDeductionChartProcess(deduChartList);
    }

    @Override
    public void setTaxDeduCopy(int year) {
        incomeTaxSetApplicationService.setTaxDeduCopy(year);
    }
    
    /* 급상여지급일자관리 */
    @Override
    public List<PaydayBean> findPaydayList(Map<String, String> argsMap) {
        return paydayApplicationService.findPaydayList(argsMap);
    }

    @Override
    public List<PaydayBean> findPaydaySubList(Map<String, String> argsMap) {
        return paydayApplicationService.findPaydaySubList(argsMap);
    }

    @Override
    public void batchPaydayProcess(List<PaydayBean> paydayList){
        paydayApplicationService.batchPaydayProcess(paydayList);
    }

    /*지급공제항목설정*/
    @Override
    public List<PayDeduBean> findPayDeduList(Map<String, String> argsMap) {
        return payDeduApplicationService.findPayDeduList(argsMap);
    }

    @Override
    public void magamCancel(List<PayDeduBean> payDeduList) {
        payDeduApplicationService.magamCancel(payDeduList);
    }

    @Override
    public void magam(List<PayDeduBean> payDeduList) {
        payDeduApplicationService.magam(payDeduList);
    }

    @Override
    public void batchPayDeduProcess(List<PayDeduBean> payDeduList) {
        payDeduApplicationService.batchPayDeduProcess(payDeduList);
    }

    @Override
    public void batchPayDeduSectProcess(List<PayDeduSectBean> payDeduSectList) {
        payDeduApplicationService.batchPayDeduSectProcess(payDeduSectList);
    }
    
    /* 사회보험설정 */
    @Override
    public List<SocialInsureBean> findsocialInsureList(Map<String, String> argsMap) {
        return socialInsuranceApplicationService.findsocialInsureList(argsMap);
    }

    @Override
    public void batchSocialInsureProcess(Map<String, String> argsMap) {
        socialInsuranceApplicationService.batchSocialInsureProcess(argsMap);
    }
    
    /*급여근태기준일설정*/
    @Override
    public List<SalStandardSetBean> findSalStandardList() {
        return salStandardSetApplicationService.findSalStandardList();
    }

    @Override
    public void batchSalStanSetProcess(List<SalStandardSetBean> salStanList) {
        salStandardSetApplicationService.batchSalStanSetProcess(salStanList);
    }

}
