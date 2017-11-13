package com.seoul.his.hrs.yeta.service;

import java.util.Map;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.hrs.yeta.applicationService.YetaApplicationService;
import com.seoul.his.hrs.yeta.to.HmDeptBean;
import com.seoul.his.hrs.yeta.to.HmEmpBean;
import com.seoul.his.hrs.yeta.to.HsPayBean;
import com.seoul.his.hrs.yeta.to.HsRegularWorksSalaryBean;
import com.seoul.his.hrs.yeta.to.HyDeductionBean;
import com.seoul.his.hrs.yeta.to.HyDeductionDataBean;
import com.seoul.his.hrs.yeta.to.HyDependentBean;
import com.seoul.his.hrs.yeta.to.HyDependentDonationBean;
import com.seoul.his.hrs.yeta.to.HyDependentEducationBean;
import com.seoul.his.hrs.yeta.to.HyDependentInsuranceBean;
import com.seoul.his.hrs.yeta.to.HyDependentMedicalBean;
import com.seoul.his.hrs.yeta.to.HyDependentPaymentBean;
import com.seoul.his.hrs.yeta.to.HyFormerCompanyBean;
import com.seoul.his.hrs.yeta.to.HyYtaResultBean;

@Service
public class YetaServiceFacadeImpl implements YetaServiceFacade {
	@Autowired
	YetaApplicationService yetaApplicationService;

	@Override
	public List<HmEmpBean> findHmEmpList() {
		return yetaApplicationService.findHmEmpList();
	}

	@Override
	public List<HmDeptBean> findHmDeptList() {
		return yetaApplicationService.findHmDeptList();
	}

	@Override
	public void batchHmDeptProcess(List<HmDeptBean> hmDeptList) {
		yetaApplicationService.batchHmDeptProcess(hmDeptList);
	}

	@Override
	public void batchHmEmpProcess(List<HmEmpBean> hmEmpList) {
		yetaApplicationService.batchHmEmpProcess(hmEmpList);
	}

	@Override
	public List<HsPayBean> findHsPayList() {
		return yetaApplicationService.findHsPayList();
	}

	@Override
	public void batchHsPayProcess(List<HsPayBean> hsPayList) {
		yetaApplicationService.batchHsPayProcess(hsPayList);
	}

	@Override
	public List<HsRegularWorksSalaryBean> findHsRegularWorksSalaryList() {
		return yetaApplicationService.findHsRegularWorksSalaryList();
	}

	@Override
	public void batchHsRegularWorksSalaryProcess(List<HsRegularWorksSalaryBean> hsRegularWorksSalaryList) {
		yetaApplicationService.batchHsRegularWorksSalaryProcess(hsRegularWorksSalaryList);
	}

	@Override
	public void batchHyDeductionDataProcess(List<HyDeductionDataBean> hyDeductionDataList) {
		yetaApplicationService.batchHyDeductionDataProcess(hyDeductionDataList);
	}

	@Override
	public List<HyDependentBean> findHyDependentList() {
		return yetaApplicationService.findHyDependentList();
	}

	@Override
	public void batchHyDependentProcess(List<HyDependentBean> hyDependentList) {
		yetaApplicationService.batchHyDependentProcess(hyDependentList);
	}

	@Override
	public List<HyDependentDonationBean> findHyDependentDonationList() {
		return yetaApplicationService.findHyDependentDonationList();
	}

	@Override
	public void batchHyDependentDonationProcess(List<HyDependentDonationBean> hyDependentDonationList) {
		yetaApplicationService.batchHyDependentDonationProcess(hyDependentDonationList);
	}

	@Override
	public List<HyDependentEducationBean> findHyDependentEducationList() {
		return yetaApplicationService.findHyDependentEducationList();
	}

	@Override
	public void batchHyDependentEducationProcess(List<HyDependentEducationBean> hyDependentEducationList) {
		yetaApplicationService.batchHyDependentEducationProcess(hyDependentEducationList);
	}

	@Override
	public List<HyDependentInsuranceBean> findHyDependentInsuranceList() {
		return yetaApplicationService.findHyDependentInsuranceList();
	}

	@Override
	public void batchHyDependentInsuranceProcess(List<HyDependentInsuranceBean> hyDependentInsuranceList) {
		yetaApplicationService.batchHyDependentInsuranceProcess(hyDependentInsuranceList);
	}

	@Override
	public List<HyDependentMedicalBean> findHyDependentMedicalList() {
		return yetaApplicationService.findHyDependentMedicalList();
	}

	@Override
	public void batchHyDependentMedicalProcess(List<HyDependentMedicalBean> hyDependentMedicalList) {
		yetaApplicationService.batchHyDependentMedicalProcess(hyDependentMedicalList);
	}

	@Override
	public List<HyDependentPaymentBean> findHyDependentPaymentList() {
		return yetaApplicationService.findHyDependentPaymentList();
	}

	@Override
	public void batchHyDependentPaymentProcess(List<HyDependentPaymentBean> hyDependentPaymentList) {
		yetaApplicationService.batchHyDependentPaymentProcess(hyDependentPaymentList);
	}

	@Override
	public List<HyFormerCompanyBean> findHyFormerCompanyList() {
		return yetaApplicationService.findHyFormerCompanyList();
	}

	@Override
	public void batchHyFormerCompanyProcess(List<HyFormerCompanyBean> hyFormerCompanyList) {
		yetaApplicationService.batchHyFormerCompanyProcess(hyFormerCompanyList);
	}

	@Override
	public List<HyYtaResultBean> findHyYtaResultList(Map<String, String> argsMap) {
		return yetaApplicationService.findHyYtaResultList(argsMap);
	}

	@Override
	public void batchHyYtaResultProcess(List<HyYtaResultBean> hyYtaResultList) {
		yetaApplicationService.batchHyYtaResultProcess(hyYtaResultList);
	}

	@Override
	public HyDeductionBean findHyDeductionData(Map<String, String> argsMap) {
		return yetaApplicationService.findHyDeductionData(argsMap);
	}

	@Override
	public void executeYta(Map<String, String> argsMap) {
		yetaApplicationService.executeYta(argsMap);
	}
}
