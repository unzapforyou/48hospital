package com.seoul.his.hdm.consultationfee.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Dataset(name="dsDscgPat")
public class DscgPatBean extends BaseBean{

	private String patNo			// 환자등록번호
						 , patNm			// 환자이름
						 , hosptlzDate	// 입원일자
						 , dscgDate		// 퇴원일자
						 , trmtDept		// 진료과
						 , hroom			// 병실
						 , dscgGubun;	// 퇴원구분

	
}
