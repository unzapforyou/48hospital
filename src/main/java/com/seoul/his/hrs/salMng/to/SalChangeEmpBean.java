package com.seoul.his.hrs.salMng.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salMng.to
 * @Class    SalChangeEmpBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsSalEmp")
public class SalChangeEmpBean {
	private String empNo,      // 사원번호
				   empNm,      // 사원명
				   deptCd,     // 부서코드
				   deptNm,     // 부서명
				   jobcl,      // 직종
				   jobrk,      // 직급
				   hireDate,   // 입사일자
				   rrn;        // 주민등록번호

}
