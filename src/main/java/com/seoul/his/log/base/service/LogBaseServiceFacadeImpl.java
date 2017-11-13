package com.seoul.his.log.base.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.log.base.applicationService.LogBaseApplicationService;
import com.seoul.his.log.base.to.BigGrpCdBean;
import com.seoul.his.log.base.to.BindLogCdBean;
import com.seoul.his.log.base.to.CustBean;
import com.seoul.his.log.base.to.GdsBean;
import com.seoul.his.log.base.to.MidGrpCdBean;
import com.seoul.his.log.base.to.OutLogCdBean;
import com.seoul.his.log.base.to.SmGrpCdBean;
import com.seoul.his.log.base.to.WhBean;

/**
 * @Package  com.seoul.his.log.base.service
 * @Class    LogBaseServiceFacadeImpl.java
 * @Create   2016. 6. 30.
 * @Author   godseop
 * @Description 물류공통 서비스퍼사드
 *
 * @LastUpdated 
 */
@Component
public class LogBaseServiceFacadeImpl implements LogBaseServiceFacade {

    @Autowired
    private LogBaseApplicationService logBaseApplicationService;

    @Override
    public List<GdsBean> findGdsList(Map<String, String> argsMap) {
        List<GdsBean> gdsList = logBaseApplicationService.findGdsList(argsMap);
        return gdsList;
    }

    @Override
    public Map<String, List<OutLogCdBean>> bindLogCd(List<BindLogCdBean> bindLogCdList) {
        Map<String, List<OutLogCdBean>> bindLogCdMap = logBaseApplicationService.bindLogCd(bindLogCdList);
        return bindLogCdMap;
    }

    @Override
    public List<BigGrpCdBean> findGrpList(Map<String, String> argsMap) {
        List<BigGrpCdBean> bigGrpList = logBaseApplicationService.findGrpList(argsMap);
        return bigGrpList;
    }

    @Override
    public List<WhBean> findWhList(Map<String, String> argsMap) {
        List<WhBean> whList = logBaseApplicationService.findWhList(argsMap);
        return whList;
    }

    @Override
    public void modifyWh(List<WhBean> whList) {
        logBaseApplicationService.modifyWh(whList);
    }

    @Override
    public String callGdsCd(Map<String, String> argsMap) {
        String postCode = logBaseApplicationService.callGdsCd(argsMap);
        return postCode;
    }

    @Override
    public void batchGdsProcess(List<GdsBean> gdsList) {
        logBaseApplicationService.batchGdsProcess(gdsList);
    }

    @Override
    public void batchGdsGrpCdProcess(List<BigGrpCdBean> bigGrpCdList, List<MidGrpCdBean> midGrpCdList,
            List<SmGrpCdBean> smGrpCdList) {
        logBaseApplicationService.batchGdsGrpCdProcess(bigGrpCdList, midGrpCdList, smGrpCdList);
    }

    @Override
    public List<CustBean> findCustList(Map<String, String> argsMap) {
        List<CustBean> custList = logBaseApplicationService.findCustList(argsMap);
        return custList;
    }

    @Override
    public void batchCustProcess(List<CustBean> custList) {
        logBaseApplicationService.batchCustProcess(custList);
    }
}
