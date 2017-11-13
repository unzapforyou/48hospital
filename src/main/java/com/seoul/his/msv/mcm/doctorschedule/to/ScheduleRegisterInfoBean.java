package com.seoul.his.msv.mcm.doctorschedule.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.to
 *    |_ ScheduleRegisterInfoBean.java
 * </pre>
 *
 * @date : 2016. 12. 21. 오후 8:14:23
 * @version :
 * @author : 이정미
 */




@Getter
@Setter
@ToString

@Dataset(name = "dsDrSchRegiInfo")
public class ScheduleRegisterInfoBean extends BaseBean {
	private String medDr, tpSeqNo, toDate, fromDate;
}
