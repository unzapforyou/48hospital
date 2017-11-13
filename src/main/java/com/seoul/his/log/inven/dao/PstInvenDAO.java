package com.seoul.his.log.inven.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.inven.to.PstInvenBean;

/**
 * @Package  com.seoul.his.log.inven.dao
 * @Class    PstInvenDAO.java
 * @Create   2016. 5. 29.
 * @Author   Chun
 * @Description
 *
 * @LastUpdated
 */

public interface PstInvenDAO {
    //실재고조회
	List<PstInvenBean> selectPstInvenList(Map<String, String> argsMap);
	//실재고저장
	void insertPstInvenList(PstInvenBean pstInvenBean);
	void updatePstInvenList(PstInvenBean pstInvenBean);
    void deletePstInvenList(PstInvenBean pstInvenBean);
}
