package com.seoul.his.acc.elementary.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.elementary.applicationService.ElementaryApplicationService;
import com.seoul.his.acc.elementary.to.AccPridBean;

@Service
public class ElementaryServiceFacadeImpl implements ElementaryServiceFacade {
	@Autowired
	ElementaryApplicationService elementaryApplicationService;

	@Override
	public List<AccPridBean> findAccPridList() {
		List<AccPridBean> accpridList = elementaryApplicationService.findAccPridList();
		return accpridList;
	}



}
