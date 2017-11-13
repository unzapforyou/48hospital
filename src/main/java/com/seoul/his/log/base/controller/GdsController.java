package com.seoul.his.log.base.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.DataSet;
import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.log.base.service.LogBaseServiceFacade;
import com.seoul.his.log.base.to.GdsBean;

/**
 * @Package  com.seoul.his.log.base.controller
 * @Class    GdsController.java
 * @Create   2016. 5. 24.
 * @Author   godseop
 * @Description 물품관리 컨트롤러
 *
 * @LastUpdated 
 */
@Controller
public class GdsController {

    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    private LogBaseServiceFacade logBaseServiceFacade;

    // 물품목록 조회
    @RequestMapping("log/base/findGdsList.do")
    public void findGdsCdList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<GdsBean> gdsList = logBaseServiceFacade.findGdsList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, gdsList, GdsBean.class);
    }

    // 물품사진 저장
    @RequestMapping("log/base/saveImg.do")
    public void saveImg(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        DataSet dataSet = inData.getDataSet("dsImg");
        FileOutputStream out = null;
        String fileName = dataSet.getString(0, "imgName"); // dataSet column
        if (fileName != null) {
            // TODO : 운영서버 배포시 물품사진 경로 수정할것!
            out = new FileOutputStream("C:/Dev/Server/apache-httpd-2.2.25/htdocs/his/images/goods/" + fileName);
            byte[] file = dataSet.getBlob(0, "imgData");   // dataSet column
            BufferedOutputStream bufferedOut = new BufferedOutputStream(out);
            bufferedOut.write(file);
            bufferedOut.flush();
            bufferedOut.close();
            out.close();
            bufferedOut = null;
            out = null;
        }
    }

    // 물품의 대중소분류 3자리코드를 넘겨받고 시퀀스넘버를 postCode로 리턴
    @RequestMapping("log/base/callGdsCd.do")
    public void callGdsCd(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        String postCode = logBaseServiceFacade.callGdsCd(argsMap);
        dataSetBeanMapper.addVariable(outData, "postCode", postCode);
    }

    // 물품 CRUD (등록, 수정, 삭제)
    @RequestMapping("log/base/batchGdsProcess.do")
    public void batchGdsProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<GdsBean> GdsList = dataSetBeanMapper.datasetToBeans(inData, GdsBean.class);
        logBaseServiceFacade.batchGdsProcess(GdsList);
    }
}
