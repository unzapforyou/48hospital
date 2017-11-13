package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;                              
import lombok.Getter;                                                 
import lombok.Setter;                                                 
import lombok.ToString;                                               
                                                                      
                                                                      
/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HyYtaResultBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  연말정산명세테이블빈
 * @LastUpdated 
 */
@Getter                                                               
@Setter                                                               
@ToString                                                             
@Dataset(name = "dsHyYtaResult")                                      
public class HyYtaResultBean extends BaseBean{                        
	private String belongYear,                                      //귀속연도
	               empNo,                                           //사번
	               preTotalSalary,                                  //전 근무지 급여
	               rwYearTaxationTotal,                             //과세총액
	               decidedTaxIncomeAmt,                             //결정 세액
	               decidedTaxLocalAmt,                              //지방소득세 결정 세액
	               paidIncomeTaxAmt,                                //기납부 소득세
	               paidLocalIncomeTaxAmt,                           //기납부 지방소득세
	               balIncomeTaxAmt,                                 //차감징수세액
	               balLocalTaxAmt,                                  //지방소득세에 대한 차감징수세액
	               dependentCnt,                                    //인적공제 해당 인원 수
	               senior70yearoverDdt,                             //인적공제 - 경로우대(70세 이상)
	               handicappedPersonDdt,                            //인적공제 - 장애인
	               womanDdt,                                        //인적공제 - 부녀자(부양/기혼)
	               singleParentDdt,                                 //인적공제 - 한부모
	               perosnalDdtAmt,                                  //인적공제 금액
	               nationalPensionAmt,                              //국민연금보험료
	               etcPensionAmt,                                   //기타연금보험료
	               pensionDdtAmt,                                   //연금보험료 공제 금액
	               insuranceDdtAmt,                                 //특별소득공제 - 보험료 금액
	               housingFundDdtAmt,                               //주택자금 공제 금액
	               housingLeaseDebtAmt,                             //주택임차차입금 원리금상환액
	               mbsDdtAmt,                                       //장기주택저당차입금 이자상환액
	               mbsRepaymentPeriod,                              //장기주택저당차입금 상환기간
	               mbsRate,                                         //장기주택저당차입금 금리
	               mbsRepaymentType,                                //장기주택저당차입금 상환 방식
	               housingSubDepositAmt,                            //주택마련저축공제 금액
	               personalPensionAmt,                              //개인연금저축
	               creditcardDdtAmt,                                //카드 사용금액
	               tmDdtAmt,                                        //카드 전통시장 사용분 금액(tm=traditional market)
	               ptDdtAmt,                                        //카드 대중교통 사용분 금액(pb=public transportation)
	               debitDdtAmt,                                     //선불COMMENT ON COLUMN ERP45.HY_YTA_RESULT. 직불카드 사용분 금액
	               cashReceiptDdtAmt,                               //현금 영수증 금액
	               cardddtExceptDdtAmt,                             //공제 제외 금액
	               addDdtUsedDdtAmt1,                               //추가 공제율 사용분 금액1
	               addDdtUsedDdtAmt2,                               //추가 공제율 사용분 금액2
	               creditcardEtcDdtAmt,                             //신용카드 등 소득공제 금액
	               smallBusinessDdtAmt,                             //소기업·소상공인 공제부금 공제 금액
	               invAssociationDdtAmt,                            //투자조합 촐자공제 금액
	               invVentureDdtAmt,                                //벤처기업 투자 공제 금액
	               empSharePensionDdtAmt,                           //우리사주조합출연금
	               mesbwDdtAmt,                                     //고용유지중소기업 근로자(mesbw = maintain employment small business worker)
	               nrsliDdtAmt,                                     //목돈 안드는 전세 이자상환액(no round sum lease interest)
	               lssDdtAmt,                                       //장기집합투자증권저축(longterm saving stock)
	               ddtAmt,                                          //공제 금액
	               specialDdtAmt,                                   //특별소득공제
	               incomeDdtTotalOverAmt,                           //소득공제 종합한도초과액
	               incomeTaxationStandard,                          //과세표준
	               calTaxAmt,                                       //산출세액
	               sbeDdtAmt,                                       //중소기업 취업자 세액감면 금액(small business employee)
	               earnedIncomeTaxDdtAmt,                           //근로소득세액 공제 금액
	               childTaxDdtAmt,                                  //자녀세액공제 금액
	               pensionTotalDdtAmt,                              //연금계좌세액공제
	               guaranteedInsuranceDdtAmt,                       //보장성보험료 공제 금액
	               guaranteedInsuranceDdt,                          //보장성보험료 공제
	               guaranteedHandicappedDdt,                        //장애인전용보장성보험료 공제
	               medicalCostDdtAmt,                               //의료비 세액 공제
	               eduCostDdtAmt,                                   //교육비 세액 공제
	               eduOwnCostDdt,                                   //본인 대학, 대학원 1학기 교육비
	               eduUnder20CostDdt,                               //기본 공제대상자(초중고생) 교육비
	               eduOver20CostDdt,                                //기본 공제대상자(대학생) 교육비
	               eduHandicappedCostDdt,                           //기본 공제대상자(장애인) 교육비
	               donationDdtAmt,                                  //기부금 세액 공제
	               donationPfDdt,                                   //정치자금 세액 공제(political fund)
	               donationCourtDdt,                                //법정 기부금 세액 공제
	               donationEsoaDdt,                                 //우리사주조합 기부금(employee stock ownership association)
	               donationReligionDdt,                             //종교단체 지정기부금
	               donationDesignatedDdt,                           //지정기부금(비종교단체)
	               taxAssociationDdtAmt,                            //납세조합공제 금액
	               housingLeaseDdt,                                 //주택자금차입급이자세액 공제
	               foreignPaymentDdt,                               //외국납부세액 공제
	               monthlyRentDdtAmt,                               //월세액 세액 공제 금액
	               specialTaxDdtAmt,                                //특별 세액 공제
	               standardTaxDdtAmt,                               //표준 세액 공제
	               taxDdtAmt,                                       //세액 공제 금액
	               cutoffFlag;                                      //마감 여부
}