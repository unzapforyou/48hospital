package com.seoul.his.log.demd.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.log.demd.dao.GdsAnspDAO;
import com.seoul.his.log.demd.dao.GdsReturnDAO;
import com.seoul.his.log.demd.dao.GdsReturnHistDAO;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;
import com.seoul.his.log.demd.to.GdsReturnBean;
import com.seoul.his.log.demd.to.GdsReturnHistBean;

/**
 * @Package  com.seoul.his.log.demd.applicationService
 * @Class    DemdApplicationServiceImpl.java
 * @Create   2016. 6. 28.
 * @Author   Bohyun
 * @Description 물품청구,물품반품 관리 애플리케이션서비스
 *
 * @LastUpdated
 */
@Component
public class DemdApplicationServiceImpl implements DemdApplicationService{

    @Autowired
    GdsReturnDAO gdsReturnDao;
    @Autowired
    GdsReturnHistDAO gdsReturnHistDao;
    @Autowired
    GdsAnspDAO gdsAnspDao;


    @Override
    public List<GdsReturnBean> findGdsReturnList()
    {
        return gdsReturnDao.selectGdsReturnList();
    }

    @Override
    public void batchGdsReturnProcess(List<GdsReturnBean> GdsReturnList)
    {
        for(GdsReturnBean GdsReturnbean:GdsReturnList)
        {
            switch (GdsReturnbean.getStatus())
            {
            case "inserted" : gdsReturnDao.insertGdsReturn(GdsReturnbean); break;
            case "updated" : gdsReturnDao.updateGdsReturn(GdsReturnbean); break;
            case "deleted" : gdsReturnDao.deleteGdsReturn(GdsReturnbean); break;
            }
        }
    }
    @Override
    public List<GdsReturnHistBean> findGdsReturnHistList()
    {
        return gdsReturnHistDao.findGdsReturnHistList();
    }
    @Override
    public void batchGdsReturnHistProcess(List<GdsReturnHistBean> GdsReturnHistList)
    {
        for(GdsReturnHistBean GdsReturnHistbean : GdsReturnHistList)
        {
            switch(GdsReturnHistbean.getStatus())
            {
            case "inserted":gdsReturnHistDao.insertGdsReturnHist(GdsReturnHistbean); break;
            case "updated":gdsReturnHistDao.updateGdsReturnHist(GdsReturnHistbean); break;
            case "deleted":gdsReturnHistDao.deleteGdsReturnHist(GdsReturnHistbean); break;

            }
        }
    }
    @Override
    public List<GdsAnspBean> findGdsAnspList(Map<String, String> argsMap)
    {
        return gdsAnspDao.selectGdsAnspList(argsMap);
    }
    @Override
    public void batchGdsAnspProcess(List<GdsAnspBean> GdsAnspBeanList)
    {
        for(GdsAnspBean GdsAnspbean:GdsAnspBeanList)
        {
            switch(GdsAnspbean.getStatus())
            {
            case "inserted":gdsAnspDao.insertGdsAnsp(GdsAnspbean); break;
            case "updated":gdsAnspDao.updateGdsAnsp(GdsAnspbean); break;
            case "deleted":gdsAnspDao.deleteGdsAnsp(GdsAnspbean); break;
            }
        }
    }
    
    @Override
    public void batchGdsAnspHistProcess(List<GdsAnspBean>GdsAnspBeanList,List<GdsAnspHistBean> GdsAnspHistBeanList)
    {
        for(GdsAnspBean gdsAnspBean:GdsAnspBeanList)
        {
            switch(gdsAnspBean.getStatus())
            {
            case "inserted":gdsAnspDao.insertGdsAnsp(gdsAnspBean); break;
            case "updated":gdsAnspDao.updateGdsAnsp(gdsAnspBean); break;
            case "deleted":gdsAnspDao.deleteGdsAnsp(gdsAnspBean); break;
            }
        }
        for(GdsAnspHistBean GdsAnspHistbean:GdsAnspHistBeanList)
        {
            switch(GdsAnspHistbean.getStatus())
            {
            case "inserted":gdsAnspDao.insertGdsAnspHist(GdsAnspHistbean); break;
            case "updated":gdsAnspDao.updateGdsAnspHist(GdsAnspHistbean); break;
            case "deleted":gdsAnspDao.deleteGdsAnspHist(GdsAnspHistbean); break;

            }
        }
    }
}
