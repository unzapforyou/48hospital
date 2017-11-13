package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.AppendFileBean;


public interface AppendFileApplicationService {

    List<AppendFileBean> findAppendFileDetail(Map<String, String> argsMap);

}
