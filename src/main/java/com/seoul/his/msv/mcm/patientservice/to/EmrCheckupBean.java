package com.seoul.his.msv.mcm.patientservice.to;

import com.seoul.his.common.annotation.Dataset;
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
 */

@Getter
@Setter
@ToString
@Dataset(name="dsEmrCheckup")
public class EmrCheckupBean extends BaseBean {
	private String prescNo;
	private String emgYn;
	private String prnYn;
	private String nightYn;
	private String wishDate;
	private String chTimes;
	private String insurance;
	private String selectCareYn;
	private String antiYn;
	private String mtrlYn;
	private String remark;
	private String hisDate;
	private String prescCd;
}
