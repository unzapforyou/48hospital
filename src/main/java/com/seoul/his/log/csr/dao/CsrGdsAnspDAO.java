package com.seoul.his.log.csr.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;
import com.seoul.his.log.inven.to.PstInvenBean;

/**
 * @Package  com.erp45.log.midSplyRm.dao
 * @Class    GdsAnspDAO.java
 * @Create   2016. 5. 25.
 * @Author   류재춘
 * @Description 공급실, 세탁실 물품청구 관리 DAO
 *
 * @LastUpdated
 */

public interface CsrGdsAnspDAO {
    List<GdsAnspBean> selectCsrGdsAnspList(Map<String, String> argsMap); //청구출고조회
    void updatedRlsGdsAnspList(GdsAnspBean lwGdsAnspBean); 
    void updatePstRlsList(GdsAnspHistBean lwGdsAnspHistBean);

}
