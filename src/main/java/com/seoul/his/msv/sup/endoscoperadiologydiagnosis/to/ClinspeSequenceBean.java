package com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to;

import com.seoul.his.common.to.BaseBean;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

import com.seoul.his.common.annotation.Dataset;

/**
 * @Package  	com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to
 * @Class    	ClinspeSequenceBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name="dsClinspeSequence")
public class ClinspeSequenceBean extends BaseBean {

	private String clinspeNo;  // 검체번호


}