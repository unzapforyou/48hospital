package com.seoul.his.msv.sup.endoscoperadiologydiagnosis.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.applicationService.EndoscopeRadiologyDiagnosisApplicationService;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.ClinspeSequenceBean;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionReceiptBean;

/**
 * @Package  com.seoul.his.acc.budget.service
 * @Class    BudgetServiceFacadeImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated
 */

@Service
public class EndoscopeRadiologyDiagnosisServiceFacadeImpl implements EndoscopeRadiologyDiagnosisServiceFacade{

	@Autowired
	EndoscopeRadiologyDiagnosisApplicationService endoscoperadiologydiagnosisApplicationService;

	// 검체번호 조회
	@Override
	public ClinspeSequenceBean findMaxClinspeNo() {
		return endoscoperadiologydiagnosisApplicationService.findMaxClinspeNo();
	}

	// 검체채취 리스트 조회
	@Override
	public List<SpecimenCollectionBean> findClinspeList(Map<String, String> argsMap) {
		return endoscoperadiologydiagnosisApplicationService.findClinspeList(argsMap);
	}

	// 검체채취 일괄처리
	@Override
	public void batchClinspeProcess(List<SpecimenCollectionBean> specimenCollectionBeanList) {
		endoscoperadiologydiagnosisApplicationService.batchClinspeProcess(specimenCollectionBeanList);
	}

	// 검체접수 조회
	@Override
	public List<SpecimenCollectionReceiptBean> findClinspeReceiptList(Map<String, String> argsMap) {
		return endoscoperadiologydiagnosisApplicationService.findClinspeReceiptList(argsMap);
	}

	// 검체접수 일괄처리
	@Override
	public void batchClinspeReceiptProcess(List<SpecimenCollectionReceiptBean> specimenCollectionReceiptBeanList) {
		endoscoperadiologydiagnosisApplicationService.batchClinspeReceiptProcess(specimenCollectionReceiptBeanList);
	}

}
