package com.seoul.his.msv.mcm.patientservice.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.to
 *    |_ EmrRehabilitationBean.java
 * </pre>
 *
 * @date : 2016. 12. 24. 오전 9:27:57
 * @version :
 * @author : Minhyeog
 *
 */

@Getter
@Setter
@ToString
@Dataset(name="dsEmrRehabilitation")
public class EmrRehabilitationBean extends BaseBean {
	private String prescNo;
	private String woundArea;
	private String selectCareYn;
	private String rehDays ;
	private String insurance ;
	private String remark;
	private String hisDate ;
	private String prescCd;
}
