package com.seoul.his.msv.sup.pathology.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;
import com.seoul.his.msv.sup.pathology.service.PathologyServiceFacade;
import com.seoul.his.msv.sup.pathology.to.PathologyBean;

/**
 * @Package  	com.seoul.his.msv.sup.pathology.controller
 * @Class    	PathologyController.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Controller
public class PathologyController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	PathologyServiceFacade pathologyServiceFacade;

	// 검체번호 조회
	@RequestMapping("sup/pathology/findClinspeNoList.do")
	public void findClinspeNoList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<SpecimenCollectionBean> specimenCollectionBeanList = pathologyServiceFacade.findClinspeNoList();
		dataSetBeanMapper.beansToDataset(outData, specimenCollectionBeanList, SpecimenCollectionBean.class);
	}

	// 검제정보 조회
	@RequestMapping("sup/pathology/findClinspeBlokList.do")
	public void findClinspeBlokList(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		String clinspeNo = inData.getVariable("clinspeNo").getString();
		PathologyBean pathologyBean = new PathologyBean();
		pathologyBean.setClinspeNo(clinspeNo);
		List<PathologyBean> specimenBlokList = pathologyServiceFacade.findClinspeBlokList(pathologyBean);
		dataSetBeanMapper.beansToDataset(outData, specimenBlokList, PathologyBean.class);
	}

	// 검체블록 일괄처리
	@RequestMapping("sup/pathology/batchClinspeBlokProcess.do")
	public void batchClinspeBlokProcess(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<PathologyBean> batchClinspeBlokList = dataSetBeanMapper.datasetToBeans(inData, PathologyBean.class);
		pathologyServiceFacade.batchClinspeBlokProcess(batchClinspeBlokList);
	}
}
