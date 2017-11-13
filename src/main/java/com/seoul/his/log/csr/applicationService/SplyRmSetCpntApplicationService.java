package com.seoul.his.log.csr.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.csr.to.SplyRmSetCpntBean;
import com.seoul.his.log.csr.to.SplyRmSetCpntHistBean;

/**
 * @Package  com.erp45.log.midSplyRm.AS
 * @Class    SplyRmSETCpntAS.java
 * @Create   2016. 5. 25.
 * @Author   류재춘
 * @Description 공급실 SET구성품 관리 애플리케이션서비스
 *
 * @LastUpdated
 */
public interface SplyRmSetCpntApplicationService {

	List<SplyRmSetCpntBean> findSplyRmSetCpntList(Map<String, String> queryMap);  //공급실 SET 구성품 조회
	String callSetCdSeq();
	void batchProcessSetCpntList(List<SplyRmSetCpntBean> splyRmSetCpnList,
			List<SplyRmSetCpntHistBean> splyRmSetCpntHistList);  //번호생성



}
