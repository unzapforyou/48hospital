package com.seoul.his.hrs.salMng.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.salMng.dao.SalCalculationDAO;
import com.seoul.his.hrs.salMng.to.SalCalculDetailBean;
import com.seoul.his.hrs.salMng.to.SalCalculSumBean;
import com.seoul.his.hrs.salMng.to.SalCalculationBean;

/**
 * @Package  com.seoul.his.hrs.salMng.applicationService
 * @Class    SalMngApplicationServiceImpl.java  
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description 사원별 급여계산을 하고 사원별 마감, 마감취소를 한다.
 *
 * @LastUpdated 2016. 6. 30.
 */

@Component
public class SalCalculApplicationServiceImpl implements SalCalculApplicationService{

    @Autowired
    public SalCalculationDAO salCalculationDAO;

    @Autowired
    ResourceBundleMessageSource messageSource;
    
    @Override
    public List<SalCalculationBean> findSalCalList(Map<String, String> argsMap) {
        return salCalculationDAO.findSalCalList(argsMap);
    }

    @Override
    public void magamCancelSalCalList(Map<String, String> argsMap) {
        salCalculationDAO.magamCancelSalCal(argsMap);
    }

    @Override
    public void magamSalCalList(Map<String, String> argsMap) {
        salCalculationDAO.magamSalCalList(argsMap);
    }

    @Override
    public List<SalCalculSumBean> findSalCalSumList(Map<String, String> argsMap) {
        return salCalculationDAO.findSalCalSumList(argsMap);
    }

    @Override
    public void salCalculation(Map<String, String> argsMap) {
        salCalculationDAO.callSalCalculation(argsMap);
        System.out.println(argsMap.get("ERRMSG"));
    }

    @Override
    public void callUpdateSal(SalCalculDetailBean salCalculDetailBean) {
        salCalculationDAO.callUpdateSal(salCalculDetailBean);
    }
	
}
