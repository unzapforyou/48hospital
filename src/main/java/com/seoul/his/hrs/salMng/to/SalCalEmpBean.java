package com.seoul.his.hrs.salMng.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salMng.to
 * @Class    SalCalEmpBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsSalCalEmp")
public class SalCalEmpBean{
    private String empNo,          // 사원번호
	               empNm,          // 사원명
	               jobClass,       // 직종
	               belongYm,       // 귀속연월
	               paymentDate,    // 지급일자
	               aap,            // 차인지급액
	               select = "0" ;  // checkbox 미선택
	
	private List<SalCalPayDedBean> salCalPayDeduList;
	
	@Remove
    public List<SalCalPayDedBean> getSalCalPayDeduList() {
        return salCalPayDeduList;
    }
	
	@Remove
    public void setSalCalPayDeduList(List<SalCalPayDedBean> salCalPayDeduList) {
        this.salCalPayDeduList = salCalPayDeduList;
    }

	
}
