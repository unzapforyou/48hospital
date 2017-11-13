package com.seoul.his.hdm.admission.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.hdm.admission.applicationService.*;
import com.seoul.his.hdm.admission.to.*;
import com.seoul.his.hdm.foreign.applicationService.ForeignApplicationService;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;
import com.seoul.his.hdm.patient.applicationService.PatientApplicationService;




/**
 * <pre>
 * com.seoul.his.hdm.admission.service
 *    |_ AdmissionServiceFacadeImpl.java
 * </pre>
 *
 * @date : 2016. 12. 12. 오후 7:38:50
 * @version :
 * @author : kimmu
 */




@Service
public class AdmissionServiceFacadeImpl implements AdmissionServiceFacade{
	@Autowired
	InpatientApplicationService inpatientApplicationService;
	@Autowired
	HospitalizationScheduleApplicationService hospitalizationScheduleApplicationService;
	@Autowired
	HospitalizationInfoApplicationService hospitalizationInfoApplicationService;
	@Autowired
	ForeignApplicationService foreignApplicationService;
	@Autowired
	HospitalRoomApplicationService hospitalRoomApplicationService;
	@Autowired
	PatientApplicationService patientApplicationService;

	@Override
		public List<InpatientBean> findInpatientList(Map<String, String> argsMap) {
		List<InpatientBean> inpatientList = inpatientApplicationService.findInpatientList(argsMap);
		return inpatientList;
	}

	@Override
	public String callhosptlzRsvtSeq() {
		return hospitalizationScheduleApplicationService.callhosptlzRsvtSeq();
	}

	@Override
	public void registerHospitalizationSchedule(List<HospitalizationScheduleBean> hospitalizationScheduleList) {
		hospitalizationScheduleApplicationService.registerHospitalizationSchedule(hospitalizationScheduleList);
	}

	@Override
	public List<HospitalizationInfoBean> findHospitalizationInfo(Map<String, String> argsMap) {
		return hospitalizationInfoApplicationService.findHospitalizationInfo(argsMap);
	}

	@Override
	public List<ReceiptInfoBean> findOutpaReceipt(Map<String, String> argsMap) {
		return foreignApplicationService.findDiagnosisReceiptList(argsMap);
	}

    @Override
    public List<HospitalRoomBean> findHospitalRoomList(Map<String, String> argsMap) {
        return hospitalRoomApplicationService.findHospitalRoomList(argsMap);
    }

	@Override
	public void batchHospitalizationProcess(List<HospitalizationInfoBean> hospitalizationInfoList) {
		hospitalizationInfoApplicationService.batchHospitalizationProcess(hospitalizationInfoList);
	}

	@Override
	public String callHospitalizationSeq() {
		return hospitalizationInfoApplicationService.callHospitalizationSeq();
	}

	@Override
	public List<HospitalizationScheduleBean> findHospitalizationSchedule(Map<String, String> argsMap) {
		return hospitalizationScheduleApplicationService.findHospitalizationSchedule(argsMap);
	}

	@Override
	public void modifyHosptalizationScheduleInfo(List<ReceiptInfoBean> receiptInfoList) {
		hospitalizationScheduleApplicationService.modifyHosptalizationScheduleInfo(receiptInfoList);
	}

	@Override
	public List<HospitalizationScheduleManageBean> findHospitalizationScheduleManageList(Map<String, String> argsMap) {
		return hospitalizationScheduleApplicationService.findHospitalizationScheduleManageList(argsMap);
	}

	@Override
	public void changeHospitalizationScheduleYb(List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList) {
		hospitalizationScheduleApplicationService.changeHospitalizationScheduleYb(hospitalizationScheduleManageList);
	}

	@Override
	public void batchHospitalizationScheduleManageProcess(List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList) {
		hospitalizationScheduleApplicationService.batchHospitalizationScheduleManageProcess(hospitalizationScheduleManageList);
	}

    @Override
    public void batchHospitalRoomProcess(List<HospitalRoomBean> hospitalRoomBeanList) {
    	hospitalRoomApplicationService.batchHospitalRoomProcess(hospitalRoomBeanList);
    }

    @Override
    public String getHospitalRoomSeq() {
    	return hospitalRoomApplicationService.getHospitalRoomSeq();
    }


}
