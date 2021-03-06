package com.seoul.his.acc.vat.to;



import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Dataset(name = "dsDetailTaxInv")
public class DetailTaxInvBean extends BaseBean{
    private String  no           ,    // 순번
                    pubDate      ,    // 발행일자
                    fm           ,    // 품목
                    stand        ,    // 규격
                    qnt          ,    // 수량
                    price        ,    // 단가
                    taxAmt       ,    // 세액
                    splyPrice    ,    // 공급가액
                    dedYN        ,    // 공제여부
                    pubNo        ,    // 발행번호
                    pubDiv ,// 발행구분
    slipNo                  ,			// 전표번호
    billDiv                 ,			// 계산서구분
    purchSalesDiv           ,			// 매입/매출구분
    anspDiv                 ,			// 청구구분
    custCd                  ,			// 거래처코드
    ABS                     ,			// 적요
    totalSumPrice                ,			// 금액
    gipyoDate               ,			// 기표일자
    resolNo                 ,			// 결의번호
    totalTaxAmt,
    totalSplyPrice,


    bussno,
	prsdntnm,
	busctgnm,
	busshpnm,
	custnm;


}
