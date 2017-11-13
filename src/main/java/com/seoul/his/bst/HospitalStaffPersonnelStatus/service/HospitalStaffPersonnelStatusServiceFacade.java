package com.seoul.his.bst.HospitalStaffPersonnelStatus.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.bstDeptBean;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.HospitalStaffPersonnelStatusBean;


/**
 *
 * @Package  com.seoul.his.bst.HospitalStaffPersonnelStatus.service
 * @Class    HospitalStaffPersonnelStatusServiceFacade.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description
 *			 인원통계 ServiceFacade
 * @LastUpdated
 * 			2016. 12. 24.
 */

public interface HospitalStaffPersonnelStatusServiceFacade {

	List<HospitalStaffPersonnelStatusBean> findPersonnelStatusList(Map<String, String> argsMap);

	List<HospitalStaffPersonnelStatusBean> findAllPersonnelStatusList();

	List<bstDeptBean> findDeptList();

}
