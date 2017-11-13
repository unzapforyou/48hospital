package com.seoul.his.hdm.admission.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hdm.admission.dao.HospitalizationInfoDAO;
import com.seoul.his.hdm.admission.to.HospitalizationInfoBean;

/**
 * @Package  com.seoul.his.acc.budget.applicationService
 * @Class    AccBudgetApplicationServiceImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated
 */

@Component
public class HospitalizationInfoApplicationServiceImpl implements HospitalizationInfoApplicationService{
	@Autowired
	HospitalizationInfoDAO hospitalizationInfoDAO;

	@Override
	public List<HospitalizationInfoBean> findHospitalizationInfo(Map<String, String> argsMap) {
		return hospitalizationInfoDAO.selectHospitalizationInfo(argsMap);
	}

	@Override
	public void batchHospitalizationProcess(List<HospitalizationInfoBean> hospitalizationInfoList) {
		for (HospitalizationInfoBean hospitalizationInfoBean : hospitalizationInfoList) {

			switch (hospitalizationInfoBean.getStatus()) {
			case "inserted":
				hospitalizationInfoDAO.insertHospitalizationInfo(hospitalizationInfoBean);
				break;
			case "updated":
				hospitalizationInfoDAO.updateHospitalizationInfo(hospitalizationInfoBean);
				break;
			case "deleted":
				hospitalizationInfoDAO.deleteHospitalizationInfo(hospitalizationInfoBean);
			}
		}
	}

	@Override
	public String callHospitalizationSeq() {
		return hospitalizationInfoDAO.selectHospitalizationSeq();
	}

}
