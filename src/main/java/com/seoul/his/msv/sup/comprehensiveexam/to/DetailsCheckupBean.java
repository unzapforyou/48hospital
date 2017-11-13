package com.seoul.his.msv.sup.comprehensiveexam.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.to
 * @Class    DetailsCheckupBean.java
 * @Create   2016. 12. 01.
 * @Author   박상우
 * @Description   세부검사항목 Bean
 *
 * @LastUpdated   2016. 12. 01.
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsDtcu")
public class DetailsCheckupBean extends BaseBean {
    private String
                    inspCd,             // 검사코드
                    dtInspCd,           // 세부검사코드
                    dtInspNm,           // 세부검사명
                    unit,               // 단위
                    genderCd,           // 성별코드
                    ocsCd,              // 처방전달코드
                    ocsNm,              // 처방명
                    refHighFig,         // 참고치(상한)
                    refLowFig,          // 참고치(하한)
                    runYn,              // 검사실행여부
                    userId,             // 사용자ID
                    userIp;             // 사용자IP
}