/**
 *
 */
package com.seoul.his.msv.pre.prescriptionmanagement.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientDsBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientPrscBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescValueBean;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.dao
 *    |_ PatientDAO.java
 *
 * </pre>
 * @date : 2016. 12. 9. 오후 12:33:26
 * @version :
 * @author : 백송은
 */



public interface PatientDsDAO {

	List<PatientDsBean> selectPatientDsList(Map<String, String> argsMap);

	void insertPatientDs(PatientDsBean patientDsBean);

	void updatePatientDs(PatientDsBean patientDsBean);

	void insertInpatientPrsc(PatientPrscBean patientPrscBean);

	void updateInpatientPrsc(PatientPrscBean patientPrscBean);

	void insertOutpatientPrsc(PatientPrscBean patientPrscBean);

	void updateOutpatientPrsc(PatientPrscBean patientPrscBean);





}





