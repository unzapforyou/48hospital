package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.resol.dao.JourDAO;
import com.seoul.his.acc.resol.to.AutoJourRuleBean;



@Service
public class AutoJourRuleApplicationServiceImpl implements AutoJourRuleApplicationService{
    @Autowired
    JourDAO jourDAO;

    @Override
    public List<AutoJourRuleBean> findAutoJourRuleList(Map<String, String> argsMap) {
        return jourDAO.selectAutoJourRuleList(argsMap);
    }
}
