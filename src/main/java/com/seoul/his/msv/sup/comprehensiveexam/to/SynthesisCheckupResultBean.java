package com.seoul.his.msv.sup.comprehensiveexam.to;



import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.to
 * @Class    SynthesisCheckupResultBean.java
 * @Create   2016. 12. 11.
 * @Author   박상우
 * @Description   종합검진 검사결과 Bean
 *
 * @LastUpdated   2016. 12. 11. 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsRslt")
public class SynthesisCheckupResultBean extends BaseBean {
    private String 
                rsvtNo,        // 예약번호
                inspCd,        // 검사코드
                dtlInspCd,     // 세부검사코드
                dtlInspNm,     // 세부검사코드명
                inspRslt,      // 검사결과
                ocsDivCd,      // OCS구분코드
                rsltDeptCd,    // 결과부서코드
                refLowFig,     // 상한참고치
                refHighFig,    // 하한참고치
                unit,          // 단위
                userId,        // 사용자아이디
                userIp;        // 사용자아이피
}