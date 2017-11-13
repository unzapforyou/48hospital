package com.seoul.his.acc.closing.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.closing.applicationService.ClosingApplicationService;
import com.seoul.his.acc.closing.applicationService.DlineCarrforApplicationService;
import com.seoul.his.acc.closing.applicationService.FinanStatsApplicationService;
import com.seoul.his.acc.closing.applicationService.TotalBalApplicationService;
import com.seoul.his.acc.closing.to.ClosAcntBean;
import com.seoul.his.acc.closing.to.ClosDataBean;
import com.seoul.his.acc.closing.to.FinanStatsBean;
import com.seoul.his.acc.closing.to.TotalBalBean;
import com.seoul.his.acc.elementary.to.AccPridBean;

@Service
public class ClosingServiceFacadeImpl implements ClosingServiceFacade{
    @Autowired
    ClosingApplicationService closingApplicationService;
    @Autowired
    DlineCarrforApplicationService dlineCarrforApplicationService;
    @Autowired
    FinanStatsApplicationService finanStatsApplicationService;
    @Autowired
    TotalBalApplicationService totalBalApplicationService;

    @Override
    public List<ClosDataBean> findClosDataList(Map<String, Object> argsMap) {
        return closingApplicationService.findClosDataList(argsMap);
    }

    @Override
    public List<ClosAcntBean> findClosAcntList(Map<String, String> argsMap) {
        return closingApplicationService.findClosAcntList(argsMap);
    }

    @Override
    public void registerClosJour(HashMap<String, Object> map) {
        closingApplicationService.registerClosJour(map);
    }

    @Override
    public void modifyDlineYn(AccPridBean accPrid) {
        dlineCarrforApplicationService.modifyDlineYn(accPrid);
    }

    @Override
    public void executeCarrfor(AccPridBean accPrid) {
        dlineCarrforApplicationService.executeCarrfor(accPrid);
    }

    @Override
    public List<FinanStatsBean> findFinanStats(Map<String, Object> argsMap) {
        return finanStatsApplicationService.findFinanStats(argsMap);
    }

    @Override
    public List<TotalBalBean> findTotalBalList(Map<String, Object> argsMap) {
        return totalBalApplicationService.findTotalBalList(argsMap);
    }

}
