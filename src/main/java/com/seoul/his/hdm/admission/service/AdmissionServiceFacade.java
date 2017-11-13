package com.seoul.his.hdm.admission.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.admission.to.*;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;



public interface AdmissionServiceFacade {

	List<InpatientBean> findInpatientList(Map<String, String> argsMap);
	String callhosptlzRsvtSeq();
	void registerHospitalizationSchedule(List<HospitalizationScheduleBean> hospitalizationScheduleList);
	List<HospitalizationInfoBean> findHospitalizationInfo(Map<String, String> argsMap);
	List<ReceiptInfoBean> findOutpaReceipt(Map<String, String> argsMap);
	List<HospitalRoomBean> findHospitalRoomList(Map<String, String> argsMap);
	void batchHospitalizationProcess(List<HospitalizationInfoBean> hosptlzReceipt);
	String callHospitalizationSeq();
	List<HospitalizationScheduleBean> findHospitalizationSchedule(Map<String, String> argsMap);
	void modifyHosptalizationScheduleInfo(List<ReceiptInfoBean> receiptInfoList);
	List<HospitalizationScheduleManageBean> findHospitalizationScheduleManageList(Map<String, String> argsMap);
	void changeHospitalizationScheduleYb(List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList);
	void batchHospitalizationScheduleManageProcess(List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList);
	void batchHospitalRoomProcess(List<HospitalRoomBean> hospitalRoomBeanList);
	String getHospitalRoomSeq();

}
