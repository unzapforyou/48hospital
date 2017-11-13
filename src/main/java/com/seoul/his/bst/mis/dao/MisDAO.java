package com.seoul.his.bst.mis.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.bst.mis.to.MisBean;

public interface MisDAO {

	List<MisBean> selectMisList(Map<String, String> argsMap);

	void insertMis(MisBean misBean);

	void updateMis(MisBean misBean);

	void deleteEmp(MisBean misBean);


}
