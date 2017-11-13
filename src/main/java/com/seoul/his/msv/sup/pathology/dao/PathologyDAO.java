package com.seoul.his.msv.sup.pathology.dao;

import java.util.List;

import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;
import com.seoul.his.msv.sup.pathology.to.PathologyBean;

public interface PathologyDAO {

	// 검체번호 조회
	List<SpecimenCollectionBean> selectClinspeNoList();
	// 검체정보 조회
	List<PathologyBean> selectClinspeBlokList(PathologyBean pathologyBean);
	// 검체블록 일괄처리 (등록)
	void insertClinspeBlok(PathologyBean pathologyBean);
	// 검체블록 일괄처리 (수정)
	void updateClinspeBlok(PathologyBean pathologyBean);
	// 검체블록 일괄처리 (삭제)
	void deleteClinspeBlok(PathologyBean pathologyBean);

}
