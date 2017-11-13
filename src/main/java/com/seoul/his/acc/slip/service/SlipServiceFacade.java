package com.seoul.his.acc.slip.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.slip.to.SlipBean;

public interface SlipServiceFacade {

    void registerSlipList(List<SlipBean> slipBeanList);

    List<SlipBean> findSlipList(Map<String, String> argsMap);

}
