package com.seoul.his.msv.sup.pathology.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;
import com.seoul.his.msv.sup.pathology.dao.PathologyDAO;
import com.seoul.his.msv.sup.pathology.dao.SpecimenAcquisitionDAO;
import com.seoul.his.msv.sup.pathology.dao.SpecimenSlideDAO;
import com.seoul.his.msv.sup.pathology.to.PathologyBean;
import com.seoul.his.msv.sup.pathology.to.SpecimenAcquisitionBean;
import com.seoul.his.msv.sup.pathology.to.SpecimenSlideBean;

/**
 * @Package  	com.seoul.his.msv.sup.pathology.applicationService
 * @Class    	PathologyApplicationServiceImpl.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Component
public class PathologyApplicationServiceImpl implements PathologyApplicationService{

	@Autowired
	PathologyDAO pathologyDAO;
	@Autowired
	SpecimenSlideDAO specimenSlideDAO;
	@Autowired
	SpecimenAcquisitionDAO specimenAcquisitionDAO;

	// 검체번호 조회
	@Override
	public List<SpecimenCollectionBean> findClinspeNoList() {
		return pathologyDAO.selectClinspeNoList();
	}

	// 검체정보 조회
	@Override
	public List<PathologyBean> findClinspeBlokList(PathologyBean pathologyBean) {
		return pathologyDAO.selectClinspeBlokList(pathologyBean);
	}

	// 검체블록 일괄처리
	@Override
	public void batchClinspeBlokProcess(List<PathologyBean> batchClinspeBlokList) {
		for(PathologyBean pathologyBean : batchClinspeBlokList){
			switch (pathologyBean.getStatus()) {
			case "insert" : pathologyDAO.insertClinspeBlok(pathologyBean); break;
			case "update" : pathologyDAO.updateClinspeBlok(pathologyBean); break;
			case "delete" : pathologyDAO.deleteClinspeBlok(pathologyBean); break;
			}
		}
	}

	// 슬라이드 리스트 조회
	@Override
	public List<SpecimenSlideBean> findClinspeSliList(SpecimenSlideBean specimenSlideBean) {
		return specimenSlideDAO.selectClinspeSliList(specimenSlideBean);
	}

	// 검체접수 리스트 조회 (검체인수 확인을 하기 위해 검체접수 리스트 조회)
	@Override
	public List<SpecimenAcquisitionBean> findSpecimenAcquisitionList(Map<String, String> argsMap) {
		List<SpecimenAcquisitionBean> specimenAcquisitionList = specimenAcquisitionDAO.selectSpecimenAcquisitionList(argsMap);
		return specimenAcquisitionList;
	}

	// 검체인수 일괄처리
	@Override
	public void batchSpecimenAcquisitionProcess(List<SpecimenAcquisitionBean> batchSpecimenAcquisitionList) {
		for(SpecimenAcquisitionBean specimenAcquisitionBean : batchSpecimenAcquisitionList){
			String clinspeNo = specimenAcquisitionDAO.selectSpecimenAcquisition(specimenAcquisitionBean.getClinspeNo());
			//System.out.println("clinspeNo : "+clinspeNo);
			//clinspeNo(검체번호)유무로 insert 와 update 구분
			if(clinspeNo==null){
				specimenAcquisitionDAO.insertSpecimenAcquisition(specimenAcquisitionBean); break;
			}else{
				specimenAcquisitionDAO.updateSpecimenAcquisition(specimenAcquisitionBean); break;
			}
		}
	}

}
