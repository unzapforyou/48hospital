
package com.seoul.his.msv.pre.prescriptionmanagement.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.to
 *    |_ FeeBean.java
 * </pre>
 *
 * @date : 2016. 12. 6. 오후 4:44:49
 * @version :
 * @author : 백송은
 */

@Getter
@Setter
@ToString
@Dataset(name="dsFeeCd")
public class FeeBean extends BaseBean{

	private String feeCd,                       // 수가코드
    				   feeNm,                       // 수가명
    				   bigGrp,                       // 대분류
    				   midGrp,                      // 중분류
    				   smGrp,                       // 소분류
    				   applyPridStartDate,          // 적용시작일
    				   applyPridEndDate,            // 적용만료일
    				   note,                        // 비고
    				   cost;                        // 비용
}





