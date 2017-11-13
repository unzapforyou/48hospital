package com.seoul.his.log.inven.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.inven.dao.InvenSilsaDAO;
import com.seoul.his.log.inven.to.InvenSilsaBean;
import com.seoul.his.log.inven.to.InvenSilsaDtlInfoBean;

@Service
public class InvenSilsaApplieServiceImpl implements InvenSilsaApplicationService {

	@Autowired
	InvenSilsaDAO invenSilsaDAO;

	// 재고실사조회
	@Override
	public List<InvenSilsaBean> findInvenSilsaList(Map<String, String> argsMap) {
		List<InvenSilsaBean> invenSilsaList = invenSilsaDAO.selectInvenSilsaList(argsMap);
		return invenSilsaList;
	}

	// 재고실사 일괄처리
	@Override
	public void batchInvenSilsaListProcess(List<InvenSilsaBean> invenSilsaList, List<InvenSilsaDtlInfoBean> invenSilsaDtlInfoList) {
		for(InvenSilsaBean invenSilsaBean : invenSilsaList){
			String status = invenSilsaBean.getStatus();
			List<InvenSilsaDtlInfoBean> invenSilsaDtlInfoBean = invenSilsaBean.getInvenSilsaDtlInfoList();
			switch (status) {
			case "inserted" :
				invenSilsaDAO.insertInvenSilsaList(invenSilsaBean);
				batchInvenSilsaDtlInfoListProcess(invenSilsaDtlInfoBean);
				break;

			case "updated" :
				invenSilsaDAO.updateInvenSilsaList(invenSilsaBean);
				batchInvenSilsaDtlInfoListProcess(invenSilsaDtlInfoBean);
				break;

			case "deleted" :
				invenSilsaDAO.deleteInvenSilsaList(invenSilsaBean);
				batchInvenSilsaDtlInfoListProcess(invenSilsaDtlInfoBean);
				break;
			}
		}
		batchInvenSilsaDtlInfoListProcess(invenSilsaDtlInfoList);
	}

	// 재고실사상세저장
	public void batchInvenSilsaDtlInfoListProcess(List<InvenSilsaDtlInfoBean> invenSilsaDtlInfoList) {
		for(InvenSilsaDtlInfoBean invenSilsaDtlInfoBean : invenSilsaDtlInfoList){
			String status = invenSilsaDtlInfoBean.getStatus();
			switch (status) {
			case "inserted" :
				invenSilsaDAO.insertInvenSilsaDtlInfoList(invenSilsaDtlInfoBean);
				break;

			case "updated" :
				invenSilsaDAO.updateInvenSilsaDtlInfoList(invenSilsaDtlInfoBean);
				break;

			case "deleted" :
				invenSilsaDAO.deleteInvenSilsaDtlInfoList(invenSilsaDtlInfoBean);
				break;
			}
		}
	}

}
