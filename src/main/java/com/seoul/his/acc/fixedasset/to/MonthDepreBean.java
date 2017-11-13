/*
***********************************************************************************
*  �ۼ��� : Hello_world                                                            *
*  �ۼ��� : 2016.11.14                                                              *
***********************************************************************************
*/
package com.seoul.his.acc.fixedasset.to;
import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Dataset(name="dsMonthDepre")
public class MonthDepreBean extends BaseBean{

	private String assetNo,               // 자산번호
	               assetNm,               // 자산명
	               mngntCd,               // 관리구분 
	               acquDate,              // 취득일
	               acquAmt,               // 취득금액
	               ownDept,               // 보유부서
	               depreMthd,             // 상각방법
	               respoWorker,           // 담당자
	               pstLoc,                // 현위치
	               depreYm,               // 년월
	               thatmonthDepreRunYn,   // 실행여부
	               befYearResidAmt,       // 전년도잔존액
	               thatmonthDepreAmt,     // 당월상각액
	               thatyearDepreAmt;      // 당기상각액
}                                         



