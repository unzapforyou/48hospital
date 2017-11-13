package com.seoul.his.hdm.consultationfee.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Dataset(name="dsHosptlzTrmtCost")
public class HosptlzTrmtCostBean extends BaseBean{

	private String hosptlzTrmtCostSeq		// 입원진료비 일련번호
				 , hosptlzReceiptNo			// 입원접수번호
				 , patNo					// 환자등록번호
				 , exmntAtc					// 검사항목
				 , sal						// 급여
				 , nonSal;					// 비급여

	

}
