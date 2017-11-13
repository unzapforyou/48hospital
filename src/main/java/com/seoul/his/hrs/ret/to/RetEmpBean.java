package com.seoul.his.hrs.ret.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @Package  com.seoul.his.hrs.ret.to
 * @Class    RetEmpBean.java
 * @Create   2016. 6. 26.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsRetEmp")
public class RetEmpBean extends BaseBean{
	
	List<RetEmpBean> retEmpList;	//퇴직사원리스트
	
	@Remove
	public List<RetEmpBean> getRetEmpList() {
		return retEmpList;
	}
	@Remove
	public void setRetEmpList(List<RetEmpBean> retEmpList) {
		this.retEmpList = retEmpList;
	}

	String 	 empNo	//사원번호
			,empNm	//사원명
			,deptNm	//부서번호
			,jobtt	//직급
			,jobcl	//직종
			,hireDiv //고용명
			,hireDate//고용일
			,retDate;//퇴직일


	

}
