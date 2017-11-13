package com.seoul.his.hrs.guntae.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.hrs.guntae.to
 *    |_ MonGuntaeCloseBean.java
 *
 * </pre>
 * @date : 2016. 12. 27. 오후 8:35:42
 * @version :
 * @author : User
 */
@Dataset(name="dsMonGuntaeClose")
@Getter
@Setter
@ToString
public class MonGuntaeCloseBean extends BaseBean{
	private String
	monGuntaeNo
  , belongYearMon
  , closeYn;
}





