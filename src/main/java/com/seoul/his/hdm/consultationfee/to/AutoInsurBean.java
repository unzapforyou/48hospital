package com.seoul.his.hdm.consultationfee.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name="dsAutoInsur")
public class AutoInsurBean extends BaseBean{
	private String           patNo                  //환자등록번
							,patNm                  //환자명
							,comCode                //회사코드
							,comName                //회사명
							,payMon                 //지불보증일
							,payStartMon            //지불보증시작일
							,payEndMon              //지불보증종료일
							,accNo                  //사고번호
							,assAccNo               //가해차량번호
							,respoworer             //담당자
							,respoworerPh           //담당자번호
							,chaMoney               //책임자손액
							,compMoney              //보험보상액
							,note                   //비고
							,treatStartDate         //진료가능시작일
							,treatEndDate           //진료마감일
							,trmtDeptCdOne          //진료과코드1
							,trmtDeptCdTwo          //진료과코드2
                            ,trmtDeptCdThree        //진료과코드3
                            ,trmtDeptCdFour         //진료과코드4
                            ,trmtDeptNmOne          //진료과명1
                            ,trmtDeptNmTwo          //진료과명2
                            ,trmtDeptNmThree        //진료과명3
                            ,trmtDeptNmFour         //진료과명4
                            ,accDate;               //사고일자
	
}
