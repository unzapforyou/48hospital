package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.TransferPatientBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.dao
 *    |_ TransferPatientDAO.java
 *
 * </pre>
 * @date : 2016. 12. 19. 오후 4:22:26
 * @version :
 * @author : User
 */

public interface TransferPatientDAO {

		List<TransferPatientBean> selectTransferPatientList(Map<String, String> argsMap);

		void insertTransferPatient(TransferPatientBean transferPatientBean);
		void updateTransferPatient(TransferPatientBean transferPatientBean);
		void deleteTransferPatient(TransferPatientBean transferPatientBean);
}





