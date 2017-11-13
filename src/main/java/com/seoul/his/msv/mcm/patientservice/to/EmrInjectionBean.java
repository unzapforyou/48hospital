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
@Dataset(name="dsEmrInjection")
public class EmrInjectionBean extends BaseBean {
	private String prescNo;
	private String prescNm;
	private String inCapacity;
	private String inTime;
	private String inDays;
	private String inMethod;
	private String insurance;
	private String emgYn;
	private String prnYn;
	private String remark;
	private String hisDate;
	private String prescCd;
}
