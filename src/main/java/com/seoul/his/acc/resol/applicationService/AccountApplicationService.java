package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.AccountBean;

public interface AccountApplicationService {

    List<AccountBean> findAccount(Map<String, String> argsMap);



}
