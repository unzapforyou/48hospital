
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
 *    |_ PatientDsBean.java
 *
 * </pre>
 * @date : 2016. 12. 7. 오후 8:47:03
 * @version :
 * @author : 백송은
 */

@Getter
@Setter
@ToString
@Dataset(name="dsPatientDs")
public class PatientDsBean extends BaseBean {

	 private String patNo,                   // 환자번호
     gubun,                   // 환자구분
     code,                    // 상병코드
     codeNm,                  // 상병명
     surYn,                   // 수술여부
     dept,                    // 진료과
     prescNo,                 // 처방번호
     prescDate;               // 처방날짜

	 List<PatientPrscBean> patientPrscList;		//처방

	 @Remove
	    public List<PatientPrscBean> getPatientPrscList() {
	        return patientPrscList;
	    }

	    @Remove
	    public void setPatientPrscList(List<PatientPrscBean> patientPrscList) {
	        this.patientPrscList = patientPrscList;
	    }
}





