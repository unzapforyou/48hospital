
package com.seoul.his.msv.pre.prescriptionmanagement.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.to
 *    |_ PatientPrscBean.java
 *
 * </pre>
 * @date : 2016. 12. 7. 오후 9:06:27
 * @version :
 * @author : 백송은
 */

@Getter
@Setter
@ToString
@Dataset(name="dsPatientPrsc")
public class PatientPrscBean extends BaseBean{
	 private String patNo,                 //환자등록번호
     prescDate,             //처방일
     diseaseCd,             //상병코드
     diseaseNm,             //상병명
     dept,                  //과
     receiptNo,             //입원&외래접수번호
     hosptizReceiptNo,      //입원접수번호
     outpaReceiptNo,        //외래접수번호
     feeCd,                 //수가코드
     feeNm,                 //수가명칭
     bigGrp,                //대분류
     midGrp,                //중분류
     smGrp,                 //소분류
     cost,                  //비용
     uniqueNtc,             //특이사항
     dscgDate,              //퇴원일자
     dscgGubun,             //퇴원구분
     prescGubun,            //처방구분
     prescNo,               //처방번호
     medicationYn,          //조제여부
     medicationNo,          //조제번호
     doctNm,               //담당의
	 surYn;				//수술여부


	 List<PrescValueBean> prescValueList;		//처방

	 @Remove
	    public List<PrescValueBean> getPrescValueList() {
	        return prescValueList;
	    }

	    @Remove
	    public void setPrescValueList(List<PrescValueBean> prescValueList) {
	        this.prescValueList = prescValueList;
	    }
}





