
package com.seoul.his.msv.pre.prescriptionmanagement.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescDtlBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescMediBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescValueBean;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.dao
 *    |_ PrescValue.java
 *
 * </pre>
 * @date : 2016. 12. 11. 오후 4:27:42
 * @version :
 * @author : User
 */


public interface PrescValueDAO {

	List<PrescValueBean> selectPrescValueList(Map<String, String> argsMap);

	List<PrescMediBean> selectMedPrescList(Map<String, String> argsMap);

	void insertPrescDtl(PrescDtlBean prescDtlBean);

	void updatePrescDtl(PrescDtlBean prescDtlBean);

}





