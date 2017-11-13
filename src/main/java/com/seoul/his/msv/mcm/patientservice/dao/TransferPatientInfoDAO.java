package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.TransferPatientInfoBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.dao
 *    |_ TransferPatientInfoDAO.java
 *
 * </pre>
 * @date : 2016. 12. 19. 오후 2:52:50
 * @version :
 * @author : User
 */

public interface TransferPatientInfoDAO {
	List<TransferPatientInfoBean> selectTransferPatInfoList(Map<String, String> argsMap);
}





