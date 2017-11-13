package com.seoul.his.hdm.consultationfee.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Dataset(name="dsHosptlzPatInfo")
public class HosptlzPatInfoBean extends BaseBean{
	private String patNo               //환자등록번호
							,patNm             //환자이름
							,tel                   //환자연락처
							,hroom             //병실
							,ward               //병동
							,respDoctNm    //진료과명
							,trmtDeptNm   //담당의사명
							,dscgDate        //퇴원일시
							,hosptlzReceiptNo;  //입원접수번호

	
}
