package com.seoul.his.msv.sup.hosptaldiet.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * @Package  com.seoul.his.msv.sup.hosptaldiet.to
 * @Class    DinnerBean.java
 * @Create   2016. 12. 09.
 * @Author   응디꿍디
 * @Description   저녁 Bean
 *
 * @LastUpdated
 *
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsDinner")
public class DinnerBean extends BaseBean {
    private String
        menuGrpCd,    // 식단분류코드
        carteDate,    // 식이개시일자
        carteTime,    // 개시끼니
        rNum,         // 순번
        foodCd,       // 음식코드
        foodNm;       // 음식명
}
