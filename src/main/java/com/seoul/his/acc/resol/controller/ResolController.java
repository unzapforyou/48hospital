package com.seoul.his.acc.resol.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.elementary.service.ElementaryServiceFacade;
import com.seoul.his.acc.resol.service.ResolServiceFacade;
import com.seoul.his.acc.resol.to.AppendFileBean;
import com.seoul.his.acc.resol.to.JourBean;
import com.seoul.his.acc.resol.to.PayRecBean;
import com.seoul.his.acc.resol.to.ResolLetBean;
import com.seoul.his.common.util.DataSetBeanMapper;


/**
 * <pre>
 * com.seoul.his.acc.resol.controller
 *    |_ ResolController.java
 *
 * </pre>
 * @date : 2016. 12. 14. 오후 4:28:27
 * @version :
 * @author : 응디꿍디
 */

@Controller
public class ResolController {
		@Autowired
		DataSetBeanMapper dataSetBeanMapper;
		@Autowired
		ResolServiceFacade resolServiceFacade;

		@RequestMapping("acc/resol/findResolLetList.do")
		public void findResolLetList(HttpServletRequest request, HttpServletResponse response) throws Exception{
			PlatformData outData = (PlatformData)request.getAttribute("outData");
			PlatformData inData = (PlatformData)request.getAttribute("inData");
			Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
			List<ResolLetBean> resolLetList = resolServiceFacade.findResolLetList(argsMap);
			dataSetBeanMapper.beansToDataset(outData, resolLetList, ResolLetBean.class);
		}

	    @RequestMapping("acc/resol/findResolLetDetailList.do")
	    public void findResolLetDetailList(HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	        PlatformData outData = (PlatformData) request.getAttribute("outData");
	        PlatformData inData = (PlatformData) request.getAttribute("inData");
	        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
	        ResolLetBean resolLetBean = resolServiceFacade.findResolLetDetail(argsMap);
	        List<JourBean> jourList = resolLetBean.getJourList();
	        List<PayRecBean> payRecList = resolLetBean.getPayRecList();
	        List<AppendFileBean> appendFileList = resolLetBean.getAppendFileList();
	        dataSetBeanMapper.beansToDataset(outData, jourList, JourBean.class);
	        dataSetBeanMapper.beansToDataset(outData, payRecList, PayRecBean.class);
	        dataSetBeanMapper.beansToDataset(outData, appendFileList, AppendFileBean.class);
	    }

}



