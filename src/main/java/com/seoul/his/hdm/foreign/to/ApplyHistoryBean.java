package com.seoul.his.hdm.foreign.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Dataset(name="dsApplyHistory")
public class ApplyHistoryBean extends BaseBean{
	private String meddate; //일

}
