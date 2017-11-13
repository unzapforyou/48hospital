package com.seoul.his.acc.closing.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.closing.to.TotalBalBean;

public interface TotalBalApplicationService {

    List<TotalBalBean> findTotalBalList(Map<String, Object> argsMap);

}
