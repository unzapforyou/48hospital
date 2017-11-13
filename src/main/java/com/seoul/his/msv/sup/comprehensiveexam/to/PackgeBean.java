package com.seoul.his.msv.sup.comprehensiveexam.to;


import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.to
 * @Class    PackgeBean.java
 * @Create   2016. 12. 01.
 * @Author   박상우
 * @Description   종합검진 패키지 Bean
 *
 * @LastUpdated   2016. 12. 01. 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsPck")
public class PackgeBean extends BaseBean {
    private String 
                    pckCd,          // 패키지 코드
                    pckNm,          // 패키지명
                    genderCd,       // 성별
                    amt,            // 패키지 금액
                    inspDivCd,      // 검사구분코드
                    useYn,          // 사용여부
                    userId,         // 사용자 아이디
                    userIp;         // 사용자 아이피
}
