package com.seoul.his.bst.HospitalStaffPersonnelStatus.applicationService;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.bst.HospitalStaffPersonnelStatus.dao.HospitalStaffPersonnelStatusDAO;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.bstDeptBean;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.HospitalStaffPersonnelStatusBean;



/**
 * @Package  com.seoul.his.bst.HospitalStaffPersonnelStatus.applicationService
 * @Class    HospitalStaffPersonnelStatusApplicationServiceImpl.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description
 *
 * @LastUpdated
 */

@Component
public class HospitalStaffPersonnelStatusApplicationServiceImpl implements HospitalStaffPersonnelStatusApplicationService{
	@Autowired
	HospitalStaffPersonnelStatusDAO hospitalStaffPersonnelStatusDAO;




	@Override
	public List<HospitalStaffPersonnelStatusBean> findPersonnelStatusList(Map<String, String> argsMap) {
		return hospitalStaffPersonnelStatusDAO.selectPersonnelStatusList(argsMap);
	}

	@Override
	public List<HospitalStaffPersonnelStatusBean> findAllPersonnelStatusList() {
		return hospitalStaffPersonnelStatusDAO.selectAllPersonnelStatusList();
	}

	@Override
	public List<bstDeptBean> findDeptList() {
		return hospitalStaffPersonnelStatusDAO.selectDeptList();
	}


}
