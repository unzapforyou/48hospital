package com.seoul.his.msv.mcm.patientservice.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.TransferPatientBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.applicationService
 *    |_ TransferPatientApplicationService.java
 *
 * </pre>
 * @date : 2016. 12. 19. 오후 3:51:55
 * @version :
 * @author : User
 */

public interface TransferPatientApplicationService {

	List<TransferPatientBean> findTransferPatientList (Map<String, String> argsMap);

	void registerTransferPatient(TransferPatientBean transferPatientBean);
	void modifyTransferPatient(TransferPatientBean transferPatientBean);
	void removeTransferPatient(TransferPatientBean transferPatientBean);

}





