
package com.seoul.his.msv.pre.prescriptionmanagement.to;

import java.util.List;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.annotation.Remove;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.to
 *    |_ PrescValueBean.java
 * </pre>
 *
 * @date : 2016. 12. 11. 오후 4:24:13
 * @version :
 * @author : 백송은
 */
@Getter
@Setter
@ToString
@Dataset(name="dsPrescMedi")
public class PrescMediBean extends BaseBean{
	private String patNo,
					prescNo,
					codeNo,
					codeValue,
					inNumber,
					prescDate;

	 List<PrescDtlBean> prescDtlList;		//처방

	 @Remove
	    public List<PrescDtlBean> getPrescDtlList() {
	        return prescDtlList;
	    }

	    @Remove
	    public void setPrescDtlList(List<PrescDtlBean> prescDtlList) {
	        this.prescDtlList = prescDtlList;
	    }
}





