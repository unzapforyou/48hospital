package com.seoul.his.hrs.yeta.service;

import java.util.Map;
import java.util.List;
import java.util.Map;

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

public interface YetaServiceFacade {
	HyDeductionBean findHyDeductionData(Map<String, String> argsMap);

	void executeYta(Map<String, String> argsMap);



	List<HmDeptBean> findHmDeptList();

	void batchHmDeptProcess(List<HmDeptBean> hmDeptList);

	List<HmEmpBean> findHmEmpList();

	void batchHmEmpProcess(List<HmEmpBean> hmEmpList);

	List<HsPayBean> findHsPayList();

	void batchHsPayProcess(List<HsPayBean> hsPayList);

	List<HsRegularWorksSalaryBean> findHsRegularWorksSalaryList();

	void batchHsRegularWorksSalaryProcess(List<HsRegularWorksSalaryBean> hsRegularWorksSalaryList);

	void batchHyDeductionDataProcess(List<HyDeductionDataBean> hyDeductionDataList);

	List<HyDependentBean> findHyDependentList();

	void batchHyDependentProcess(List<HyDependentBean> hyDependentList);

	List<HyDependentDonationBean> findHyDependentDonationList();

	void batchHyDependentDonationProcess(List<HyDependentDonationBean> hyDependentDonationList);

	List<HyDependentEducationBean> findHyDependentEducationList();

	void batchHyDependentEducationProcess(List<HyDependentEducationBean> hyDependentEducationList);

	List<HyDependentInsuranceBean> findHyDependentInsuranceList();

	void batchHyDependentInsuranceProcess(List<HyDependentInsuranceBean> hyDependentInsuranceList);

	List<HyDependentMedicalBean> findHyDependentMedicalList();

	void batchHyDependentMedicalProcess(List<HyDependentMedicalBean> hyDependentMedicalList);

	List<HyDependentPaymentBean> findHyDependentPaymentList();

	void batchHyDependentPaymentProcess(List<HyDependentPaymentBean> hyDependentPaymentList);

	List<HyFormerCompanyBean> findHyFormerCompanyList();

	void batchHyFormerCompanyProcess(List<HyFormerCompanyBean> hyFormerCompanyList);

	List<HyYtaResultBean> findHyYtaResultList(Map<String, String> argsMap);

	void batchHyYtaResultProcess(List<HyYtaResultBean> hyYtaResultList);
}
