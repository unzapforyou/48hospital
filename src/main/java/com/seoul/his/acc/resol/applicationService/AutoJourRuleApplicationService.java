package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.AutoJourRuleBean;

public interface AutoJourRuleApplicationService {

    List<AutoJourRuleBean> findAutoJourRuleList(Map<String, String> argsMap);

}
