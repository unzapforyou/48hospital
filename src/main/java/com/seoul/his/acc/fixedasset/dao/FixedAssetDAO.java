package com.seoul.his.acc.fixedasset.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.fixedasset.to.FixedAssetBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetSequenceBean;

public interface FixedAssetDAO {

    public FixedAssetSequenceBean selectMaxAssetNo();

    public List<FixedAssetBean> selectFixedAssetList(Map<String, String> argsMap);

    public FixedAssetBean selectFixedAsset(Map<String, String> argsMap);

    public void insertFixedAsset(FixedAssetBean fixedAssetBean);

    public void deleteFixedAsset(FixedAssetBean fixedAssetBean);

    public void updateFixedAsset(FixedAssetBean fixedAssetBean);

    public void updateFixedAssetForMov(FixedAssetBean fixedAssetBean);

    public void updateFixedAssetForDisposal(FixedAssetBean fixedAssetBean);
}
