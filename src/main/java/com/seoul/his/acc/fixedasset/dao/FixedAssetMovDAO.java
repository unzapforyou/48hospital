package com.seoul.his.acc.fixedasset.dao;

import java.util.List;

import com.seoul.his.acc.fixedasset.to.FixedAssetMovBean;

public interface FixedAssetMovDAO {

    List<FixedAssetMovBean> selectFixedAssetMovList();

    void insertFixedAssetMov(FixedAssetMovBean fixedAssetMovBean);

    void deleteFixedAssetMov(FixedAssetMovBean fixedAssetMovBean);

    void updateFixedAssetMov(FixedAssetMovBean fixedAssetMovBean);

}
