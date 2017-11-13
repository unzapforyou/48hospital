package com.seoul.his.bst.HospitalStaffPersonnelStatus.dao;



import java.util.List;

import com.seoul.his.hrs.emp.to.DisabilityBean;



/**
 *
 * @Package  com.seoul.his.bst.HospitalStaffPersonnelStatus.dao
 * @Class    DisabilityDAO.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description
 *
 * @LastUpdated
 */

public interface DisabilityDAO1 {
	List<DisabilityBean> findDisabilityList(String empNo);


}
