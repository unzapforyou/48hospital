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
import com.seoul.his.acc.resol.to.ResolLetBean;
import com.seoul.his.acc.vat.service.VatServiceFacade;
import com.seoul.his.acc.vat.to.DetailTaxInvBean;
import com.seoul.his.acc.vat.to.TaxInvBean;
import com.seoul.his.common.util.DataSetBeanMapper;

/**
 * <pre>
 * com.seoul.his.acc.vat.controller
 *    |_ VatController.java
 *
 * </pre>
 * @date : 2016. 12. 16. 오후 12:18:53
 * @version :
 * @author : 응디꿍디
 */
@Controller
public class VatController {
	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	VatServiceFacade vatServiceFacade;



}





