package com.seoul.his.acc.budget.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Dataset(name = "dsJobLimit")
public class JobLimitBean extends BaseBean{
	private String 	chgCau			// 수정사유
					, chgDay		// 수정일
				    , modifier		// 수정자
				    , jobcl			// 직종
				    , limit			// 정원 
				    , prePersonnel  // 현원
				    , preLimit      // 정원대비
				    , preDate;      // 정원일
}
