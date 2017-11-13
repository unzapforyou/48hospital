package com.seoul.his.log.inven.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.inven.to.PstInvenBean;



/**
 * @Package  com.seoul.his.log.inven.applicationService
 * @Class    PstInvenAS.java
 * @Create   2016. 5. 29.
 * @Author   Chun
 * @Description
 *
 * @LastUpdated
 */

public interface PstInvenApplicationService {
	List<PstInvenBean> findPstInvenList(Map<String, String> argsMap);
	void batchPstInvenListProcess(List<PstInvenBean> pstInvenList);
}
