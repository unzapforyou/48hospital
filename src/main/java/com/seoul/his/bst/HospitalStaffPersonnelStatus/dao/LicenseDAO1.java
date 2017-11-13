package com.seoul.his.bst.HospitalStaffPersonnelStatus.dao;



import java.util.List;

import com.seoul.his.hrs.emp.to.LicenseBean;


/**
 *
 * @Package com.seoul.his.bst.HospitalStaffPersonnelStatus.dao
 * @Class    LicenseDAO.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description
 *
 * @LastUpdated
 */

public interface LicenseDAO1 {
	List<LicenseBean> findLicenseList(String empNo);




}
