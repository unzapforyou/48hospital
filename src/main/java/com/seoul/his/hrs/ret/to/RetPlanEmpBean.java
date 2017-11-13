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
 * @Class    RetPlanEmpBean.java
 * @Create   2016. 6. 26.
 * @Author   Ckeun
 * @Description
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsRetPlanEmp")
public class RetPlanEmpBean extends BaseBean{

	List<RetPlanEmpBean> retPlanEmpList; 	//퇴직예정자리스트
	
	@Remove
	public List<RetPlanEmpBean> getRetPlanEmpList() {
		return retPlanEmpList;
	}
	
	@Remove
	public void setRetPlanEmpList(List<RetPlanEmpBean> retPlanEmpList) {
		this.retPlanEmpList = retPlanEmpList;
	}

	String empNo						//사원번호
			,empNm						//사원명
			,deptCd						//부서코드
			,deptNm						//부서명
			,jobtt						//직급
			,retMonthWorkingdays; 		//퇴직예정일
}
