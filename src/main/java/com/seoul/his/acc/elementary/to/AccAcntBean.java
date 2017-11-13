package com.seoul.his.acc.elementary.to;


import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Dataset(name = "dsAccAcnt")
public class AccAcntBean extends BaseBean{
    private String  accYear,            //회계년도
                    acntCd,             //계정과목코드
                    acntNm,             //계정과목명
                    parentAcntCd,       //상위계정코드
                    acntDiv,            //계정구분
                    creDebDiv,          //차대구분
                    assiTypeCd,         //보조유형코드
                    assiTypeNm,         //보조유형명
                    budgYn,             //예산여부
                    useYn,              //사용여부
                    incomArtiCd,        //손익계산서그룹코드
                    cashArtiCd,         //현금흐름표그룹코드
                    inputYn,            //입력구분
                    deductYn,           //차감구분
                    lev,                //레벨
                    errorCode,
                    errorMsg;
}
