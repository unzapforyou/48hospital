package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.resol.dao.JourDAO;
import com.seoul.his.acc.resol.to.JourBean;

@Service
public class JourApplicationServiceImpl implements JourApplicationService{
    @Autowired
    JourDAO jourDAO;



    @Override
    public List<JourBean> findJourRecDetail(Map<String, String> argsMap) {
        return jourDAO.selectJourDetail(argsMap);
    }

}
