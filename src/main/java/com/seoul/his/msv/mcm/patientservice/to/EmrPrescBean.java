package com.seoul.his.msv.mcm.patientservice.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.to
 *    |_ EmrPrescBean.java
 * </pre>
 *
 * @date : 2016. 12. 24. 오전 9:28:05
 * @version :
 * @author : Minhyeog
 *
 */

@Getter
@Setter
@ToString
@Dataset(name="dsEmrPresc")
public class EmrPrescBean extends BaseBean {
	private String prescNo;
	private String patNo ;
	private String diseaseCd;
	private String diseaseNm;
	private String surYn;
	private String deptNo;
	private String prescDate;

	List<EmrRehabilitationBean> rehabilitationList;	// 재활리스트
	List<EmrMaterialBean> materialList;				// 재료리스트
	List<EmrInjectionBean> injectionList;				// 투약리스트
	List<EmrHandleBean> handleList;					// 처치리스트
	List<EmrCheckupBean> checkupList;				// 검사리스트
	List<EmrTransfusionBean> transfusionList;		// 수혈리스트

	@Remove
	public List<EmrRehabilitationBean> getRehabilitationList() {
		return rehabilitationList;
	}
	@Remove
	public void setRehabilitationList(List<EmrRehabilitationBean> rehabilitationList) {
		this.rehabilitationList = rehabilitationList;
	}
	@Remove
	public List<EmrMaterialBean> getMaterialList() {
		return materialList;
	}
	@Remove
	public void setMaterialList(List<EmrMaterialBean> materialList) {
		this.materialList = materialList;
	}
	@Remove
	public List<EmrInjectionBean> getInjectionList() {
		return injectionList;
	}
	@Remove
	public void setInjectionList(List<EmrInjectionBean> injectionList) {
		this.injectionList = injectionList;
	}
	@Remove
	public List<EmrHandleBean> getHandleList() {
		return handleList;
	}
	@Remove
	public void setHandleList(List<EmrHandleBean> handleList) {
		this.handleList = handleList;
	}
	@Remove
	public List<EmrCheckupBean> getCheckupList() {
		return checkupList;
	}
	@Remove
	public void setCheckupList(List<EmrCheckupBean> checkupList) {
		this.checkupList = checkupList;
	}
	@Remove
	public List<EmrTransfusionBean> getTransfusionList() {
		return transfusionList;
	}
	@Remove
	public void setTransfusionList(List<EmrTransfusionBean> transfusionList) {
		this.transfusionList = transfusionList;
	}
}
