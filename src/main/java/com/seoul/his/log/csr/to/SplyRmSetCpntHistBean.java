package com.seoul.his.log.csr.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.log.midSplyRm.to
 * @Class    SplyRmSETCpntHistBean.java
 * @Create   2016. 5. 25.
 * @Author   Chun
 * @Description 공급실SET구성품내역 빈
 *
 * @LastUpdated
 */
@Dataset(name="dsSplyRmSetCpntHist")
@Setter
@Getter
@ToString
public class SplyRmSetCpntHistBean extends BaseBean{

    private String bigGrpCd   //대분류코드
                  ,cpntHistNo //구성내역번호
                  ,fmCd       //품목코드
                  ,fmNm       //품명
                  ,midGrpCd   //중분류코드
                  ,qnt        //수량
                  ,setCd      //SET코드
                  ,smGrpCd    //소분류코드
                  ,stand      //규격
                  ,unit;      //단위


}
