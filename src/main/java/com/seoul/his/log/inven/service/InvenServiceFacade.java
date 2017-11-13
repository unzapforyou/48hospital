package com.seoul.his.log.inven.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.inven.to.InvenSilsaBean;
import com.seoul.his.log.inven.to.InvenSilsaDtlInfoBean;
import com.seoul.his.log.inven.to.PstInvenBean;

public interface InvenServiceFacade {

	// 재고실사조회
	public List<InvenSilsaBean> findInvenSilsaList(Map<String, String> argsMap);

	// 재고실사 일괄처리
	public void batchInvenSilsaListProcess(List<InvenSilsaBean> invenSilsaList, List<InvenSilsaDtlInfoBean> invenSilsaDtlInfoList);

	public List<PstInvenBean> findPstInvenList(Map<String, String> argsMap);

	public void batchPstInvenListProcess(List<PstInvenBean> pstInvenList);


}
