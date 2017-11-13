package com.seoul.his.msv.mcm.patientservice.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.to
 *    |_ EmrTransfusionBean.java
 * </pre>
 *
 * @date : 2016. 12. 24. 오전 9:27:46
 * @version :
 * @author : Minhyeog
 */

@Getter
@Setter
@ToString
@Dataset(name="dsEmrTransfusion")
public class EmrTransfusionBean extends BaseBean {
	private String prescNo;
	private String emgYn;
	private String amount;
	private String bloodDonor;
	private String trTimes;
	private String startTime;
	private String insurance;
	private String purpose;
	private String trLocation;
	private String remark;
	private String hisDate;
	private String prescCd;
}
