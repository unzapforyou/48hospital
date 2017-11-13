package com.seoul.his.hrs.salBase.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salBase.to
 * @Class    JobBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsJob")
public class JobBean{
    private String detailCodeName,   // 상세코드명
	               detailCode;       // 상세코드

}
