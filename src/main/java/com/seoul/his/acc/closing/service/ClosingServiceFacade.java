package com.seoul.his.acc.closing.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.seoul.his.acc.closing.to.ClosAcntBean;
import com.seoul.his.acc.closing.to.ClosDataBean;
import com.seoul.his.acc.closing.to.FinanStatsBean;
import com.seoul.his.acc.closing.to.TotalBalBean;
import com.seoul.his.acc.elementary.to.AccPridBean;

public interface ClosingServiceFacade {

    List<ClosDataBean> findClosDataList(Map<String, Object> argsMap);

    List<ClosAcntBean> findClosAcntList(Map<String, String> argsMap);

    void registerClosJour(HashMap<String, Object> map);

    void modifyDlineYn(AccPridBean accPrid);

    void executeCarrfor(AccPridBean accPrid);

    List<FinanStatsBean> findFinanStats(Map<String, Object> argsMap);

    List<TotalBalBean> findTotalBalList(Map<String, Object> argsMap);

}
