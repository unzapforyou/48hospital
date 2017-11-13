package com.seoul.his.acc.elementary.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.elementary.to.AssiSubBean;


public interface AssiSubDAO {
    List<AssiSubBean> selectAssiSubList(Map<String, String> argsMap);

    void insertAssiSub(AssiSubBean assiSubBean);

    void deleteAssiSub(AssiSubBean assiSubBean);

    void updateAssiSub(AssiSubBean assiSubBean);
}
