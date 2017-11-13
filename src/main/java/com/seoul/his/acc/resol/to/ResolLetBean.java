package com.seoul.his.acc.resol.to;


import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.acc.resol.to
 *    |_ ResolLetBean.java
 * </pre>
 *
 * @date : 2016. 12. 15. 오후 8:40:43
 * @version :
 * @author : 응디꿍디
 */




@Setter
@Getter
@ToString
@Dataset(name = "dsResolLet")
public class ResolLetBean extends BaseBean{
    private String  resolNo     ,  //  결의번호
                    resolDiv    ,  //  결의구분
                    resolDate   ,  //  결의일자
                    resoler     ,  //  결의자
                    resolDeptCd ,  //  결의부서코드
                    progStatDiv ,  //  진행상태구분
                    sakNo       ,  //  원인번호
                    receiptNo   ,  //  접수번호
                    custCd      ,  //  거래처코드
                    operNo      ,  //  사업자번호
                    resolAmt    ,  //  결의금액
                    brCau       ,  //  반려사유
                    abs         ,  //  적요
                    demdDeptCd  ,  //  요구부서코드
                    autoJourYb  ,  //  자동분개여부
                    modWorker   ,  //  수정자
                    modDate     ,  //  수정일시
                    danDiv      ,  //  단구분
                    acntCd      ,  //  계정과목코드
                    assiSubCd   ,  //  보조과목코드
                    ctrtNo      ,  //  계약번호
                    surtaxYb    ,  //  부가세여부
                    resolDeptExtsn ,  //  결의부서 원내전화
                    closYb      ,  //결산여부
                    accPrid      , //회계기수
                    resolerNm    , //결의자 이름
                    check="0"    ,   //체크박스
                    acntCdNm     ,   //계정과목명
                    assiSubCdNm  ;   //보조과목명

    List<JourBean> jourList;
    List<PayRecBean> payRecList;
    List<AppendFileBean> appendFileList;

    @Remove
    public List<JourBean> getJourList() {
        return jourList;
    }
    @Remove
    public void setJourList(List<JourBean> jourList) {
        this.jourList = jourList;
    }
    @Remove
    public List<PayRecBean> getPayRecList() {
        return payRecList;
    }
    @Remove
    public void setPayRecList(List<PayRecBean> payRecList) {
        this.payRecList = payRecList;
    }
    @Remove
    public List<AppendFileBean> getAppendFileList() {
        return appendFileList;
    }
    @Remove
    public void setAppendFileList(List<AppendFileBean> appendFileList) {
        this.appendFileList = appendFileList;
    }

}