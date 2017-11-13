package com.seoul.his.hdm.admission.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.admission.to.HospitalizationScheduleBean;
import com.seoul.his.hdm.admission.to.HospitalizationScheduleManageBean;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;

public interface HospitalizationScheduleDAO {

	String selectHosptlzRsvtSeq();
	void insertHospitalizationSchedule(HospitalizationScheduleBean hospitalizationScheduleBean);
	List<HospitalizationScheduleBean> selectHospitalizationSchedule(Map<String, String> argsMap);
	void updataHosptalizationScheduleInfo(ReceiptInfoBean receiptInfoBean);
	List<HospitalizationScheduleManageBean> selectHospitalizationScheduleManageList(Map<String, String> argsMap);
	void updateHospitalizationScheduleYb(HospitalizationScheduleManageBean hospitalizationScheduleManageBean);
	void updateHospitalizationScheduleManage(HospitalizationScheduleManageBean hospitalizationScheduleManageBean);
	void deleteHospitalizationScheduleManage(HospitalizationScheduleManageBean hospitalizationScheduleManageBean);


}
