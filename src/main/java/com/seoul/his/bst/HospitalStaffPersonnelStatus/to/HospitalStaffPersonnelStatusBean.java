package com.seoul.his.bst.HospitalStaffPersonnelStatus.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;
import com.seoul.his.hrs.emp.to.CareerBean;
import com.seoul.his.hrs.emp.to.DisabilityBean;
import com.seoul.his.hrs.emp.to.EducaBean;
import com.seoul.his.hrs.emp.to.FamilyBean;
import com.seoul.his.hrs.emp.to.LicenseBean;
import com.seoul.his.hrs.emp.to.MilitaryBean;
import com.seoul.his.hrs.emp.to.PerconaldateBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.bst.HospitalStaffPersonnelStatus.to
 * @Class    HospitalStaffPersonnelStatusBean.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description   원내직원 인훤현황 Bean
 *
 * @LastUpdated   2016. 12. 24.
 */
@Getter
@Setter
@ToString

@Dataset(name = "dsHsps")
public class HospitalStaffPersonnelStatusBean extends BaseBean{

	private String empNo,      //사원번호
						empNm,     //사원명
						jobcl,          //직종
						jobtt,          //직위
						jobrk,          //직급
						gender,       //성별
						addr,           //주소
						detailAddr,   //상세주소
						zipCd,         //우편번호
						natnt,         //국적
						deptCd,       //부서코드
						hireDate,     //입사일
						workPeriod,  //근속년수
						deptNm;     //부서명

	List<CareerBean> careerList;			//경력리스트
	List<DisabilityBean> disabilityList;	//장애리스트
	List<EducaBean> educationBeanList;		//교육리스트
	List<FamilyBean> familyList;			//가족리스트
	List<LicenseBean> licenseList;			//자격리스트
	List<MilitaryBean> militaryList;		//병역리스트
	List<PerconaldateBean> perconaldateList;//인적사항리스트

	@Remove
	public List<CareerBean> getCareerList() {
		return careerList;
	}
	@Remove
	public void setCareerList(List<CareerBean> careerList) {
		this.careerList = careerList;
	}
	@Remove
	public List<DisabilityBean> getDisabilityList() {
		return disabilityList;
	}
	@Remove
	public void setDisabilityList(List<DisabilityBean> disabilityList) {
		this.disabilityList = disabilityList;
	}
	@Remove
	public List<EducaBean> getEducationBeanList() {
		return educationBeanList;
	}
	@Remove
	public void setEducationBeanList(List<EducaBean> educationBeanList) {
		this.educationBeanList = educationBeanList;
	}
	@Remove
	public List<FamilyBean> getFamilyList() {
		return familyList;
	}
	@Remove
	public void setFamilyList(List<FamilyBean> familyList) {
		this.familyList = familyList;
	}
	@Remove
	public List<LicenseBean> getLicenseList() {
		return licenseList;
	}
	@Remove
	public void setLicenseList(List<LicenseBean> licenseList) {
		this.licenseList = licenseList;
	}
	@Remove
	public List<MilitaryBean> getMilitaryList() {
		return militaryList;
	}
	@Remove
	public void setMilitaryList(List<MilitaryBean> militaryList) {
		this.militaryList = militaryList;
	}
	@Remove
	public List<PerconaldateBean> getPerconaldateList() {
		return perconaldateList;
	}
	@Remove
	public void setPerconaldateList(List<PerconaldateBean> perconaldateList) {
		this.perconaldateList = perconaldateList;
	}

}
