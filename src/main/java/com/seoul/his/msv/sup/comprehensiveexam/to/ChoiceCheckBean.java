package com.seoul.his.msv.sup.comprehensiveexam.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.to
 * @Class    ChoiceCheckBean.java
 * @Create   2016. 5. 30.
 * @Author   박상우
 * @Description   선택검사 Bean
 *
 * @LastUpdated   2016. 12. 01. 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsChoInsp")
public class ChoiceCheckBean extends BaseBean {
    private String 
                    rsvtNo,         // 예약번호
                    inspCd,         // 검사코드
                    inspNm,         // 검사명
                    qnt,            // 수량
                    amt,            // 검사금액
                    inspPlnDate,    // 검사예정일
                    userId,         // 사용자ID
                    userIp;         // 사용자IP
}
