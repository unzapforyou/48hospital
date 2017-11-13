package com.seoul.his.acc.fixedasset.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name="dsAssetMidGrpCd")
public class FixedAssetMidGrpCdBean extends BaseBean{
    private String  lgGrpCd, 
                    midGrpCd, 
                    midGrpCdNm;
    
    public List<FixedAssetSmGrpCdBean> fixedAssetSmGrpCdBeanList;

    @Remove
    public List<FixedAssetSmGrpCdBean> getFixedAssetSmGrpCdBeanList() {
        return fixedAssetSmGrpCdBeanList;
    }
    @Remove
    public void setFixedAssetSmGrpCdBeanList(List<FixedAssetSmGrpCdBean> fixedAssetSmGrpCdBeanList) {
        this.fixedAssetSmGrpCdBeanList = fixedAssetSmGrpCdBeanList;
    }
}