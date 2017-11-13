package com.seoul.his.acc.elementary.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsCorpCard")
public class CorpCardBean extends BaseBean{
    private String  cardNo,         //카드번호
                    cardKnd,        //카드종류
                    cardDiv,        //카드관리구분
                    empNo,          //사원번호
                    empNm,          //회원명
                    signBank,       //결제은행
                    signAccntNo,    //결제계좌번호
                    deptCd,         //부서코드
                    deptNm,         //부서명
                    issCau,         //수령일자
                    ccardMngntDiv,  //관리구분
                    receiveDate,    //수령일자
                    useYn,          //사용여부
                    note;           //비고
}
