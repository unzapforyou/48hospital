package com.seoul.his.bst.HospitalStaffPersonnelStatus.dao;



import java.util.List;

import com.seoul.his.hrs.emp.to.EducaBean;



/**
 *
 * @Package  com.seoul.his.bst.HospitalStaffPersonnelStatus.dao
 * @Class    EducationDAO.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description
 *
 * @LastUpdated
 */

public interface EducationDAO1 {
	List<EducaBean> findEducationList(String empNo);


}
