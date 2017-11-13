package com.seoul.his.hdm.admission.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.hdm.admission.dao.HospitalRoomDAO;
import com.seoul.his.hdm.admission.to.HospitalRoomBean;

/**
 * @Package  com.seoul.his.acc.budget.applicationService
 * @Class    AccBudgetApplicationServiceImpl.java
 * @Create   2016. 6. 27.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated
 */

@Component
public class HospitalRoomApplicationServiceImpl implements HospitalRoomApplicationService{
	@Autowired
	HospitalRoomDAO hospitalRoomDAO;

    @Override
    public List<HospitalRoomBean> findHospitalRoomList(Map<String, String> argsMap) {
        return hospitalRoomDAO.selectHospitalRoomList(argsMap);
    }

    @Override
    public void batchHospitalRoomProcess(List<HospitalRoomBean> hospitalRoomBeanList) {
    	for (HospitalRoomBean hospitalRoomBean : hospitalRoomBeanList) {
            switch (hospitalRoomBean.getStatus()) {
            case "inserted": { hospitalRoomDAO.insertHospitalRoom(hospitalRoomBean); break; }
            case "deleted":  { hospitalRoomDAO.deleteHospitalRoom(hospitalRoomBean); break; }
            case "updated":  { hospitalRoomDAO.updateHospitalRoom(hospitalRoomBean); break; }
            }
        }
    }

    @Override
    public String getHospitalRoomSeq() {
    	return hospitalRoomDAO.selectHospitalRoomSeq();
    }

}
