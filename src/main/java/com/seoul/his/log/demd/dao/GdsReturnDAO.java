package com.seoul.his.log.demd.dao;

import java.util.List;

import com.seoul.his.log.demd.to.GdsReturnBean;

public interface GdsReturnDAO {
    public List<GdsReturnBean> selectGdsReturnList();
    public void insertGdsReturn(GdsReturnBean GdsReturnbean);
    public void updateGdsReturn(GdsReturnBean GdsReturnbean);
    public void deleteGdsReturn(GdsReturnBean GdsReturnbean);
}
