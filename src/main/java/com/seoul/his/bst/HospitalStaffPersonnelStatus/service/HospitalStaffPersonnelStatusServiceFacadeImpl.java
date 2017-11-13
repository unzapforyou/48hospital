package com.seoul.his.bst.HospitalStaffPersonnelStatus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.bst.HospitalStaffPersonnelStatus.applicationService.HospitalStaffPersonnelStatusApplicationService;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.bstDeptBean;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.HospitalStaffPersonnelStatusBean;




/**
 * @Package  com.seoul.his.bst.HospitalStaffPersonnelStatus.service
 * @Class    HospitalStaffPersonnelStatusServiceFacadeImpl.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description
 *
 * @LastUpdated
 */

@Service
public class HospitalStaffPersonnelStatusServiceFacadeImpl implements HospitalStaffPersonnelStatusServiceFacade{

	@Autowired
	HospitalStaffPersonnelStatusApplicationService hospitalStaffPersonnelStatusApplicationService;


	@Override
	public List<HospitalStaffPersonnelStatusBean> findPersonnelStatusList(Map<String, String> argsMap) {
		return hospitalStaffPersonnelStatusApplicationService.findPersonnelStatusList(argsMap);
	}

	@Override
	public List<HospitalStaffPersonnelStatusBean> findAllPersonnelStatusList() {
		return hospitalStaffPersonnelStatusApplicationService.findAllPersonnelStatusList();
	}

	@Override
	public List<bstDeptBean> findDeptList() {
		return hospitalStaffPersonnelStatusApplicationService.findDeptList();
	}


}
