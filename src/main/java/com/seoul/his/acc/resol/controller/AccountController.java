package com.seoul.his.acc.resol.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.resol.service.ResolServiceFacade;
import com.seoul.his.acc.resol.to.AccountBean;
import com.seoul.his.common.util.DataSetBeanMapper;


/**
 * <pre>
 * com.seoul.his.acc.resol.controller
 *    |_ AccountController.java
 * </pre>
 *
 * @date : 2016. 12. 13. 오후 8:43:14
 * @version :
 * @author : 응디꿍디
 */




@Controller
public class AccountController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    ResolServiceFacade resolServiceFacade;

    @RequestMapping("acc/resol/findAccount.do")
    public void findAccount(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	System.out.println("어카운트왓찌롱");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<AccountBean> accountList = resolServiceFacade.findAccount(argsMap);
        dataSetBeanMapper.beansToDataset(outData, accountList, AccountBean.class);
    }
}
