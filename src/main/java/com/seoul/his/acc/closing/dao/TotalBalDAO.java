package com.seoul.his.acc.closing.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.closing.to.TotalBalBean;

public interface TotalBalDAO {

    List<TotalBalBean> selectTotalBalList(Map<String, Object> argsMap);

}
