
package com.seoul.his.msv.pre.prescriptionmanagement.to;

import com.seoul.his.common.annotation.Dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.to
 *    |_ PrescBean.java
 * </pre>
 *
 * @date : 2016. 12. 6. 오전 10:22:19
 * @version :
 * @author : 백송은
 */

@Getter
@Setter
@ToString
@Dataset(name="dsPresc")
public class PrescBean {
	private String  prescNo,
						patNo,
						prescDate,
						prescDoc;
}





