package com.seoul.his.log.demd.dao;

import java.util.List;

import com.seoul.his.log.demd.to.GdsReturnHistBean;

public interface GdsReturnHistDAO {
    
    public List<GdsReturnHistBean> findGdsReturnHistList();
    public void insertGdsReturnHist(GdsReturnHistBean GdsReturnHistbean);
    public void updateGdsReturnHist(GdsReturnHistBean GdsReturnHistbean);
    public void deleteGdsReturnHist(GdsReturnHistBean GdsReturnHistbean);

}
