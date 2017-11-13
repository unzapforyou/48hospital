package com.seoul.his.msv.mcm.patientservice.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.to
 *    |_ TransferPatientBean.java
 *
 * </pre>
 * @date : 2016. 12. 19. 오후 2:35:26
 * @version :
 * @author : User
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsTransferPatientInfo")
	public class TransferPatientInfoBean {

	private String patNo,						//환자번호
						patNm,					//환자이름
						trmtDate,				//진료일
						trmtDept,				//진료과
						trmtDoct,					//진료의
						receiptDate,				//외래일자
						dgnsNm,					//진단명
						hosptlzDate,				//입원일자
						hosptlzYb,				//입원외래구분
						rrn1,						//주민번호
						rrn2,
						gender,					//성별
						age,						//나이
						tel,							//환자 연락처
						zip,						//우편번호
						addr,						//주소
						dtlAddr,
						trmtDeptNm,
						trmtDoctNm;














}





