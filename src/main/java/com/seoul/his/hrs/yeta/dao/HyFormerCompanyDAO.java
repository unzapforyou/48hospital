package com.seoul.his.hrs.yeta.dao;

import java.util.List;

import com.seoul.his.hrs.yeta.to.HyFormerCompanyBean;

public interface HyFormerCompanyDAO {
	List<HyFormerCompanyBean> selectHyFormerCompanyList();

	void insertHyFormerCompany(HyFormerCompanyBean hyFormerCompanyBean);

	void updateHyFormerCompany(HyFormerCompanyBean hyFormerCompanyBean);

	void deleteHyFormerCompany(HyFormerCompanyBean hyFormerCompanyBean);

}
