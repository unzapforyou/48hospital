package com.seoul.his.msv.sup.pathology.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;
import com.seoul.his.msv.sup.pathology.applicationService.PathologyApplicationService;
import com.seoul.his.msv.sup.pathology.to.PathologyBean;
import com.seoul.his.msv.sup.pathology.to.SpecimenAcquisitionBean;
import com.seoul.his.msv.sup.pathology.to.SpecimenSlideBean;


/**
 * @Package  	com.seoul.his.msv.sup.pathology.service
 * @Class    	PathologyServiceFacadeImpl.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Service
public class PathologyServiceFacadeImpl implements PathologyServiceFacade{

	@Autowired
	PathologyApplicationService pathologyApplicationService;

	// 검체번호 조회
	@Override
	public List<SpecimenCollectionBean> findClinspeNoList() {
		List<SpecimenCollectionBean> specimenCollectionBeanList = pathologyApplicationService.findClinspeNoList();
		return specimenCollectionBeanList;
	}

	// 검제정보 조회
	@Override
	public List<PathologyBean> findClinspeBlokList(PathologyBean pathologyBean) {
		List<PathologyBean> specimenBlokList = pathologyApplicationService.findClinspeBlokList(pathologyBean);
		return specimenBlokList;
	}

	// 걸체블럭 일괄처리
	@Override
	public void batchClinspeBlokProcess(List<PathologyBean> batchClinspeBlokList) {
		pathologyApplicationService.batchClinspeBlokProcess(batchClinspeBlokList);
	}

	// 슬라이드 리스트 조회
	@Override
	public List<SpecimenSlideBean> findClinspeSliList(SpecimenSlideBean specimenSlideBean) {
		List<SpecimenSlideBean> specimenSlideBeanList = pathologyApplicationService.findClinspeSliList(specimenSlideBean);
		return specimenSlideBeanList;
	}

	// 검체접수 리스트 조회 (검체인수 확인을 하기 위해 검체접수 리스트 조회)
	@Override
	public List<SpecimenAcquisitionBean> findSpecimenAcquisitionList(Map<String, String> argsMap) {
		List<SpecimenAcquisitionBean> specimenAcquisitionList = pathologyApplicationService.findSpecimenAcquisitionList(argsMap);
		return specimenAcquisitionList;
	}

	// 검체인수 일괄처리
	@Override
	public void batchSpecimenAcquisitionProcess(List<SpecimenAcquisitionBean> batchSpecimenAcquisitionList) {
		pathologyApplicationService.batchSpecimenAcquisitionProcess(batchSpecimenAcquisitionList);
	}

}
