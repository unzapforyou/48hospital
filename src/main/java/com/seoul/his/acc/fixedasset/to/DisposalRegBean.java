package com.seoul.his.acc.fixedasset.to;
import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ToString

@Dataset(name="dsDisposalReg")
public class DisposalRegBean extends BaseBean{
	private String assetNo,        // 자산번호
	               sellComp,       // 처분처
	               sellAmt,        // 매각금액
	               sellCost,       // 매각비용
	               sellProfit,     // 매각이익
	               sellLoss,       // 매각손실
	               assetNm,        // 자산명
	               disposalDate,   // 매각일 
	               disposalCd,     // 매각구분
	               acquDate;       // 취득일
}