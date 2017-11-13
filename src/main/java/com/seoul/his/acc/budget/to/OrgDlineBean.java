package com.seoul.his.acc.budget.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Dataset(name = "dsOrgDline")
public class OrgDlineBean extends BaseBean{
	
	private	String 	accYear		      // 회계연도
					, dlineDiv	      // 마감구분
				  	, procDiv	      // 처리구분
				  	, procDay	      // 처리일자
				  	, reason	      // 사유
				  	, procPerson;     // 처리자

}
