package com.seoul.his.log.inven.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  	com.seoul.his.log.inven.to
 * @Class    	InvenSilsaDtlInfoBean.java
 * @Create   	2016. 12. 16.
 * @Author   	oss
 * @Description 재고실사 상세내역
 *
 * @LastUpdated
 */

@Getter
@Setter
@ToString

@Dataset(name = "dsInvenSilsaDtlInfo")
public class InvenSilsaDtlInfoBean extends BaseBean {

	String whCd;               //창고코드
	String whNm;
	String diffQnt;            //차이수량
	String midGrpCd;           //중분류코드
	String dproQnt;            //전산수량
	String invenRflt;          //재고반영
	String invenDlineYb;       //재고마감여부
	String silsaDate;
	String silsaQnt;           //실사수량
	String subulUnit;          //수불단위
	String smGrpCd;            //소분류코드
	String gdsCd;              //물품코드
	String bigGrpCd;           //대분류코드
	String price;              //단가
	String amt;                //금액
	String priceCtrt;          //계약단가
	String gdsNm;              //물품명
    String silsaNo;            //실사번호
    String silsaDetailNo;      //실사상세번호

}
