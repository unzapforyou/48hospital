package com.seoul.his.msv.sup.pathology.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  	com.seoul.his.msv.sup.pathology.to
 * @Class    	SpecimenSlideBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name="dsSspClinspeSli")
public class SpecimenSlideBean extends BaseBean{

    private String clinspeNo,         // 검체번호
		           clinspeBlokCode,   // 검체블록 코드
		           sliCode,           // 슬라이드 코드
		           sliProdDay,        // 슬라이드 제작일
		           sliQnt,            // 슬라이드 수량
		           sliCon;            // 슬라이드 내용
}
