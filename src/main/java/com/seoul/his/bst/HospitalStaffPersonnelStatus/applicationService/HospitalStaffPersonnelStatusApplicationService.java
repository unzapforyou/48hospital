package com.seoul.his.bst.HospitalStaffPersonnelStatus.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.bstDeptBean;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.HospitalStaffPersonnelStatusBean;




public interface HospitalStaffPersonnelStatusApplicationService {

	List<HospitalStaffPersonnelStatusBean> findPersonnelStatusList(Map<String, String> argsMap);

	List<HospitalStaffPersonnelStatusBean> findAllPersonnelStatusList();

	List<bstDeptBean> findDeptList();


}
