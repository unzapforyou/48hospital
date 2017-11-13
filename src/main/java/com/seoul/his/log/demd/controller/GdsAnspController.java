package com.seoul.his.log.demd.controller;

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
import com.seoul.his.log.demd.service.DemdServiceFacade;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;
import com.seoul.his.log.inven.to.InvenSilsaBean;
import com.seoul.his.log.inven.to.InvenSilsaDtlInfoBean;


/**
 * @Package  com.seoul.his.log.demd.controller
 * @Class    GdsAnspController.java
 * @Create   2016. 5. 25.
 * @Author   Bohyun
 * @Description 물품청구 컨트롤러 & 물품청구상세 컨트롤러
 *
 * @LastUpdated
 */
@Controller
public class GdsAnspController {

    @Autowired
    DemdServiceFacade demdServiceFacade;
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;

    //조회
    @RequestMapping("log/demd/findGdsAnspList.do")
    public void findGdsAnspList(HttpServletRequest request,HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<GdsAnspBean> gdsAnspList = demdServiceFacade.findGdsAnspList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, gdsAnspList, GdsAnspBean.class);
        List<GdsAnspHistBean> gdsAnspHistList = new ArrayList<>();
        for(GdsAnspBean gsAnspBean : gdsAnspList){
            List<GdsAnspHistBean> gdsAnspHist = gsAnspBean.getGdsAnspHistList();
            gdsAnspHistList.addAll(gdsAnspHist);
        }

        dataSetBeanMapper.beansToDataset(outData, gdsAnspHistList, GdsAnspHistBean.class);

    }
    
    //안씀
    @RequestMapping("log/demd/batchGdsAnspProcess.do")
    public void batchGdsAnspProcess(HttpServletRequest request,HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");

        List<GdsAnspBean> GdsAnspBeanList = dataSetBeanMapper.datasetToBeans(inData, GdsAnspBean.class);
        demdServiceFacade.batchGdsAnspProcess(GdsAnspBeanList);
    }

    //일괄처리
    @RequestMapping("log/demd/batchGdsAnspHistProcess.do")
    public void batchGdsAnspHistProcess(HttpServletRequest request,HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        
        List<GdsAnspBean> GdsAnspBeanList = dataSetBeanMapper.datasetToBeans(inData, GdsAnspBean.class);
        List<GdsAnspHistBean> GdsAnspHistBeanList = dataSetBeanMapper.datasetToBeans(inData, GdsAnspHistBean.class);
        
        if(GdsAnspBeanList.size() != 0)
        {
            for(GdsAnspBean anspBean:GdsAnspBeanList)
            {
                List<GdsAnspHistBean> tempGdsAnspHistList=new ArrayList<GdsAnspHistBean>();
                if(GdsAnspHistBeanList.size()!= 0)
                {
                    for(int i=0; i<GdsAnspHistBeanList.size(); i++)
                    {
                        if(anspBean.getGdsAnspNo().equals(GdsAnspHistBeanList.get(i)))
                        {
                            tempGdsAnspHistList.add(GdsAnspHistBeanList.get(i));
                            tempGdsAnspHistList.remove(GdsAnspHistBeanList.get(i));
                        }
                    }
                }
                anspBean.setGdsAnspHistList(tempGdsAnspHistList);
            }
        }
        demdServiceFacade.batchGdsAnspHistProcess(GdsAnspBeanList,GdsAnspHistBeanList);
    }
}
