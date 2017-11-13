package com.seoul.his.acc.elementary.applicationService;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.acc.elementary.dao.AccPridDAO;
import com.seoul.his.acc.elementary.to.AccPridBean;



@Component
public class ElementaryApplicationServiceImpl implements ElementaryApplicationService {

	@Autowired
	AccPridDAO accPridDAO;



	@Override
	public List<AccPridBean> findAccPridList() {
		List<AccPridBean> accPridList = accPridDAO.selectAccPridList();
		return accPridList;
	}

}
