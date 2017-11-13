package com.seoul.his.hdm.admission.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.admission.to.HospitalizationScheduleBean;
import com.seoul.his.hdm.admission.to.HospitalizationScheduleManageBean;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;


public interface HospitalizationScheduleApplicationService {
	String callhosptlzRsvtSeq();
	void registerHospitalizationSchedule(List<HospitalizationScheduleBean> hospitalizationScheduleList);
	List<HospitalizationScheduleBean> findHospitalizationSchedule(Map<String, String> queryMap);
	void modifyHosptalizationScheduleInfo(List<ReceiptInfoBean> receiptInfoList);
	List<HospitalizationScheduleManageBean> findHospitalizationScheduleManageList(Map<String, String> argsMap);
	void changeHospitalizationScheduleYb(List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList);
	void batchHospitalizationScheduleManageProcess(List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList);

}
