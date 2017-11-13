package com.seoul.his.hrs.salBase.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.seoul.his.hrs.salBase.to.DeduChartBean;
import com.seoul.his.hrs.salBase.to.IncomeTaxSetBean;

public interface IncomeTaxSetDAO {

    public List<IncomeTaxSetBean> findTaxChartList(Map<String, String> argsMap) throws DataAccessException;
    public List<DeduChartBean> findDeduChartList(Map<String, String> argsMap) throws DataAccessException;
    public void setTaxDeduCopy(int year) throws DataAccessException;
    public void insertTaxChart(IncomeTaxSetBean incomeTaxSetBean);
    public void updateTaxChart(IncomeTaxSetBean incomeTaxSetBean);
    public void insertDeductionChart(DeduChartBean deduChartBean);
    public void updateDeductionChart(DeduChartBean deduChartBean);

}
