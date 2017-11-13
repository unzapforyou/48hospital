package com.seoul.his.acc.closing.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

@Dataset(name = "dsClosData")
public class AcClosDataBean extends BaseBean{
	private String artiCd,          // 결산자료항목
	               artiNm,          // 항목명
	               amt,             // 금액
	               sumAmt,          // 합계금액
	               jourAmt,         // 분개대상금액
	               cellInputDiv,    // 셀입력구분 I-입력/P-팝업
	               autoCalYn,       // 자동계산여부
	               sumArtiCd,       // 합산항목코
	               deductYn,        // 차감여부
	               level;			// 수준
}