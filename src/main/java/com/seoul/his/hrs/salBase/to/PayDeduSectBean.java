package com.seoul.his.hrs.salBase.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.hrs.salBase.to
 * @Class    PayDeduSectBean.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description
 *
 * @LastUpdated 
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsPayDeduSect")
public class PayDeduSectBean extends BaseBean {
	private String paymDeducCd,     // 지급공제코드
                   paymDeducNm,     // 지급공제명
                   divSectCd,       // 분류구분코드
                   divSectCdNm,     // 분류구분코드명
                   divCd,           // 분류코드
                   divNm,           // 분류명
                   amt;             // 금액 
}
