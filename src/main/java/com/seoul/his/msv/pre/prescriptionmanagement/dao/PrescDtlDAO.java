/**
 *
 */
package com.seoul.his.msv.pre.prescriptionmanagement.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescDtlBean;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.dao
 *    |_ PrescDtlDAO.java
 *
 * </pre>
 * @date : 2016. 12. 12. 오전 11:35:14
 * @version :
 * @author : User
 */



public interface PrescDtlDAO {

	List<PrescDtlBean> selectPrescDtlList(Map<String, String> argsMap);
}





