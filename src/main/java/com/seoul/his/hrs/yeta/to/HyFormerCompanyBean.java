package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HyFormerCompanyBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  전근무지공제테이블빈
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsHyFormerCompany")
public class HyFormerCompanyBean extends BaseBean{
	private String empNo,                                       //사원번호
	               crNumber,                                    //사업자등록번호
	               companyName,                                 //법인명
	               totalSalary,                                 //급여총액
	               bonus,                                       //상여총액
	               deemedBonus,                                 //인정상여
	               etcTaxFree,                                  //기타비과세
	               nationalPension,                             //국민연금
	               healthInsurance,                             //건강보험
	               empInsurance,                                //고용보험
	               totalDonation,                               //전액기부금
	               desDonation,                                 //지정기부금
	               workingIncomeTax,                            //근로세액공제
	               incomeTax,                                   //소득세
	               residenceTax,                                //주민세
	               totalIncome,                                 //소득계
	               totalDdt,                                    //공제계
	               totalTax;                                    //세액계

}