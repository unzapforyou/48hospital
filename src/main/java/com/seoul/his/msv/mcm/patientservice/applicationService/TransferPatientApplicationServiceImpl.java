package com.seoul.his.msv.mcm.patientservice.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.msv.mcm.patientservice.dao.TransferPatientDAO;
import com.seoul.his.msv.mcm.patientservice.to.TransferPatientBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.applicationService
 *    |_ TransferPatientApplicationServiceImpl.java
 *
 * </pre>
 * @date : 2016. 12. 19. 오후 3:52:26
 * @version :
 * @author : User
 */
@Component
public class TransferPatientApplicationServiceImpl implements TransferPatientApplicationService{
	@Autowired
	TransferPatientDAO transferPatientDAO;


	@Override
	public List<TransferPatientBean> findTransferPatientList (Map<String, String> argsMap) {
		return transferPatientDAO.selectTransferPatientList(argsMap);
	}

	@Override
	public void registerTransferPatient(TransferPatientBean transferPatientBean) {
		transferPatientDAO.insertTransferPatient(transferPatientBean);
	}
	@Override
	public void modifyTransferPatient(TransferPatientBean transferPatientBean) {
		transferPatientDAO.updateTransferPatient(transferPatientBean);
	}
	@Override
	public void removeTransferPatient(TransferPatientBean transferPatientBean) {
		transferPatientDAO.deleteTransferPatient(transferPatientBean);
	}

}





