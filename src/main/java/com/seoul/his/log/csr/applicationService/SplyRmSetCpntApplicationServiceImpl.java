package com.seoul.his.log.csr.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.log.csr.dao.SplyRmSetCpntDAO;
import com.seoul.his.log.csr.to.SplyRmSetCpntBean;
import com.seoul.his.log.csr.to.SplyRmSetCpntHistBean;

/**
 * @Package  com.erp45.log.midSplyRm.AS
 * @Class    SplyRmSETCpntASImpl.java
 * @Create   2016. 5. 25.
 * @Author   류재춘
 * @Description 공급실 SET구성품관리 애플리케이션서비스
 *
 * @LastUpdated
 */

@Service
public class SplyRmSetCpntApplicationServiceImpl implements SplyRmSetCpntApplicationService{

	@Autowired
	private SplyRmSetCpntDAO splyRmSetCpntDAO;

	@Override
	public List<SplyRmSetCpntBean> findSplyRmSetCpntList(Map<String, String> argsMap) {
		return splyRmSetCpntDAO.selectSplyRmSetCpntList(argsMap);
	}



    //번호생성
	@Override
	public String callSetCdSeq() {
		String SetCdNo=splyRmSetCpntDAO.callSetCdSeq();
		//System.out.println("번호생성"+SetCdNo);
		return SetCdNo;
	}

    //SET구성품 일괄처리
	@Override
	public void batchProcessSetCpntList(List<SplyRmSetCpntBean> splyRmSetCpnList, List<SplyRmSetCpntHistBean> splyRmSetCpntHistList) {

		//SET 구성품
		for(SplyRmSetCpntBean splyRmSetCpntBean : splyRmSetCpnList){
			System.out.println("========================= : "+splyRmSetCpntBean.getStatus());
			switch(splyRmSetCpntBean.getStatus()){
			case "inserted":
				splyRmSetCpntDAO.insertSplyRmSetCpnt(splyRmSetCpntBean);
				break;
			case "deleted":
				splyRmSetCpntDAO.deleteSplyRmSetCpnt(splyRmSetCpntBean);
				break;
			case "updated":
				splyRmSetCpntDAO.updateSplyRmSetCpnt(splyRmSetCpntBean);
				break;
			}
		}

		//SET구성품 내역
		for(SplyRmSetCpntHistBean splyRmSetCpntHistBean : splyRmSetCpntHistList){
			System.out.println("========== 상세내역 =============== : "+splyRmSetCpntHistBean.getStatus());
			switch(splyRmSetCpntHistBean.getStatus()){
			case "inserted":
				splyRmSetCpntDAO.insertSplyRmSetCpntHist(splyRmSetCpntHistBean);
				break;
			case "deleted":
				splyRmSetCpntDAO.deleteSplyRmSetCpntHist(splyRmSetCpntHistBean);
				break;
			case "updated":
				splyRmSetCpntDAO.updateSplyRmSetCpntHist(splyRmSetCpntHistBean);
				break;
			}
		}

	}




}
