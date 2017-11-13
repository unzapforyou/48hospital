
package com.seoul.his.acc.elementary.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.acc.elementary.service.AccElementaryServiceFacade;
import com.seoul.his.acc.elementary.to.AccPridBean;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.common.util.NexacroLogger;


/**

 * </pre>
 * @date : 2016. 12. 11. 오후 2:42:45
 * @version :
 * @author : 응디꿍디
 */



@Controller
public class AccPridController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    private AccElementaryServiceFacade accElementaryServiceFacade;

    // 회계기수 조회
    @RequestMapping("acc/elementary/findAccPridList.do")
    public void findAccPridList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        List<AccPridBean> accPridList = accElementaryServiceFacade.findAccPridList();
        dataSetBeanMapper.beansToDataset(outData, accPridList, AccPridBean.class);
    }
  
    
    // 회계기수 일괄처리
    @RequestMapping("acc/elementary/batchAccPridList.do")
    public void batchAccPridListProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        List<AccPridBean> accPridList = dataSetBeanMapper.datasetToBeans(inData, AccPridBean.class);
        accElementaryServiceFacade.batchAccPridListProcess(accPridList);
    }

    @RequestMapping("acc/elementary/findAccPrid.do")
    public void findAccPrid(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        AccPridBean accPrid = accElementaryServiceFacade.findAccPrid(argsMap);
        dataSetBeanMapper.beanToDataset(outData, accPrid, AccPridBean.class);
    }
}

