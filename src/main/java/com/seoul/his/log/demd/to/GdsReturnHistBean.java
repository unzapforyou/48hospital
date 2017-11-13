package com.seoul.his.log.demd.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.log.demd.to
 * @Class    GdsReturnHistBean.java
 * @Create   2016. 7. 6.
 * @Author   Bohyun
 * @Description 물품반품상세 빈
 *
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsGdsReturnHist")
public class GdsReturnHistBean extends BaseBean{
    String gdsCd;
    String gdsNm;
    String unit;
    String qnt;
    String returnDate;
    String returnSeq;
    String returnHistSeq;
    
    
}
