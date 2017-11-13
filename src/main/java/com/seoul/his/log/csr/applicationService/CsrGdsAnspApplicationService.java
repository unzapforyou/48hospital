package com.seoul.his.log.csr.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;
import com.seoul.his.log.inven.to.PstInvenBean;




/**
 * @Package  com.seoul.his.log.midSplyRm.applicationService
 * @Class    GdsAnspApplicationService.java
 * @Create   2016. 5. 25.
 * @Author   Chun
 * @Description
 *
 * @LastUpdated
 */

public interface CsrGdsAnspApplicationService {

	public List<GdsAnspBean> findCsrGdsAnspList(Map<String, String> gdsAnspMap);  //물품청구조회
    public void batchRlsGdsAnspList(List<GdsAnspBean> gdsAnspList,
            List<GdsAnspHistBean> gdsAnspHistList);
    void batchRlsGdsAnspHistList(List<GdsAnspHistBean> gdsAnspHistList);
    public void updatePstRlsList(List<GdsAnspHistBean> gdsAnspHistList);

}
