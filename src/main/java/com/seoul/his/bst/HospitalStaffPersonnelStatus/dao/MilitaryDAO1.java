package com.seoul.his.bst.HospitalStaffPersonnelStatus.dao;



import java.util.List;

import com.seoul.his.hrs.emp.to.MilitaryBean;



/**
 *
 * @Package  com.seoul.his.bst.HospitalStaffPersonnelStatus.dao
 * @Class    MilitaryDAO.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description
 *
 * @LastUpdated
 */

public interface MilitaryDAO1 {
	List<MilitaryBean> findMilitaryList(String empNo);


}
