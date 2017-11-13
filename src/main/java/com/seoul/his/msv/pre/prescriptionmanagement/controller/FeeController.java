
package com.seoul.his.msv.pre.prescriptionmanagement.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.msv.pre.prescriptionmanagement.service.BaseServiceFacade;
import com.seoul.his.msv.pre.prescriptionmanagement.to.FeeBean;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.controller
 *    |_ FeeController.java
 *
 * </pre>
 * @date : 2016. 12. 6. 오후 4:58:47
 * @version :
 * @author : User
 */

@Controller
public class FeeController {

	@Autowired
	DataSetBeanMapper dataSetBeanMapper;
	@Autowired
	BaseServiceFacade baseServiceFacade;

	@RequestMapping("msv/pre/prescriptionmanagement/findFeeListEMR.do")
    public void findFeeListEMR(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<FeeBean> feeBeanList = baseServiceFacade.findFeeListEMR(argsMap);
        dataSetBeanMapper.beansToDataset(outData, feeBeanList, FeeBean.class);
    }

}





