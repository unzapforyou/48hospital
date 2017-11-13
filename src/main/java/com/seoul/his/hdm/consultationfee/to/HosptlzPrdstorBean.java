package com.seoul.his.hdm.consultationfee.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name="dsHosptlzPrdstor")
public class HosptlzPrdstorBean extends BaseBean{
	private String trmtDoct                         //담당의사
							,trmtDept               //진료과
							,trmtDate               //진료일자
							,outpaReceiptNo         //외래접수번호
							,patNo                  //환자등록번호
							,age                    //환자나이
							,patNm                  //환자이름
							,gender                 //환자성별
							,hosptlzPlnDate         //입원예정일
							,hosptlzRsvtNo          //입원예약번호
							,uniqueNtc              //특기사항
 							,hopeRoom               //희망병실
 							,hopeWard               //희망병동
 							,hosptlzRsvtYb;         //입원예약 상태

	
}
