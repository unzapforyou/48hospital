package com.seoul.his.msv.mcm.patientservice.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.mcm.patientservice.to
 *    |_ AttentionalPatientBean.java
 * </pre>
 *
 * @date : 2016. 12. 1. 오후 3:34:38
 * @version :
 * @author : Minhyeog
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsAttentionalPatient")
public class AttentionalPatientBean extends BaseBean {
	private String attentionalRegNo ,patNo ,patName ,attentionalFieldName, attentionalDiv ,attentionalContent, startDate ,endDate;
}
