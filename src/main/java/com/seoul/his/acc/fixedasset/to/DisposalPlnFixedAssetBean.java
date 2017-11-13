package com.seoul.his.acc.fixedasset.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Dataset(name="dsDisposalPlnFixedAsset")
public class DisposalPlnFixedAssetBean extends BaseBean{
    
     private String assetNo,           // 자산번호
                    disposalAppDate,   // 매각신청일
                    disposalCd,        // 매각구분
                    comYn,             // 매각완료
                    mngntCd,           // 관리구분
                    ownDept,           // 보유부서
                    pstLoc,            // 현위치
                    respoWorker,       // 담당자
                    acquDate,          // 취득일
                    assetNm,           // 자산명
                    acquAmt,           // 취득금액
                    residAmt,          // 잔존가액
                    disposalDate;      // 매각일
}




