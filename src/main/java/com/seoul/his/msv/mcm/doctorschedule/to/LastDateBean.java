package com.seoul.his.msv.mcm.doctorschedule.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.to
 *    |_ LastDateBean.java
 * </pre>
 *
 * @date : 2016. 12. 22. 오전 11:43:23
 * @version :
 * @author : 이정미
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsDrDow")
public class LastDateBean extends BaseBean {
	private String dow, lastDate;
}
