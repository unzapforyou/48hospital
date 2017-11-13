package com.seoul.his.hdm.admission.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.*;

/**
 * <pre>
 * com.seoul.his.hdm.admission.to
 *    |_ HospitalRoomBean.java
 *
 * </pre>
 * @date : 2016. 12. 7. 오전 11:49:09
 * @version :
 * @author : kimmu
 */


@Getter
@Setter
@ToString
@Dataset(name="dsHospitalRoom")
public class HospitalRoomBean extends BaseBean{

	private String hroomNo,                    // 병실번호
	               ward,                       // 병동
	               hroom,                      // 병실
	               applyPridStartDate,         // 적용시작일
	               applyPridEndDate,           // 적용만료일
	               trmtDept,                   // 진료과
	               hroomGrade,                 // 병실등급
	               gender,                     // 성별
	               sibdTel,                    // 병상전화번호
	               feeCd,                      // 수가코드
	               hroomDiffAmt,               // 병실차액
	               sibdCnt,                    // 병상개수
	               pmsnSibd,                   // 허가병상
	               finanCnt;                   // 재원자수

}




