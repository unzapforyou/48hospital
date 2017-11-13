package com.seoul.his.acc.fixedasset.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name="dsFixedAsset")
public class FixedAssetBean extends BaseBean{
    private String  assetNo,
                    assetCd,
                    equipCd,
                    mngntCd,
                    acquFinanCd,
                    acquDate,
                    dproDate,
                    inOutCapitalCd,
                    acntCd,
                    acquCd,
                    profitCd,
                    assetNm,
                    acnt,
                    asstAcnt,
                    assetGrp,
                    disposalDate,
                    disposalCd,
                    monUnitCd,
                    splyComp,
                    cashBuyYn,
                    prodComp,
                    modelNm,
                    prodNo,
                    prodCtry,
                    receiver,
                    ownDept,
                    pstLoc,
                    respoWorker,
                    grade,
                    fixedAssetPhoto,
                    depreMthd,
                    depreRate,
                    acquAmt,
                    depreYears;
}