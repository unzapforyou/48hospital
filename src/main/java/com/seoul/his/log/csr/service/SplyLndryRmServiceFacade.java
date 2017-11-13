package com.seoul.his.log.csr.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.csr.to.SplyRmSetCpntBean;
import com.seoul.his.log.csr.to.SplyRmSetCpntHistBean;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;
import com.seoul.his.log.inven.to.PstInvenBean;


/**
 * @Package  com.erp45.log.midSplyRm.service
 * @Class    SplyLndryRmServiceFacade.java
 * @Create   2016. 5. 25.
 * @Author   Chun
 * @Description
 *
 * @LastUpdated
 */
public interface SplyLndryRmServiceFacade {

List<GdsAnspBean> findCsrGdsAnspList(Map<String, String> queryMap);  //물품청구조회


	List<SplyRmSetCpntBean> findSplyRmSetCpntList(Map<String, String> argsMap);  //공급실 SET구성품 조회
	String callSetCdSeq();   //번호생성
	void batchProcessSetCpntList(List<SplyRmSetCpntBean> splyRmSetCpnList,
			List<SplyRmSetCpntHistBean> splyRmSetCpntHistList);  //SET 구성품 일괄처리


    void batchRlsGdsAnspList(List<GdsAnspBean> gdsAnspList, List<GdsAnspHistBean> gdsAnspHistList);


    void updatePstRlsList(List<GdsAnspHistBean> gdsAnspHistList);

}
