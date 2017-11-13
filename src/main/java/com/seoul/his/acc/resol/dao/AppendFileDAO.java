package com.seoul.his.acc.resol.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.AppendFileBean;

public interface AppendFileDAO {

    List<AppendFileBean> selectAppendFileDetail(Map<String, String> argsMap);

}
