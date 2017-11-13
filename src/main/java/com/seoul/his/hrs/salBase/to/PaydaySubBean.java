package com.seoul.his.hrs.salBase.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salBase.to
 * @Class    PaydaySubBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsPaydaySub")
public class PaydaySubBean {
	private String belongYm,    // 귀속연월
                   dline,       // 마감상태
			       jobClass;    // 직종
}
