package com.seoul.his.log.inven.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.inven.dao.PstInvenDAO;
import com.seoul.his.log.inven.to.PstInvenBean;




/**
 * @Package  com.seoul.his.log.inven.applicationService
 * @Class    PstInvenASImpl.java
 * @Create   2016. 5. 29.
 * @Author   Chun
 * @Description
 *
 * @LastUpdated
 */
@Service
public class PstInvenApplicationServiceImpl implements PstInvenApplicationService {
	@Autowired
	PstInvenDAO pstInvenDAO;

	//실재고 조회
	@Override
	public List<PstInvenBean> findPstInvenList(Map<String, String> argsMap){
		List<PstInvenBean> pstInvenList = pstInvenDAO.selectPstInvenList(argsMap);
		return pstInvenList;
	}

	//실재고 저장
	@Override
	public void batchPstInvenListProcess(List<PstInvenBean> pstInvenList) {
		for(PstInvenBean pstInvenBean : pstInvenList){
			String status=pstInvenBean.getStatus();
			switch (status) {
			case "inserted":
				pstInvenDAO.insertPstInvenList(pstInvenBean);
				break;

			case "updated":
				pstInvenDAO.updatePstInvenList(pstInvenBean);
				break;
			case "deleted":
			    pstInvenDAO.deletePstInvenList(pstInvenBean);
			}
		}
	}
}
