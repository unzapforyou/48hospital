package com.seoul.his.acc.vat.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.vat.dao.VATDeclDAO;
import com.seoul.his.acc.vat.to.VATDeclBean;

@Service
public class VATDeclApplicationServiceImpl implements VATDeclApplicationService{
    @Autowired
    VATDeclDAO vatDeclDAO;

    @Override
    public List<VATDeclBean> findVATDeclList(Map<String, String> argsMap) {
        return vatDeclDAO.selectVATDeclList(argsMap);
    }

}
