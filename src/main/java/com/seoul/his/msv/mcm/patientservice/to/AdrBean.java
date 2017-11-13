package com.seoul.his.msv.mcm.patientservice.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.med.adr.to
 * @Class    AdrBean.java
 * @Create   2016. 6. 22.
 * @Author   godseop
 * @Description 약물유해반응 TO
 *
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name="dsAdr")
public class AdrBean extends BaseBean {
    private String adrNo,               // 약물유해반응번호
                   patNo,               // 환자번호
                   patNm,               // 환자명
                   patAge,              // 환자나이
                   patGender,           // 환자성별
                   prescNo,             // 처방전번호
                   diseaseNm,           // 진단명
                   writerNo,            // 작성자번호
                   writerNm,            // 작성자명
                   writeDate,           // 작성일자
                   writerJob,           // 자격(의사/간호사/약사)
                   drugNo,              // 의심약물번호
                   drugNm,              // 의심약물명
                   manifacture,         // 제조사
                   usage,               // 용법
                   capct,               // 용량
                   injcStartDate,       // 투약시작일
                   injcEndDate,         // 투약종료일
                   injcPurp,            // 투약목적
                   rvlStartDate,        // 발현시작일
                   rvlEndDate,          // 발현종료일
                   rvlRecogDate,        // 발현인지일
                   afterInjcRvl,        // 투약후발현시기
                   symptom,             // 주증상
                   prog,                // 경과내용
                   rltnExmntNm,         // 관련검사명
                   rltnExmntVal,        // 관련검사수치
                   action,              // 조치내용
                   reinjcReact,         // 재투여시반응
                   opinion,             // 종합의견
                   reportYn;            // 보고여부
}
