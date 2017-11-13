package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HyDependentMedicalBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  부양가족의료비공제테이블빈
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsHyDependentMedical")
public class HyDependentMedicalBean extends BaseBean{
	private String empNo,                          //사원번호
	               occGubun,                       //발생구분
	               medicalProofCode,               //의료증빙코드
	               medicalCompanyName,             //지급법인명
	               medicalGubun,                   //의료비구분
	               medicalAmt,                     //금액
	               regiNo,                         //주민등록번호
	               name;                           //이름
}