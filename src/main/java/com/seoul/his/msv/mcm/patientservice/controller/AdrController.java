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
import com.seoul.his.msv.mcm.patientservice.service.PatientServiceServiceFacade;
import com.seoul.his.msv.mcm.patientservice.to.AdrBean;


/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.controller
 *    |_ AdrController.java
 * </pre>
 *
 * @date : 2016. 12. 1. 오후 7:44:41
 * @version :
 * @author : Minhyeog
 */

@Controller
public class AdrController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	PatientServiceServiceFacade patientserviceServiceFacade;

    // 약물유해반응 조회
    @RequestMapping("msv/mcm/patientservice/findAdrList.do")
    public void findDiseaseList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        List<AdrBean> adrList = patientserviceServiceFacade.findAdrList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, adrList, AdrBean.class);
    }

    @RequestMapping("msv/mcm/patientservice/batchAdrProcess.do")
    public void batchAdrProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");

        List<AdrBean> adrList = dataSetBeanMapper.datasetToBeans(inData, AdrBean.class);
        patientserviceServiceFacade.batchAdrProcess(adrList);
    }
}
