package com.seoul.his.acc.elementary.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.elementary.applicationService.AccElementaryApplicationService;
import com.seoul.his.acc.elementary.exception.AccntNoCopyException;
import com.seoul.his.acc.elementary.exception.AcntCopyException;
import com.seoul.his.acc.elementary.exception.AssiCopyException;
import com.seoul.his.acc.elementary.to.AccAcntBean;
import com.seoul.his.acc.elementary.to.AccPridBean;
import com.seoul.his.acc.elementary.to.AccntNoBean;
import com.seoul.his.acc.elementary.to.AssiSubBean;
import com.seoul.his.acc.elementary.to.AssiTypeBean;
import com.seoul.his.acc.elementary.to.CorpCardBean;

@Service
public class AccElementaryServiceFacadeImpl implements AccElementaryServiceFacade{

    @Autowired
    AccElementaryApplicationService accElementaryApplicationService;
    
    @Override
    public List<AccPridBean> findAccPridList() {
        return accElementaryApplicationService.findAccPridList();
    }

    @Override
    public void batchAccPridListProcess(List<AccPridBean> accPridList) {
        accElementaryApplicationService.batchAccPridListProcess(accPridList);
    }

    @Override
    public List<AccAcntBean> findAccAcntList(Map<String, String> argsMap) {
        return accElementaryApplicationService.findAccAcntList(argsMap);
    }

    @Override
    public List<AccAcntBean> lastYearAcntCopy(Map<String, String> argsMap) throws AcntCopyException {
        return accElementaryApplicationService.lastYearAcntCopy(argsMap);
    }

    @Override
    public List<AssiTypeBean> findAssiTypeList(Map<String, String> argsMap) {
        return accElementaryApplicationService.findAssiTypeList(argsMap);
    }

    @Override
    public void batchAccAcntProcess(List<AccAcntBean> accAcntList) {
        accElementaryApplicationService.batchAccAcntProcess(accAcntList);
    }

    @Override
    public List<AssiSubBean> findAssiSubList(Map<String, String> argsMap) {
        return accElementaryApplicationService.findAssiSubList(argsMap);
    }

    @Override
    public void batchAssiCodeList(HashMap<String, Object> map) {
        accElementaryApplicationService.batchAssiCodeList(map);
    }

    @Override
    public List<AssiTypeBean> lastYearAssiCodeCopy(Map<String, String> argsMap) throws AssiCopyException {
        return accElementaryApplicationService.lastYearAssiCodeCopy(argsMap);
    }

    @Override
    public List<AccntNoBean> findAccntNoList(Map<String, String> argsMap) {
        return accElementaryApplicationService.findAccntNoList(argsMap);
    }

    @Override
    public void batchAccntNoListProcess(List<AccntNoBean> accntNoList) {
        accElementaryApplicationService.batchAccntNoListProcess(accntNoList);
    }

    @Override
    public List<AccntNoBean> lastYearAccntNoCopy(Map<String, String> argsMap) throws AccntNoCopyException {
        return accElementaryApplicationService.lastYearAccntNoCopy(argsMap);
    }

    @Override
    public List<CorpCardBean> findCorpCardList(Map<String, String> argsMap) {
        return accElementaryApplicationService.findCorpCardList(argsMap);
    }

    @Override
    public void batchCorpCardListProcess(List<CorpCardBean> corpCardList) {
        accElementaryApplicationService.batchCorpCardListProcess(corpCardList);
    }

    @Override
    public AccPridBean findAccPrid(Map<String, String> argsMap) {
        return accElementaryApplicationService.findAccPrid(argsMap);
    }

}
