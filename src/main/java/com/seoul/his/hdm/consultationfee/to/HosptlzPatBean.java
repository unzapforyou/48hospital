package com.seoul.his.hdm.consultationfee.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name="dshosptlzPat")
public class HosptlzPatBean extends BaseBean{

	private String patNo				// 환자등록번호
				 , patNm				// 환자이름
				 , rrn1					// 주민번호 앞자리
				 , rrn2					// 주민번호 뒷자리
				 , gender				// 성별
				 , age					// 나이
				 , tel					// 연락처
				 , note					// 메모
				 , grtorNm				// 보증인성명
				 , grtorRrn				// 보증인주민
				 , grtorTel				// 보증인전화번호
				 , rship				// 보증인관계
				 , trmtDept				// 진료과
				 , ward					// 병실
				 , hroom				// 병동
				 , hosptlzRoute			// 입원경로
				 , dscgDate				// 퇴원일자
				 , patType				// 환자유형
				 , hosptlzDate			// 입원일자
				 , trmtDoct 			// 담당의
				 , dscgGubun			// 환자상태
				 , receState			// 수납상태
				 , hosptlzYb			// 입원여부
				 , hosptlzReceiptNo;	// 입원환자접수번호

	private List<HosptlzTrmtCostBean> HosptlzTrmtCostList;

	

	@Remove
	public List<HosptlzTrmtCostBean> getHosptlzTrmtCostList() {
		return HosptlzTrmtCostList;
	}

	@Remove
	public void setHosptlzTrmtCostList(List<HosptlzTrmtCostBean> hosptlzTrmtCostList) {
		HosptlzTrmtCostList = hosptlzTrmtCostList;
	}

}
