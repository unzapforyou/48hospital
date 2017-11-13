package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HyDependentDonationBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  부양가족기부금공제테이블빈
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsHyDependentDonation")
public class HyDependentDonationBean extends BaseBean{
	private String empNo,                                     //사원번호
	               occGubun,                                  //발생구분
	               donationType,                              //기부유형
	               donationDate,                              //기부일
	               donationCompanyName,                       //지급법인명
	               donationAmt,                               //금액
	               regiNo,                                    //주민등록번호
	               name;                                      //이름
}