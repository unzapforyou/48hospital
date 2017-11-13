package com.seoul.his.acc.vat.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.vat.service.VatServiceFacade;
import com.seoul.his.acc.vat.to.DetailTaxInvBean;
import com.seoul.his.acc.vat.to.TaxInvBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * <pre>
 * com.seoul.his.acc.vat.controller
 *    |_ TaxInvController.java
 *
 * </pre>
 * @date : 2016. 12. 23. 오후 3:13:31
 * @version :
 * @author : 응디꿍디
 */
@Controller
public class TaxInvController {
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	VatServiceFacade vatServiceFacade;

	@RequestMapping("acc/vat/findTaxInvList.do")
	public void findTaxInvList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData outData = (PlatformData)request.getAttribute("outData");
		PlatformData inData = (PlatformData)request.getAttribute("inData");
		   Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
		   List<DetailTaxInvBean> detailTaxInvList= vatServiceFacade.searchTaxInvList(argsMap);


	        dataSetBeanMapper.beansToDataset(outData, detailTaxInvList,DetailTaxInvBean.class);
	   }
}





