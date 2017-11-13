package com.seoul.his.acc.resol.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.resol.dao.PayRecDAO;
import com.seoul.his.acc.resol.to.PayRecBean;

@Service
public class PayRecApplicationServiceImpl implements PayRecApplicationService{
    @Autowired
    PayRecDAO payRecDAO;



    @Override
    public List<PayRecBean> findPayRecDetail(Map<String, String> argsMap) {
        return payRecDAO.selectPayRecDetail(argsMap);
    }

}
