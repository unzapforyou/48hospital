package com.seoul.his.acc.budget.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Dataset(name = "dsBudgBimok")
public class BudgBimokBean extends BaseBean{
	
	private	String	bimokCd			// 예산비목코드
				    , accYear		// 회계연도
				    , bimokNm		// 예산비목명칭
				    , parentBimok	// 상위코드
				    , acntCd		// 계정코드
				    , acntNm		// 계정명
				    , assiSubCd		// 보조과목코드
				    , assiSubNm		// 보조과목명
				    , bimokLevel	// 수준
				    , finYn			// 최종여부
				    , useYn			// 사용여부
				    , goveAprcYn	// 정부출연여부
				    , budgGuide		// 예산지침내용
				    , creDebDiv   	//
				    , deptCount;   	//


	
	
}
