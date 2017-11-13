package com.seoul.his.acc.closing.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.closing.dao.TotalBalDAO;
import com.seoul.his.acc.closing.to.TotalBalBean;

@Service
public class TotalBalApplicationServiceImpl implements TotalBalApplicationService{
    @Autowired
    TotalBalDAO totalBalDAO;

    @SuppressWarnings("unchecked")
    @Override
    public List<TotalBalBean> findTotalBalList(Map<String, Object> argsMap) {
        argsMap.put("errorCode"     , "");
        argsMap.put("errorMsg"      , "");
        argsMap.put("finanStatsList", "");
        totalBalDAO.selectTotalBalList(argsMap);
        List<TotalBalBean> totalBalBeanList = (List<TotalBalBean>) argsMap.get("totalBalList");
        return totalBalBeanList;
    }

}
