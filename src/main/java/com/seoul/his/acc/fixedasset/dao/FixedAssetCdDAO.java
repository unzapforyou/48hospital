package com.seoul.his.acc.fixedasset.dao;

import java.util.List;

import com.seoul.his.acc.fixedasset.to.FixedAssetCdBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetCdDtlBean;

public interface FixedAssetCdDAO {

    List<FixedAssetCdDtlBean> selectUsingFixedAssetCdDtlList();

    List<FixedAssetCdBean> selectFixedAssetCdList();

    List<FixedAssetCdDtlBean> selectFixedAssetCdDtlList();

    void insertFixedAssetCd(FixedAssetCdBean fixedAssetCdBean);

    void deleteFixedAssetCdDtl(FixedAssetCdDtlBean tmpFixedAssetCdDtlBean);

    void deleteFixedAssetCd(FixedAssetCdBean fixedAssetCdBean);

    void updateFixedAssetCd(FixedAssetCdBean fixedAssetCdBean);

    void insertFixedAssetCdDtl(FixedAssetCdDtlBean fixedAssetCdDtlBean);

    void updateFixedAssetCdDtl(FixedAssetCdDtlBean fixedAssetCdDtlBean);

    

}
