package com.seoul.his.hrs.yeta.applicationService;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.yeta.dao.HmDeptDAO;
import com.seoul.his.hrs.yeta.dao.HmEmpDAO;
import com.seoul.his.hrs.yeta.dao.HsPayDAO;
import com.seoul.his.hrs.yeta.dao.HsRegularWorksSalaryDAO;
import com.seoul.his.hrs.yeta.dao.HyDeductionDataDAO;
import com.seoul.his.hrs.yeta.dao.HyDependentDAO;
import com.seoul.his.hrs.yeta.dao.HyDependentDonationDAO;
import com.seoul.his.hrs.yeta.dao.HyDependentEducationDAO;
import com.seoul.his.hrs.yeta.dao.HyDependentInsuranceDAO;
import com.seoul.his.hrs.yeta.dao.HyDependentMedicalDAO;
import com.seoul.his.hrs.yeta.dao.HyDependentPaymentDAO;
import com.seoul.his.hrs.yeta.dao.HyFormerCompanyDAO;
import com.seoul.his.hrs.yeta.dao.HyYtaResultDAO;
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

@Component
public class YetaApplicationServiceImpl implements YetaApplicationService {
	@Autowired
	HmDeptDAO hmDeptDAO;
	@Autowired
	HmEmpDAO hmEmpDAO;
	@Autowired
	HsPayDAO hsPayDAO;
	@Autowired
	HsRegularWorksSalaryDAO hsRegularWorksSalaryDAO;
	@Autowired
	HyDeductionDataDAO hyDeductionDataDAO;
	@Autowired
	HyDependentDAO hyDependentDAO;
	@Autowired
	HyDependentDonationDAO hyDependentDonationDAO;
	@Autowired
	HyDependentEducationDAO hyDependentEducationDAO;
	@Autowired
	HyDependentInsuranceDAO hyDependentInsuranceDAO;
	@Autowired
	HyDependentMedicalDAO hyDependentMedicalDAO;
	@Autowired
	HyDependentPaymentDAO hyDependentPaymentDAO;
	@Autowired
	HyFormerCompanyDAO hyFormerCompanyDAO;
	@Autowired
	HyYtaResultDAO hyYtaResultDAO;


	@Override
	public List<HmDeptBean> findHmDeptList() {
		return hmDeptDAO.selectHmDeptList();
	}

	@Override
	public void batchHmDeptProcess(List<HmDeptBean> hmDeptBeanList) {
		for(HmDeptBean hmDeptBean : hmDeptBeanList){
			switch(hmDeptBean.getStatus()){
			case "inserted" :hmDeptDAO.insertHmDept(hmDeptBean); break;
			case "updated" :hmDeptDAO.updateHmDept(hmDeptBean); break;
			case "deleted" :hmDeptDAO.deleteHmDept(hmDeptBean); break;
			}
		}
	}

	@Override
	public List<HmEmpBean> findHmEmpList() {
		return hmEmpDAO.selectHmEmpList();
	}

	@Override
	public void batchHmEmpProcess(List<HmEmpBean> hmEmpBeanList) {
		for(HmEmpBean hmEmpBean : hmEmpBeanList){
			switch(hmEmpBean.getStatus()){
			case "inserted" :hmEmpDAO.insertHmEmp(hmEmpBean); break;
			case "updated" :hmEmpDAO.updateHmEmp(hmEmpBean); break;
			case "deleted" :hmEmpDAO.deleteHmEmp(hmEmpBean); break;
			}
		}
	}

	@Override
	public List<HsPayBean> findHsPayList() {
		return hsPayDAO.selectHsPayList();
	}

	@Override
	public void batchHsPayProcess(List<HsPayBean> hsPayBeanList) {
		for(HsPayBean hsPayBean : hsPayBeanList){
			switch(hsPayBean.getStatus()){
			case "inserted" :hsPayDAO.insertHsPay(hsPayBean); break;
			case "updated" :hsPayDAO.updateHsPay(hsPayBean); break;
			case "deleted" :hsPayDAO.deleteHsPay(hsPayBean); break;
			}
		}
	}

	@Override
	public List<HsRegularWorksSalaryBean> findHsRegularWorksSalaryList() {
		return hsRegularWorksSalaryDAO.selectHsRegularWorksSalaryList();
	}

	@Override
	public void batchHsRegularWorksSalaryProcess(List<HsRegularWorksSalaryBean> hsRegularWorksSalaryBeanList) {
		for(HsRegularWorksSalaryBean hsRegularWorksSalaryBean : hsRegularWorksSalaryBeanList){
			switch(hsRegularWorksSalaryBean.getStatus()){
			case "inserted" :hsRegularWorksSalaryDAO.insertHsRegularWorksSalary(hsRegularWorksSalaryBean); break;
			case "updated" :hsRegularWorksSalaryDAO.updateHsRegularWorksSalary(hsRegularWorksSalaryBean); break;
			case "deleted" :hsRegularWorksSalaryDAO.deleteHsRegularWorksSalary(hsRegularWorksSalaryBean); break;
			}
		}
	}

	@Override
	public void batchHyDeductionDataProcess(List<HyDeductionDataBean> hyDeductionDataBeanList) {
		for(HyDeductionDataBean hyDeductionDataBean : hyDeductionDataBeanList){
		    System.out.println("hyDeductionDataBean 상태 : "+hyDeductionDataBean.getStatus());
			switch(hyDeductionDataBean.getStatus()){
			case "inserted" :hyDeductionDataDAO.insertHyDeductionData(hyDeductionDataBean); break;
			case "updated" :hyDeductionDataDAO.updateHyDeductionData(hyDeductionDataBean); break;
			case "deleted" :hyDeductionDataDAO.deleteHyDeductionData(hyDeductionDataBean); break;
			}
		}
	}

	@Override
	public List<HyDependentBean> findHyDependentList() {
		return hyDependentDAO.selectHyDependentList();
	}

	@Override
	public void batchHyDependentProcess(List<HyDependentBean> hyDependentBeanList) {
		for(HyDependentBean hyDependentBean : hyDependentBeanList){
			switch(hyDependentBean.getStatus()){
			case "inserted" :hyDependentDAO.insertHyDependent(hyDependentBean); break;
			case "updated" :hyDependentDAO.updateHyDependent(hyDependentBean); break;
			case "deleted" :hyDependentDAO.deleteHyDependent(hyDependentBean); break;
			}
		}
	}

	@Override
	public List<HyDependentDonationBean> findHyDependentDonationList() {
		return hyDependentDonationDAO.selectHyDependentDonationList();
	}

	@Override
	public void batchHyDependentDonationProcess(List<HyDependentDonationBean> hyDependentDonationBeanList) {
		for(HyDependentDonationBean hyDependentDonationBean : hyDependentDonationBeanList){
			switch(hyDependentDonationBean.getStatus()){
			case "inserted" :hyDependentDonationDAO.insertHyDependentDonation(hyDependentDonationBean); break;
			case "updated" :hyDependentDonationDAO.updateHyDependentDonation(hyDependentDonationBean); break;
			case "deleted" :hyDependentDonationDAO.deleteHyDependentDonation(hyDependentDonationBean); break;
			}
		}
	}

	@Override
	public List<HyDependentEducationBean> findHyDependentEducationList() {
		return hyDependentEducationDAO.selectHyDependentEducationList();
	}

	@Override
	public void batchHyDependentEducationProcess(List<HyDependentEducationBean> hyDependentEducationBeanList) {
		for(HyDependentEducationBean hyDependentEducationBean : hyDependentEducationBeanList){
			switch(hyDependentEducationBean.getStatus()){
			case "inserted" :hyDependentEducationDAO.insertHyDependentEducation(hyDependentEducationBean); break;
			case "updated" :hyDependentEducationDAO.updateHyDependentEducation(hyDependentEducationBean); break;
			case "deleted" :hyDependentEducationDAO.deleteHyDependentEducation(hyDependentEducationBean); break;
			}
		}
	}

	@Override
	public List<HyDependentInsuranceBean> findHyDependentInsuranceList() {
		return hyDependentInsuranceDAO.selectHyDependentInsuranceList();
	}

	@Override
	public void batchHyDependentInsuranceProcess(List<HyDependentInsuranceBean> hyDependentInsuranceBeanList) {
		for(HyDependentInsuranceBean hyDependentInsuranceBean : hyDependentInsuranceBeanList){
			switch(hyDependentInsuranceBean.getStatus()){
			case "inserted" :hyDependentInsuranceDAO.insertHyDependentInsurance(hyDependentInsuranceBean); break;
			case "updated" :hyDependentInsuranceDAO.updateHyDependentInsurance(hyDependentInsuranceBean); break;
			case "deleted" :hyDependentInsuranceDAO.deleteHyDependentInsurance(hyDependentInsuranceBean); break;
			}
		}
	}

	@Override
	public List<HyDependentMedicalBean> findHyDependentMedicalList() {
		return hyDependentMedicalDAO.selectHyDependentMedicalList();
	}

	@Override
	public void batchHyDependentMedicalProcess(List<HyDependentMedicalBean> hyDependentMedicalBeanList) {
		for(HyDependentMedicalBean hyDependentMedicalBean : hyDependentMedicalBeanList){
			switch(hyDependentMedicalBean.getStatus()){
			case "inserted" :hyDependentMedicalDAO.insertHyDependentMedical(hyDependentMedicalBean); break;
			case "updated" :hyDependentMedicalDAO.updateHyDependentMedical(hyDependentMedicalBean); break;
			case "deleted" :hyDependentMedicalDAO.deleteHyDependentMedical(hyDependentMedicalBean); break;
			}
		}
	}

	@Override
	public List<HyDependentPaymentBean> findHyDependentPaymentList() {
		return hyDependentPaymentDAO.selectHyDependentPaymentList();
	}

	@Override
	public void batchHyDependentPaymentProcess(List<HyDependentPaymentBean> hyDependentPaymentBeanList) {
		for(HyDependentPaymentBean hyDependentPaymentBean : hyDependentPaymentBeanList){
			switch(hyDependentPaymentBean.getStatus()){
			case "inserted" :hyDependentPaymentDAO.insertHyDependentPayment(hyDependentPaymentBean); break;
			case "updated" :hyDependentPaymentDAO.updateHyDependentPayment(hyDependentPaymentBean); break;
			case "deleted" :hyDependentPaymentDAO.deleteHyDependentPayment(hyDependentPaymentBean); break;
			}
		}
	}

	@Override
	public List<HyFormerCompanyBean> findHyFormerCompanyList() {
		return hyFormerCompanyDAO.selectHyFormerCompanyList();
	}

	@Override
	public void batchHyFormerCompanyProcess(List<HyFormerCompanyBean> hyFormerCompanyBeanList) {
		for(HyFormerCompanyBean hyFormerCompanyBean : hyFormerCompanyBeanList){
			switch(hyFormerCompanyBean.getStatus()){
			case "inserted" :hyFormerCompanyDAO.insertHyFormerCompany(hyFormerCompanyBean); break;
			case "updated" :hyFormerCompanyDAO.updateHyFormerCompany(hyFormerCompanyBean); break;
			case "deleted" :hyFormerCompanyDAO.deleteHyFormerCompany(hyFormerCompanyBean); break;
			}
		}
	}

	@Override
	public List<HyYtaResultBean> findHyYtaResultList(Map<String, String> argsMap) {
		return hyYtaResultDAO.selectHyYtaResultList(argsMap);
	}

	@Override
	public void batchHyYtaResultProcess(List<HyYtaResultBean> hyYtaResultBeanList) {
		for(HyYtaResultBean hyYtaResultBean : hyYtaResultBeanList){
			switch(hyYtaResultBean.getStatus()){
			case "inserted" :hyYtaResultDAO.insertHyYtaResult(hyYtaResultBean); break;
			case "updated" :hyYtaResultDAO.updateHyYtaResult(hyYtaResultBean); break;
			case "deleted" :hyYtaResultDAO.deleteHyYtaResult(hyYtaResultBean); break;
			}
		}
	}

	@Override
	public HyDeductionBean findHyDeductionData(Map<String, String> argsMap) {
		return hyDeductionDataDAO.selectHyDeduction(argsMap);

	}

	@Override
	public void executeYta(Map<String, String> argsMap) {
		hyYtaResultDAO.executeYta(argsMap);
	}
}
