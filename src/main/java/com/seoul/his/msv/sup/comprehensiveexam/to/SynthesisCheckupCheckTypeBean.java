package com.seoul.his.msv.sup.comprehensiveexam.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.to
 * @Class    SynthesisCheckupCheckTypeBean.java
 * @Create   2016. 12. 01.
 * @Author   박상우
 * @Description   종합검진검사종류 Bean
 *
 * @LastUpdated   2016. 12. 01.
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsScct")
public class SynthesisCheckupCheckTypeBean extends BaseBean {
    private String
                    rsvNo,           // 예약번호
                    inspCd,          // 검사코드
                    inspNm,          // 검사명
                    ocsCd,           // 처방전달코드
                    ocsNm,           // 처방명
                    rsltDeptCd,      // 결과부서코드
                    rsltDeptNm,      // 결과부서명
                    ocsDivCd,        // OCS전달구분코드
                    amt,             // 검사금액
                    useYn,           // 사용여부
                    userId,          // 사용자ID
                    userIp,          // 사용자IP
                    pckCd;           // 패키지코드
}