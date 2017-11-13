package com.seoul.his.msv.sup.endoscoperadiologydiagnosis.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.ClinspeSequenceBean;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionReceiptBean;

public interface EndoscopeRadiologyDiagnosisServiceFacade {

	// 검체번호 조회
	public ClinspeSequenceBean findMaxClinspeNo();
	// 검체채취 리스트 조회
	public List<SpecimenCollectionBean> findClinspeList(Map<String, String> argsMap);
	// 검체채취 일괄처리
	public void batchClinspeProcess(List<SpecimenCollectionBean> specimenCollectionBeanList);
	// 검체접수 조회
	public List<SpecimenCollectionReceiptBean> findClinspeReceiptList(Map<String, String> argsMap);
	// 검체접수 일괄처리
	public void batchClinspeReceiptProcess(List<SpecimenCollectionReceiptBean> specimenCollectionReceiptBeanList);
}
