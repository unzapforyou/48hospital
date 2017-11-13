package com.seoul.his.msv.sup.endoscoperadiologydiagnosis.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionReceiptBean;

public interface SpecimenCollectionReceiptDAO {

	// 검체접수 조회
	public List<SpecimenCollectionReceiptBean> selectClinspeReceiptList(Map<String, String> argsMap);
	// 검체접수 일괄처리
	public void insertClinspeReceipt(SpecimenCollectionReceiptBean specimenCollectionReceiptBean);
	public void deleteClinspeReceipt(SpecimenCollectionReceiptBean specimenCollectionReceiptBean);
	public void updateClinspeReceipt(SpecimenCollectionReceiptBean specimenCollectionReceiptBean);
	public void insertClinspeReceiptCancel(SpecimenCollectionReceiptBean specimenCollectionReceiptBean);
	public void deleteClinspeReceiptCancel(SpecimenCollectionReceiptBean specimenCollectionReceiptBean);
	public void updateClinspeReceiptCancel(SpecimenCollectionReceiptBean specimenCollectionReceiptBean);

}
