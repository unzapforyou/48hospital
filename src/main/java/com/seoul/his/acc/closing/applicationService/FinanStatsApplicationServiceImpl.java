package com.seoul.his.acc.closing.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.closing.dao.FinanStatsDAO;
import com.seoul.his.acc.closing.to.FinanStatsBean;

@Service
public class FinanStatsApplicationServiceImpl implements FinanStatsApplicationService{
    @Autowired
    FinanStatsDAO finanStatsDAO;

    @Override
    public List<FinanStatsBean> findFinanStats(Map<String, Object> argsMap) {
        String finanStatsCd = (String)argsMap.get("finanStatsCd");
        argsMap.put("errorCode"     , "");
        argsMap.put("errorMsg"      , "");
        argsMap.put("finanStatsList", "");

        if(finanStatsCd.equals("A")){
            finanStatsDAO.selectFinanPosiList(argsMap);
        }else if(finanStatsCd.equals("B")){
            finanStatsDAO.selectIncomStatList(argsMap);
        }

        String errorCode    = (String)argsMap.get("errorCode");
        String errorMsg     = (String)argsMap.get("errorMsg");

        List<FinanStatsBean> finanStatsList = (List<FinanStatsBean>)argsMap.get("finanStatsList");

        return finanStatsList;
    }

}
