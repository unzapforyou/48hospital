package com.seoul.his.hdm.admission.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.admission.to.InpatientBean;


public interface InpatientDAO {

	List<InpatientBean> selectInpatientList(Map<String, String> argsMap);


}
