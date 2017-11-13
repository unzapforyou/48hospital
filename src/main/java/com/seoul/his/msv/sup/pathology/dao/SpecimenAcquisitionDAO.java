package com.seoul.his.msv.sup.pathology.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.pathology.to.SpecimenAcquisitionBean;

public interface SpecimenAcquisitionDAO {

	// 검체접수 리스트 조회 (검체인수 확인을 하기 위해 검체접수 리스트 조회)
	public List<SpecimenAcquisitionBean> selectSpecimenAcquisitionList(Map<String, String> argsMap);
	// clinspeNo(검체번호)유무로 insert 와 update 구분
	public String selectSpecimenAcquisition(String clinspeNo);
	// 검체인수 일괄처리
	public void insertSpecimenAcquisition(SpecimenAcquisitionBean specimenAcquisitionBean);
	public void updateSpecimenAcquisition(SpecimenAcquisitionBean specimenAcquisitionBean);

}
