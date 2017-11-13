package com.seoul.his.hrs.salBase.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hrs.salBase.dao.PayDeduDAO;
import com.seoul.his.hrs.salBase.to.PayDeduBean;
import com.seoul.his.hrs.salBase.to.PayDeduSectBean;

/**
 * @Package  com.seoul.his.hrs.salBase.applicationService
 * @Class    PayDeduApplicationServiceImpl.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 2016. 6. 30.
 */

@Component
public class PayDeduApplicationServiceImpl implements PayDeduApplicationService{

	@Autowired
	public PayDeduDAO payDeduDAO;

	/* 지급공제항목설정 */
	@Override
	public List<PayDeduBean> findPayDeduList(Map<String, String> argsMap) {
		return payDeduDAO.findPayDeduList(argsMap);
	}

	@Override
	public void magamCancel(List<PayDeduBean> payDeduList) {
		for(PayDeduBean payDeduBean:payDeduList){
			payDeduDAO.magamCancel(payDeduBean);
		}

	}

	@Override
	public void magam(List<PayDeduBean> payDeduList) {
		for(PayDeduBean payDeduBean:payDeduList){
			payDeduDAO.magam(payDeduBean);
		}
	}

	@Override
	public void batchPayDeduProcess(List<PayDeduBean> payDeduList) {
		for (PayDeduBean payDeduBean : payDeduList) {
			if (payDeduBean.getStatus().equals("inserted")) {
				payDeduDAO.insertPayDedu(payDeduBean);
			} else if (payDeduBean.getStatus().equals("updated")) {
				payDeduDAO.updatePayDedu(payDeduBean);
			} else if (payDeduBean.getStatus().equals("deleted")) {
				payDeduDAO.deletePayDedu(payDeduBean);
			}
		}

	}

	@Override
	public void batchPayDeduSectProcess(List<PayDeduSectBean> payDeduSectList) {
		for (PayDeduSectBean payDeduSectBean : payDeduSectList) {
			if (payDeduSectBean.getStatus().equals("inserted")) {
				payDeduDAO.insertPayDeduSect(payDeduSectBean);
			} else if (payDeduSectBean.getStatus().equals("updated")) {
				payDeduDAO.updatePayDeduSect(payDeduSectBean);
			} else if (payDeduSectBean.getStatus().equals("deleted")) {
				payDeduDAO.deletePayDeduSect(payDeduSectBean);
			}
		}
	}

}
