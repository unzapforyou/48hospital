package com.seoul.his.bst.HospitalStaffPersonnelStatus.dao;



import java.util.List;

import com.seoul.his.hrs.emp.to.CareerBean;



/**
 *
 * @Package  com.seoul.his.bst.HospitalStaffPersonnelStatus.dao
 * @Class    CareerDAO.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description
 *
 * @LastUpdated
 */

public interface CareerDAO1 {

	List<CareerBean> findCareerList(String empNo);


}
