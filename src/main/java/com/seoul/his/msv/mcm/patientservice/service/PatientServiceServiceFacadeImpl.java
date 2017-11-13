package com.seoul.his.msv.mcm.patientservice.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.mcm.patientservice.applicationService.PatientServiceApplicationService;
import com.seoul.his.msv.mcm.patientservice.applicationService.TransferPatientApplicationService;
import com.seoul.his.msv.mcm.patientservice.applicationService.TreatmentReservationApplicationService;
import com.seoul.his.msv.mcm.patientservice.to.AdrBean;
import com.seoul.his.msv.mcm.patientservice.to.AttentionalFieldBean;
import com.seoul.his.msv.mcm.patientservice.to.AttentionalPatientBean;
import com.seoul.his.msv.mcm.patientservice.to.DaySchBean;
import com.seoul.his.msv.mcm.patientservice.to.EmrPrescBean;
import com.seoul.his.msv.mcm.patientservice.to.MedicalConsultationRequestBean;
import com.seoul.his.msv.mcm.patientservice.to.RsvPatBean;
import com.seoul.his.msv.mcm.patientservice.to.TimeSchBean;
import com.seoul.his.msv.mcm.patientservice.to.TransferPatientBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.service
 *    |_ PatientServiceServiceFacadeImpl.java
 * </pre>
 *
 * @date : 2016. 11. 30. 오후 5:43:56
 * @version :
 * @author : Minhyeog
 */

@Service
public class PatientServiceServiceFacadeImpl implements PatientServiceServiceFacade {
	@Autowired
	PatientServiceApplicationService patientserviceApplicationService;
	@Autowired
	TreatmentReservationApplicationService treatmentReservationAppService;
	@Autowired
	TransferPatientApplicationService transferPatientApplicationService;
	/* 	 EMR 관리	*/
	@Override
	public List<EmrPrescBean> findEmrPrescList(Map<String, String> argsMap) {
		return patientserviceApplicationService.findEmrPrescList(argsMap);
	}

	/*	 ADR관리	*/
	@Override
	public List<AdrBean> findAdrList(Map<String, String> argsMap) {
		return patientserviceApplicationService.findAdrList(argsMap);
	}
	@Override
	public void batchAdrProcess(List<AdrBean> adrList) {
		patientserviceApplicationService.batchAdrProcess(adrList);
	}
	/* 관심환자관리 */
	@Override
	public List<AttentionalPatientBean> findAttentionalPatientList(Map<String, String> argsMap) {
		List<AttentionalPatientBean> attentionalPatientList = patientserviceApplicationService
				.findAttentionalPatientList(argsMap);
		return attentionalPatientList;
	}
	@Override
	public void registerAttentionalPatient(AttentionalPatientBean attentionalPatient) {
		patientserviceApplicationService.registerAttentionalPatient(attentionalPatient);
	}
	@Override
	public void  batchAttentionalPatientProcess(List<AttentionalPatientBean> attentionalPatientList ){
		patientserviceApplicationService.batchAttentionalPatientProcess(attentionalPatientList);
	}

	/* 관심분류관리 */
	@Override
	public List<AttentionalFieldBean> findAttentionalFieldList(Map<String, String> argsMap) {
		List<AttentionalFieldBean> attentionalFieldList = patientserviceApplicationService
				.findAttentionalFieldList(argsMap);
		return attentionalFieldList;
	}
	@Override
	public void batchAttentionalFieldProcess(List<AttentionalFieldBean> attentionalFieldList) {
		patientserviceApplicationService.batchAttentionalFieldProcess(attentionalFieldList);
	}
	/* 외래재진예약관리 */
	@Override
	public List<DaySchBean> findDayScheduleList(Map<String, String> argsMap) {

		return treatmentReservationAppService.findDayScheduleList(argsMap);
	}

	@Override
	public List<TimeSchBean> findTimeScheduleList(Map<String, String> argsMap) {
		return treatmentReservationAppService.findTimeScheduleList(argsMap);
	}

	@Override
	public List<MedicalConsultationRequestBean> findMedicalConsultationRequestList(Map<String, String> argsMap) {
		return patientserviceApplicationService.findMedicalConsultationRequestList(argsMap);
	}

	@Override
	public void batchMedicalConsultationRequestProcess(
			List<MedicalConsultationRequestBean> medicalConsultationRequestList) {
		patientserviceApplicationService.batchMedicalConsultationRequestProcess(medicalConsultationRequestList);
	}

	@Override
	public List<RsvPatBean> findRsvByPatList(Map<String, String> argsMap) {
		return treatmentReservationAppService.findRsvByPatList(argsMap);
	}

	// -------- 전원환자 등록 / 수정 / 삭제 / 조회 --------

	@Override
	public List<TransferPatientBean> findTransferPatientList(Map<String, String> argsMap){
		return transferPatientApplicationService.findTransferPatientList(argsMap);
	}

	@Override
	public void registerTransferPatient(TransferPatientBean transferPatientBean){
		transferPatientApplicationService.registerTransferPatient(transferPatientBean);
	}

	@Override
	public void modifyTransferPatient(TransferPatientBean transferPatientBean){
		transferPatientApplicationService.modifyTransferPatient(transferPatientBean);
	}

	@Override
	public void removeTransferPatient(TransferPatientBean transferPatientBean){
		transferPatientApplicationService.removeTransferPatient(transferPatientBean);
	}
}
