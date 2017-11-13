package com.seoul.his.msv.mcm.doctorschedule.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.to
 *    |_ ScheduleDetailBean.java
 * </pre>
 *
 * @date : 2016. 12. 19. 오후 3:59:04
 * @version :
 * @author : 이정미
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsDtlOrg")
public class ScheduleDetailBean extends BaseBean {
	private String medDr, tpSeqNo, dow, examTm, totCnt, amPmFlag, rsvYn, findKey;

}
