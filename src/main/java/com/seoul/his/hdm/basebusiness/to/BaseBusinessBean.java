package com.seoul.his.hdm.basebusiness.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Dataset(name = "dsBaseBusiness")
public class BaseBusinessBean extends BaseBean{
	
	private	String	empNo,empNm;
	
	
}
