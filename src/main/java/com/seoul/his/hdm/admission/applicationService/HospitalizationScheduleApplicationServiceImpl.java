package com.seoul.his.hdm.admission.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hdm.admission.dao.HospitalizationScheduleDAO;
import com.seoul.his.hdm.admission.to.HospitalizationScheduleBean;
import com.seoul.his.hdm.admission.to.HospitalizationScheduleManageBean;
import com.seoul.his.hdm.foreign.to.ReceiptInfoBean;



/**
 * <pre>
 * com.seoul.his.hdm.admission.applicationService
 *    |_ HospitalizationScheduleApplicationServiceImpl.java
 * </pre>
 *
 * @date : 2016. 12. 12. 오후 7:37:06
 * @version :
 * @author : kimmu
 */




@Component
public class HospitalizationScheduleApplicationServiceImpl implements HospitalizationScheduleApplicationService{
	@Autowired
	HospitalizationScheduleDAO hospitalizationScheduleDAO;

	@Override
	public String callhosptlzRsvtSeq() {
		String hosptlzRsvtNo=hospitalizationScheduleDAO.selectHosptlzRsvtSeq();
		return hosptlzRsvtNo;
	}

	@Override
	public void registerHospitalizationSchedule(List<HospitalizationScheduleBean> hospitalizationScheduleList){
		for(HospitalizationScheduleBean hospitalizationScheduleBean : hospitalizationScheduleList){
			switch(hospitalizationScheduleBean.getStatus()){
			case "inserted":
				hospitalizationScheduleDAO.insertHospitalizationSchedule(hospitalizationScheduleBean);
			}
		}
	}

	@Override
	public List<HospitalizationScheduleBean> findHospitalizationSchedule(Map<String, String> argsMap) {
		return hospitalizationScheduleDAO.selectHospitalizationSchedule(argsMap);
	}

	@Override
	public void modifyHosptalizationScheduleInfo(List<ReceiptInfoBean> receiptInfoList) {
		for(ReceiptInfoBean receiptInfoBean :receiptInfoList ){
			switch(receiptInfoBean.getStatus()){
			case "updated" :
				hospitalizationScheduleDAO.updataHosptalizationScheduleInfo(receiptInfoBean);
			}
		}
	}

	@Override
	public List<HospitalizationScheduleManageBean> findHospitalizationScheduleManageList(Map<String, String> argsMap) {
		return hospitalizationScheduleDAO.selectHospitalizationScheduleManageList(argsMap);
	}

	@Override
	public void changeHospitalizationScheduleYb(List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList) {
		for(HospitalizationScheduleManageBean hospitalizationScheduleManageBean :hospitalizationScheduleManageList ){
			switch(hospitalizationScheduleManageBean.getStatus()){
			case "updated" :
				hospitalizationScheduleDAO.updateHospitalizationScheduleYb(hospitalizationScheduleManageBean);
			}
		}
	}

	@Override
	public void batchHospitalizationScheduleManageProcess(List<HospitalizationScheduleManageBean> hospitalizationScheduleManageList) {
		for(HospitalizationScheduleManageBean hospitalizationScheduleManageBean :hospitalizationScheduleManageList ){
			switch(hospitalizationScheduleManageBean.getStatus()){
			case "updated" :
				hospitalizationScheduleDAO.updateHospitalizationScheduleManage(hospitalizationScheduleManageBean);
				break;
			case "deleted":
				hospitalizationScheduleDAO.deleteHospitalizationScheduleManage(hospitalizationScheduleManageBean);
			    break;
			}
		}
	}


}
