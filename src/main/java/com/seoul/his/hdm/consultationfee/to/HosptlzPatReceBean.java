package com.seoul.his.hdm.consultationfee.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Dataset(name="dsHosptlzPatRece")
public class HosptlzPatReceBean extends BaseBean{

	private String receState          // 수납상태
				 , receDate           // 수납일자
				 , receType           // 수납유형
				 , receAmt            // 수납금액
				 , hosptlzReceiptNo   // 입원접수번호
				 , alrdReceAmt        // 기수납액
				 , recp               // 수납자
				 , procWorker         // 처리자
				 , outAmt;			  // 미수금액

	
}
