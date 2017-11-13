package com.seoul.his.acc.vat.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import com.seoul.his.common.annotation.Dataset;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

/**
 * @Package  com.seoul.his.acc.vat.to
 * @Class    SearchConditionBean.java
 * @Create   2016. 6. 1.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString

@Dataset(name="dsSearchCondition")
public class SearchConditionBean extends BaseBean {
    
	private String tableName, 
	               columnName, 
	               columnValue, 
	               operator;
}
