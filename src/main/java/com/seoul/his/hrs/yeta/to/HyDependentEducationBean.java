package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HyDependentEducationBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  부양가족교육비공제테이블빈
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsHyDependentEducation")
public class HyDependentEducationBean extends BaseBean{
	private String empNo,                                     //사원번호
	               occGubun,                                  //발생구분
	               eduGubun,                                  //교육비구분
	               eduAmt,                                    //교육비
	               regiNo,                                    //주민등록번호
	               name;                                      //이름
}