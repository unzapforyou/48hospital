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
import com.seoul.his.hdm.admission.to.HospitalizationScheduleBean;
import com.seoul.his.hdm.admission.to.HospitalizationScheduleManageBean;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.common.util.NexacroLogger;


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
public class HospitalizationScheduleController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	AdmissionServiceFacade admissionServiceFacade;
	private Map<String, String> argsMap;
	private PlatformData inData;
	private PlatformData outData;

	// 입원예약자 번호 생성
	@RequestMapping("hdm/admission/callhosptlzRsvtSeq.do")
	public void callhosptlzRsvtSeq(HttpServletRequest request, HttpServletResponse response) throws Exception {
		outData = (PlatformData) request.getAttribute("outData");

		String hosptlzRsvtNo = admissionServiceFacade.callhosptlzRsvtSeq();
		dataSetBeanMapper.addVariable(outData, "hosptlzRsvtNo", hosptlzRsvtNo);
	}

    // 입원예약정보 등록
	@RequestMapping("hdm/admission/registerHospitalizationSchedule.do")
	public void registerHospitalizationSchedule(HttpServletRequest request, HttpServletResponse response) throws Exception {
		inData = (PlatformData) request.getAttribute("inData");

		List<HospitalizationScheduleBean> hospitalizationScheduleList = dataSetBeanMapper.datasetToBeans(inData, HospitalizationScheduleBean.class);
		admissionServiceFacade.registerHospitalizationSchedule(hospitalizationScheduleList);
	}

	// 입원예약정보 조회
	@RequestMapping("hdm/admission/findHospitalizationSchedule.do")
	public void findHospitalizationSchedule(HttpServletRequest request, HttpServletResponse response) throws Exception {
		outData = (PlatformData) request.getAttribute("outData");
		inData = (PlatformData) request.getAttribute("inData");

		argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<HospitalizationScheduleBean> hospitalizationScheduleList = admissionServiceFacade.findHospitalizationSchedule(argsMap);
		System.out.println("입원예약조회 여기타나요 ? 몇개입니까 예약내역이  : "+hospitalizationScheduleList.size());
		dataSetBeanMapper.beansToDataset(outData, hospitalizationScheduleList, HospitalizationScheduleBean.class);
	}

	//입원예약자 변경(N -> Y)
	@RequestMapping("hdm/admission/modifyHospitalizationScheduleInfo.do")
	public void modifyHosptalizationScheduleInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		inData = (PlatformData) request.getAttribute("inData");

		List<ReceiptInfoBean> receiptInfoList = dataSetBeanMapper.datasetToBeans(inData, ReceiptInfoBean.class);
		admissionServiceFacade.modifyHosptalizationScheduleInfo(receiptInfoList);
	}

	//입원예정자 조회
	@RequestMapping("hdm/admission/hospitalizationScheduleList.do")
	public void findHosptlzPrdstorList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		outData = (PlatformData) request.getAttribute("outData");
		inData = (PlatformData) request.getAttribute("inData");

		argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList = admissionServiceFacade.findHospitalizationScheduleManageList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, hospitalizationScheduleManageList, HospitalizationScheduleManageBean.class);
	}

	//입원예약상태 변경(Y->N)
	@RequestMapping("hdm/admission/changeHospitalizationScheduleYb.do")
	public void changeHospitalizationScheduleYb(HttpServletRequest request, HttpServletResponse response) throws Exception {
		inData = (PlatformData) request.getAttribute("inData");

		List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList = dataSetBeanMapper.datasetToBeans(inData, HospitalizationScheduleManageBean.class);
		admissionServiceFacade.changeHospitalizationScheduleYb(hospitalizationScheduleManageList);
	}

	//입원예정자 입원일 변경.
	@RequestMapping("hdm/admission/batchHospitalizationScheduleProcess.do")
	public void batchProcessHosptlzRsvt(HttpServletRequest request, HttpServletResponse response) throws Exception {
		inData = (PlatformData) request.getAttribute("inData");
		System.out.println("batchProcessHosptlzRsvt : 입원예약일및 예약병동병실 수정");
		   NexacroLogger.debug(inData.getDataSetList());//받은데이터 내역보기
		List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList = dataSetBeanMapper.datasetToBeans(inData, HospitalizationScheduleManageBean.class);
		admissionServiceFacade.batchHospitalizationScheduleManageProcess(hospitalizationScheduleManageList);
	}


}
