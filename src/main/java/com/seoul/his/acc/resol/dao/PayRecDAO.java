package com.seoul.his.acc.resol.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.PayRecBean;


public interface PayRecDAO {


    List<PayRecBean> selectPayRecDetail(Map<String, String> argsMap);


}
