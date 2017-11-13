package com.seoul.his.acc.vat.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Dataset(name = "dsTaxInv")
public class TaxInvBean extends BaseBean{
    private String  pubNo                   ,			// 발행번호
                    pubDate                 ,			// 발행일자
                    pubDiv                  ,			// 발행구분
                    slipNo                  ,			// 전표번호
                    billDiv                 ,			// 계산서구분
                    purchSalesDiv           ,			// 매입/매출구분
                    anspDiv                 ,			// 청구구분
                    custCd                  ,			// 거래처코드
                    ABS                     ,			// 적요
                    sumPrice                ,			// 금액
                    gipyoDate               ,			// 기표일자
                    resolNo                 ,			// 결의번호
                    splyPrice               ,			// 공급가액
                    taxAmt                  ;			// 세액

    private List<DetailTaxInvBean> detailTaxInvList ;	// 세금계산서상세정보



}
