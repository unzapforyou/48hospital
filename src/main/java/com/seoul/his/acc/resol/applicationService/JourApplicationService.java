package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.JourBean;

public interface JourApplicationService {


    List<JourBean> findJourRecDetail(Map<String, String> argsMap);

}
