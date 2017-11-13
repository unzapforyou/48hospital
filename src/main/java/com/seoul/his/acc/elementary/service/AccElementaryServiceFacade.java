package com.seoul.his.acc.elementary.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.seoul.his.acc.elementary.exception.AccntNoCopyException;
import com.seoul.his.acc.elementary.exception.AcntCopyException;
import com.seoul.his.acc.elementary.exception.AssiCopyException;
import com.seoul.his.acc.elementary.to.AccAcntBean;
import com.seoul.his.acc.elementary.to.AccPridBean;
import com.seoul.his.acc.elementary.to.AccntNoBean;
import com.seoul.his.acc.elementary.to.AssiSubBean;
import com.seoul.his.acc.elementary.to.AssiTypeBean;
import com.seoul.his.acc.elementary.to.CorpCardBean;

public interface AccElementaryServiceFacade {

    List<AccPridBean> findAccPridList();

    void batchAccPridListProcess(List<AccPridBean> accPridList);

    List<AccAcntBean> findAccAcntList(Map<String, String> argsMap);

    List<AccAcntBean> lastYearAcntCopy(Map<String, String> argsMap) throws AcntCopyException;

    List<AssiTypeBean> findAssiTypeList(Map<String, String> argsMap);

    void batchAccAcntProcess(List<AccAcntBean> accAcntList);

    List<AssiSubBean> findAssiSubList(Map<String, String> argsMap);

    void batchAssiCodeList(HashMap<String, Object> map);

    List<AssiTypeBean> lastYearAssiCodeCopy(Map<String, String> argsMap) throws AssiCopyException;

    List<AccntNoBean> findAccntNoList(Map<String, String> argsMap);

    void batchAccntNoListProcess(List<AccntNoBean> accntNoList);

    List<AccntNoBean> lastYearAccntNoCopy(Map<String, String> argsMap) throws AccntNoCopyException;

    List<CorpCardBean> findCorpCardList(Map<String, String> argsMap);

    void batchCorpCardListProcess(List<CorpCardBean> corpCardList);

    AccPridBean findAccPrid(Map<String, String> argsMap);

}
