package com.seoul.his.msv.sup.endoscoperadiologydiagnosis.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.service.EndoscopeRadiologyDiagnosisServiceFacade;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.ClinspeSequenceBean;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionReceiptBean;

/**
 * @Package  	com.seoul.his.msv.sup.endoscoperadiologydiagnosis.controller
 * @Class    	DiagnosisController.java
 * @Create  	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Controller
public class DiagnosisController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	EndoscopeRadiologyDiagnosisServiceFacade endoscoperadiologydiagnosisServiceFacade;

	// 검체번호 조회
	@RequestMapping("sup/endoscoperadiologydiagnosis/findMaxClinspeNo.do")
	public void findMaxClinspeNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData outData = (PlatformData)request.getAttribute("outData");
		ClinspeSequenceBean clinspeSequenceBean = (ClinspeSequenceBean)endoscoperadiologydiagnosisServiceFacade.findMaxClinspeNo();
		dataSetBeanMapper.beanToDataset(outData, clinspeSequenceBean, ClinspeSequenceBean.class);
	}

	// 검체채취 리스트 조회
	@RequestMapping("sup/endoscoperadiologydiagnosis/findClinspeList.do")
	public void findClinspeList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		List<SpecimenCollectionBean> specimenCollectionBeanList = endoscoperadiologydiagnosisServiceFacade.findClinspeList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, specimenCollectionBeanList, SpecimenCollectionBean.class);
	}

	// 검체채취 일괄처리
	@RequestMapping("sup/endoscoperadiologydiagnosis/batchClinspeProcess.do")
	public void batchClinspeProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData)request.getAttribute("inData");
		PlatformData outData = (PlatformData)request.getAttribute("outData");
		List<SpecimenCollectionBean> diagnosisBeanList = dataSetBeanMapper.datasetToBeans(inData, SpecimenCollectionBean.class);
		endoscoperadiologydiagnosisServiceFacade.batchClinspeProcess(diagnosisBeanList);
		dataSetBeanMapper.beanToDataset(outData, new SpecimenCollectionBean(), SpecimenCollectionBean.class);
	}

	// 검체접수 조회
	@RequestMapping("sup/endoscoperadiologydiagnosis/findClinspeReceiptList.do")
	public void findClinspeReceiptList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    PlatformData inData = (PlatformData)request.getAttribute("inData");
	    PlatformData outData = (PlatformData)request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
    	List<SpecimenCollectionReceiptBean> specimenCollectionReceiptBeanList = endoscoperadiologydiagnosisServiceFacade.findClinspeReceiptList(argsMap);
		dataSetBeanMapper.beansToDataset(outData, specimenCollectionReceiptBeanList, SpecimenCollectionReceiptBean.class);
	}

	// 검체접수 일괄처리
	@RequestMapping("sup/endoscoperadiologydiagnosis/batchClinspeReceiptProcess.do")
	public void batchClinspeReceiptProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData)request.getAttribute("inData");
		PlatformData outData = (PlatformData)request.getAttribute("outData");
		List<SpecimenCollectionReceiptBean> specimenCollectionReceiptBeanList = dataSetBeanMapper.datasetToBeans(inData, SpecimenCollectionReceiptBean.class);
		endoscoperadiologydiagnosisServiceFacade.batchClinspeReceiptProcess(specimenCollectionReceiptBeanList);
		dataSetBeanMapper.beanToDataset(outData, new SpecimenCollectionReceiptBean(), SpecimenCollectionReceiptBean.class);
	}

}
