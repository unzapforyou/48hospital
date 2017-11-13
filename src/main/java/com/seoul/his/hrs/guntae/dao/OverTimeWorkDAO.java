package com.seoul.his.hrs.guntae.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hrs.guntae.to.OverTimeWorkBean;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.dao
 *    |_ OverTimeWorkDAO.java
 *
 * </pre>
 * @date : 2016. 12. 23. 오후 5:25:58
 * @version :
 * @author : User
 */

public interface OverTimeWorkDAO {

	List<OverTimeWorkBean> selectOverTimeWorkList(Map<String, String> argsMap);

	List<OverTimeWorkBean> selectApproverOverTimeWorkList();

	void insertOverTimeWork(OverTimeWorkBean overTimeWorkbean);

	void updateOverTimeWork(OverTimeWorkBean overTimeWorkbean);

	void deleteOverTimeWork(OverTimeWorkBean overTimeWorkbean);

	void deleteBeforeOverTimeWork(OverTimeWorkBean overTimeWorkbean);

}





