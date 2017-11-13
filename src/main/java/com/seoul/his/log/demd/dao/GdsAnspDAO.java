package com.seoul.his.log.demd.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;

public interface GdsAnspDAO {
    public void insertGdsAnsp(GdsAnspBean GdsAnspbean);
    public void updateGdsAnsp(GdsAnspBean GdsAnspbean);
    public void deleteGdsAnsp(GdsAnspBean GdsAnspbean);

    public List<GdsAnspHistBean> selectGdsAnspHistList(GdsAnspHistBean GdsAnspHistbean);
    public void insertGdsAnspHist(GdsAnspHistBean GdsAnspHistbean);
    public void updateGdsAnspHist(GdsAnspHistBean GdsAnspHistbean);
    public void deleteGdsAnspHist(GdsAnspHistBean GdsAnspHistbean);
    public List<GdsAnspBean> selectGdsAnspList(Map<String, String> argsMap);
}
