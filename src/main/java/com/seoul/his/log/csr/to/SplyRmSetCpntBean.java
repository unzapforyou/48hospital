package com.seoul.his.log.csr.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * @Package  com.seoul.his.log.midSplyRm.to
 * @Class    SplyRmSETCpntBean.java
 * @Create   2016. 5. 25.
 * @Author   Chun
 * @Description 공급실SET구성품 빈
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString
@Dataset(name="dsSplyRmSetCpnt")
public class SplyRmSetCpntBean extends BaseBean{
    private String bigGrpCd    //대분류코드
                  ,disuseCau   //불용사유
                  ,disuseDate  //불용일자
                  ,midGrpCd    //중분류코드
                  ,mngntDeptCd //관리부서코드
                  ,mngntDeptNm //관리부서명
                  ,realuseYb   //실사용어부
                  ,setCd       //SET코드
                  ,setNm       //SET명
                  ,smGrpCd     //소분류코드
                  ,bigGrpNm    //대분류코드명
                  ,midGrpCdNm  //중분류코드명
                  ,smGrpCdNm;  //소분류코드명

    private List<SplyRmSetCpntHistBean> splyRmSetCpntHistList;   //

    @Remove
    public List<SplyRmSetCpntHistBean> getSplyRmSetCpntHistList() {
        return splyRmSetCpntHistList;
    }

    @Remove
    public void setSplyRmSetCpntHistList(List<SplyRmSetCpntHistBean> splyRmSetCpntHistList) {
        this.splyRmSetCpntHistList = splyRmSetCpntHistList;
    }


}
