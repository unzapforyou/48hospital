package com.seoul.his.acc.fixedasset.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name="dsAssetSmGrpCd")
public class FixedAssetSmGrpCdBean extends BaseBean{
    private String  lgGrpCd, 
                    midGrpCd, 
                    smGrpCd, 
                    smGrpCdNm, 
                    useYn;

}