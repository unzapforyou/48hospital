package com.seoul.his.bst.HospitalStaffPersonnelStatus.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.bst.HospitalStaffPersonnelStatus.to
 * @Class    DeptBean.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description   부서 Bean
 *
 * @LastUpdated   2016. 12. 24.
 */
@Getter
@Setter
@ToString

@Dataset(name = "dsDept")
public class bstDeptBean extends BaseBean{

	private String deptCd, //.부서코드
						deptNm, //부서명
						sectionManagerNm; //상위부서

}
