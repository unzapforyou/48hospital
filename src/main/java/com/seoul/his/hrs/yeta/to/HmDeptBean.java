package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HmDeptBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  부서테이블빈
 * @LastUpdated 
 */
@Dataset(name = "dsHmDept")
@Getter
@Setter
@ToString
public class HmDeptBean extends BaseBean{
	private String deptCd,												//부서코드
		   		   deptNm,												//부서명
		   		   sectionManagerNm;									//상위부서
	
}