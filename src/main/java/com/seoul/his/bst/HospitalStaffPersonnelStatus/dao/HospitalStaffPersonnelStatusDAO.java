package com.seoul.his.bst.HospitalStaffPersonnelStatus.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.bstDeptBean;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.HospitalStaffPersonnelStatusBean;



public interface HospitalStaffPersonnelStatusDAO {

	List<HospitalStaffPersonnelStatusBean> selectPersonnelStatusList(Map<String, String> argsMap);

	List<HospitalStaffPersonnelStatusBean> selectAllPersonnelStatusList();

	List<bstDeptBean> selectDeptList();

}
