package com.seoul.his.msv.sup.hosptaldiet.to;


import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.msv.sup.hosptaldiet.to
 * @Class    IngredBean.java
 * @Create   2016. 12. 08.
 * @Author   응디꿍디
 * @Description   식품 Bean
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsIngred")
public class IngredBean extends BaseBean {
    private String
                    ingredGrpCd,          //식재료 분류 코드
                    ingredCd,             //식재료코드
                    ingredNm,             //식재료 명
                    spec,                 //규격
                    unit,                 //단위
                    chngQty,              //구매 환산수량
                    chngQty2,             //재고 환산수량2
                    chngQty3,             //영양소 환산수량3
                    ingredFlag,           //견적구분(4채,5공)
                    minOrdQty,            //최소발주량
                    saftyStkQty,          //안전재고량
                    itemMclasCd,          //구매분류
                    autoOrderYn,          //자동 발주 여부(Y/N)
                    autoOutYn,            //자동출고(Y/N)
                    stockYn,              //재고관련여부
                    addYn,                //추가재료여부 요거
                    meatYn,               //육류여부
                    useYn,                //사용유무(Y/N)
                    rate,                 //시세(단가)
                    roundFlag,            //반올림 여부
                    roundDec,             //반올림 소수자리
                    roundNum,             //반올림 기준수
                    notes,                //비고
                    nutrit1,              //영양소: 에너지
                    nutrit2,              //영양소: 단백질
                    nutrit3,              //영양소: 지질
                    nutrit4,              //영양소: 당질
                    nutrit5,              //영양소: 식이섬유
                    nutrit7,              //영양소: 칼슘
                    nutrit8,              //영양소: 인
                    nutrit9,              //영양소: 철
                    nutrit11,             //영양소: 칼륨
                    nutrit16,             //영양소: 비타민B1
                    nutrit17,             //영양소: 비타민B2
                    nutrit18,             //영양소: 비타민B6
                    nutrit22,             //영양소: 비타민E
                    nutrit23,             //영양소: 콜레스테롤
                    nutrit25,             //영양소: 총지방산
                    nutrit24,
                    spliesDiv,            //저장품구분코드(GD003)
                    ctrtPrice,            //계약단가
                    gdsCd,                //물품코드
                    subulUnit,            //수불단위코드(GD022)(재고)
                    ordUnit,              //발주단위코드(GD022)(구매)
                    hospcls;              //병원구분


}

