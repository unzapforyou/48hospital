package com.seoul.his.msv.sup.pathology.dao;

import java.util.List;

import com.seoul.his.msv.sup.pathology.to.SpecimenSlideBean;

public interface SpecimenSlideDAO {

	// 슬라이드 리스트 조회
	public List<SpecimenSlideBean> selectClinspeSliList(SpecimenSlideBean specimenSlideBean);

}
