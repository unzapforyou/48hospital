package com.seoul.his.hdm.admission.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.hdm.admission.service.AdmissionServiceFacade;
import com.seoul.his.hdm.admission.to.HospitalizationInfoBean;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;
import com.seoul.his.common.util.DataSetBeanMapper;


/**
 * <pre>
 * com.seoul.his.hdm.admission.controller
 *    |_ InpatientController.java
 * </pre>
 *
 * @date : 2016. 12. 4. 오후 2:44:35
 * @version :
 * @author : kimmu
 */

@Controller
public class HospitalizationController {

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	AdmissionServiceFacade admissionServiceFacade;
	private PlatformData inData;
	private PlatformData outData;
	private Map<String, String> argsMap;

	//입원정보 조회
	@RequestMapping("hdm/admission/findHospitalizationInfo.do")
	public void findHospitalizationInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		outData = (PlatformData) request.getAttribute("outData");
		inData = (PlatformData) request.getAttribute("inData");
		argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<HospitalizationInfoBean> hospitalizationInfoList = admissionServiceFacade.findHospitalizationInfo(argsMap);
		dataSetBeanMapper.beansToDataset(outData, hospitalizationInfoList, HospitalizationInfoBean.class);
	}

	//외래접수번호와 입원여부확인
	@RequestMapping("hdm/admission/findOutpaReceipt.do")
	public void findOutpaReceipt(HttpServletRequest request, HttpServletResponse response) throws Exception {
		outData = (PlatformData) request.getAttribute("outData");
		inData = (PlatformData) request.getAttribute("inData");
		argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<ReceiptInfoBean> receiptInfoList = admissionServiceFacade.findOutpaReceipt(argsMap);
		dataSetBeanMapper.beansToDataset(outData, receiptInfoList, ReceiptInfoBean.class);
	}

	//입원정보 일괄처리
	@RequestMapping("hdm/admission/batchHospitalizationProcess.do")
	public void batchHospitalizationProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		inData = (PlatformData) request.getAttribute("inData");
		List<HospitalizationInfoBean> hospitalizationInfoList = dataSetBeanMapper.datasetToBeans(inData, HospitalizationInfoBean.class);
		admissionServiceFacade.batchHospitalizationProcess(hospitalizationInfoList);
	}

	//입원등록번호(시퀀스) 얻기
	@RequestMapping("hdm/admission/callHospitalizationSeq.do")
	public void callHospitalizationSeq(HttpServletRequest request, HttpServletResponse response) throws Exception {
		outData = (PlatformData) request.getAttribute("outData");
		String hosptlzReceiptNo =admissionServiceFacade.callHospitalizationSeq();
		dataSetBeanMapper.addVariable(outData, "hosptlzReceiptNo", hosptlzReceiptNo);
	}



}
