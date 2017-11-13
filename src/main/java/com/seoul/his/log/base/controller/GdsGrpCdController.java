package com.seoul.his.log.base.controller;

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
import com.seoul.his.log.base.service.LogBaseServiceFacade;
import com.seoul.his.log.base.to.BigGrpCdBean;
import com.seoul.his.log.base.to.MidGrpCdBean;
import com.seoul.his.log.base.to.SmGrpCdBean;

/**
 * @Package com.seoul.his.log.base.controller
 * @Class GdsGrpCdController.java
 * @Create 2016. 5. 24.
 * @Author godseop
 * @Description 물품분류코드관리 컨트롤러
 *
 * @LastUpdated
 */
@Controller
public class GdsGrpCdController {

    @Autowired
    private LogBaseServiceFacade logBaseServiceFacade;
    @Autowired
    private DataSetBeanMapper dataSetBeanMapper;

    @RequestMapping("log/base/findGrpList.do")
    public void findGrpList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        PlatformData outData = (PlatformData) request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<BigGrpCdBean> bigGrpList = logBaseServiceFacade.findGrpList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, bigGrpList, BigGrpCdBean.class);
        List<MidGrpCdBean> midGrpList = new ArrayList<MidGrpCdBean>();
        List<SmGrpCdBean> smGrpList = new ArrayList<SmGrpCdBean>();
        for (BigGrpCdBean bigGrpBean : bigGrpList) {
            List<MidGrpCdBean> subMidGrpList = bigGrpBean.getMidGrpCdList();
            midGrpList.addAll(subMidGrpList);
            for (MidGrpCdBean midGrpBean : subMidGrpList) {
                List<SmGrpCdBean> subSmGrpList = midGrpBean.getSmGrpCdList();
                smGrpList.addAll(subSmGrpList);
            }
        }
        dataSetBeanMapper.beansToDataset(outData, midGrpList, MidGrpCdBean.class);
        dataSetBeanMapper.beansToDataset(outData, smGrpList, SmGrpCdBean.class);
    }

    @RequestMapping("log/base/batchGdsGrpCdProcess.do")
    public void batchGdsGrpCdProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PlatformData inData = (PlatformData) request.getAttribute("inData");
        List<BigGrpCdBean> bigGrpCdList = dataSetBeanMapper.datasetToBeans(inData, BigGrpCdBean.class);
        List<MidGrpCdBean> midGrpCdList = dataSetBeanMapper.datasetToBeans(inData, MidGrpCdBean.class);
        List<SmGrpCdBean> smGrpCdList = dataSetBeanMapper.datasetToBeans(inData, SmGrpCdBean.class);
        /**
         * 대분류, 중분류, 소분류 모두 변경이 되었을 때 완전한 composit을 만듬
         * 중분류와 소분류가 변경이 되었을 때는 중분류 안에 소분류를 넣어 composit을 만듬
         * 소분류만 변경이 되었을 때는 소분류 List만 뒷단으로 던짐
         * 부모객체에 새로운 List를 만들어서 for문을 돌리면서 분류코드가 일치하는 객체끼리 List에 담고,
         * 새로운 List에 담긴 객체는 remove를 이용하여 삭제시킴으로써 중복객체를 피함
         */
        if (bigGrpCdList.size() != 0) {
            for (BigGrpCdBean bigGrpCdBean : bigGrpCdList) {
                List<MidGrpCdBean> tempMidGrpCdList = new ArrayList<MidGrpCdBean>();
                if (midGrpCdList.size() != 0) {
                    for (int i = 0; i < midGrpCdList.size(); i++) {
                        if (bigGrpCdBean.getBigGrpCd().equals(midGrpCdList.get(i).getBigGrpCd())) {
                            List<SmGrpCdBean> tempSmGrpCdList = new ArrayList<SmGrpCdBean>();
                            if (smGrpCdList.size() != 0) {
                                for (int s = 0; s < smGrpCdList.size(); s++) {
                                    if (midGrpCdList.get(i).getMidGrpCd().equals(smGrpCdList.get(s).getMidGrpCd()) && midGrpCdList.get(i).getBigGrpCd().equals(smGrpCdList.get(s).getBigGrpCd())) {
                                        tempSmGrpCdList.add(smGrpCdList.get(s));
                                        smGrpCdList.remove(smGrpCdList.get(s));
                                    }
                                }
                            }
                            midGrpCdList.get(i).setSmGrpCdList(tempSmGrpCdList);
                            tempMidGrpCdList.add(midGrpCdList.get(i));
                            midGrpCdList.remove(midGrpCdList.get(i));
                        }
                    }
                }
                bigGrpCdBean.setMidGrpCdList(tempMidGrpCdList);
            }
        }
        logBaseServiceFacade.batchGdsGrpCdProcess(bigGrpCdList, midGrpCdList, smGrpCdList);
    }
}
