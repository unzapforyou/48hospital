package com.seoul.his.acc.budget.to;

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

@Dataset(name = "dsBudgMisa")
public class BudgMisaBean extends BaseBean {

	private 	String 	deciDept  		    // 승인부서
					    , deciNote  		// 승인사유
					    , signDiv   		// 상태구분
					    , appDept   		// 신청부서
					    , appDay    		// 신청일
					    , accYear   		// 회계년도 
					    , misaNo    		// 전용번호 
					    , calcReason		// 변경사유
					    , deciDay   ;		// 승인일
	
	private List<BudgMisaTagetBean> budgMisaTagetList;
	@Remove
	public List<BudgMisaTagetBean> getBudgMisaTagetList() {
		return budgMisaTagetList;
	}
	@Remove
	public void setBudgMisaTagetList(List<BudgMisaTagetBean> budgMisaTagetList) {
		this.budgMisaTagetList = budgMisaTagetList;
	}
}