package com.seoul.his.msv.sup.endoscoperadiologydiagnosis.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.ClinspeSequenceBean;
import com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to.SpecimenCollectionBean;

public interface SpecimenCollectionDAO {

	// 검체번호 조회
	public ClinspeSequenceBean selectMaxClinspeNo();
	// 검체채취 리스트 조회
	public List<SpecimenCollectionBean> selectClinspeList(Map<String, String> argsMap);
	// 검체채취 일괄처리
	public void insertClinspe(SpecimenCollectionBean specimenCollectionBean);
	public void insertClinspeBlok(SpecimenCollectionBean specimenCollectionBean);
	public void updateClinspe(SpecimenCollectionBean specimenCollectionBean);
	public void deleteClinspe(SpecimenCollectionBean specimenCollectionBean);
	public void deleteClinspeBlok(SpecimenCollectionBean specimenCollectionBean);

}
