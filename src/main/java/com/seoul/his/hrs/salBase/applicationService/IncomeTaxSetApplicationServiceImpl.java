package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.salBase.dao.IncomeTaxSetDAO;
import com.seoul.his.hrs.salBase.to.DeduChartBean;
import com.seoul.his.hrs.salBase.to.IncomeTaxSetBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    IncomeTaxSetApplicationServiceImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 28.
 */

@Component
public class IncomeTaxSetApplicationServiceImpl implements IncomeTaxSetApplicationService{

	@Autowired
	public IncomeTaxSetDAO incomeTaxSetDAO;

	/* 소득세액공제설정 */
	@Override
	public List<IncomeTaxSetBean> findTaxChartList(Map<String, String> argsMap) {
		return incomeTaxSetDAO.findTaxChartList(argsMap);
	}

	@Override
	public List<DeduChartBean> findDeduChartList(Map<String, String> argsMap) {
		return incomeTaxSetDAO.findDeduChartList(argsMap);
	}

    @Override
    public void batchTaxChartProcess(List<IncomeTaxSetBean> taxList) {
        for (IncomeTaxSetBean incomeTaxSetBean : taxList) {
            if (incomeTaxSetBean.getStatus().equals("inserted")) {
                incomeTaxSetDAO.insertTaxChart(incomeTaxSetBean);
            } else if (incomeTaxSetBean.getStatus().equals("updated")) {
                incomeTaxSetDAO.updateTaxChart(incomeTaxSetBean);
            }
        }
    }

    @Override
    public void batchDeductionChartProcess(List<DeduChartBean> deduChartList) {
        for (DeduChartBean deduChartBean : deduChartList) {
            if (deduChartBean.getStatus().equals("inserted")) {
                incomeTaxSetDAO.insertDeductionChart(deduChartBean);
            } else if (deduChartBean.getStatus().equals("updated")) {
                incomeTaxSetDAO.updateDeductionChart(deduChartBean);
            }
        }
    }

	@Override
	public void setTaxDeduCopy(int year) {
		incomeTaxSetDAO.setTaxDeduCopy(year);
	}

}
