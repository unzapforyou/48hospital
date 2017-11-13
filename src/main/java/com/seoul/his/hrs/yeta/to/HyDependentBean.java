package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HyDependentBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *	부앙가족테이블빈
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsHyDependent")
public class HyDependentBean extends BaseBean{
	private String name,                               //성명
				   regiNo,                             //주민등록번호
				   basicDdt,                           //기본공제
				   womenDdt,                           //부녀자공제
				   handicappedPersonDdt,               //장애인공제
				   singleParentDdt,                    //한부모공제
				   senior70yearoverDdt,                //경로우대공제
				   empNo,                              //사원번호
				   belongYear,                         //귀속연도
				   relationGubun,                      //관계구분
				   pensionerDdt,                       //
				   foChdDdt;                           //
}