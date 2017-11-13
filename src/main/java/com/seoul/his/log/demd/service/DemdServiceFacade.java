package com.seoul.his.log.demd.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;
import com.seoul.his.log.demd.to.GdsReturnBean;
import com.seoul.his.log.demd.to.GdsReturnHistBean;

public interface DemdServiceFacade {

    public List<GdsReturnBean> findGdsReturnList();
    public void batchGdsReturnProcess(List<GdsReturnBean> GdsReturnList);
    public List<GdsReturnHistBean> findGdsReturnHistList();
    public void batchGdsReturnHistProcess(List<GdsReturnHistBean> GdsReturnHistList);

    public void batchGdsAnspProcess(List<GdsAnspBean> GdsAnspBeanList);
    public void batchGdsAnspHistProcess(List<GdsAnspBean>GdsAnspBeanList,List<GdsAnspHistBean> GdsAnspHistBeanList);
    public List<GdsAnspBean> findGdsAnspList(Map<String, String> argsMap);
}
