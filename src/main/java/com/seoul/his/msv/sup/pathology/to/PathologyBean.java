package com.seoul.his.msv.sup.pathology.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  	com.seoul.his.msv.sup.pathology.to
 * @Class    	PathologyBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsSspClinspeBlok")
public class PathologyBean extends BaseBean{

	private	String	clinspeNo,
					clinspeBlokCode,
					clinspeBlokProdDay,
					clinspeBlokProdTime,
					clinspeBlokQnt,
					patNo,
					patNm;

}
