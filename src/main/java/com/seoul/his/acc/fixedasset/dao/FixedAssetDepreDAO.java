package com.seoul.his.acc.fixedasset.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.seoul.his.acc.fixedasset.to.DepreRateBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetDepreYmBean;
import com.seoul.his.acc.fixedasset.to.MonthDepreBean;
import com.seoul.his.acc.fixedasset.to.YearDepreBean;

public interface FixedAssetDepreDAO {

    public List<DepreRateBean> selectDepreRateList();

    public List<YearDepreBean> selectFixedAssetYearDepreList(Map<String, String> argsMap);

    public void callFixedAssetDepre(FixedAssetBean fixedAssetBean);

    public List<MonthDepreBean> selectFixedAssetMonthDepreList(HashMap<String, Object> argsMap);
    
    public List<FixedAssetDepreYmBean> selectFixedAssetMonthDepreYmList(HashMap<String, Object> argsMap);
    
    public MonthDepreBean callFixedAssetMonthDepreDline(MonthDepreBean monthDepreBean);
    
    public List<YearDepreBean> selectFixedAssetYearDepreDtlList(HashMap<String, Object> argsMap);
    
    public List<FixedAssetDepreYmBean> selectFixedAssetYearDepreYearList(HashMap<String, Object> argsMap);
    
    public YearDepreBean callFixedAssetYearDepreDline(YearDepreBean yearDepreBean);
}







