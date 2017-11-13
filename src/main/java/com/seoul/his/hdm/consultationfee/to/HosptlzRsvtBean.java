package com.seoul.his.hdm.consultationfee.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Dataset(name = "dsHosptlzRsvt")
public class HosptlzRsvtBean extends BaseBean {
    private String hosptlzPlnDate,          //입원예정일
			       hosptlzRsvtNo,           //입원예약번호
			       hopeRoom,                //희망병실
			       outpaReceiptNo,          //외래접수번호
			       patNo,                   //환자등록번
			       prdtFinanDate,           //예상재원일
			       respDoctCd,              //담당의사코드
			       trmtDeptCd,              //진료과코드
			       uniqueNtc,               //의사특기사항
			       hopeWard;                //희망병동

}
