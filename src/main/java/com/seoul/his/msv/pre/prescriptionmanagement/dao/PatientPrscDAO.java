
package com.seoul.his.msv.pre.prescriptionmanagement.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientPrscBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescValueBean;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.dao
 *    |_ PatientPrscDAO.java
 * </pre>
 *
 * @date : 2016. 12. 9. 오전 11:16:20
 * @version :
 * @author : 백송은
 */

public interface PatientPrscDAO {
	List<PatientPrscBean> selectPatientPrscList(Map<String, String> argsMap);

	void insertInPrescValue(PrescValueBean prescValueBean);

	void updateInPrescValue(PrescValueBean prescValueBean);

	void insertOutPrescValue(PrescValueBean prescValueBean);

	void updateOutPrescValue(PrescValueBean prescValueBean);


}





