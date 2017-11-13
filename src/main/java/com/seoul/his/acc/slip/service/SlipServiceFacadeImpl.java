package com.seoul.his.acc.slip.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.slip.applicationService.SlipApplicationService;
import com.seoul.his.acc.slip.to.SlipBean;


@Service
public class SlipServiceFacadeImpl implements SlipServiceFacade{
    @Autowired
    SlipApplicationService slipApplicationService;

    @Override
    public void registerSlipList(List<SlipBean> slipBeanList) {
        slipApplicationService.registerSlipList(slipBeanList);
    }

    @Override
    public List<SlipBean> findSlipList(Map<String, String> argsMap) {
        return slipApplicationService.findSlipList(argsMap);
    }

}
