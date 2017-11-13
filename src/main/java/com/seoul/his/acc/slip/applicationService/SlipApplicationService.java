package com.seoul.his.acc.slip.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.slip.to.SlipBean;


public interface SlipApplicationService {

    void registerSlipList(List<SlipBean> slipBeanList);

    List<SlipBean> findSlipList(Map<String, String> argsMap);

}
