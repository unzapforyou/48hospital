package com.seoul.his.msv.sup.hosptaldiet.to;

import com.seoul.his.common.annotation.Dataset;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

/**
 * <pre>
 * com.seoul.his.msv.sup.hosptaldiet.to
 *    |_ IngredCodeBean.java
 *
 * </pre>
 * @date : 2016. 12. 5. 오전 10:23:42
 * @version :
 * @author : 응디꿍디
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsCode")
public class HosptalDietCodeBean {
	String	     smallCode1,     // 소분류코드1
    fullName1,      // 코드전체명1
    smallCode2,     // 소분류코드2
    fullName2,      // 코드전체명2
    fullName,       // 소분류코드
    smallCode;      // 코드전체명
}



