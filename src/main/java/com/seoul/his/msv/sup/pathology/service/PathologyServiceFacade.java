package com.seoul.his.msv.sup.pathology.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;
import com.seoul.his.msv.sup.pathology.to.PathologyBean;
import com.seoul.his.msv.sup.pathology.to.SpecimenAcquisitionBean;
import com.seoul.his.msv.sup.pathology.to.SpecimenSlideBean;

public interface PathologyServiceFacade {

	// 검체번호 조회
	List<SpecimenCollectionBean> findClinspeNoList();
	// 검체정보 조회
	List<PathologyBean> findClinspeBlokList(PathologyBean pathologyBean);
	// 검체블록 일괄처리
	void batchClinspeBlokProcess(List<PathologyBean> batchClinspeBlokList);
	// 슬라이드 리스트 조회
	public List<SpecimenSlideBean> findClinspeSliList(SpecimenSlideBean specimenSlideBean);
	// 검체접수 리스트 조회 (검체인수 확인을 하기 위해 검체접수 리스트 조회)
	public List<SpecimenAcquisitionBean> findSpecimenAcquisitionList(Map<String, String> argsMap);
	// 검체인수 일괄처리
	public void batchSpecimenAcquisitionProcess(List<SpecimenAcquisitionBean> batchSpecimenAcquisitionList);

}
