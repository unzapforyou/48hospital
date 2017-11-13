package com.seoul.his.hdm.admission.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.hdm.admission.to
 *    |_ HospitalizationInfoBean.java
 *
 * </pre>
 * @date : 2016. 12. 5. 오후 8:27:49
 * @version :
 * @author : kimmu
 */

@Getter
@Setter
@ToString
@Dataset(name="dsHospitalizationInfo")
public class HospitalizationInfoBean extends BaseBean{
	private String ward                           //병동
				   ,rship                         //관계
                   ,patNo                         //환자등록번호
                   ,outpaReceiptNo                //외래접수번호
                   ,hroom                         //병실
                   ,hosptlzRsvtYb                 //입원예약여부
                   ,hosptlzRoute                  //입원경로
                   ,hosptlzReceiptNo              //입원접수번호
                   ,hosptlzDate                   //입원일시
                   ,grtorTel                      //보증인연락처
                   ,grtorRrn                      //보증인주민번호
                   ,grtorNm                       //보증인성명
                   ,grtorAddr                     //보증인주소
                   ,dscgDiv                       //퇴원구분
                   ,dscgDate                      //퇴원일시
                   ,trmtDeptNm                    //진료과명
                   ,trmtDeptCd                    //진료과코드
                   ,respDoctNm                    //담당의사이름
                   ,respDoctCd                    //담당의사코드
                   ,patTypeNm                     //환자유형명
                   ,patTypeCd                     //환자유형코드
                   ,patRship;                     //환자와의 관계

}







