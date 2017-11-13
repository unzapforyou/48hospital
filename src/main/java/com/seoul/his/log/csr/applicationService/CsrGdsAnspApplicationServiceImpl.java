package com.seoul.his.log.csr.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.csr.dao.CsrGdsAnspDAO;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;




/**
 * @Package  com.erp45.log.midSplyRm.AS
 * @Class    GdsAnspASImpl.java
 * @Create   2016. 5. 25.
 * @Author   류재춘
 * @Description 공급실, 세탁실 물품청구 관리 애플리케이션서비스
 *
 * @LastUpdated
 */
@Service
public class CsrGdsAnspApplicationServiceImpl implements CsrGdsAnspApplicationService{

	@Autowired
	private CsrGdsAnspDAO csrGdsAnspDAO;

    //물품청구조회
	@Override
	public List<GdsAnspBean> findCsrGdsAnspList(Map<String, String> argsMap) {
		return csrGdsAnspDAO.selectCsrGdsAnspList(argsMap);
	}


    @Override
    public void batchRlsGdsAnspList(List<GdsAnspBean> gdsAnspList,
            List<GdsAnspHistBean> batchRlsGdsAnspHistList) {

        for(GdsAnspBean lwGdsAnspBean : gdsAnspList){
            List<GdsAnspHistBean> gdsAnspHistInfoBean = lwGdsAnspBean.getGdsAnspHistList();
            csrGdsAnspDAO.updatedRlsGdsAnspList(lwGdsAnspBean);
            batchRlsGdsAnspHistList(gdsAnspHistInfoBean);
    }
        batchRlsGdsAnspHistList(batchRlsGdsAnspHistList);
    }

    @Override
    public void batchRlsGdsAnspHistList(List<GdsAnspHistBean> gdsAnspHistList){
        for(GdsAnspHistBean lwGdsAnspHistBean : gdsAnspHistList){

    }
    }


    @Override
    public void updatePstRlsList(List<GdsAnspHistBean> gdsAnspHistList) {
        for(GdsAnspHistBean lwGdsAnspHistBean : gdsAnspHistList){


            csrGdsAnspDAO.updatePstRlsList(lwGdsAnspHistBean);

    }
    }


}