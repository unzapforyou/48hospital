package com.seoul.his.log.base.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.log.base.service.LogBaseServiceFacade;
import com.seoul.his.log.base.to.BindLogCdBean;
import com.seoul.his.log.base.to.OutLogCdBean;

/**
 * @Package  com.seoul.his.log.base.controller
 * @Class    BindLogCdController.java
 * @Create   2016. 5. 24.
 * @Author   godseop
 * @Description 물품코드바인딩 컨트롤러
 *
 * @LastUpdated 
 */
@Controller
public class BindLogCdController {
    @Autowired
    private LogBaseServiceFacade logBaseServiceFacade;
    @Autowired
    private DataSetBeanMapper dataSetBeanMapper;

    @SuppressWarnings("deprecation")
	@RequestMapping("log/base/bindLogCd.do")
    public void bindLogCd(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        List<BindLogCdBean> bindLogCdList = dataSetBeanMapper.datasetToBeans(inData, BindLogCdBean.class);
        Map<String, List<OutLogCdBean>> bindLogCdMap = logBaseServiceFacade.bindLogCd(bindLogCdList);
        dataSetBeanMapper.bindLogCd(outData, bindLogCdMap, bindLogCdList, OutLogCdBean.class);
    }
}
