package com.seoul.his.acc.fixedasset.controller;

import java.io.BufferedOutputStream;
import java.io.File;
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
import com.seoul.his.acc.fixedasset.service.FixedAssetServiceFacade;
import com.seoul.his.acc.fixedasset.to.FixedAssetBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetSequenceBean;
import com.seoul.his.common.util.DataSetBeanMapper;

@Controller
public class FixedAssetController {
    @Autowired
    DataSetBeanMapper dataSetBeanMapper;
    @Autowired
    FixedAssetServiceFacade fixedAssetServiceFacade;
    
    @RequestMapping("acc/fixedasset/findMaxAssetNo.do")
    public void findMaxAssetNo(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        FixedAssetSequenceBean fixedAssetSequenceBean = fixedAssetServiceFacade.findMaxAssetNo();
        dataSetBeanMapper.beanToDataset(outData, fixedAssetSequenceBean, FixedAssetSequenceBean.class);
    }
    
    @RequestMapping("acc/fixedasset/findFixedAssetList.do")
    public void findFixedAssetList(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        List<FixedAssetBean> fixedAssetBeanList = fixedAssetServiceFacade.findFixedAssetList(argsMap);
        dataSetBeanMapper.beansToDataset(outData, fixedAssetBeanList, FixedAssetBean.class);
    }
    
    @RequestMapping("acc/fixedasset/findFixedAsset.do")
    public void findFixedAsset(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        Map<String, String> argsMap = dataSetBeanMapper.variablesToMap(inData);
        FixedAssetBean fixedAssetBean = fixedAssetServiceFacade.findFixedAsset(argsMap);
        dataSetBeanMapper.beanToDataset(outData, fixedAssetBean, FixedAssetBean.class);
    }
    
    @RequestMapping("acc/fixedasset/batchFixedAssetProcess.do")
    public void batchFixedAssetProcess(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PlatformData inData = (PlatformData)request.getAttribute("inData");
        PlatformData outData = (PlatformData)request.getAttribute("outData");
        DataSet dsFixedAssetPhoto = inData.getDataSet("dsFixedAssetPhoto");
        int dsFixedAssetPhotoSize = dsFixedAssetPhoto.getRowCount();
        List<FixedAssetBean> fixedAssetBeanList = dataSetBeanMapper.datasetToBeans(inData, FixedAssetBean.class);
        
        for(int i=0; i<dsFixedAssetPhotoSize;i++){
            byte[] fixedAssetPhoto = dsFixedAssetPhoto.getBlob(i,"fixedAssetPhoto");
            String assetNo = dsFixedAssetPhoto.getString(i,"assetNo");
            int index = dsFixedAssetPhoto.getString(i,"fileFullPath").lastIndexOf(".");
            String type = dsFixedAssetPhoto.getString(i,"fileFullPath").substring(index);
            String path = "C:/dev/Apache2.2/htdocs/his/image/goods/";
        
            String fileName = assetNo+type;
            FileOutputStream fos = new FileOutputStream(new File(path+fileName));
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(fixedAssetPhoto);
            bos.flush();
            fos.close();
            bos.close();
            
            for(FixedAssetBean fixedAssetBean : fixedAssetBeanList){
                if(assetNo.equals(fixedAssetBean.getAssetNo())){
                    fixedAssetBean.setFixedAssetPhoto("img::acc/"+fileName); 
                    break;
                }
            }
        }
        fixedAssetServiceFacade.batchFixedAssetProcess(fixedAssetBeanList);
        dataSetBeanMapper.beanToDataset(outData, new FixedAssetBean(), FixedAssetBean.class);
    }
}
