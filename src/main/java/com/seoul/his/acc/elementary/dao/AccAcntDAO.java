package com.seoul.his.acc.elementary.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.elementary.to.AccAcntBean;

public interface AccAcntDAO {

    List<AccAcntBean> selectAccAcntList(Map<String, String> argsMap);

    void callCopyAcnt(AccAcntBean accAcntBean);

    void insertAccAcnt(AccAcntBean batchAccAcntBean);

    void deleteAccAcnt(AccAcntBean batchAccAcntBean);

    void updateAccAcnt(AccAcntBean batchAccAcntBean);

}
