package com.seoul.his.msv.mcm.patientservice.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hdm.foreign.service.ForeignServiceFacade;
import com.seoul.his.msv.mcm.patientservice.service.PatientServiceServiceFacade;
import com.seoul.his.msv.mcm.patientservice.to.TransferPatientBean;
import com.seoul.his.msv.mcm.patientservice.to.TransferPatientInfoBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.controller
 *    |_ TransferPatientController.java
 *
 * </pre>
 * @date : 2016. 12. 19. 오후 3:11:43
 * @version :
 * @author : User
 */
@Controller
public class TransferPatientController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	PatientServiceServiceFacade patientserviceServiceFacade;
	@Autowired
	ForeignServiceFacade foreignServiceFacade;

	@RequestMapping("msv/mcm/patientservice/findTransferPatientInfoList.do")
	public void findTransferPatientInfoList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<TransferPatientInfoBean> transferPatientInfoList = foreignServiceFacade.findTransferPatientInfoList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, transferPatientInfoList, TransferPatientInfoBean.class);
	}

	@RequestMapping("msv/mcm/patientservice/findTransferPatientList.do")
	public void findTransferPatientList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<TransferPatientBean> transferPatientList = patientserviceServiceFacade.findTransferPatientList(argsMap);
			System.out.println("transferPatientList -----------> " + transferPatientList);
			dataSetBeanMapper.beansToDataset(outData, transferPatientList, TransferPatientBean.class);
	}


	@RequestMapping("msv/mcm/patientservice/registerTransferPatient.do")
	public void registerTransferPatient(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		TransferPatientBean transferPatientBean = dataSetBeanMapper.datasetToBean(inData ,TransferPatientBean.class);
		patientserviceServiceFacade.registerTransferPatient(transferPatientBean);
	}

	@RequestMapping("msv/mcm/patientservice/modifyTransferPatient.do")
	public void modifyTransferPatient(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		TransferPatientBean transferPatientBean = dataSetBeanMapper.datasetToBean(inData ,TransferPatientBean.class);
		patientserviceServiceFacade.modifyTransferPatient(transferPatientBean);
	}

	@RequestMapping("msv/mcm/patientservice/removeTransferPatient.do")
	public void removeTransferPatient(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		TransferPatientBean transferPatientBean = dataSetBeanMapper.datasetToBean(inData ,TransferPatientBean.class);
		patientserviceServiceFacade.removeTransferPatient(transferPatientBean);
	}
}





