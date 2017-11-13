package com.seoul.his.hdm.consultationfee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hdm.consultationfee.service.ConsultationFeeServiceFacade;
import com.seoul.his.hdm.consultationfee.to.HosptlzPatBean;
import com.seoul.his.hdm.consultationfee.to.HosptlzPatReceBean;
import com.seoul.his.hdm.consultationfee.to.HosptlzTrmtCostBean;

@Controller
public class InpatientPaymentController {

	@Autowired
	private ConsultationFeeServiceFacade consultationFeeServiceFacade;

	@Autowired
	private DataSetBeanMapper dataSetBeanMapper;

	@RequestMapping("hdm/consultationfee/findInpatientPayment.do")
	public void findInpatientPayment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData;
		outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData;
		inData = (PlatformData) request.getAttribute("inData");
		Map<String, String> argsMap;
		argsMap = dataSetBeanMapper.variablesToMap(inData);

		List<HosptlzPatBean> hosptlzPatList;
		hosptlzPatList = consultationFeeServiceFacade.findInpatientPayment(argsMap);
		dataSetBeanMapper.beansToDataset(outData, hosptlzPatList, HosptlzPatBean.class);

		List<HosptlzTrmtCostBean> tempHosptlzTrmtCosList = new ArrayList<HosptlzTrmtCostBean>();
		for (HosptlzPatBean hosptlzPatBean : hosptlzPatList) {
			List<HosptlzTrmtCostBean> hosptlzTrmtCostList;
			hosptlzTrmtCostList = hosptlzPatBean.getHosptlzTrmtCostList();
			tempHosptlzTrmtCosList.addAll(hosptlzTrmtCostList);
		}
		dataSetBeanMapper.beansToDataset(outData, tempHosptlzTrmtCosList, HosptlzTrmtCostBean.class);
	}

	@RequestMapping("hdm/consultationfee/calcuInpatientPayment.do")
	public void calcuInpatientPayment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, String> argsMap;
		PlatformData inData;
		inData = (PlatformData) request.getAttribute("inData");
		argsMap = dataSetBeanMapper.variablesToMap(inData);

		consultationFeeServiceFacade.calcuInpatientPayment(argsMap);
	}

	@RequestMapping("hdm/consultationfee/findHosptlzPatRece.do")
	public void findHosptlzPatRece(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData;
		outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData;
		inData = (PlatformData) request.getAttribute("inData");
		Map<String, String> argsMap;
		argsMap = dataSetBeanMapper.variablesToMap(inData);

		HosptlzPatReceBean hosptlzPatReceBean;
		hosptlzPatReceBean = consultationFeeServiceFacade.findHosptlzPatRece(argsMap);

		dataSetBeanMapper.beanToDataset(outData, hosptlzPatReceBean, HosptlzPatReceBean.class);
	}

	@RequestMapping("hdm/consultationfee/callHosptlzPatRece.do")
	public void callHosptlzPatRece(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData;
		inData = (PlatformData) request.getAttribute("inData");

		HosptlzPatReceBean hosptlzPatReceBean;
		hosptlzPatReceBean = dataSetBeanMapper.datasetToBean(inData, HosptlzPatReceBean.class);

		consultationFeeServiceFacade.callHosptlzPatRece(hosptlzPatReceBean);
		findHosptlzPatRece(request, response);
	}
}
