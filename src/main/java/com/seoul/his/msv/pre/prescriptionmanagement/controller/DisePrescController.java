package com.seoul.his.msv.pre.prescriptionmanagement.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.common.util.NexacroLogger;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;
import com.seoul.his.msv.pre.prescriptionmanagement.service.PrescriptionManagementServiceFacade;
import com.seoul.his.msv.pre.prescriptionmanagement.to.DiseaseBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientDsBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PatientPrscBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescDtlBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescMediBean;
import com.seoul.his.msv.pre.prescriptionmanagement.to.PrescValueBean;

/**
 * @Package  com.seoul.his.acc.budget.controller
 * @Class    BudgBimokController.java
 * @Create   2016. 6. 10.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated
 */

@Controller
public class DisePrescController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	PrescriptionManagementServiceFacade prescriptionmanagementServiceFacade;

	//진단명조회
	@RequestMapping("msv/pre/prescriptionmanagement/findDiseaseList.do")
	public void findDiseaseList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<DiseaseBean> diseaseList = prescriptionmanagementServiceFacade.findDiseaseList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, diseaseList, DiseaseBean.class);
	}

	//환자진단조회
	@RequestMapping("msv/pre/prescriptionmanagement/findDsPrescList.do")
	 public void findPatientDsPrscList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        List<PatientDsBean> patientDsList = prescriptionmanagementServiceFacade.findPatientDsList(argsMap);

        List<PatientPrscBean> patientPrscList = new ArrayList<>();
        for(PatientDsBean patientDsBean : patientDsList){

            patientPrscList.addAll(patientDsBean.getPatientPrscList());
        }
       dataSetBeanMapper.beansToDataset(outData, patientDsList, PatientDsBean.class);
       dataSetBeanMapper.beansToDataset(outData, patientPrscList, PatientPrscBean.class);

    }

	@RequestMapping("msv/pre/prescriptionmanagement/findPrescList.do")
	public void findPatientPrscList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
	    PlatformData outData = (PlatformData) request.getAttribute("outData");
	    Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
	    System.out.println("argsMap 처방-------------->"   + argsMap);
	    List<PrescValueBean> prescValueList = prescriptionmanagementServiceFacade.findPrescValueList(argsMap);
	    dataSetBeanMapper.beansToDataset(outData, prescValueList, PrescValueBean.class);
	}

	@RequestMapping("msv/pre/prescriptionmanagement/findMedPrescList.do")
	public void findMedPrescList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
	    PlatformData outData = (PlatformData) request.getAttribute("outData");
	    Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
	    System.out.println("argsMap 처방-------------->"   + argsMap);
	    List<PrescMediBean> prescValueList = prescriptionmanagementServiceFacade.findMedPrescList(argsMap);
	    dataSetBeanMapper.beansToDataset(outData, prescValueList, PrescMediBean.class);
	}

	@RequestMapping("msv/pre/prescriptionmanagement/findPrescDtlList.do")
	public void findPatientPrscDtlList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
	    PlatformData outData = (PlatformData) request.getAttribute("outData");
	    Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
	    		System.out.println("argsMap 처방상세-------------->"   + argsMap);
	    //List<PrescValueBean> prescValueList = prescriptionmanagementServiceFacade.findPrescValueList(argsMap);
	    List<PrescDtlBean> prescDtlList = prescriptionmanagementServiceFacade.findPrescDtlList(argsMap);

	    //dataSetBeanMapper.beansToDataset(outData, prescValueList, PrescValueBean.class);
	    dataSetBeanMapper.beansToDataset(outData, prescDtlList, PrescDtlBean.class);


	}


	//환자별 접수정보, 상병내역정보, 처방정보, 처방상세 일괄처리
	@RequestMapping("msv/pre/prescriptionmanagement/batchDisePrescProcess.do")
	public void batchDisePrescProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
	    NexacroLogger.debug(inData);

	    List<PatientDsBean> patientDsList = dataSetBeanMapper.datasetToBeans(inData, PatientDsBean.class);
	    List<PatientPrscBean> patientPrscList = dataSetBeanMapper.datasetToBeans(inData, PatientPrscBean.class);
	    List<PrescValueBean> prescValueList = dataSetBeanMapper.datasetToBeans(inData, PrescValueBean.class);
	    List<PrescDtlBean> prescDtlList = dataSetBeanMapper.datasetToBeans(inData, PrescDtlBean.class);
	    List<ReceiptInfoBean> receiptList=dataSetBeanMapper.datasetToBeans(inData, ReceiptInfoBean.class);

	    Map<String, Object> disePrescMap = new HashMap<>();
	    	disePrescMap.put("patientDsList", patientDsList);
	    	disePrescMap.put("patientPrscList", patientPrscList);
	    	disePrescMap.put("prescValueList", prescValueList);
	    	disePrescMap.put("prescDtlList", prescDtlList);
	    	disePrescMap.put("receiptList", receiptList);


	    prescriptionmanagementServiceFacade.batchDisePrescProcess(disePrescMap);
	}
}
