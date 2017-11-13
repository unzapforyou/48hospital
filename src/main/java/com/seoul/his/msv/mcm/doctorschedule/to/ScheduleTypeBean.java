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
 *    |_ ScheduleTypeBean.java
 *
 * </pre>
 *
 * @date : 2016. 12. 19. 오후 2:26:26
 * @version :
 * @author : 이정미
 */
@Getter
@Setter
@ToString

@Dataset(name = "dsTypeList")
public class ScheduleTypeBean extends BaseBean{
	private String medDr, tpSeqNo, typeName, amStTm, amEdTm, amTerm, amTotCnt, pmStTm, pmEdTm, pmTerm, pmTotCnt, rsvYn,
			comments;
	private List<DetailDowBean> detailDowList;
	private List<ScheduleDetailBean> scheduleDetailList;
}
