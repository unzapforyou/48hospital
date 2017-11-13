package com.seoul.his.acc.vat.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Dataset(name = "dsVATDecl")
public class VATDeclBean extends BaseBean{
    private String  declYear                , // 신고년도
                    declPrid                , // 신고기수
                    salesTaxinv             , // 매출과세세금계산서발급금액
                    salesBuyerTaxinv        , // 매출과세매입자발행세금계산서금액
                    salesZtrTaxinv          , // 매출영세세금계산서발급금액
                    salesZtrEtc             , // 매출영세기타금액
                    purchTaxinv             , // 일반매입세금계산서금액
                    purchFixedAssetTaxinv   , // 고정자산매입세금계산서금액
                    purchPlnDeclOmi         , // 매입예정신고누락분금액
                    salesPlnDeclOmi         , // 매출예정신고누락분금액
                    vatSalesBdtc            , // 매출대손세액가감금액
                    buyerTaxinv             , // 매입자발행세금계산서금액
                    vatPurchEtcDeduct       , // 기타공제매입세액
                    vatPurchNonDeduct       , // 비공제매입세액
                    vatEtcDeductReduct      , // 기타공제경감세액
                    vatSalesCcardDeduct     , // 신용카드매출전표발행공제세액
                    vatPlnDeclNonRefund     , // 예정신고미환급금세액
                    vatPlnNoti              , // 예정고지세액
                    vatSumTaxdef            , // 가산세액합계
                    salesCcardCreceipt      , // 매출과세신용카드현금영수증금액
                    salesEtc                , // 매출과세기타금액
                    vatSalesPlnDeclOmi      , // 매출예정신고누락분세액
                    vatPurchTaxinv          , // 일반매입세금계산서세액
                    vatPurchFixedAssetTaxinv, // 고정자산매입세금계산서세액
                    vatPurchPlnDeclOmi      , // 매입예정신고누락분세액
                    vatBuyerTaxinv          , // 매입자발행세금계산서세액
                    purchEtcDeduct          , // 기타공제매입금액
                    purchNonDeduct          , // 비공제매입금액
                    vatSalesTaxinv          , // 매출과세세금계산서발급세액
                    vatSalesBuyerTaxinv     , // 매출과세매입자발행세금계산서세액
                    vatSalesCcardCreceipt   , // 매출과세신용카드현금영수증세액
                    vatSalesEtc             ; // 매출과세기타세액
}
