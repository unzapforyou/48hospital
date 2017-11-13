package com.seoul.his.msv.mcm.patientservice.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.to
 *    |_ TransferPatientBean.java
 *
 * </pre>
 * @date : 2016. 12. 19. 오후 2:36:17
 * @version :
 * @author : User
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsTransferPatient")
 public class TransferPatientBean extends BaseBean{
	private String transferNo,				//전원환자번호
						patNo,					//환자번호
						receiptDate,				//접수일자
						recodeDate,				//기록일자
						transferDate,			//전원일자
						trmtDept,				//진료과
						trmtDoct,					//진료의
						dgnsNm,					//진단명
						dischargeDate,			//퇴원일자
						transferHosNm,			//전원기관명
						transferHosDept,		//전원진료과
						transferHosDoct,		//전원기관전문의
						transferHosTel,			//전원기관연락처
						transferReason,			//전원사유
						providingMedInfo,		//의료정보제공
						recodeYn,				//작성여부
						adviceResult,			//상담결과
						note;						//비고

}





