package com.seoul.his.acc.closing.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.closing.to.FinanStatsBean;

public interface FinanStatsApplicationService {

    List<FinanStatsBean> findFinanStats(Map<String, Object> argsMap);

}
