package com.seoul.his.log.demd.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.log.demd.to
 * @Class    GdsAnspBean.java
 * @Create   2016. 7. 6.
 * @Author   Bohyun
 * @Description 물품청구 빈
 *
 * @LastUpdated 
 */
@Setter
@Getter
@ToString
@Dataset(name = "dsGdsAnsp")
public class GdsAnspBean extends BaseBean{

     String gdsAnspNo;    //물품청구번호
     String anspDept;     //청구부서
     String anspDate;     //청구일자
     String anspDiv;      //청구구분
     String mngntDept;    //관리부서
     String danDiv;       //단구분
     String rlsWh;        //충고창고
     String anspCon;      //청구사유
     String progStat;     //진행상태
     String anspQnt;      //청구수량
     String respoWorker;  //응답담당자
     String rlsDate;      //출고일자
    String anspDeptNm;    //청구부서명
    List<GdsAnspHistBean> gdsAnspHistList;

    @Remove
    public List<GdsAnspHistBean> getGdsAnspHistList() {
        return gdsAnspHistList;
    }

    @Remove
    public void setGdsAnspHistList(List<GdsAnspHistBean> gdsAnspHistList) {
        this.gdsAnspHistList = gdsAnspHistList;
    }



}
