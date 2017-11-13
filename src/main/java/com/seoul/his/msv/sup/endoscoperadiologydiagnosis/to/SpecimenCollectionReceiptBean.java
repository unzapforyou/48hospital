package com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

/**
 * @Package  	com.seoul.his.msv.sup.endoscoperadiologydiagnosis.to
 * @Class    	SpecimenCollectionReceiptBean.java
 * @Create  	2016. 12. 26.
 * @Author   	jeong
 * @Description
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name="dsClinspeReceipt")
public class SpecimenCollectionReceiptBean extends BaseBean{

	private String clinspeNo,              // 검체번호
	               clinspeReceiptDate,     // 검체접수일
	               receiptCd,              // 접수구분
	               emeYn,                  // 응급여부
	               receiptCancelCau,       // 접수취소사유
	               receiptCancelDate,      // 접수취소일
	               dgnsNm,                 //
	               exmntCd,                // 검사항목
	               clinspeNm,              // 검체명
	               bloodgetDate,           // 채취일시
	               bloodgetEmp;            // 채취자

}