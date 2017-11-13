package com.seoul.his.hrs.yeta.to;

import java.util.List;
import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HyDeductionBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  사원 연말정산 내역빈
 * @LastUpdated 
 */
@Dataset(name = "dsHyDeduction")
@Getter
@Setter
@ToString
public class HyDeductionBean extends BaseBean {
	private String empNo;													//사원번호
	private List<HyDependentBean> hyDependentBeanList;						//부양가족빈리스트
	private List<HyDependentInsuranceBean> hyDependentInsuranceBeanList;	//부양가족보험공제빈리스트
	private List<HyDependentMedicalBean> hyDependentMedicalBeanList;		//부양가족의료비공제빈리스트
	private List<HyDependentDonationBean> hyDependentDonationBeanList;		//부양가족기부금공제빈리스트
	private List<HyDependentEducationBean> hyDependentEducationBeanList;	//부양가족교육비공제빈리스트
	private List<HyDependentPaymentBean> hyDependentPaymentBeanList;		//부양가족지출내역공제빈리스트
	private List<HyFormerCompanyBean> hyFormerCompanyBeanList;				//전근무지공제빈리스트
	private HyDeductionDataBean hyDeductionDataBean;						//사원공제자료빈

}
