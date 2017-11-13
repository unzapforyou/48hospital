package com.seoul.his.msv.sup.hosptaldiet.to;



import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.msv.sup.hosptaldiet.to
 * @Class    FoodBean.java
 * @Create   2016. 12. 09.
 * @Author   응디꿍디
 * @Description   음식 Bean
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsFood")
public class FoodBean extends BaseBean {
    private String
    ingredCd,
                    foodGrpCd,         // 음식 분류 코드
                    foodCd,            // 음식코드
                    foodType,          // 식사구분
                    foodNm,            // 음식명
                    notes,             // 비고
                    amount,            // 금액
                    nutrit1,           // 영양소: 에너지
                    nutrit2,           // 영양소: 단백질
                    nutrit3,           // 영양소: 지질
                    nutrit4,           // 영양소: 당질
                    nutrit5,           // 영양소: 식이섬유
                    nutrit7,           // 영양소: 칼슘
                    nutrit8,           // 영양소: 인
                    nutrit9,           // 영양소: 철
                    nutrit11,          // 영양소: 칼륨
                    nutrit16,          // 영양소: 비타민B1
                    nutrit17,          // 영양소: 비타민B2
                    nutrit18,          // 영양소: 비타민B6
                    nutrit22,          // 영양소: 비타민E
                    nutrit23,          // 영양소: 콜레스테롤
                    nutrit25,          // 영양소: 총지방산
                    checkDiv,
                    hospcls;
}


