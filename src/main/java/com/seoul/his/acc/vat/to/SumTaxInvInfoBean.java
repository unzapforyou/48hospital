package com.seoul.his.acc.vat.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Dataset(name = "dsSumTaxInvInfo")
public class SumTaxInvInfoBean extends BaseBean{
    private String  custCd        ,    // 거래처코드
                    splyPrice     ,    // 공급가액
                    taxAmt        ,    // 세액
                    taxInvCount   ;    // 매수
}
