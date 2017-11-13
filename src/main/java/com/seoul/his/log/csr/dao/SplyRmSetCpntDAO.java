package com.seoul.his.log.csr.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.csr.to.SplyRmSetCpntBean;
import com.seoul.his.log.csr.to.SplyRmSetCpntHistBean;

/**
 * @Package  com.seoul.his.log.midSplyRm.dao
 * @Class    SplyRmSETCpntDAO.java
 * @Create   2016. 5. 25.
 * @Author   류재춘
 * @Description
 *
 * @LastUpdated
 */

public interface  SplyRmSetCpntDAO {

	List<SplyRmSetCpntBean> selectSplyRmSetCpntList(Map<String, String> queryMap);   //공급실 SET 구성품조회

	void insertSetCdSEQ(SplyRmSetCpntBean splyRmSETCpntBean);
	public String callSetCdSeq();  //번호생성

	void insertSplyRmSetCpnt(SplyRmSetCpntBean splyRmSetCpntBean);    //SET구성품 등록.
	void deleteSplyRmSetCpnt(SplyRmSetCpntBean splyRmSetCpntBean);   //SET구성품 삭제.
	void updateSplyRmSetCpnt(SplyRmSetCpntBean splyRmSetCpntBean);  //SET구성품 수정.

	void insertSplyRmSetCpntHist(SplyRmSetCpntHistBean splyRmSetCpntHistBean);  //SET 구성품 상세내역 등록.
	void deleteSplyRmSetCpntHist(SplyRmSetCpntHistBean splyRmSetCpntHistBean);  //SET 구성품 상세내역 삭제.
	void updateSplyRmSetCpntHist(SplyRmSetCpntHistBean splyRmSetCpntHistBean);  //SET 구성품 상세내역 수정.

}
