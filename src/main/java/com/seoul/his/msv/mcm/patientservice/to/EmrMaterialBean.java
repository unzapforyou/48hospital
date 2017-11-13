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
@Dataset(name="dsEmrMaterial")
public class EmrMaterialBean extends BaseBean {
	private String prescNo;
	private String prescNm;
	private String emgYn;
	private String reoperYn;
	private String nightYn;
	private String amount;
	private String startTime;
	private String insurance;
	private String usingLocation;
	private String remark;
	private String hisDate;
	private String prescCd;
}
