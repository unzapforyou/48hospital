package com.seoul.his.msv.sup.pathology.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.msv.sup.pathology.service.PathologyServiceFacade;
import com.seoul.his.msv.sup.pathology.to.SpecimenSlideBean;

/**
 * @Package  	com.seoul.his.msv.sup.pathology.controller
 * @Class    	SpecimenSlideController.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Controller
public class SpecimenSlideController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	PathologyServiceFacade pathologyServiceFacade;

	// 슬라이드 리스트 조회
	@RequestMapping("sup/pathology/findClinspeSliList.do")
	public void findClinspeSliList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        String cliNo = inData.getVariable("CLINSPE_NO").getString();
        SpecimenSlideBean specimenSlideBean = new SpecimenSlideBean();
        specimenSlideBean.setClinspeNo(cliNo);
        List<SpecimenSlideBean> specimenSlideBeanList = pathologyServiceFacade.findClinspeSliList(specimenSlideBean);
        dataSetBeanMapper.beansToDataset(outData, specimenSlideBeanList, SpecimenSlideBean.class);

	}

}
