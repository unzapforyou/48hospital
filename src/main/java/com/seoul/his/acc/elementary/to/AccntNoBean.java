package com.seoul.his.acc.elementary.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsAccntNo")
public class AccntNoBean extends BaseBean{
    private String  accYear,        //회계연도
                    accntNo,        //계좌번호
                    accntNm,        //계좌명
                    acntCd,         //계정코드
                    acntNm,         //계정명
                    assiTypeCd,     //보조유형코드
                    assiTypeNm,     //보조유형명
                    bankDiv,        //은행구분
                    useYn,          //사용여부
                    note;           //비고
}
