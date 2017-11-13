package com.seoul.his.msv.pre.prescriptionmanagement.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.pre.prescriptionmanagement.to.DiseaseBean;

public interface DiseaseDAO {

	List<DiseaseBean> selectDiseaseList(Map<String, String> argsMap);


}
