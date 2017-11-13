/**
 *
 */
package com.seoul.his.msv.pre.prescriptionmanagement.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.to
 *    |_ DiseaseBean.java
 *
 * </pre>
 * @date : 2016. 12. 2. 오후 4:16:01
 * @version :
 * @author : 백송은
 */

@Getter
@Setter
@ToString
@Dataset(name="dsDisease")
public class DiseaseBean {

	private String lv,
					   code,
					   codeNm,
					   pCode;

}





