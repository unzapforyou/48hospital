package com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  	com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to
 * @Class    	SpecimenCollectionBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsClinspe")
public class SpecimenCollectionBean extends BaseBean {

	private String 	prescNo, // 처방번호
					trmtDept, // 진료과
					receiptCd, // 접수구분
					respDoct, // 진료의사
					dgnsNm, //
					exmntCd, // 검사항목
					clinspeNm, // 검체명
					bloodgetDate, // 채취일시
					bloodgetEmp, // 채취자
					clinspeNo, // 검체번호
					patNo, // 환자등록번호
					patNm, // 환자명
					gender, // 성별
					ward, // 병동
					hroom, // 병실
					clinspeBlokCode; // 검체블록코드

}
