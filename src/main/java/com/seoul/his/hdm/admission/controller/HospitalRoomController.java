/**
 *
 */
package com.seoul.his.hdm.admission.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hdm.admission.service.AdmissionServiceFacade;
import com.seoul.his.hdm.admission.to.HospitalRoomBean;

/**
 * <pre>
 * com.seoul.his.hdm.admission.controller
 *    |_ HospitalRoomAssignmentController.java
 *
 * </pre>
 * @date : 2016. 12. 7. 오전 11:20:50
 * @version :
 * @author : kimmu
 */

@Controller
public class HospitalRoomController {

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	AdmissionServiceFacade admissionServiceFacade;
	private PlatformData inData;
	private PlatformData outData;
	private Map<String, String> argsMap;

	//병실 조회
    @RequestMapping("hdm/admission/findHospitalRoomList.do")
    public void findHospitalRoomList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");
        argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<HospitalRoomBean> hospitalRoomList = admissionServiceFacade.findHospitalRoomList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, hospitalRoomList, HospitalRoomBean.class);
    }

  //병실번호 시퀀스 얻기
    @RequestMapping("hdm/admission/getHospitalRoomSeq.do")
    public void getHospitalRoomSeq(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        String hospitalRoomSeq = admissionServiceFacade.getHospitalRoomSeq();
        dataSetBeanMapper.addVariable(outData, "hospitalRoomSeq", hospitalRoomSeq);
    }

    //병실정보 일괄처리
    @RequestMapping("hdm/admission/batchHospitalroomProcess.do")
    public void batchHospitalRoomProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        List<HospitalRoomBean> hospitalRoomBeanList = dataSetBeanMapper.datasetToBeans(inData, HospitalRoomBean.class);
        admissionServiceFacade.batchHospitalRoomProcess(hospitalRoomBeanList);
        dataSetBeanMapper.beanToDataset(outData, new HospitalRoomBean(), HospitalRoomBean.class);
    }

}





