package com.seoul.his.acc.fixedasset.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Dataset(name="dsYearDepre")
public class YearDepreBean extends BaseBean{
    private String  depreYear,          // 년도
                    yearDepreDlineYn,   // 마감여부
                    assetNo,            // 자산번호
                    acquDate,           // 취득일자
                    assetNm,            // 자산명
                    basicAssetAmt,      // 기초자산액
                    depreSum,           // 상각누계액
                    residDepreAmt,      // 잔존상각액
                    thatyearDepreAmt,   // 당기상각액
                    residAmt;           // 잔존가액
}