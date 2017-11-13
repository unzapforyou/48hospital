package com.seoul.his.bst.HospitalStaffPersonnelStatus.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.service.HospitalStaffPersonnelStatusServiceFacade;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.bstDeptBean;
import com.seoul.his.bst.HospitalStaffPersonnelStatus.to.HospitalStaffPersonnelStatusBean;

import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.emp.to.CareerBean;
import com.seoul.his.hrs.emp.to.DisabilityBean;
import com.seoul.his.hrs.emp.to.EducaBean;
import com.seoul.his.hrs.emp.to.FamilyBean;
import com.seoul.his.hrs.emp.to.LicenseBean;
import com.seoul.his.hrs.emp.to.MilitaryBean;
import com.seoul.his.hrs.emp.to.PerconaldateBean;



/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    BudgBimokController.java
 * @Create   2016. 12. 24.
 * @Author   박상우
 * @Description
 *
 * @LastUpdated
 */

@Controller
public class HospitalStaffPersonnelStatusController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	HospitalStaffPersonnelStatusServiceFacade hospitalStaffPersonnelStatusServiceFacade;

	@RequestMapping("bst/hospitalStaffPersonnelStatus/findPersonnelStatusList.do")
	public void findPersonnelStatusList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

		List<HospitalStaffPersonnelStatusBean> empList = hospitalStaffPersonnelStatusServiceFacade.findPersonnelStatusList(argsMap);


		List<CareerBean> careerList = new ArrayList<CareerBean>();
		List<DisabilityBean> disabilityList = new ArrayList<DisabilityBean>();
		List<EducaBean> educationList = new ArrayList<EducaBean>();
		List<FamilyBean> familyList = new ArrayList<FamilyBean>();
		List<LicenseBean> licenseList = new ArrayList<LicenseBean>();
		List<MilitaryBean> militaryList = new ArrayList<MilitaryBean>();
		List<PerconaldateBean> perconaldateList = new ArrayList<PerconaldateBean>();

		for (HospitalStaffPersonnelStatusBean hospitalStaffPersonnelStatusBean : empList) {

			List<CareerBean> careerBeanList = hospitalStaffPersonnelStatusBean.getCareerList();
			if (careerBeanList != null)
				careerList.addAll(careerBeanList);

			List<DisabilityBean> disabilityBeanList = hospitalStaffPersonnelStatusBean.getDisabilityList();
			if (disabilityBeanList != null)
				disabilityList.addAll(disabilityBeanList);

			List<EducaBean> educationBeanList = hospitalStaffPersonnelStatusBean.getEducationBeanList();
			if (educationBeanList != null)
				educationList.addAll(educationBeanList);

			List<FamilyBean> familyBeanList = hospitalStaffPersonnelStatusBean.getFamilyList();
			if (familyBeanList != null)
				familyList.addAll(familyBeanList);

			List<LicenseBean> licenseBeanList = hospitalStaffPersonnelStatusBean.getLicenseList();
			if (licenseBeanList != null)
				licenseList.addAll(licenseBeanList);

			List<MilitaryBean> militaryBeanList = hospitalStaffPersonnelStatusBean.getMilitaryList();
			if (militaryBeanList != null)
				militaryList.addAll(militaryBeanList);

			List<PerconaldateBean> perconaldateBeanList = hospitalStaffPersonnelStatusBean.getPerconaldateList();
			if (perconaldateBeanList != null)
				perconaldateList.addAll(perconaldateBeanList);
		}

		dataSetBeanMapper.beansToDataset(outData, empList, HospitalStaffPersonnelStatusBean.class);

		dataSetBeanMapper.beansToDataset(outData, careerList, CareerBean.class);
		dataSetBeanMapper.beansToDataset(outData, disabilityList, DisabilityBean.class);
		dataSetBeanMapper.beansToDataset(outData, educationList, EducaBean.class);
		dataSetBeanMapper.beansToDataset(outData, familyList, FamilyBean.class);
		dataSetBeanMapper.beansToDataset(outData, licenseList, LicenseBean.class);
		dataSetBeanMapper.beansToDataset(outData, militaryList, MilitaryBean.class);
		dataSetBeanMapper.beansToDataset(outData, perconaldateList, PerconaldateBean.class);
	}

	@RequestMapping("bst/hospitalStaffPersonnelStatus/findAllPersonnelStatusList.do")
	public void findAllPersonnelStatusList(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PlatformData outData = (PlatformData) request.getAttribute("outData");

		List<HospitalStaffPersonnelStatusBean> empList = hospitalStaffPersonnelStatusServiceFacade.findAllPersonnelStatusList();

		List<CareerBean> careerList = new ArrayList<CareerBean>();
		List<DisabilityBean> disabilityList = new ArrayList<DisabilityBean>();
		List<EducaBean> educationList = new ArrayList<EducaBean>();
		List<FamilyBean> familyList = new ArrayList<FamilyBean>();
		List<LicenseBean> licenseList = new ArrayList<LicenseBean>();
		List<MilitaryBean> militaryList = new ArrayList<MilitaryBean>();
		List<PerconaldateBean> perconaldateList = new ArrayList<PerconaldateBean>();

		for (HospitalStaffPersonnelStatusBean hospitalStaffPersonnelStatusBean : empList) {

			List<CareerBean> careerBeanList = hospitalStaffPersonnelStatusBean.getCareerList();
			if (careerBeanList != null)
				careerList.addAll(careerBeanList);

			List<DisabilityBean> disabilityBeanList = hospitalStaffPersonnelStatusBean.getDisabilityList();
			if (disabilityBeanList != null)
				disabilityList.addAll(disabilityBeanList);

			List<EducaBean> educationBeanList = hospitalStaffPersonnelStatusBean.getEducationBeanList();
			if (educationBeanList != null)
				educationList.addAll(educationBeanList);

			List<FamilyBean> familyBeanList = hospitalStaffPersonnelStatusBean.getFamilyList();
			if (familyBeanList != null)
				familyList.addAll(familyBeanList);

			List<LicenseBean> licenseBeanList = hospitalStaffPersonnelStatusBean.getLicenseList();
			if (licenseBeanList != null)
				licenseList.addAll(licenseBeanList);

			List<MilitaryBean> militaryBeanList = hospitalStaffPersonnelStatusBean.getMilitaryList();
			if (militaryBeanList != null)
				militaryList.addAll(militaryBeanList);

			List<PerconaldateBean> perconaldateBeanList = hospitalStaffPersonnelStatusBean.getPerconaldateList();
			if (perconaldateBeanList != null)
				perconaldateList.addAll(perconaldateBeanList);
		}

		dataSetBeanMapper.beansToDataset(outData, empList, HospitalStaffPersonnelStatusBean.class);

		dataSetBeanMapper.beansToDataset(outData, careerList, CareerBean.class);
		dataSetBeanMapper.beansToDataset(outData, disabilityList, DisabilityBean.class);
		dataSetBeanMapper.beansToDataset(outData, educationList, EducaBean.class);
		dataSetBeanMapper.beansToDataset(outData, familyList, FamilyBean.class);
		dataSetBeanMapper.beansToDataset(outData, licenseList, LicenseBean.class);
		dataSetBeanMapper.beansToDataset(outData, militaryList, MilitaryBean.class);
		dataSetBeanMapper.beansToDataset(outData, perconaldateList, PerconaldateBean.class);
	}

	@RequestMapping("bst/hospitalStaffPersonnelStatus/findDeptList.do")
	public void findDeptList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		List<bstDeptBean> deptList = hospitalStaffPersonnelStatusServiceFacade.findDeptList();
		dataSetBeanMapper.beansToDataset(outData, deptList, bstDeptBean.class);
	}

}
