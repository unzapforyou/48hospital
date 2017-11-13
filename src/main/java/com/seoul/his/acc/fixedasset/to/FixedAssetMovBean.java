package com.seoul.his.acc.fixedasset.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Dataset(name="dsFixedAssetMov")
public class FixedAssetMovBean extends BaseBean{
    private String  assetNo, 
                    movDate,
                    mngntCd, 
                    ownDept,
                    pstLoc,
                    respoWorker,
                    note;
}