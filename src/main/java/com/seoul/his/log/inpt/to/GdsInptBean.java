package com.seoul.his.log.inpt.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  	com.seoul.his.log.inpt.to
 * @Class    	GdsInptBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description 물품검수 빈
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsGdsInpt")
public class GdsInptBean extends BaseBean{
    private String
    amt             //계약금액
    ,ctrtNo         //계약번호
    ,delayDays      //지체일
    ,delayGijunPay  //기체기준액
    ,delayPrzAmt    //지체상금
    ,delayRate      //지체비율
    ,delivDay       //납품일
    ,gdsInptNo      //물품검수번호
    ,inptDate;      //검수일

}
