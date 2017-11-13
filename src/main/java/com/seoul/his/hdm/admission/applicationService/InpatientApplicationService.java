package com.seoul.his.hdm.admission.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.admission.to.InpatientBean;


public interface InpatientApplicationService {
	List<InpatientBean> findInpatientList(Map<String, String> argsMap);


}
