package com.seoul.his.msv.sup.pathology.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  	com.seoul.his.msv.sup.pathology.to
 * @Class    	SpecimenAcquisitionBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name="dsSpecimenAcquisition")
public class SpecimenAcquisitionBean extends BaseBean {

	private	String	clinspeNo,				// 검체번호
					clinspeReceiptDate,		// 검체접수일자
					bloodgetDate,			// 채혈일자
					bloodgetEmp,			// 채혈자
					patNo,					// 환자등록번호
					patNm,					// 환자명
					acquisitionYn,			// 인수확인
					acquisitionDate,		// 인수일자
					acquisitionCancelDate;	// 인수취소일자

}
