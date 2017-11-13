package com.seoul.his.msv.sup.endoscoperadiologydiagnosis.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.dao.SpecimenCollectionDAO;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.dao.SpecimenCollectionReceiptDAO;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.ClinspeSequenceBean;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionReceiptBean;

/**
 * @Package 	com.seoul.his.msv.sup.endoscoperadiologydiagnosis.applicationService
 * @Class 		EndoscopeRadiologyDiagnosisApplicationServiceImpl.java
 * @Create 		2016. 12. 16.
 * @Author 		oss
 * @Description
 *
 * @LastUpdated
 */

@Component
public class EndoscopeRadiologyDiagnosisApplicationServiceImpl implements EndoscopeRadiologyDiagnosisApplicationService {

	@Autowired
	SpecimenCollectionDAO specimenCollectionDAO;
	@Autowired
	SpecimenCollectionReceiptDAO specimenCollectionReceiptDAO;

	// 검체번호 조회
	@Override
	public ClinspeSequenceBean findMaxClinspeNo() {
		return specimenCollectionDAO.selectMaxClinspeNo();
	}

	// 검체채취 리스트 조회
	@Override
	public List<SpecimenCollectionBean> findClinspeList(Map<String, String> argsMap) {
		return specimenCollectionDAO.selectClinspeList(argsMap);
	}

	// 검체채취 일괄처리
	@Override
	public void batchClinspeProcess(List<SpecimenCollectionBean> specimenCollectionBeanList) {
		for (SpecimenCollectionBean specimenCollectionBean : specimenCollectionBeanList) {
			switch (specimenCollectionBean.getStatus()) {
				case "inserted": {
					specimenCollectionDAO.insertClinspe(specimenCollectionBean);
					specimenCollectionDAO.insertClinspeBlok(specimenCollectionBean);
					break;
				}
				case "deleted": {
					specimenCollectionDAO.deleteClinspe(specimenCollectionBean);
					specimenCollectionDAO.deleteClinspeBlok(specimenCollectionBean);
					break;
				}
				case "updated": {
					specimenCollectionDAO.updateClinspe(specimenCollectionBean);
					break;
				}
			}
		}
	}

	// 검체접수 조회
	@Override
	public List<SpecimenCollectionReceiptBean> findClinspeReceiptList(Map<String, String> argsMap) {
		return specimenCollectionReceiptDAO.selectClinspeReceiptList(argsMap);
	}

	// 검체접수 일괄처리
	@Override
	public void batchClinspeReceiptProcess(List<SpecimenCollectionReceiptBean> specimenCollectionReceiptBeanList) {
		for (SpecimenCollectionReceiptBean specimenCollectionReceiptBean : specimenCollectionReceiptBeanList) {
			switch (specimenCollectionReceiptBean.getStatus()) {
				case "inserted": {
					specimenCollectionReceiptDAO.insertClinspeReceipt(specimenCollectionReceiptBean);
					break;
				}

				case "deleted": {
					specimenCollectionReceiptDAO.deleteClinspeReceiptCancel(specimenCollectionReceiptBean);
					specimenCollectionReceiptDAO.deleteClinspeReceipt(specimenCollectionReceiptBean);
					break;
				}

				case "updated": {
					specimenCollectionReceiptDAO.updateClinspeReceipt(specimenCollectionReceiptBean);
					if (specimenCollectionReceiptBean.getReceiptCd().equals("RE002")) {
						specimenCollectionReceiptDAO.insertClinspeReceiptCancel(specimenCollectionReceiptBean);
					}
					break;
				}
			}
		}

	}

}
