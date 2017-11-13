package com.seoul.his.acc.fixedasset.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.fixedasset.applicationService.FixedAssetApplicationService;
import com.seoul.his.acc.fixedasset.exception.assetMonthDepreNotFinish;
import com.seoul.his.acc.fixedasset.exception.assetYearDepreFinish;
import com.seoul.his.acc.fixedasset.to.DepreRateBean;
import com.seoul.his.acc.fixedasset.to.DisposalPlnFixedAssetBean;
import com.seoul.his.acc.fixedasset.to.DisposalRegBean;
import com.seoul.his.acc.fixedasset.to.DisposalSellValueBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetCdDtlBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetMovBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetSequenceBean;
import com.seoul.his.acc.fixedasset.to.MonthDepreBean;
import com.seoul.his.acc.fixedasset.to.YearDepreBean;

/**
 * @Package  com.seoul.his.acc.fixedasset.service
 * @Class    FixedAssetServiceFacadeImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Service
public class FixedAssetServiceFacadeImpl implements FixedAssetServiceFacade{
    @Autowired
    FixedAssetApplicationService fixedAssetApplicationService;
    
    @Override
    public FixedAssetSequenceBean findMaxAssetNo() {
        return fixedAssetApplicationService.findMaxAssetNo();
    }

    @Override
    public List<FixedAssetCdDtlBean> findUsingFixedAssetCdDtlList() {
        return fixedAssetApplicationService.findUsingFixedAssetCdDtlList();
    }

    @Override
    public List<DepreRateBean> findDepreRateList() {
        return fixedAssetApplicationService.findDepreRateList();
    }

    @Override
    public List<FixedAssetBean> findFixedAssetList(Map<String, String> argsMap) {
        return fixedAssetApplicationService.findFixedAssetList(argsMap);
    }

    @Override
    public FixedAssetBean findFixedAsset(Map<String, String> argsMap) {
        return fixedAssetApplicationService.findFixedAsset(argsMap);
    }

    @Override
    public List<YearDepreBean> findFixedAssetYearDepreList(Map<String, String> argsMap) {
        return fixedAssetApplicationService.findFixedAssetYearDepreList(argsMap);
    }

    @Override
    public HashMap<String, Object> findFixedAssetGrpCdList() {
        return fixedAssetApplicationService.findFixedAssetGrpCdList();
    }

    @Override
    public void batchFixedAssetProcess(List<FixedAssetBean> fixedAssetBeanList) {
        fixedAssetApplicationService.batchFixedAssetProcess(fixedAssetBeanList);
    }

    @Override
    public List<FixedAssetMovBean> findFixedAssetMovList() {
        return fixedAssetApplicationService.findFixedAssetMovList();
    }

    @Override
    public void batchFixedAssetMovProcess(List<FixedAssetMovBean> fixedAssetMovBeanList) {
        fixedAssetApplicationService.batchFixedAssetMovProcess(fixedAssetMovBeanList);
    }

    @Override
    public void batchFixedAssetGrpCdProcess(HashMap<String, Object> fixedAssetGrpCdMap) {
        fixedAssetApplicationService.batchFixedAssetGrpCdProcess(fixedAssetGrpCdMap);
    }

    @Override
    public HashMap<String, Object> findFixedAssetCdList() {
        return fixedAssetApplicationService.findFixedAssetCdList();
    }

    @Override
    public void batchFixedAssetCdProcess(HashMap<String, Object> fixedAssetCdMap) {
        fixedAssetApplicationService.batchFixedAssetCdProcess(fixedAssetCdMap);
    }
    
    @Override
    public List<DisposalRegBean> findDisposalFixedAssetList(Map<String, String> argsMap){
         return fixedAssetApplicationService.findDisposalFixedAssetList(argsMap);
    }
    
    @Override
    public List<DisposalPlnFixedAssetBean> findDisposalPlnFixedAssetList(Map<String, String> argsMap){
         return fixedAssetApplicationService.findDisposalPlnFixedAssetList(argsMap);
    }

    @Override
    public List<FixedAssetSequenceBean> findDisposalPlnFixedAssetNo(){
         return fixedAssetApplicationService.findDisposalPlnFixedAssetNo();
    }
    
    @Override
    public void batchDisposalPlnFixedAssetProcess(List<DisposalPlnFixedAssetBean> disposalPlnFixedAssetBeanList){
        fixedAssetApplicationService.batchDisposalPlnFixedAssetProcess(disposalPlnFixedAssetBeanList);
    }
    
    @Override
    public HashMap<String, Object> findFixedAssetMonthDepreList(HashMap<String, Object> argsMap){
         return fixedAssetApplicationService.findFixedAssetMonthDepreList(argsMap);
    }
    
    @Override
    public void modifyFixedAssetMonthDepre(List<MonthDepreBean> monthDepreBeanList) throws assetYearDepreFinish{
        fixedAssetApplicationService.modifyFixedAssetMonthDepre(monthDepreBeanList);
    }
    
    @Override
    public HashMap<String, Object> findFixedAssetYearDepreDtlList(HashMap<String, Object> argsMap){
        return fixedAssetApplicationService.findFixedAssetYearDepreDtlList(argsMap);
   }
    
    @Override
    public void modifyFixedAssetYearDepre(List<YearDepreBean> yearDepreBeanList) throws assetMonthDepreNotFinish{
        fixedAssetApplicationService.modifyFixedAssetYearDepre(yearDepreBeanList);
    }
    
    @Override
    public DisposalSellValueBean findDisposalSellValue(DisposalSellValueBean inDisposalSellValueBean){
         return fixedAssetApplicationService.findDisposalSellValue(inDisposalSellValueBean);
    }
    
    @Override
    public void batchDisposalFixedAssetProcess(List<DisposalRegBean> disposalRegBeanList){
        fixedAssetApplicationService.batchDisposalFixedAssetProcess(disposalRegBeanList);
    }
}
