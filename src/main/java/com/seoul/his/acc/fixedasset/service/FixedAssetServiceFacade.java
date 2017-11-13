package com.seoul.his.acc.fixedasset.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public interface FixedAssetServiceFacade {

    FixedAssetSequenceBean findMaxAssetNo();

    List<FixedAssetCdDtlBean> findUsingFixedAssetCdDtlList();

    List<DepreRateBean> findDepreRateList();

    List<FixedAssetBean> findFixedAssetList(Map<String, String> argsMap);

    FixedAssetBean findFixedAsset(Map<String, String> argsMap);

    List<YearDepreBean> findFixedAssetYearDepreList(Map<String, String> argsMap);

    HashMap<String, Object> findFixedAssetGrpCdList();

    void batchFixedAssetProcess(List<FixedAssetBean> fixedAssetBeanList);

    List<FixedAssetMovBean> findFixedAssetMovList();

    void batchFixedAssetMovProcess(List<FixedAssetMovBean> fixedAssetMovBeanList);

    void batchFixedAssetGrpCdProcess(HashMap<String, Object> fixedAssetGrpCdMap);

    HashMap<String, Object> findFixedAssetCdList();

    void batchFixedAssetCdProcess(HashMap<String, Object> fixedAssetCdMap);
    
    public List<DisposalRegBean> findDisposalFixedAssetList(Map<String, String> argsMap);
    
    public List<DisposalPlnFixedAssetBean> findDisposalPlnFixedAssetList(Map<String, String> argsMap);
    
    public List<FixedAssetSequenceBean> findDisposalPlnFixedAssetNo();
    
    public void batchDisposalPlnFixedAssetProcess(List<DisposalPlnFixedAssetBean> disposalPlnFixedAssetBeanList);

    public HashMap<String, Object> findFixedAssetMonthDepreList(HashMap<String, Object> argsMap);
    
    public void modifyFixedAssetMonthDepre(List<MonthDepreBean> monthDepreBeanList) throws assetYearDepreFinish;
    
    public HashMap<String, Object> findFixedAssetYearDepreDtlList(HashMap<String, Object> argsMap);
    
    public void modifyFixedAssetYearDepre(List<YearDepreBean> yearDepreBeanList) throws assetMonthDepreNotFinish;
    
    public DisposalSellValueBean findDisposalSellValue(DisposalSellValueBean inDisposalSellValueBean);
    
    public void batchDisposalFixedAssetProcess(List<DisposalRegBean> disposalRegBeanList);
}
