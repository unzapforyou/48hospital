package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.PayRecBean;


public interface PayRecApplicationService {

    List<PayRecBean> findPayRecDetail(Map<String, String> argsMap);

}
