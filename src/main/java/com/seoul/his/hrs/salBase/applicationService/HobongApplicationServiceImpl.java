package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.salBase.dao.HobongDAO;
import com.seoul.his.hrs.salBase.to.HobongBean;
import com.seoul.his.hrs.salBase.to.HobongHistoryBean;
import com.seoul.his.hrs.salBase.to.JobBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    HobongApplicationServiceImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

@Component
public class HobongApplicationServiceImpl implements HobongApplicationService{

	@Autowired
	public HobongDAO hobongDAO;
	
	/* 호봉 */
	@Override
	public List<JobBean> findJobList() {
		return hobongDAO.findJobList();
	}

	@Override
	public List<HobongBean> findHobongList(Map<String, String> argsMap) {
		return hobongDAO.findHobongList(argsMap);
	}

	@Override
	public List<HobongHistoryBean> findHobongHistoryList(Map<String, String> argsMap) {
		return hobongDAO.findHobongHistoryList(argsMap);
	}

	@Override
	public void batchHobongProcess(List<HobongBean> hobongList) {
		for (HobongBean hobongBean : hobongList) {
			if (hobongBean.getStatus().equals("inserted")) {
				hobongDAO.insertHobong(hobongBean);
			} else if (hobongBean.getStatus().equals("updated")) {
				hobongDAO.updateHobong(hobongBean);
			} else if (hobongBean.getStatus().equals("deleted")) {
				hobongDAO.deleteHobong(hobongBean);
			}
		}

	}

	@Override
	public void batchHobongHisProcess(List<HobongHistoryBean> hobongHisList) {
        for (HobongHistoryBean hobongHisBean : hobongHisList) {
			if (hobongHisBean.getStatus().equals("inserted")) {
				hobongDAO.insertHobongHis(hobongHisBean);
			} else if (hobongHisBean.getStatus().equals("updated")) {
				hobongDAO.updateHobongHis(hobongHisBean);
			} else if (hobongHisBean.getStatus().equals("deleted")) {
				hobongDAO.deleteHobongHis(hobongHisBean);
			}
		}
	}

}
