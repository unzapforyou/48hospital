package com.seoul.his.bst.patientStatus.selectDailyPatient.exception;

@SuppressWarnings("serial")
public class SelectDailyPatientException extends Exception{
	public SelectDailyPatientException(String errorMsg){
		super(errorMsg);
	}
}
