package com.seoul.his.bst.patientStatus.selectDailyPatient.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Dataset(name = "dsSelectDailyPatient")
public class SelectDailyPatientBean extends BaseBean{
	
	private String rk,patNo,patNm,prescDate,dept,diseaseNm,ibwon;
	
	
}
