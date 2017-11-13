package com.seoul.his.hdm.admission.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.hdm.admission.to.HospitalRoomBean;

public interface HospitalRoomDAO {

	List<HospitalRoomBean> selectHospitalRoomList(Map<String, String> argsMap);
	public void insertHospitalRoom(HospitalRoomBean hospitalRoomBean);
	public void deleteHospitalRoom(HospitalRoomBean hospitalRoomBean);
	public void updateHospitalRoom(HospitalRoomBean hospitalRoomBean);
	public String selectHospitalRoomSeq();


}
