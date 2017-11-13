package com.seoul.his.log.inven.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.inven.applicationService.InvenSilsaApplicationService;
import com.seoul.his.log.inven.to.InvenSilsaBean;
import com.seoul.his.log.inven.to.InvenSilsaDtlInfoBean;
import com.seoul.his.log.inven.to.PstInvenBean;

@Service
public class InvenServiceFacadeImpl implements InvenServiceFacade {

	@Autowired
	InvenSilsaApplicationService invenSilsaApplicationService;

	// 재고실사조회
	@Override
	public List<InvenSilsaBean> findInvenSilsaList(Map<String, String> argsMap) {
		List<InvenSilsaBean> invenSilsaList= invenSilsaApplicationService.findInvenSilsaList(argsMap);
		return invenSilsaList;
	}

	// 재고실사 일괄처리
	@Override
	public void batchInvenSilsaListProcess(List<InvenSilsaBean> invenSilsaList, List<InvenSilsaDtlInfoBean> invenSilsaDtlInfoList) {
		invenSilsaApplicationService.batchInvenSilsaListProcess(invenSilsaList, invenSilsaDtlInfoList);
	}

	@Override
	public List<PstInvenBean> findPstInvenList(Map<String, String> argsMap) {
		return null;
	}

	@Override
	public void batchPstInvenListProcess(List<PstInvenBean> pstInvenList) {
	}

}
