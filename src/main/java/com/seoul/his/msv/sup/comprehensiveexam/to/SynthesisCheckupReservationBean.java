package com.seoul.his.msv.sup.comprehensiveexam.to;


import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.sup.checkup.to
 * @Class    RsvtBean.java
 * @Create   2016. 12. 11.
 * @Author   박상우
 * @Description   종합검진 예약 Bean
 *
 * @LastUpdated   2016. 12. 11. 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsRsvt")
public class SynthesisCheckupReservationBean extends BaseBean{
    private String 
                    rsvtNo,                    // 예약번호
                    patNo,                     // 환자등록번호
                    patNm,                     // 예약자명
                    age,                       // 나이
                    gender,                    // 성별
                    rrn1,                      // 주민번호1
                    rrn2,                      // 주민번호2
                    sms,                       // SMS
                    rsvtDate,                  // 예약일자
                    rsvtTime,                  // 예약시간
                    inspPlnDate,               // 검진예정일
                    inspPlnTime,               // 검진예정시간
                    aplMan,                    // 신청인
                    aplManTel,                 // 신청인연락처
                    rship,                     // 관계
                    pckCd,                     // 패키지코드
                    pckNm,                     // 패키지명
                    basicInspAmt,              // 기본검사금액
                    reducCd,                   // 감면코드
                    reducNm,                   // 감면명
                    reducAmt,                  // 감면금액
                    rsvtAmt,                   // 예약금액
                    basicInspSumAmt,           // 기본검사합계금액
                    payMan,                    // 입금자
                    rsvtResp,                  // 예약담당자
                    memo,                      // 메모
                    cancelYn,                  // 취소여부
                    receYn,                    // 수납여부
                    choInspAmt,                // 선택검사금액
                    inspSumAmt,                // 총수납금액
                    userId,                    // 사용자ID
                    userIp;                    // 사용자IP
 
private List<SynthesisCheckupCheckTypeBean> pckInspList;
private List<ChoiceCheckBean> choInspList;

}
