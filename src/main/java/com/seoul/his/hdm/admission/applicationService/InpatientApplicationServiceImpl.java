package com.seoul.his.hdm.admission.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hdm.admission.dao.InpatientDAO;
import com.seoul.his.hdm.admission.to.InpatientBean;

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
public class InpatientApplicationServiceImpl implements InpatientApplicationService{
	@Autowired
	InpatientDAO inpatientDAO;

	@Override
	public List<InpatientBean> findInpatientList(Map<String, String> argsMap) {
		List<InpatientBean> inpatientList = inpatientDAO.selectInpatientList(argsMap);
		return inpatientList;
	}

}
