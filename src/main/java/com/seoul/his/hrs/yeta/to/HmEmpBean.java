package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HmEmpBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *	사원정보테이블빈		
 *
 * @LastUpdated 
 */
@Dataset(name = "dsHmEmp")
@Getter
@Setter
@ToString
public class HmEmpBean extends BaseBean{
	private String empNo,												//사원번호
	 	           empNm,												//사원명
	 	           jobcl,												//직종
	 	           jobtt,												//직위
	 	           jobrk,												//직급
	 	           rrn,													//주민등록번호
	 	           birthday,											//생년월일
	 	           gender,												//성별
	 	           mateYn,												//배우자유무
	 	           addr,												//주소
	 	           zipCd,												//우편번호
	 	           permaddr,											//본적
	 	           tel,				    								//전화번호
	 	           phone,												//휴대전화번호
	 	           extsn,												//원내전화
	 	           fax,													//팩스번호
	 	           password,											//비밀번호
	 	           image,												//사진
	 	           natnt,												//국적
	 	           localYn,												//내외국인여부
	 	           forinNum,											//외국인등록번호
	 	           deptCd,												//부서코드
	 	           hireDiv,												//고용구분
	 	           workStatus,											//재직상태
	 	           retMonthWorkingdays,									//퇴직예정일			
	 	           payStep,												//호봉
	 	           hireDate,											//입사일
	 	           pms,													//권한코드
	 	           detailAddr,											//상세주소	
	 	           email,												//이메일
	 	           bankNm,												//은행명
	 	           accountNm,											//계좌번호
	 	           retDate,												//퇴사일
	 	           payDate,												//급여일
	 	           workPeriod,											//근속년수
	 	           deptNm,												//부서명
	 	           frignSingleTxrate,									//외국인단일세율		
	 	           sts,													//상태
	 	           loginIp,												//최종접속IP
	 	           loginTime;											//최종접속시간
	
}