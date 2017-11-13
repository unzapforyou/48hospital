package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.salBase.dao.PaydayDAO;
import com.seoul.his.hrs.salBase.to.PaydayBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    PaydayApplicationServiceImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

@Component
public class PaydayApplicationServiceImpl implements PaydayApplicationService{

	@Autowired
	public PaydayDAO paydayDAO;
	
	@Autowired
    ResourceBundleMessageSource messageSource;

	/* 급상여지급일자관리 */
	@Override
	public List<PaydayBean> findPaydayList(Map<String, String> argsMap) {
		return paydayDAO.findPaydayList(argsMap);
	}
	
    @Override
    public List<PaydayBean> findPaydaySubList(Map<String, String> argsMap) {
        return paydayDAO.findPaydaySubList(argsMap);
    }

	@Override
	public void batchPaydayProcess(List<PaydayBean> paydayList){
		for (PaydayBean paydayBean : paydayList) {
			if (paydayBean.getStatus().equals("inserted")) {
				paydayDAO.insertPayday(paydayBean);
				paydayDAO.callCreatePay(paydayBean);
			} else if (paydayBean.getStatus().equals("updated")) {
				paydayDAO.updatePayday(paydayBean);
			} else if (paydayBean.getStatus().equals("deleted")) {
              //급여계산이 한명이라도 되었다면 삭제할 수 없다. 마감취소를 하고 삭제해야 한다.
                List<PaydayBean> paydaySubList = paydayDAO.findMagam(paydayBean);
                //마감정보가 0은 해당직종에 대한 데이터가 없다는 뜻이다. 바로 삭제 가능하다.
                if(paydaySubList.size() == 0){
                    paydayDAO.deletePayday(paydayBean);
                    paydayDAO.deleteRegularWorksSal(paydayBean);
                }
            }
		}
	}
	  
}
