package com.seoul.his.hrs.yeta.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.yeta.to
 * @Class    HsPayBean.java
 * @Create   2016.5.25
 * @Author   hwang
 * @Description
 *  책정임금테이블빈
 * @LastUpdated 
 */
@Dataset(name = "dsHsPay")
@Getter
@Setter
@ToString
public class HsPayBean extends BaseBean{
	private String paymDeducDiv,												//지급공제구분
				   paymDeducCd,												    //지급공제코드
				   paymDeducNm,												    //지급공제명
				   amt,											             	//금액
				   compShare,													//회사부담금
				   empNo;														//사원번호
}