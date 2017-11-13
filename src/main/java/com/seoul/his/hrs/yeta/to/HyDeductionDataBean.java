package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HyDeductionDataBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  공제자료빈
 * @LastUpdated 
 */
@Getter
@Setter
@ToString
@Dataset(name = "dsHyDeductionData")
public class HyDeductionDataBean extends BaseBean{
	private String empNo,									    //사원번호
				   spouseDdt,									//배우자
				   linAscDdt,									//직계존속
				   linDescChdDdt,								//직계비속
				   sibilingDdt,									//형제자매
				   pensionerDdt,								//수급자
				   foChdDdt,									//위탁아동
				   senior70yearoverDdt,							//70세이상 경로우대공제
				   handicappedPersonDdt,						//장애인공제
				   womanDdt,									//부녀자공제
				   singleParentDdt,								//한부모공제
				   nationalPensionDdt,							//국민연금
				   publicOfficialPensionDdt,					//공무원연금
				   militaryPensionDdt,							//군인연금
				   privateSchoolDdt,							//사립학교 교직원연금
				   specialPostofficeDdt,						//별정우체국연금
				   healthInsuranceDdt,							//건강보험료 납임금
				   empInsuranceDdt,								//고용보험료 납입금
				   housingLeaseDebtDdt,							//주택임차 차입금 원리금상환액
				   housingDepositWorkerDdt,						//
				   mbsUnder15yearDdt,							//장기주택 저당차입금 이자상환액 2011년이전차입분_15년미만
				   mbs15to29yearDdt,							//장기주택 저당차입금 이자상환액 2011년 이전차입분_15년~29년
				   mbsOver30yearDdt,							//장기주택 저당차입금 이자상환액 2011년 이전차입분_30년이상
				   mbsFrmDdt,									//장기주택 저당차입금 이자상환액 2012년이후 차입분 고정금리 비거치 상환대출
				   mbsEtcDdt,									//장기주택 저당차입금 이자상환액 2012년 이후 차입분 기타대출
				   personalPensionDdt,							//개인연금저축 납입액
				   subDepositDdt,								//청약저축 납입액
				   empHmlDdt,									//근로자주택마련저축 납입액
				   housingSubDepositDdt,						//주택청약종합저축 납입액
				   creditcardDdt,								//신용카드 사용금액_전통시장 대중교통제외
				   cashReceiptDdt,								//현금영수증 사용금액_전통시장 대중교통제외
				   debitcardDdt,								//직불카드 사용금액_전통시장 대중교통제외
				   tradMarketDdt,								//전통시장사용분
				   publicTransportationDdt,						//대중교통 이용분
				   own2013CreditcardUsedDdt,					//2013년 본인 신용카드등 사용액
				   own2014CreditcardUsedDdt,					//2014년 본인 신용카드등 사용액
				   own2013AdditionalDdt,						//2013년 본인의 추가공제율 사용액
				   own2014SecondHalfDdt,						//2014년 하반기 본인의 추가공제율 사용액
				   smallBusinessDdt,							//소기업 소상공인 공제부금 소득공제 납입액
				   inv2012AssociationDdt,						//투자조합 출자공제 2012년
				   inv2013AssociationDdt,						//투자조합 출자공제 2013년
				   inv2014AssociationDdt,						//투자조합 출자공제 2014년이후
				   empSharePensionDdt,							//우리사주출연금 소득공제
				   empShareDonationDdt,							//우리사주조합기부금 소득공제
				   sbeSalaryDdt,								//고용유지 중소기업 근로자 소득공제
				   noMokdonHousingDdt,							//목돈 안드는 전세 이자상환액공제
				   longtermSavingStockDdt,						//장기집합 투자증권저축
				   incomeTaxLawDdt,								//소득세법 감면세액
				   sbeDdt,										//조세특례제한법 중소기업취업청년 감면대상 총급여액
				   sbcOwnWorkingPersonDdt,						//조세특례제한법 중소기업취업청년 해당 근로자 총급여액
				   foreignTechnicianDdt,						//조세특례제한법 외국인기술자 감면세액
				   taxTreatyDdt,								//조세조약 감면세액
				   earnedIncomeTaxDdtAuto,						//근로소득세액공제_자동계산
				   chdTaxDdt,									//자녀세액공제_자동계산
				   scientistDdt,								//연금계좌 과학기술인공제 납입액
				   retirementPensionDdt,						//연금계좌 퇴직금액 납입액
				   annuitySavingDdt,							//연금계좌 연금저축 납입액
				   guaranteedInsuranceDdt,						//보장성보험료 납입액
				   guaranteedHandicappedDdt,					//장애인 보장성보험료 납입액
				   medical65overCostDdt,						//65세이상 부양가족 의료비 지출액
				   etcMedicalCostDdt,							//그 밖의 공제 대상자 의료비 지출액
				   medicalOwnCostDdt,							//의료비세액공제 대상금액_자동계산
				   medicalBasicCostDdt,							//의료비 세액공제 세액공제액_자동계산
				   eduOwnCostDdt,								//근로소득자 본인 교육비 지출액							
				   familyEduCostDdt,							//기본공제대상자인 배우자 직계비속 형제자매 입양자및 위탁아동 교육비 지출액
				   eduHandicappedCostDdt,						//장애인 특수교육비 지출액
				   eduCostTotal,								//교육비세액공제 대상금액_자동계산
				   eduCostDdt,									//교육비세액공제 세액공제액_자동계산
				   campaigningDonationDdt,						//정치자금기부금
				   legalDonationDdtLast,						//법정기부금 전년도 이월액		
				   legalDonationDdt,							//법정기부금 기부금액
				   chaTrustDonationDdtLast,						//공익신탁 기부금 전년도 이월액
				   chaTrustDonationDdt,							//공익신탁 기부금액
				   empSharePensionDonationDdt,					//우리사주 조합기부금액
				   desDonationDdtLast,							//지정기부금 전년도 이월액_종교단체외
				   desDonationDdt,								//지정기부금 기부금액_종교단체외
				   desDonationReligionDdtLast,					//지정기부금 전년도이월액_종교단체
				   desDonationReligionDdt,						//지정기부금액_종교단체
				   standardTaxDdtAuto,							//표준세액공제_자동계산
				   taxAssociationDdt,							//납세조합공제
				   housingLeaseDdt,								//주택차입금 이자상환액
				   foreignIncomeDdt,							//외국납부 소득금액
				   foreignPaymentDdt,							//외국납부 납부세액
				   monthlyRentDdt,								//월세액
				   belongYear,									//귀속연도
				   cutoffFlag,									//마감여부
				   seniorLongtermDdt,							//
				   mbsRepaymentType,							//
				   mbsRepaymentPeriod,							//
				   mbsDdt,									    //
				   housingFundDdt,								//
				   mbsRate,										//
				   adu2014Amt,									//
				   adu2015FhyAmt,								//
				   adu2015ShyAmt,								//
				   adu2013Amt,									//
				   inv2015AssociationDdt,						//
				   inv2013VentureDdt,							//
				   inv2014VentureDdt,							//
				   inv2015VentureDdt,							//
				   mesbwDdt,									//
				   nrsliDdt,									//
				   sbeDdtRate,									//
				   childUnder6Ddt,								//
				   childBirthAdoptDdt,							//								
				   eduUnder20CostDdt,							//
				   eduOver20CostDdt,							//
				   eduOver20Cnt,								//
				   eduUnder20Cnt,								//
				   medicalHandicappedCostDdt,					//								
				   medicalIgCostDdt,							//
				   medicalInfertilityCostDdt;					//

}