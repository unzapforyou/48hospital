package com.seoul.his.acc.resol.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.resol.to.ResolLetBean;

public interface ResolLetDAO {

    List<ResolLetBean> selectResolLetList(Map<String, String> argsMap);

    String getResolNo();

    void insertResolLet(ResolLetBean resolLetBean);

    void updateResolLet(ResolLetBean resolLetBean);

}
