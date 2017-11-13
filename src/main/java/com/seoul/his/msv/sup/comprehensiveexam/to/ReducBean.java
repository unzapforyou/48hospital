package com.seoul.his.msv.sup.comprehensiveexam.to;





import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.to
 * @Class    ReducBean.java
 * @Create   2016. 12. 11.
 * @Author   박상우
 * @Description   감면 Bean
 *
 * @LastUpdated   2016. 12. 11. 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsReduc")
public class ReducBean extends BaseBean{
    private String
                    reducCd,            // 감면코드
                    reducNm,            // 감면명
                    reducAmt,           // 감면액
                    rateAmtDivCd,       // 비유금액 구분
                    useYn;              // 사용여부
}
