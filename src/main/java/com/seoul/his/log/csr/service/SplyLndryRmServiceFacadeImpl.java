package com.seoul.his.log.csr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.csr.applicationService.CsrGdsAnspApplicationService;
import com.seoul.his.log.csr.applicationService.SplyRmSetCpntApplicationService;
import com.seoul.his.log.csr.to.SplyRmSetCpntBean;
import com.seoul.his.log.csr.to.SplyRmSetCpntHistBean;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;


/**
 * @Package  com.erp45.log.midSplyRm.service
 * @Class    SplyLndryRmServiceFacadeImpl.java
 * @Create   2016. 5. 25.
 * @Author   류재춘
 * @Description 공급실, 세탁실 물품청구 관리 서비스퍼사드
 *
 * @LastUpdated
 */

@Service
public class SplyLndryRmServiceFacadeImpl implements SplyLndryRmServiceFacade{

	@Autowired
	private CsrGdsAnspApplicationService gdsAnspApplicationService;

	@Autowired
    private SplyRmSetCpntApplicationService splyRmSetCpntApplicationService;

	//물품청구조회
	@Override
	public List<GdsAnspBean> findCsrGdsAnspList(Map<String, String> argsMap) {
		return gdsAnspApplicationService.findCsrGdsAnspList(argsMap);
	}



	//공급실 SET 구성품조회
	@Override
	public List<SplyRmSetCpntBean> findSplyRmSetCpntList(Map<String, String> argsMap) {
		return splyRmSetCpntApplicationService.findSplyRmSetCpntList(argsMap);
	}



	//SET번호생성
	@Override
	public String callSetCdSeq() {
		String SetCdNo = splyRmSetCpntApplicationService.callSetCdSeq();
		return SetCdNo;
	}

	//SET일괄처리
	@Override
	public void batchProcessSetCpntList(List<SplyRmSetCpntBean> splyRmSetCpnList,
			List<SplyRmSetCpntHistBean> splyRmSetCpntHistList) {
	    splyRmSetCpntApplicationService.batchProcessSetCpntList(splyRmSetCpnList,splyRmSetCpntHistList);

	}


    @Override
    public void batchRlsGdsAnspList(List<GdsAnspBean> gdsAnspList,
            List<GdsAnspHistBean> gdsAnspHistList) {
        gdsAnspApplicationService.batchRlsGdsAnspList(gdsAnspList, gdsAnspHistList);
    }



    @Override
    public void updatePstRlsList(List<GdsAnspHistBean> gdsAnspHistList) {
        gdsAnspApplicationService.updatePstRlsList(gdsAnspHistList);
    }






}
