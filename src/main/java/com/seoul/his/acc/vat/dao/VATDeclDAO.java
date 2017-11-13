package com.seoul.his.acc.vat.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.vat.to.VATDeclBean;

public interface VATDeclDAO {

    List<VATDeclBean> selectVATDeclList(Map<String, String> argsMap);

}
