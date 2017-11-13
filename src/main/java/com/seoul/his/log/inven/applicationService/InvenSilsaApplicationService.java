package com.seoul.his.log.inven.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.inven.to.InvenSilsaBean;
import com.seoul.his.log.inven.to.InvenSilsaDtlInfoBean;

public interface InvenSilsaApplicationService {

	// 재고실사조회
	public List<InvenSilsaBean> findInvenSilsaList(Map<String, String> argsMap);

	// 재고실사 일괄처리
	public void batchInvenSilsaListProcess(List<InvenSilsaBean> invenSilsaList, List<InvenSilsaDtlInfoBean> invenSilsaDtlInfoList);

}
