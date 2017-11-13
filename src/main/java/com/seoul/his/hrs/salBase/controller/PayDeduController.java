package com.seoul.his.hrs.salBase.controller;

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
import com.seoul.his.hrs.salBase.service.SalBaseServiceFacade;
import com.seoul.his.hrs.salBase.to.PayDeduBean;
import com.seoul.his.hrs.salBase.to.PayDeduSectBean;

/**
 * @Package  com.seoul.his.hrs.salBase.controller
 * @Class    PayDeduController.java
 * @Create   2016. 5. 25.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Controller
public class PayDeduController {
	@Autowired
	public SalBaseServiceFacade salBaseServiceFacade;

	@Autowired
    private DataSetBeanMapper dataSetBeanMapper;

	@RequestMapping("hrs/salBase/findPayDeduList.do")
	public void findPayDeduList(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    System.out.println("findPayDeduList 컨트롤러");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);

        List<PayDeduBean> payDeduList = salBaseServiceFacade.findPayDeduList(argsMap);
		List<PayDeduSectBean> payDeduSectList = new ArrayList<>();
		
		for(PayDeduBean payDeduBean : payDeduList){
			payDeduSectList.addAll(payDeduBean.getPayDeduSectList());
		}

		dataSetBeanMapper.beansToDataset(outData, payDeduList, PayDeduBean.class);
		dataSetBeanMapper.beansToDataset(outData, payDeduSectList, PayDeduSectBean.class);
	}
	
	//마감
	@RequestMapping("hrs/salBase/magam.do")
	public void magam(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<PayDeduBean> payDeduList = dataSetBeanMapper.datasetToBeans(inData, PayDeduBean.class);
		salBaseServiceFacade.magam(payDeduList);
	}
	
	//마감취소
	@RequestMapping("hrs/salBase/magamCancel.do")
	public void magamCancel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<PayDeduBean> payDeduList = dataSetBeanMapper.datasetToBeans(inData, PayDeduBean.class);
		salBaseServiceFacade.magamCancel(payDeduList);
	}
	
	//일괄처리
	@RequestMapping("hrs/salBase/batchPayDeduProcess.do")
	public void batchPayDeduProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<PayDeduBean> payDeduList = dataSetBeanMapper.datasetToBeans(inData, PayDeduBean.class);
		List<PayDeduSectBean> payDeduSectList = dataSetBeanMapper.datasetToBeans(inData, PayDeduSectBean.class);
		salBaseServiceFacade.batchPayDeduProcess(payDeduList);
		salBaseServiceFacade.batchPayDeduSectProcess(payDeduSectList);
	}
}
