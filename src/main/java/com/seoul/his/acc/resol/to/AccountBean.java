package com.seoul.his.acc.resol.to;


import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.acc.resol.to
 *    |_ AccountBean.java
 * </pre>
 *
 * @date : 2016. 12. 13. 오후 8:42:13
 * @version :
 * @author : 응디꿍디
 */




@Setter
@Getter
@ToString
@Dataset(name = "dsAccount")
public class AccountBean extends BaseBean {
    String   custCd      //거래처코드
            ,custNm      //거래처명
            ,adptdt      //적용일자
            ,bussNo      //사업자등록번호
            ,zipCd       //우편번호
            ,addr        //주소
            ,telNo       //전화번호
            ,faxNo       //팩스번호
            ,bankCd      //은행코드
            ,accNo       //계좌번호
            ,busctgNm    //업종명
            ,busshpNm    //업체명
            ,prsdntNm    //대표자명
            ,resNo       //주민등록번호
            ,dpstr       //예금주
            ,useYn       //사용여부
            ,gpuseYn     //인사사용여부
            ,gduseYn     //구매사용여부
            ,cardYn      //카드가맹점여부
            ,riuseYn     //동위원소거래처여부
            ,hospcls   ;  //병원구분
}