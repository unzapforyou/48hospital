package com.seoul.his.acc.closing.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.seoul.his.acc.closing.to.ClosAcntBean;
import com.seoul.his.acc.closing.to.ClosDataBean;
import com.seoul.his.acc.elementary.to.AccPridBean;

public interface ClosingApplicationService {

    List<ClosDataBean> findClosDataList(Map<String, Object> argsMap);

    List<ClosAcntBean> findClosAcntList(Map<String, String> argsMap);

    void registerClosJour(HashMap<String, Object> map);

}
