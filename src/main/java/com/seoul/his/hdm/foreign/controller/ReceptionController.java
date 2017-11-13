package com.seoul.his.hdm.foreign.controller;

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
import com.seoul.his.hdm.foreign.service.ForeignServiceFacade;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;

@Controller
public class ReceptionController {

		@Autowired
	    DataSetBeanMapper dataSetBeanMapper;
	    @Autowired
	    private ForeignServiceFacade foreignServiceFacade;
	    
	    private PlatformData outData;
	    private PlatformData inData;
	    private Map<String, String> argsMap;

	   // 접수내역조회
	    @RequestMapping("hdm/foreign/findDiagnosisReceiptList.do")
	    public void findDiagnosisReceiptList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	        outData = (PlatformData) request.getAttribute("outData");
	        inData = (PlatformData) request.getAttribute("inData");
	        argsMap = dataSetBeanMapper.variablesToMap(inData);
	        List<ReceiptInfoBean> list
	        = foreignServiceFacade.findDiagnosisReceiptList(argsMap);
	        System.out.println("사이즈:"+list.size());
	        dataSetBeanMapper.beansToDataset(outData, list, ReceiptInfoBean.class);
	    }
	    // 접수 등록
	    @RequestMapping("hdm/foreign/registerDiagnosisReceipt.do")
	    public void registerDiagnosisReceipt(HttpServletRequest request, HttpServletResponse response) throws Exception {
	        inData = (PlatformData) request.getAttribute("inData");
	        NexacroLogger.debug(inData);
	        ReceiptInfoBean receiptInfoBean
	        = dataSetBeanMapper.datasetToBean( inData, ReceiptInfoBean.class);	        
	        foreignServiceFacade.registerDiagnosisReceipt(receiptInfoBean);
	    }
	    // 접수 삭제
	    @RequestMapping("hdm/foreign/removeDiagnosisReceipt.do")
	    public void removeDiagnosisReceipt(HttpServletRequest request, HttpServletResponse response) throws Exception {
	        inData = (PlatformData) request.getAttribute("inData");
	        ReceiptInfoBean receiptInfoBean
	        = dataSetBeanMapper.datasetToBean( inData, ReceiptInfoBean.class);
	        foreignServiceFacade.removeDiagnosisReceipt(receiptInfoBean);
	    }
}

