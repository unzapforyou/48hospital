package com.seoul.his.hrs.guntae.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.to
 *    |_ InoutWorkTimeBean.java
 *
 * </pre>
 * @date : 2016. 12. 22. 오후 4:55:38
 * @version :
 * @author : ssongnee
 */

@Dataset(name="dsInoutWorkTime")
@Getter
@Setter
@ToString
public class InoutWorkTimeBean extends BaseBean{
	private String
	inOutTime
  , reason
  , inoutGubun
  , inoutTimeNo
  , startDate
  , endDate
  , empNo
  , empNm
  , overTime
  , belongDay;
}





