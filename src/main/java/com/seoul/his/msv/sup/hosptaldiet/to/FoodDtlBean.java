package com.seoul.his.msv.sup.hosptaldiet.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * @Package  com.seoul.his.msv.sup.hosptaldiet.to
 * @Class    FoodDtlBean.java
 * @Create   2016. 12. 09.
 * @Author   응디꿍디
 * @Description   음식상세 Bean
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsFoodDtl")
public class FoodDtlBean extends BaseBean {
    private String
                    foodCd,             // 음식코드
                    ingredCd,           // 식재료
                    ingredNm,           // 식재료명
                    qty,                // 수량
                    amount,
                    mainmenuYn,         // 주재료, 양념구분
    				hospcls;				//병원분류
}
