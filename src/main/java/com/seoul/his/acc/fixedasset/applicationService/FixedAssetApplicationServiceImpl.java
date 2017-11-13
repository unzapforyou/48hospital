package com.seoul.his.acc.fixedasset.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.fixedasset.dao.FixedAssetCdDAO;
import com.seoul.his.acc.fixedasset.dao.FixedAssetDAO;
import com.seoul.his.acc.fixedasset.dao.FixedAssetDepreDAO;
import com.seoul.his.acc.fixedasset.dao.FixedAssetDisposalDAO;
import com.seoul.his.acc.fixedasset.dao.FixedAssetGrpCdDAO;
import com.seoul.his.acc.fixedasset.dao.FixedAssetMovDAO;
import com.seoul.his.acc.fixedasset.exception.assetMonthDepreNotFinish;
import com.seoul.his.acc.fixedasset.exception.assetYearDepreFinish;
import com.seoul.his.acc.fixedasset.to.DepreRateBean;
import com.seoul.his.acc.fixedasset.to.DisposalPlnFixedAssetBean;
import com.seoul.his.acc.fixedasset.to.DisposalRegBean;
import com.seoul.his.acc.fixedasset.to.DisposalSellValueBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetCdBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetCdDtlBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetLgGrpCdBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetMidGrpCdBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetMovBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetSequenceBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetSmGrpCdBean;
import com.seoul.his.acc.fixedasset.to.MonthDepreBean;
import com.seoul.his.acc.fixedasset.to.YearDepreBean;

/**
 * @Package  com.seoul.his.acc.fixedasset.applicationService
 * @Class    FixedAssetApplicationServiceImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Service
public class FixedAssetApplicationServiceImpl implements FixedAssetApplicationService{

    @Autowired
    FixedAssetDAO fixedAssetDAO;
    @Autowired
    FixedAssetCdDAO fixedAssetCdDAO;
    @Autowired
    FixedAssetDepreDAO fixedAssetDepreDAO;
    @Autowired
    FixedAssetGrpCdDAO fixedAssetGrpCdDAO;
    @Autowired
    FixedAssetMovDAO fixedAssetMovDAO;
    @Autowired
    FixedAssetDisposalDAO fixedAssetDisposalDAO;
    
    @Override
    public FixedAssetSequenceBean findMaxAssetNo() {
        return fixedAssetDAO.selectMaxAssetNo();
    }

    @Override
    public List<FixedAssetCdDtlBean> findUsingFixedAssetCdDtlList() {
        return fixedAssetCdDAO.selectUsingFixedAssetCdDtlList();
    }

    @Override
    public List<DepreRateBean> findDepreRateList() {
        return fixedAssetDepreDAO.selectDepreRateList();
    }

    @Override
    public List<FixedAssetBean> findFixedAssetList(Map<String, String> argsMap) {
        return fixedAssetDAO.selectFixedAssetList(argsMap);
    }

    @Override
    public FixedAssetBean findFixedAsset(Map<String, String> argsMap) {
        return fixedAssetDAO.selectFixedAsset(argsMap);
    }

    @Override
    public List<YearDepreBean> findFixedAssetYearDepreList(Map<String, String> argsMap) {
        return fixedAssetDepreDAO.selectFixedAssetYearDepreList(argsMap);
    }

    @Override
    public HashMap<String, Object> findFixedAssetGrpCdList() {
        HashMap<String, Object> fixedAssetGrpCdMap = new HashMap<String, Object>(); 
        fixedAssetGrpCdMap.put("fixedAssetLgGrpCdList", fixedAssetGrpCdDAO.selectFixedAssetLgGrpCdList());
        fixedAssetGrpCdMap.put("fixedAssetMidGrpCdList", fixedAssetGrpCdDAO.selectFixedAssetMidGrpCdList());
        fixedAssetGrpCdMap.put("fixedAssetSmGrpCdList", fixedAssetGrpCdDAO.selectFixedAssetSmGrpCdList());
        return fixedAssetGrpCdMap;
    }

    @Override
    public void batchFixedAssetProcess(List<FixedAssetBean> fixedAssetBeanList) {
        for (FixedAssetBean fixedAssetBean : fixedAssetBeanList) {
            switch ( fixedAssetBean.getStatus() ){
                case "inserted" : { fixedAssetDAO.insertFixedAsset(fixedAssetBean);
                                    fixedAssetDepreDAO.callFixedAssetDepre(fixedAssetBean);
                                    break; }
                case "deleted" : { fixedAssetDAO.deleteFixedAsset(fixedAssetBean); break; }
                case "updated" : { fixedAssetDAO.updateFixedAsset(fixedAssetBean); break; }
            }
        }
    }

    @Override
    public List<FixedAssetMovBean> findFixedAssetMovList() {
        return fixedAssetMovDAO.selectFixedAssetMovList();
    }

    @Override
    public void batchFixedAssetMovProcess(List<FixedAssetMovBean> fixedAssetMovBeanList) {
        FixedAssetBean fixedAssetBean = new FixedAssetBean();
        int flag = 0;
        for(FixedAssetMovBean fixedAssetMovBean : fixedAssetMovBeanList){
            fixedAssetBean.setAssetNo(fixedAssetMovBean.getAssetNo());
            fixedAssetBean.setMngntCd(fixedAssetMovBean.getMngntCd());
            fixedAssetBean.setOwnDept(fixedAssetMovBean.getOwnDept());
            fixedAssetBean.setPstLoc(fixedAssetMovBean.getPstLoc());
            fixedAssetBean.setRespoWorker(fixedAssetMovBean.getRespoWorker());
            switch ( fixedAssetMovBean.getStatus() ){
                case "inserted" : { 
                    fixedAssetMovDAO.insertFixedAssetMov(fixedAssetMovBean);
                    fixedAssetDAO.updateFixedAssetForMov(fixedAssetBean);
                    flag = 1;
                    break; 
                }
                case "deleted" : { 
                    fixedAssetMovDAO.deleteFixedAssetMov(fixedAssetMovBean); 
                    break; 
                }
                case "updated" : { 
                    fixedAssetMovDAO.updateFixedAssetMov(fixedAssetMovBean); 
                    if (flag == 0) {
                        fixedAssetDAO.updateFixedAssetForMov(fixedAssetBean);
                    }
                    break; 
                }
            }   
            
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void batchFixedAssetGrpCdProcess(HashMap<String, Object> fixedAssetGrpCdMap) {
        FixedAssetMidGrpCdBean tmpFixedAssetMidGrpCdBean = new FixedAssetMidGrpCdBean();
        FixedAssetSmGrpCdBean tmpFixedAssetSmGrpCdBean = new FixedAssetSmGrpCdBean();
        List<FixedAssetLgGrpCdBean> fixedAssetLgGrpCdBeanList =(List<FixedAssetLgGrpCdBean>) fixedAssetGrpCdMap.get("fixedListLgGrpCdList");
        List<FixedAssetMidGrpCdBean> fixedAssetMidGrpCdBeanList =(List<FixedAssetMidGrpCdBean>) fixedAssetGrpCdMap.get("fixedListMidGrpCdList");
        List<FixedAssetSmGrpCdBean> fixedAssetSmGrpCdBeanList =(List<FixedAssetSmGrpCdBean>) fixedAssetGrpCdMap.get("fixedListSmGrpCdList");
        for(FixedAssetLgGrpCdBean fixedAssetLgGrpCdBean : fixedAssetLgGrpCdBeanList ){
                switch ( fixedAssetLgGrpCdBean.getStatus() ){
                    case "inserted" : { 
                        fixedAssetGrpCdDAO.insertFixedAssetLgGrpCd(fixedAssetLgGrpCdBean); 
                        break; 
                    }
                    case "deleted" : { 
                        tmpFixedAssetSmGrpCdBean.setLgGrpCd(fixedAssetLgGrpCdBean.getLgGrpCd());
                        fixedAssetGrpCdDAO.deleteFixedAssetSmGrpCd(tmpFixedAssetSmGrpCdBean);
                        tmpFixedAssetMidGrpCdBean.setLgGrpCd(fixedAssetLgGrpCdBean.getLgGrpCd());
                        fixedAssetGrpCdDAO.deleteFixedAssetMidGrpCd(tmpFixedAssetMidGrpCdBean);
                        fixedAssetGrpCdDAO.deleteFixedAssetLgGrpCd(fixedAssetLgGrpCdBean); 
                        break; 
                    }
                    case "updated" : { 
                        fixedAssetGrpCdDAO.updateFixedAssetLgGrpCd(fixedAssetLgGrpCdBean);
                        break; 
                    }
                }
            }
        for(FixedAssetMidGrpCdBean fixedAssetMidGrpCdBean : fixedAssetMidGrpCdBeanList){
                switch ( fixedAssetMidGrpCdBean.getStatus() ){
                    case "inserted" : { 
                        fixedAssetGrpCdDAO.insertFixedAssetMidGrpCd(fixedAssetMidGrpCdBean); 
                        break; 
                    }
                    case "deleted" : { 
                        tmpFixedAssetSmGrpCdBean.setLgGrpCd(fixedAssetMidGrpCdBean.getLgGrpCd());
                        tmpFixedAssetSmGrpCdBean.setMidGrpCd(fixedAssetMidGrpCdBean.getMidGrpCd());
                        fixedAssetGrpCdDAO.deleteFixedAssetSmGrpCd(tmpFixedAssetSmGrpCdBean);
                        fixedAssetGrpCdDAO.deleteFixedAssetMidGrpCd(fixedAssetMidGrpCdBean);
                        break;
                    }
                    case "updated" : { 
                        fixedAssetGrpCdDAO.updateFixedAssetMidGrpCd(fixedAssetMidGrpCdBean); 
                        break;
                    }
                }
            }
        for(FixedAssetSmGrpCdBean fixedAssetSmGrpCdBean : fixedAssetSmGrpCdBeanList){
            switch ( fixedAssetSmGrpCdBean.getStatus() ){
                case "inserted" : { 
                    fixedAssetGrpCdDAO.insertFixedAssetSmGrpCd(fixedAssetSmGrpCdBean); 
                    break; 
                }
                case "deleted" : {
                    fixedAssetGrpCdDAO.deleteFixedAssetSmGrpCd(fixedAssetSmGrpCdBean); 
                    break;
                }
                case "updated" : { 
                    fixedAssetGrpCdDAO.updateFixedAssetSmGrpCd(fixedAssetSmGrpCdBean); 
                    break;
                }
            }
        }
    }

    @Override
    public HashMap<String, Object> findFixedAssetCdList() {
        HashMap<String, Object> fixedAssetCdMap = new HashMap<String, Object>();    
        fixedAssetCdMap.put("fixedAssetCdList", fixedAssetCdDAO.selectFixedAssetCdList());
        fixedAssetCdMap.put("fixedAssetCdDtlList", fixedAssetCdDAO.selectFixedAssetCdDtlList());
        return fixedAssetCdMap;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void batchFixedAssetCdProcess(HashMap<String, Object> fixedAssetCdMap) {
        FixedAssetCdDtlBean tmpFixedAssetCdDtlBean = new FixedAssetCdDtlBean(); 
        List<FixedAssetCdBean> fixedAssetCdBeanList =(List<FixedAssetCdBean>) fixedAssetCdMap.get("fixedAssetCdList");
        List<FixedAssetCdDtlBean> fixedAssetCdDtlBeanList =(List<FixedAssetCdDtlBean>) fixedAssetCdMap.get("fixedAssetCdDtlList");
        for(FixedAssetCdBean fixedAssetCdBean : fixedAssetCdBeanList ){
            switch ( fixedAssetCdBean.getStatus() ){
                case "inserted" : { 
                    fixedAssetCdDAO.insertFixedAssetCd(fixedAssetCdBean); 
                    break; 
                }
                case "deleted" : { 
                    tmpFixedAssetCdDtlBean.setFixedAssetCd(fixedAssetCdBean.getFixedAssetCd());
                    fixedAssetCdDAO.deleteFixedAssetCdDtl(tmpFixedAssetCdDtlBean);
                    fixedAssetCdDAO.deleteFixedAssetCd(fixedAssetCdBean);
                    break;
                }
                case "updated" : { 
                    fixedAssetCdDAO.updateFixedAssetCd(fixedAssetCdBean); 
                    break; 
                }
            }
        }
        for(FixedAssetCdDtlBean fixedAssetCdDtlBean : fixedAssetCdDtlBeanList){
            switch ( fixedAssetCdDtlBean.getStatus() ){
                case "inserted" : { 
                    fixedAssetCdDAO.insertFixedAssetCdDtl(fixedAssetCdDtlBean); 
                    break; 
                }
                case "deleted" : { 
                    fixedAssetCdDAO.deleteFixedAssetCdDtl(fixedAssetCdDtlBean); 
                    break; 
                }
                case "updated" : { 
                    fixedAssetCdDAO.updateFixedAssetCdDtl(fixedAssetCdDtlBean); 
                    break;
                }
            }
        }
    }
    
    @Override
    public List<DisposalRegBean> findDisposalFixedAssetList(Map<String, String> argsMap){
         return fixedAssetDisposalDAO.selectDisposalFixedAssetList(argsMap);
    }
    
    @Override
    public List<DisposalPlnFixedAssetBean> findDisposalPlnFixedAssetList(Map<String, String> argsMap){
         return fixedAssetDisposalDAO.selectDisposalPlnFixedAssetList(argsMap);
    }
    
    @Override
    public List<FixedAssetSequenceBean> findDisposalPlnFixedAssetNo(){
         return fixedAssetDisposalDAO.selectDisposalPlnFixedAssetNo();
    }
    
    @Override
    public void batchDisposalPlnFixedAssetProcess(List<DisposalPlnFixedAssetBean> disposalPlnFixedAssetBeanList){
        for(DisposalPlnFixedAssetBean disposalPlnFixedAssetBean : disposalPlnFixedAssetBeanList){
            switch ( disposalPlnFixedAssetBean.getStatus() ){
                case "inserted" : { fixedAssetDisposalDAO.insertDisposalPlnFixedAsset(disposalPlnFixedAssetBean); break; }
                case "deleted" : { fixedAssetDisposalDAO.deleteDisposalPlnFixedAsset(disposalPlnFixedAssetBean); break; }
                case "updated" : { fixedAssetDisposalDAO.updateDisposalPlnFixedAsset(disposalPlnFixedAssetBean); break; }
            }   
            
        }
    }
    
    @Override
    public HashMap<String, Object> findFixedAssetMonthDepreList(HashMap<String, Object> argsMap){
        HashMap<String, Object> fixedAssetMonthDepreMap = new HashMap<String, Object>();    
        fixedAssetMonthDepreMap.put("fixedAssetMonthDepreList",fixedAssetDepreDAO.selectFixedAssetMonthDepreList(argsMap));
        fixedAssetMonthDepreMap.put("fixedAssetMonthDepreYmList", fixedAssetDepreDAO.selectFixedAssetMonthDepreYmList(argsMap));
        return fixedAssetMonthDepreMap;
    }
    
    @Override
    public void modifyFixedAssetMonthDepre(List<MonthDepreBean> monthDepreBeanList) throws assetYearDepreFinish{
        for(MonthDepreBean monthDepreBean : monthDepreBeanList){
            switch ( monthDepreBean.getStatus() ){
                case "updated" : { 
                     fixedAssetDepreDAO.callFixedAssetMonthDepreDline(monthDepreBean); 
                     if(monthDepreBean.getErrorCode().equals("-1")){
                         throw new assetYearDepreFinish(monthDepreBean.getErrorMsg());
                     }
                    break; }
            }
        }
    }
    
    @Override
    public HashMap<String, Object> findFixedAssetYearDepreDtlList(HashMap<String, Object> argumentMap){
        HashMap<String, Object> fixedAssetYearDepreMap = new HashMap<String, Object>();
        fixedAssetYearDepreMap.put("fixedAssetYearDepreList",fixedAssetDepreDAO.selectFixedAssetYearDepreDtlList(argumentMap));
        fixedAssetYearDepreMap.put("fixedAssetYearDepreYearList", fixedAssetDepreDAO.selectFixedAssetYearDepreYearList(argumentMap));
        return fixedAssetYearDepreMap;
    }
    
    @Override
    public void modifyFixedAssetYearDepre(List<YearDepreBean> yearDepreBeanList) throws assetMonthDepreNotFinish{
        for(YearDepreBean yearDepreBean : yearDepreBeanList){
            switch ( yearDepreBean.getStatus() ){
                case "updated" : { 
                     fixedAssetDepreDAO.callFixedAssetYearDepreDline(yearDepreBean); 
                     if(yearDepreBean.getErrorCode().equals("-1")){
                         throw new assetMonthDepreNotFinish(yearDepreBean.getErrorMsg());
                     }
                    break; }
            }
        }
    }
    
    @Override
    public DisposalSellValueBean findDisposalSellValue(DisposalSellValueBean inDisposalSellValueBean){
         fixedAssetDisposalDAO.callDisposalSellValue(inDisposalSellValueBean);
         return inDisposalSellValueBean;
    }
    
    @Override
    public void batchDisposalFixedAssetProcess(List<DisposalRegBean> disposalRegBeanList){
        DisposalPlnFixedAssetBean disposalPlnFixedAssetBean = new DisposalPlnFixedAssetBean();
        FixedAssetBean fixedAssetBean = new FixedAssetBean();
        for(DisposalRegBean disposalRegBean : disposalRegBeanList){
            switch ( disposalRegBean.getStatus() ){
                case "inserted" : { fixedAssetDisposalDAO.insertDisposalFixedAsset(disposalRegBean); 
                                    disposalPlnFixedAssetBean.setAssetNo(disposalRegBean.getAssetNo());
                                    disposalPlnFixedAssetBean.setDisposalDate(disposalRegBean.getDisposalDate());
                                    disposalPlnFixedAssetBean.setComYn("1");
                                    fixedAssetDisposalDAO.updateDisposalPlnFixedAsset(disposalPlnFixedAssetBean);
                                    fixedAssetBean.setAssetNo(disposalRegBean.getAssetNo());
                                    fixedAssetBean.setDisposalDate(disposalRegBean.getDisposalDate());
                                    fixedAssetBean.setDisposalCd(disposalRegBean.getDisposalCd());
                                    fixedAssetDAO.updateFixedAssetForDisposal(fixedAssetBean);
                                    break; }
                case "deleted" : { fixedAssetDisposalDAO.deleteDisposalFixedAsset(disposalRegBean); 
                                    disposalPlnFixedAssetBean.setAssetNo(disposalRegBean.getAssetNo());
                                    disposalPlnFixedAssetBean.setDisposalDate(null);
                                    disposalPlnFixedAssetBean.setComYn("0");
                                    fixedAssetDisposalDAO.updateDisposalPlnFixedAsset(disposalPlnFixedAssetBean);
                                    fixedAssetBean.setAssetNo(disposalRegBean.getAssetNo());
                                    fixedAssetBean.setDisposalDate(null);
                                    fixedAssetBean.setDisposalCd(null);
                                    fixedAssetDAO.updateFixedAssetForDisposal(fixedAssetBean);
                                    break; }
                case "updated" : { fixedAssetDisposalDAO.updateDisposalFixedAsset(disposalRegBean); break; }
            }   
            
        }
    }
}
