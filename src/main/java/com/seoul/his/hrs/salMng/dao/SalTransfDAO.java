package com.seoul.his.hrs.salMng.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.salMng.to.SalTransfBean;

public interface SalTransfDAO {

    List<SalTransfBean> findSalTransfList(Map<String, String> argsMap);

}
