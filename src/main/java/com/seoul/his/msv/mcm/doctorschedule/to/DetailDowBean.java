package com.seoul.his.msv.mcm.doctorschedule.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.mcm.doctorschedule.to
 *    |_ DetailDowBean.java
 * </pre>
 *
 * @date : 2016. 12. 21. 오후 12:24:42
 * @version :
 * @author : 이정미
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsDtlDow")
public class DetailDowBean extends BaseBean {
	private String medDr, tpSeqNo, dow, amCnt, pmCnt;

}
