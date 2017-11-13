package com.seoul.his.hrs.yeta.controller;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.common.util.NexacroLogger;
import com.seoul.his.hrs.yeta.service.YetaServiceFacade;
import com.seoul.his.hrs.yeta.to.HyDeductionBean;
import com.seoul.his.hrs.yeta.to.HyDeductionDataBean;
import com.seoul.his.hrs.yeta.to.HyDependentBean;
import com.seoul.his.hrs.yeta.to.HyDependentDonationBean;
import com.seoul.his.hrs.yeta.to.HyDependentEducationBean;
import com.seoul.his.hrs.yeta.to.HyDependentInsuranceBean;
import com.seoul.his.hrs.yeta.to.HyDependentMedicalBean;
import com.seoul.his.hrs.yeta.to.HyDependentPaymentBean;
import com.seoul.his.hrs.yeta.to.HyFormerCompanyBean;

@Controller
public class HyDeductionController {
    @Autowired
    YetaServiceFacade yetaServiceFacade;
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;

    private PlatformData outData;
    private PlatformData inData;
    private Map<String, String> argsMap;
    
    @RequestMapping("hrs/yeta/findHyDeductionData.do")
    public void findHyDeductionData(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        outData = (PlatformData) request.getAttribute("outData");
        System.out.println("outData 내역보기");
        NexacroLogger.debug(outData.getDataSetList());//받은데이터 내역보기
        argsMap = dataSetBeanMapper.variablesToMap(inData);
        
        HyDeductionBean hyDeductionbean = yetaServiceFacade.findHyDeductionData(argsMap);

        HyDeductionDataBean hyDeductionData = hyDeductionbean.getHyDeductionDataBean();
        List<HyDependentBean> hyDependentBeanList = hyDeductionbean.getHyDependentBeanList();
        List<HyDependentInsuranceBean> hyDependentInsuranceBeanList = hyDeductionbean
                .getHyDependentInsuranceBeanList();
        List<HyDependentMedicalBean> hyDependentMedicalBeanList = hyDeductionbean
                .getHyDependentMedicalBeanList();
        List<HyDependentDonationBean> hyDependentDonationBeanList = hyDeductionbean
                .getHyDependentDonationBeanList();
        List<HyDependentEducationBean> hyDependentEducationBeanList = hyDeductionbean
                .getHyDependentEducationBeanList();
        List<HyDependentPaymentBean> hyDependentPaymentBeanList = hyDeductionbean
                .getHyDependentPaymentBeanList();
        List<HyFormerCompanyBean> hyFormerCompanyBeanList = hyDeductionbean
                .getHyFormerCompanyBeanList();

        if (hyDeductionData != null) {
            dataSetBeanMapper.beanToDataset(outData, hyDeductionData, HyDeductionDataBean.class);
        }
        
        dataSetBeanMapper.beansToDataset(outData, hyDependentBeanList, HyDependentBean.class);
        dataSetBeanMapper.beansToDataset(outData, hyDependentInsuranceBeanList,
                HyDependentInsuranceBean.class);
        dataSetBeanMapper.beansToDataset(outData, hyDependentMedicalBeanList,
                HyDependentMedicalBean.class);
        dataSetBeanMapper.beansToDataset(outData, hyDependentDonationBeanList,
                HyDependentDonationBean.class);
        dataSetBeanMapper.beansToDataset(outData, hyDependentEducationBeanList,
                HyDependentEducationBean.class);
        dataSetBeanMapper.beansToDataset(outData, hyDependentPaymentBeanList,
                HyDependentPaymentBean.class);
        dataSetBeanMapper.beansToDataset(outData, hyFormerCompanyBeanList,
                HyFormerCompanyBean.class);
    }

    @RequestMapping("hrs/yeta/batchHyDeductionData.do")
    public void batchFormerCompanyDdt(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        inData = (PlatformData) request.getAttribute("inData");
        System.out.println("indata 내역보기");
        NexacroLogger.debug(inData.getDataSetList());//받은데이터 내역보기
        List<HyDeductionDataBean> hyDeductionData = dataSetBeanMapper.datasetToBeans(inData,
                HyDeductionDataBean.class);
        List<HyDependentBean> hyDependentBeanList = dataSetBeanMapper.datasetToBeans(inData,
                HyDependentBean.class);
        List<HyDependentInsuranceBean> hyDependentInsuranceBeanList = dataSetBeanMapper
                .datasetToBeans(inData, HyDependentInsuranceBean.class);
        List<HyDependentMedicalBean> hyDependentMedicalBeanList = dataSetBeanMapper
                .datasetToBeans(inData, HyDependentMedicalBean.class);
        List<HyDependentDonationBean> hyDependentDonationBeanList = dataSetBeanMapper
                .datasetToBeans(inData, HyDependentDonationBean.class);
        List<HyDependentEducationBean> hyDependentEducationBeanList = dataSetBeanMapper
                .datasetToBeans(inData, HyDependentEducationBean.class);
        List<HyDependentPaymentBean> hyDependentPaymentBeanList = dataSetBeanMapper
                .datasetToBeans(inData, HyDependentPaymentBean.class);
        List<HyFormerCompanyBean> hyFormerCompanyBeanList = dataSetBeanMapper.datasetToBeans(inData,
                HyFormerCompanyBean.class);

        yetaServiceFacade.batchHyDeductionDataProcess(hyDeductionData);
        yetaServiceFacade.batchHyDependentProcess(hyDependentBeanList);
        yetaServiceFacade.batchHyDependentInsuranceProcess(hyDependentInsuranceBeanList);
        yetaServiceFacade.batchHyDependentMedicalProcess(hyDependentMedicalBeanList);
        yetaServiceFacade.batchHyDependentDonationProcess(hyDependentDonationBeanList);
        yetaServiceFacade.batchHyDependentEducationProcess(hyDependentEducationBeanList);
        yetaServiceFacade.batchHyDependentPaymentProcess(hyDependentPaymentBeanList);
        yetaServiceFacade.batchHyFormerCompanyProcess(hyFormerCompanyBeanList);

    }

}
