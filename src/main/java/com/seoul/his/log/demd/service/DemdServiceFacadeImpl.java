package com.seoul.his.log.demd.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.demd.applicationService.DemdApplicationService;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;
import com.seoul.his.log.demd.to.GdsReturnBean;
import com.seoul.his.log.demd.to.GdsReturnHistBean;

/**
 * @Package  com.seoul.his.log.demd.service
 * @Class    DemdServiceFacadeImpl.java
 * @Create   2016. 6. 28.
 * @Author   Bohyun
 * @Description 물품청구,물품반품 관리 서비스퍼사드
 *
 * @LastUpdated 
 */
@Service
public class DemdServiceFacadeImpl implements DemdServiceFacade{

    @Autowired
    DemdApplicationService demdApplicationService;

    @Override
    public List<GdsReturnBean> findGdsReturnList()
    {
        return demdApplicationService.findGdsReturnList();
    }

    @Override
    public void batchGdsReturnProcess(List<GdsReturnBean> GdsReturnList)
    {
        demdApplicationService.batchGdsReturnProcess(GdsReturnList);
    }
    @Override
    public List<GdsReturnHistBean> findGdsReturnHistList()
    {
        return demdApplicationService.findGdsReturnHistList();
    }
    @Override
    public void batchGdsReturnHistProcess(List<GdsReturnHistBean> GdsReturnHistList)
    {
        demdApplicationService.batchGdsReturnHistProcess(GdsReturnHistList);
    }
    public List<GdsAnspBean> findGdsAnspList(Map<String, String> argsMap)
    {
        return demdApplicationService.findGdsAnspList(argsMap);
    }
    @Override
    public void batchGdsAnspProcess(List<GdsAnspBean> GdsAnspBeanList)
    {
        demdApplicationService.batchGdsAnspProcess(GdsAnspBeanList);
    }
    @Override
    public void batchGdsAnspHistProcess(List<GdsAnspBean>GdsAnspBeanList,List<GdsAnspHistBean> GdsAnspHistBeanList)
    {
        demdApplicationService.batchGdsAnspHistProcess(GdsAnspBeanList,GdsAnspHistBeanList);
    }


}
