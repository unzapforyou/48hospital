package com.seoul.his.msv.mcm.doctorschedule.applicationService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.msv.mcm.doctorschedule.dao.DoctorScheduleDAO;
import com.seoul.his.msv.mcm.doctorschedule.dao.ScheduleDetailDAO;
import com.seoul.his.msv.mcm.doctorschedule.dao.ScheduleTypeDAO;
import com.seoul.his.msv.mcm.doctorschedule.to.LastDateBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleDetailBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleRegisterInfoBean;
import com.seoul.his.msv.mcm.doctorschedule.to.ScheduleTypeBean;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.applicationService
 *    |_ DoctorScheduleApplicaionServiceImpl.java
 *
 * </pre>
 *
 * @date : 2016. 12. 19. 오후 2:32:22
 * @version :
 * @author : 이정미
 */
@Component
public class DoctorScheduleApplicaionServiceImpl implements DoctorScheduleApplicaionService {
	@Autowired
	ScheduleTypeDAO scheduleTypeDAO;
	@Autowired
	ScheduleDetailDAO scheduleDetailDAO;
	@Autowired
	DoctorScheduleDAO doctorScheduleDAO;

	@Override
	public List<ScheduleTypeBean> findScheduleTypeList(Map<String, String> argsMap) {
		return scheduleTypeDAO.selectScheduleTypeList(argsMap);
	}

	@Override
	public void registerScheduleType(ScheduleTypeBean scheduleType) {
		scheduleTypeDAO.insertScheduleType(scheduleType);
		registerScheduleDetail(scheduleType);
	}

	@Override
	public void modifyScheduleType(ScheduleTypeBean scheduleType) {
		scheduleTypeDAO.updateScheduleType(scheduleType);
		removeScheduleDetailList(scheduleType);
		registerScheduleDetail(scheduleType);

	}

	@Override
	public void removeScheduleType(ScheduleTypeBean scheduleType) {
		removeScheduleDetailList(scheduleType);
		scheduleTypeDAO.deleteScheduleType(scheduleType);
	}

	@Override
	public List<ScheduleDetailBean> findScheduleDetailList(Map<String, String> argsMap) {
		return scheduleDetailDAO.selectSchduleDetailList(argsMap);
	}

	@Override
	public void registerScheduleDetail(ScheduleTypeBean scheduleType) {
		List<ScheduleDetailBean> scheduleDetailList = scheduleType.getScheduleDetailList();
		for (ScheduleDetailBean scheduleDetail : scheduleDetailList) {
			scheduleDetail.setMedDr(scheduleType.getMedDr());
			scheduleDetail.setTpSeqNo(scheduleType.getTpSeqNo());
			scheduleDetailDAO.insertScheduleDetail(scheduleDetail);
		}
	}

	@Override
	public void removeScheduleDetailList(ScheduleTypeBean scheduleType) {
		scheduleDetailDAO.deleteScheduleDetailList(scheduleType);
	}

	@Override
	public void registerDoctorSchedule(ScheduleRegisterInfoBean scheduleRegisterInfo) {
		doctorScheduleDAO.insertDoctorSchedule(scheduleRegisterInfo);
	}

	@Override
	public List<LastDateBean> findLastDateList(Map<String, String> argsMap) {
		return doctorScheduleDAO.selectLastDateList(argsMap);
	}

	@Override
	public void removeDoctorSchedule(Map<String, String> argsMap) {
		Map<String,Object> paramMap=new HashMap<String,Object>();
		paramMap.putAll(argsMap);
		String sDow=argsMap.get("dow");
		int sDowLen=sDow.length();
		String[] dowArr=new String[sDowLen];
		for (int i = 0; i < sDowLen; i++) {
			dowArr[i]=sDow.substring(i,i+1);

		}
		paramMap.put("dow", dowArr);
		for(String key:argsMap.keySet()){
			System.out.println(key+":"+argsMap.get(key));
		}
		for(String key:paramMap.keySet()){
			System.out.println(key+":"+paramMap.get(key));
		}
		doctorScheduleDAO.deleteDoctorSchedule(paramMap);

	}

}
